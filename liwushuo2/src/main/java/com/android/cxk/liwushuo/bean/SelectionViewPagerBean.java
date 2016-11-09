package com.android.cxk.liwushuo.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/11/6.
 */
public class SelectionViewPagerBean {

    /**
     * code : 200
     * data : {"banners":[{"ad_monitors":[],"channel":"all","id":769,"image_url":"http://img03.liwushuo.com/image/161104/o3bk3likr.jpg-w720","order":941,"status":0,"target":{"banner_image_url":"http://img03.liwushuo.com/image/161102/zqby0nfxr.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/161102/zqby0nfxr.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/161102/t6n2e0gmd.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/161102/t6n2e0gmd.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1478068472,"id":382,"posts_count":12,"status":1,"subtitle":"每日更新，双11优惠早知道","title":"双11优惠日报","updated_at":1478424565},"target_id":382,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&amp;login=false&amp;type=topic&amp;topic_id=382","type":"collection","webp_url":"http://img03.liwushuo.com/image/161104/o3bk3likr.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":767,"image_url":"http://img02.liwushuo.com/image/161101/c6q7tbt9s.jpg-w720","order":822,"status":0,"target_id":1046370,"target_type":"url","target_url":"liwushuo:///page?url=https%3A%2F%2Fevent.liwushuo.com%2Fevent%2F161103-event%2F&amp;page_action=navigation&amp;login=false&amp;type=url","type":"url","webp_url":"http://img02.liwushuo.com/image/161101/c6q7tbt9s.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":771,"image_url":"http://img01.liwushuo.com/image/161104/q5375vn8n.jpg-w720","order":811,"status":0,"target_id":1046422,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&amp;login=false&amp;type=post&amp;post_id=1046422","type":"post","webp_url":"http://img01.liwushuo.com/image/161104/q5375vn8n.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":756,"image_url":"http://img02.liwushuo.com/image/161026/dxhiii89e.jpg-w720","order":758,"status":0,"target_id":1046250,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&amp;login=false&amp;type=post&amp;post_id=1046250","type":"post","webp_url":"http://img02.liwushuo.com/image/161026/dxhiii89e.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":730,"image_url":"http://img01.liwushuo.com/image/160929/68bib1c1a.jpg-w720","order":500,"status":0,"target_id":null,"target_url":"liwushuo:///page?type=dailylucky","type":"url","webp_url":"http://img01.liwushuo.com/image/160929/68bib1c1a.jpg?imageView2/2/w/720/q/85/format/webp"}]}
     * message : OK
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * ad_monitors : []
         * channel : all
         * id : 769
         * image_url : http://img03.liwushuo.com/image/161104/o3bk3likr.jpg-w720
         * order : 941
         * status : 0
         * target : {"banner_image_url":"http://img03.liwushuo.com/image/161102/zqby0nfxr.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/161102/zqby0nfxr.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/161102/t6n2e0gmd.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/161102/t6n2e0gmd.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1478068472,"id":382,"posts_count":12,"status":1,"subtitle":"每日更新，双11优惠早知道","title":"双11优惠日报","updated_at":1478424565}
         * target_id : 382
         * target_type : url
         * target_url : liwushuo:///page?page_action=navigation&amp;login=false&amp;type=topic&amp;topic_id=382
         * type : collection
         * webp_url : http://img03.liwushuo.com/image/161104/o3bk3likr.jpg?imageView2/2/w/720/q/85/format/webp
         */

        private List<BannersBean> banners;

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public static class BannersBean {
            private String channel;
            private int id;
            private String image_url;
            private int order;
            private int status;
            /**
             * banner_image_url : http://img03.liwushuo.com/image/161102/zqby0nfxr.jpg-w300
             * banner_webp_url : http://img03.liwushuo.com/image/161102/zqby0nfxr.jpg?imageView2/2/w/300/q/85/format/webp
             * cover_image_url : http://img01.liwushuo.com/image/161102/t6n2e0gmd.jpg-w720
             * cover_webp_url : http://img01.liwushuo.com/image/161102/t6n2e0gmd.jpg?imageView2/2/w/720/q/85/format/webp
             * created_at : 1478068472
             * id : 382
             * posts_count : 12
             * status : 1
             * subtitle : 每日更新，双11优惠早知道
             * title : 双11优惠日报
             * updated_at : 1478424565
             */

            private TargetBean target;
            private int target_id;
            private String target_type;
            private String target_url;
            private String type;
            private String webp_url;
            private List<?> ad_monitors;

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public TargetBean getTarget() {
                return target;
            }

            public void setTarget(TargetBean target) {
                this.target = target;
            }

            public int getTarget_id() {
                return target_id;
            }

            public void setTarget_id(int target_id) {
                this.target_id = target_id;
            }

            public String getTarget_type() {
                return target_type;
            }

            public void setTarget_type(String target_type) {
                this.target_type = target_type;
            }

            public String getTarget_url() {
                return target_url;
            }

            public void setTarget_url(String target_url) {
                this.target_url = target_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getWebp_url() {
                return webp_url;
            }

            public void setWebp_url(String webp_url) {
                this.webp_url = webp_url;
            }

            public List<?> getAd_monitors() {
                return ad_monitors;
            }

            public void setAd_monitors(List<?> ad_monitors) {
                this.ad_monitors = ad_monitors;
            }

            public static class TargetBean {
                private String banner_image_url;
                private String banner_webp_url;
                private String cover_image_url;
                private String cover_webp_url;
                private int created_at;
                private int id;
                private int posts_count;
                private int status;
                private String subtitle;
                private String title;
                private int updated_at;

                public String getBanner_image_url() {
                    return banner_image_url;
                }

                public void setBanner_image_url(String banner_image_url) {
                    this.banner_image_url = banner_image_url;
                }

                public String getBanner_webp_url() {
                    return banner_webp_url;
                }

                public void setBanner_webp_url(String banner_webp_url) {
                    this.banner_webp_url = banner_webp_url;
                }

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public String getCover_webp_url() {
                    return cover_webp_url;
                }

                public void setCover_webp_url(String cover_webp_url) {
                    this.cover_webp_url = cover_webp_url;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getPosts_count() {
                    return posts_count;
                }

                public void setPosts_count(int posts_count) {
                    this.posts_count = posts_count;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getSubtitle() {
                    return subtitle;
                }

                public void setSubtitle(String subtitle) {
                    this.subtitle = subtitle;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(int updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }
    }
}
