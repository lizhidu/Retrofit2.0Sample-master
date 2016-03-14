package rest;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;

import models.GitResult;
import models.Item;
import models.NewsResult;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Part;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Ashiq Uz Zoha on 9/13/15.
 * Dhrubok Infotech Services Ltd.
 * ashiq.ayon@gmail.com
 */
public class RestClient {

    private static GitApiInterface gitApiInterface;
    private static String baseUrl = "https://api.github.com";
    private static String baseUrl1 = "http://op.juhe.cn";


    public static GitApiInterface getClient() {
        if (gitApiInterface == null) {

            OkHttpClient okClient = new OkHttpClient();
            okClient.interceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response response = chain.proceed(chain.request());
                    System.err.println("resoonse=" + response.toString());
                    return response;
                }
            });

            Retrofit client = new Retrofit.Builder()
                    .baseUrl(baseUrl1)
                    .addConverter(String.class, new ToStringConverter())
                    .client(okClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            gitApiInterface = client.create(GitApiInterface.class);
        }
        return gitApiInterface;
    }

    public interface GitApiInterface {

//        9e1432111c23ce5c1a5cb8ebdc5a9c84

        @Headers("User-Agent: Retrofit2.0Tutorial-App")
        @GET("/search/users")
        Call<GitResult> getUsersNamedTom(@Query("q") String name);

        @POST("/user/create")
        Call<Item> createUser(@Body String name, @Body String email);

        @PUT("/user/{id}/update")
        Call<Item> updateUser(@Path("id") String id, @Body Item user);

        @GET("/onebox/news/query")
        Call<Response> getRes(@Query("q") String q, @Query("key") String key, @Query("dtype") String dtype);

        @FormUrlEncoded
        @POST("/onebox/news/query")
        Call<NewsResult> getNews(@Query("key") String key,@Field("q") String param1,@Field("dtype") String param2);



    }

}
