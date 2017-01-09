package mobi.xiaowu.qyer.model.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by xiaowu on 2017/1/6.
 */

//http://open.qyer.com/lastminute/home/major?client_id=qyer_discount_androi
public class Home {
    /**
     * status : 1
     * info :
     * times : 0
     * data : {}]}
     * mTraceSwitch : true
     * raReferer : app_home
     */

    private int status;
    private String info;
    private int times;
    private DataBean data;
    @SerializedName("trace_switch")
    private String mTraceSwitch;
    @SerializedName("ra_referer")
    private String raReferer;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getTraceSwitch() {
        return mTraceSwitch;
    }

    public void setTraceSwitch(String traceSwitch) {
        this.mTraceSwitch = traceSwitch;
    }

    public String getRaReferer() {
        return raReferer;
    }

    public void setRaReferer(String raReferer) {
        this.raReferer = raReferer;
    }

    public static class DataBean {
        /**
         * msgSwitch : 1
         * slide : [{""}]
         */
        @SerializedName("msg_switch")
        private int msgSwitch;
        @SerializedName("head_slide")
        private HeadSlideBean headSlide;
        private String promot_title;
        private SearchBean search;
        private List<SlideBean> slide;
        private List<BarBean> bar;
        private List<PromoBean> promo;
        private List<HotTopicBean> hot_topic;
        private List<PtypeIconBean> ptype_icon;
        private List<GearsBean> gears;
        private List<?> sub_cate;
        private List<?> hover_ad;
        private List<?> welcome_ad;
        private List<?> second_ad;
        private List<?> hot_destination;
        private List<?> promo_page;
        private List<HotCityBean> hot_city;

        public int getMsgSwitch() {
            return msgSwitch;
        }

        public void setMsgSwitch(int msgSwitch) {
            this.msgSwitch = msgSwitch;
        }

        public HeadSlideBean getHeadSlide() {
            return headSlide;
        }

        public void setHeadSlide(HeadSlideBean headSlide) {
            this.headSlide = headSlide;
        }

        public String getPromot_title() {
            return promot_title;
        }

        public void setPromot_title(String promot_title) {
            this.promot_title = promot_title;
        }

        public SearchBean getSearch() {
            return search;
        }

        public void setSearch(SearchBean search) {
            this.search = search;
        }

        public List<SlideBean> getSlide() {
            return slide;
        }

        public void setSlide(List<SlideBean> slide) {
            this.slide = slide;
        }

        public List<BarBean> getBar() {
            return bar;
        }

        public void setBar(List<BarBean> bar) {
            this.bar = bar;
        }

        public List<PromoBean> getPromo() {
            return promo;
        }

        public void setPromo(List<PromoBean> promo) {
            this.promo = promo;
        }

        public List<HotTopicBean> getHot_topic() {
            return hot_topic;
        }

        public void setHot_topic(List<HotTopicBean> hot_topic) {
            this.hot_topic = hot_topic;
        }

        public List<PtypeIconBean> getPtype_icon() {
            return ptype_icon;
        }

        public void setPtype_icon(List<PtypeIconBean> ptype_icon) {
            this.ptype_icon = ptype_icon;
        }

        public List<GearsBean> getGears() {
            return gears;
        }

        public void setGears(List<GearsBean> gears) {
            this.gears = gears;
        }

        public List<?> getSub_cate() {
            return sub_cate;
        }

        public void setSub_cate(List<?> sub_cate) {
            this.sub_cate = sub_cate;
        }

        public List<?> getHover_ad() {
            return hover_ad;
        }

        public void setHover_ad(List<?> hover_ad) {
            this.hover_ad = hover_ad;
        }

        public List<?> getWelcome_ad() {
            return welcome_ad;
        }

        public void setWelcome_ad(List<?> welcome_ad) {
            this.welcome_ad = welcome_ad;
        }

        public List<?> getSecond_ad() {
            return second_ad;
        }

        public void setSecond_ad(List<?> second_ad) {
            this.second_ad = second_ad;
        }

        public List<?> getHot_destination() {
            return hot_destination;
        }

        public void setHot_destination(List<?> hot_destination) {
            this.hot_destination = hot_destination;
        }

        public List<?> getPromo_page() {
            return promo_page;
        }

        public void setPromo_page(List<?> promo_page) {
            this.promo_page = promo_page;
        }

        public List<HotCityBean> getHot_city() {
            return hot_city;
        }

        public void setHot_city(List<HotCityBean> hot_city) {
            this.hot_city = hot_city;
        }

        public static class HeadSlideBean {
            /**
             * count : 4
             * slideData : [{"_id":"","id":"","open_type":"1","name":"0105-0111发现世界","url":"http://m.qyer.com/z/zt/dkmdd/?source=app2&campaign=zkapp&category=zkslide_ztfxsj_20170105&ra_model=head_slide","cover":"https://pic.qyer.com/public/lmapp/op_conf/2017/01/05/14836155617916?imageMogr2/thumbnail/!750x375r","type":"APP_OP_HEAD_SLIDE","ra_n_model":"headSlide"},{"_id":"","id":"","open_type":"1","name":"0104-0110冰岛城市玩乐","url":"http://m.qyer.com/z/zt/bdzhw/?source=app2&ra_model=head_slide","cover":"https://pic.qyer.com/public/lmapp/op_conf/2017/01/04/14835246431762?imageMogr2/thumbnail/!750x375r","type":"APP_OP_HEAD_SLIDE","ra_n_model":"headSlide"},{"_id":"","id":"","open_type":"1","name":"1229-1004春节专题","url":"http://m.qyer.com/z/zt/jzjl/?source=app2&campaign=zkapp&category=zkslide_ztcjjl_20161229&ra_model=head_slide","cover":"http://pic.qyer.com/public/lmapp/op_conf/2016/12/29/14830068543874?imageMogr2/thumbnail/!750x375r","type":"APP_OP_HEAD_SLIDE","ra_n_model":"headSlide"},{"_id":"","id":"","open_type":"1","name":"1229-1004挪威专题","url":"http://m.qyer.com/z/zt/nworl/?source=app2&campaign=zkapp&category=zkslide_ztnorway_20161229&ra_model=head_slide","cover":"http://pic.qyer.com/public/lmapp/op_conf/2016/12/29/14829974748868?imageMogr2/thumbnail/!750x375r","type":"APP_OP_HEAD_SLIDE","ra_n_model":"headSlide"}]
             */

            private int count;
            @SerializedName("slide_data")
            private List<SlideDataBean> slideData;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public List<SlideDataBean> getSlideData() {
                return slideData;
            }

            public void setSlideData(List<SlideDataBean> slideData) {
                this.slideData = slideData;
            }

            public static class SlideDataBean {
                /**
                 * _id :
                 * id :
                 * open_type : 1
                 * name : 0105-0111发现世界
                 * url : http://m.qyer.com/z/zt/dkmdd/?source=app2&campaign=zkapp&category=zkslide_ztfxsj_20170105&ra_model=head_slide
                 * cover : https://pic.qyer.com/public/lmapp/op_conf/2017/01/05/14836155617916?imageMogr2/thumbnail/!750x375r
                 * type : APP_OP_HEAD_SLIDE
                 * ra_n_model : headSlide
                 */

                private String _id;
                private String id;
                private String open_type;
                private String name;
                private String url;
                private String cover;
                private String type;
                private String ra_n_model;

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getOpen_type() {
                    return open_type;
                }

                public void setOpen_type(String open_type) {
                    this.open_type = open_type;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getRa_n_model() {
                    return ra_n_model;
                }

                public void setRa_n_model(String ra_n_model) {
                    this.ra_n_model = ra_n_model;
                }
            }
        }

        public static class SearchBean {
        }

        public static class SlideBean {
            /**
             * _id :
             * id :
             * open_type : 3
             * title : 欧铁指南
             * url : http://m.qyer.com/z/zt/otzn?%2Fsource=app2&campaign=zkapp&category=slide_otzn%2F&ra_model=index_ad
             * img : http://pic.qyer.com/public/lmapp/op_conf/2016/06/12/14657279979977?imageMogr2/thumbnail/!750x375r
             * type : topic
             * ra_n_model : index_ad
             */

            private String _id;
            private String id;
            private String open_type;
            private String title;
            private String url;
            private String img;
            private String type;
            private String ra_n_model;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getOpen_type() {
                return open_type;
            }

            public void setOpen_type(String open_type) {
                this.open_type = open_type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getRa_n_model() {
                return ra_n_model;
            }

            public void setRa_n_model(String ra_n_model) {
                this.ra_n_model = ra_n_model;
            }
        }

        public static class BarBean {
            /**
             * id : 1018
             * enname : free
             * name : 机+酒
             * open_type : 6
             * icon : http://pic.qyer.com/public/lmapp/category/2016/05/06/14625235646061
             * ra_n_model : index_bar
             */

            private int id;
            private String enname;
            private String name;
            private int open_type;
            private String icon;
            private String ra_n_model;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getEnname() {
                return enname;
            }

            public void setEnname(String enname) {
                this.enname = enname;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getOpen_type() {
                return open_type;
            }

            public void setOpen_type(int open_type) {
                this.open_type = open_type;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getRa_n_model() {
                return ra_n_model;
            }

            public void setRa_n_model(String ra_n_model) {
                this.ra_n_model = ra_n_model;
            }
        }

        public static class PromoBean {
            /**
             * _id :
             * id :
             * open_type : 3
             * title : 相约欧罗巴
             * url : http://m.qyer.com/z/zt/europeart&source=app2&campaign=zkapp&category=zk3_europeart/?ra_model=route
             * img : http://pic.qyer.com/public/lmapp/op_conf/2016/03/08/14574323867607?imageMogr2/thumbnail/!750x375r
             * type : topic
             * ra_n_model : route
             */

            private String _id;
            private String id;
            private String open_type;
            private String title;
            private String url;
            private String img;
            private String type;
            private String ra_n_model;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getOpen_type() {
                return open_type;
            }

            public void setOpen_type(String open_type) {
                this.open_type = open_type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getRa_n_model() {
                return ra_n_model;
            }

            public void setRa_n_model(String ra_n_model) {
                this.ra_n_model = ra_n_model;
            }
        }

        public static class HotTopicBean {
            /**
             * _id :
             * id :
             * open_type : 3
             * title : 0105-0111发现世界
             * url : http://m.qyer.com/z/zt/dkmdd/?source=app&campaign=zkapp&category=hot_ztsjds_20170105&ra_model=hot_zt
             * img : https://pic.qyer.com/public/lmapp/op_conf/2017/01/05/14836158438222?imageMogr2/thumbnail/!710x213r
             * type : topic
             * ra_n_model : Homepage-dynamicactivity_b
             * topic_type : tt_b
             * subtitle :
             * topic_context :
             */

            private String _id;
            private String id;
            private String open_type;
            private String title;
            private String url;
            private String img;
            private String type;
            private String ra_n_model;
            private String topic_type;
            private String subtitle;
            private String topic_context;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getOpen_type() {
                return open_type;
            }

            public void setOpen_type(String open_type) {
                this.open_type = open_type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getRa_n_model() {
                return ra_n_model;
            }

            public void setRa_n_model(String ra_n_model) {
                this.ra_n_model = ra_n_model;
            }

            public String getTopic_type() {
                return topic_type;
            }

            public void setTopic_type(String topic_type) {
                this.topic_type = topic_type;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getTopic_context() {
                return topic_context;
            }

            public void setTopic_context(String topic_context) {
                this.topic_context = topic_context;
            }
        }

        public static class PtypeIconBean {
            /**
             * ptype_id : 1016
             * icon : http://pic.qyer.com/public/lmapp/category/2016/05/06/14625305428231
             * bgc : #F08278
             */

            private int ptype_id;
            private String icon;
            private String bgc;

            public int getPtype_id() {
                return ptype_id;
            }

            public void setPtype_id(int ptype_id) {
                this.ptype_id = ptype_id;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getBgc() {
                return bgc;
            }

            public void setBgc(String bgc) {
                this.bgc = bgc;
            }
        }

        public static class GearsBean {
            /**
             * _id :
             * id :
             * open_type : 1
             * name : WIFI/电话卡
             * url : http://z.qyer.com/cityfun/wifi_0_0_0_0_0_0_0/?_channel=cityfun&_type=channel#anchor_filtrate
             * cover : http://pic.qyer.com/public/lmapp/op_conf/2016/05/16/14633776129918?imageMogr2/thumbnail/!345x231r
             * type : APP_OP_GEARS
             * ra_n_model : gears
             */

            private String _id;
            private String id;
            private String open_type;
            private String name;
            private String url;
            private String cover;
            private String type;
            private String ra_n_model;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getOpen_type() {
                return open_type;
            }

            public void setOpen_type(String open_type) {
                this.open_type = open_type;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getRa_n_model() {
                return ra_n_model;
            }

            public void setRa_n_model(String ra_n_model) {
                this.ra_n_model = ra_n_model;
            }
        }

        public static class HotCityBean {
            /**
             * id : 14
             * name : 日本
             * type : country
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
