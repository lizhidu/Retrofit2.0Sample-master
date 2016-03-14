package rest;

/**
 * Created by dulzh on 3/12/16.
 */
public class Params {

    private String q;
//    private String key;
    private String dtype;

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

//    public String getKey() {
//        return key;
//    }

//    public void setKey(String key) {
//        this.key = key;
//    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public Params(String q, String dtype) {
        this.q = q;
//        this.key = key;
        this.dtype = dtype;
    }
}
