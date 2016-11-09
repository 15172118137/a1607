package com.android.cxk.liwushuo.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/11/6.
 */
public class SelectionHonListViewBean {

    /**
     * code : 200
     * data : {"secondary_banners":[{"ad_monitors":[],"id":72,"image_url":"http://img01.liwushuo.com/image/161028/6a0d9ekhy.jpg-w720","target_url":"liwushuo:///page?type=dailylucky","webp_url":"http://img01.liwushuo.com/image/161028/6a0d9ekhy.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"id":74,"image_url":"http://img01.liwushuo.com/image/161103/f4sjbgqyv.jpg-w720","target_url":"liwushuo:///page?type=url&amp;url=http%3a%2f%2fhawaii.liwushuo.com%2fcollection%2f379&amp;right_item_title=%e5%88%86%e4%ba%ab&amp;right_item_callback=_lws.shareCollection","webp_url":"http://img01.liwushuo.com/image/161103/f4sjbgqyv.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"id":69,"image_url":"http://img01.liwushuo.com/image/161028/gneo1mdld.jpg-w720","target_url":"liwushuo:///page?type=url&amp;url=http%3a%2f%2fhawaii.liwushuo.com%2fcollection%2f369&amp;right_item_title=%e5%88%86%e4%ba%ab&amp;right_item_callback=_lws.shareCollection","webp_url":"http://img01.liwushuo.com/image/161028/gneo1mdld.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"id":70,"image_url":"http://img02.liwushuo.com/image/161028/g1ntuogz4.jpg-w720","target_url":"liwushuo:///page?type=url&amp;url=http%3a%2f%2fhawaii.liwushuo.com%2fcollection%2f368&amp;right_item_title=%e5%88%86%e4%ba%ab&amp;right_item_callback=_lws.shareCollection","webp_url":"http://img02.liwushuo.com/image/161028/g1ntuogz4.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"id":64,"image_url":"http://img01.liwushuo.com/image/161028/2xk75qrla.jpg-w720","target_url":"liwushuo:///page?type=url&amp;url=http%3a%2f%2fhawaii.liwushuo.com%2fcollection%2f366&amp;right_item_title=%e5%88%86%e4%ba%ab&amp;right_item_callback=_lws.shareCollection","webp_url":"http://img01.liwushuo.com/image/161028/2xk75qrla.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"id":68,"image_url":"http://img03.liwushuo.com/image/161106/jl1f0u2nf.jpg-w720","target_url":"liwushuo:///page?type=post&amp;post_id=1046450&amp;page_action=navigation","webp_url":"http://img03.liwushuo.com/image/161106/jl1f0u2nf.jpg?imageView2/2/w/720/q/85/format/webp"}]}
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
         * id : 72
         * image_url : http://img01.liwushuo.com/image/161028/6a0d9ekhy.jpg-w720
         * target_url : liwushuo:///page?type=dailylucky
         * webp_url : http://img01.liwushuo.com/image/161028/6a0d9ekhy.jpg?imageView2/2/w/720/q/85/format/webp
         */

        private List<SecondaryBannersBean> secondary_banners;

        public List<SecondaryBannersBean> getSecondary_banners() {
            return secondary_banners;
        }

        public void setSecondary_banners(List<SecondaryBannersBean> secondary_banners) {
            this.secondary_banners = secondary_banners;
        }

        public static class SecondaryBannersBean {
            private int id;
            private String image_url;
            private String target_url;
            private String webp_url;
            private List<?> ad_monitors;

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

            public String getTarget_url() {
                return target_url;
            }

            public void setTarget_url(String target_url) {
                this.target_url = target_url;
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
        }
    }
}
