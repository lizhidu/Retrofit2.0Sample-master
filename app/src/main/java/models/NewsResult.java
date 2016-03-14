package models;

import java.util.List;

/**
 * Created by dulzh on 3/13/16.
 */
public class NewsResult {


    /**
     * reason : 查询成功
     * result : [{"title":"清风吹来气象新--从四个侧面看两会会风","content":"他认为<em>两会<\/em>是观察中国政治制度的一个窗口:当前我国政治制度不断完善,政治生态不断改善,<em>两会<\/em>会风进一步改进,代表委员履职能力更加提升,这些都是国家治理体系和治理能力现代化过程中不断取得的新成果。  \"从代表委员履职上看,反映出中国特色社会主义民主法制制度体系更加成熟...","img_width":"209","full_title":"清风吹来气象新--从四个侧面看两会会风","pdate":"1小时前","src":"新华网","img_length":"600","img":"http://p8.qhimg.com/t011421f2608efd158b.jpg","url":"http://news.xinhuanet.com/politics/2016-03/12/c_128795132.htm","pdate_src":"2016-03-12 23:04:43"},{"title":"【时局】七天五次讲话,习近平两会为这五类人\"撑腰\"","content":"其实,习近平的心里时刻装着这件事。每年<em>两会<\/em>,他都会倾听少数民族代表的声音,关心他们的生活。在国内考察,他也少不了看望少数民族群众。\"一些民族地区群众困难多,困难群众多\",在习近平眼中,民族地区是全面建成小康社会的重点,也是\"短板\"。  决不让一个兄弟民族掉队,决不让一个...","img_width":"387","full_title":"【时局】七天五次讲话,习近平两会为这五类人\"撑腰\"","pdate":"3小时前","src":"中国广播网","img_length":"640","img":"http://p5.qhimg.com/t01ddbeadccd764bc75.jpg","url":"http://news.cnr.cn/native/gd/20160312/t20160312_521594743.shtml","pdate_src":"2016-03-12 21:05:00"},{"title":"(两会每日盘点)权威发布不断 澄清五大传闻","content":"中新社北京3月12日电 (记者 沈嘉)正在北京召开的全国<em>两会<\/em>,不仅是代表委员参政议政的平台,也是权威信息发布和流通的场域。截至12日,广受关注的五大传闻在<em>两会<\/em>上得以释疑与澄清。  --刘士余澄清\"希望大家买股票不要卖股票\"  在12日的记者会上,中国证监会新任主席刘士余在开场白...","img_width":"","full_title":"(两会每日盘点)权威发布不断 澄清五大传闻","pdate":"4小时前","src":"中国经济网","img_length":"","img":"","url":"http://www.ce.cn/xwzx/gnsz/gdxw/201603/12/t20160312_9453744.shtml","pdate_src":"2016-03-12 20:13:00"},{"title":"(两会速递)政协大会发言谈党清政勤两岸亲和民族情","content":"3月12日,全国政协十二届四次会议在北京人民大会堂举行第四次全体会议。 中新社记者 盛佳鹏 摄   中新社北京3月12日电 (记者 邢利宇)全国政协十二届四次会议12日举行第四次全体会议,15位委员大会发言,建言党清政勤、两岸亲和民族情。  \"全面从严治党,使中华大地发生了全面系...","img_width":"366","full_title":"(两会速递)政协大会发言谈党清政勤两岸亲和民族情","pdate":"4小时前","src":"中国青年网","img_length":"550","img":"http://p2.qhimg.com/t01d254c808b42e8c5d.jpg","url":"http://news.youth.cn/jsxw/201603/t20160312_7737770.htm","pdate_src":"2016-03-12 20:08:10"}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    /**
     * title : 清风吹来气象新--从四个侧面看两会会风
     * content : 他认为<em>两会</em>是观察中国政治制度的一个窗口:当前我国政治制度不断完善,政治生态不断改善,<em>两会</em>会风进一步改进,代表委员履职能力更加提升,这些都是国家治理体系和治理能力现代化过程中不断取得的新成果。  "从代表委员履职上看,反映出中国特色社会主义民主法制制度体系更加成熟...
     * img_width : 209
     * full_title : 清风吹来气象新--从四个侧面看两会会风
     * pdate : 1小时前
     * src : 新华网
     * img_length : 600
     * img : http://p8.qhimg.com/t011421f2608efd158b.jpg
     * url : http://news.xinhuanet.com/politics/2016-03/12/c_128795132.htm
     * pdate_src : 2016-03-12 23:04:43
     */

    private List<ResultEntity> result;

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public String getReason() {
        return reason;
    }

    public int getError_code() {
        return error_code;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public static class ResultEntity {
        private String title;
        private String content;
        private String img_width;
        private String full_title;
        private String pdate;
        private String src;
        private String img_length;
        private String img;
        private String url;
        private String pdate_src;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setImg_width(String img_width) {
            this.img_width = img_width;
        }

        public void setFull_title(String full_title) {
            this.full_title = full_title;
        }

        public void setPdate(String pdate) {
            this.pdate = pdate;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public void setImg_length(String img_length) {
            this.img_length = img_length;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setPdate_src(String pdate_src) {
            this.pdate_src = pdate_src;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getImg_width() {
            return img_width;
        }

        public String getFull_title() {
            return full_title;
        }

        public String getPdate() {
            return pdate;
        }

        public String getSrc() {
            return src;
        }

        public String getImg_length() {
            return img_length;
        }

        public String getImg() {
            return img;
        }

        public String getUrl() {
            return url;
        }

        public String getPdate_src() {
            return pdate_src;
        }
    }
}
