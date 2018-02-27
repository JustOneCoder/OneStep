package com.flf.storage;

import java.util.List;

/**
 * Created by fenglingfeng on 2018/2/27.
 * 说明：头条新闻数据模型.
 */

public class TopNews {

    private List<T1348647909107Bean> T1348647909107;

    public List<T1348647909107Bean> getT1348647909107() {
        return T1348647909107;
    }

    public void setT1348647909107(List<T1348647909107Bean> T1348647909107) {
        this.T1348647909107 = T1348647909107;
    }

    public static class T1348647909107Bean {
        /**
         * lmodify : 2018-02-27 16:47:09
         * source : 视觉中国
         * title : 朴槿惠或被判30年监禁 支持者"呐喊"
         * mtime : 2018-02-27 16:47:09
         * hasImg : 1
         * topic_background : http://img2.cache.netease.com/m/newsapp/reading/cover1/C1348646712614.jpg
         * alias : Top News
         * imgsrc : http://cms-bucket.nosdn.127.net/c198ce40b9fc4b7fade06f58572e1e8f20180227152202.jpeg
         * ptime : 2018-02-27 15:22:37
         * hasHead : 1
         * votecount : 160    投票数
         * tname : 头条
         * ads : [{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2290898","tag":"photoset","title":"俊男美女亮相北电 报考人次再创新高","imgsrc":"bigimg","url":"00AP0001|2290898"},{"subtitle":"","skipType":"photoset","skipID":"00AO0001|2290861","tag":"photoset","title":"朝鲜代表团返朝 韩朝选手挥泪惜别","imgsrc":"bigimg","url":"00AO0001|2290861"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2290854","tag":"photoset","title":"上戏艺考拉开大幕 3万人争464个名额","imgsrc":"bigimg","url":"00AP0001|2290854"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2290853","tag":"photoset","title":"广西查获百只跨国野生活体八哥雏鸟","imgsrc":"bigimg","url":"00AP0001|2290853"},{"subtitle":"","skipType":"photoset","skipID":"00AO0001|2290821","tag":"photoset","title":"平昌冬奥会闭幕式 \"北京8分钟\"亮相","imgsrc":"bigimg","url":"00AO0001|2290821"}]
         * replyCount : 168    回复数
         * imgsum : 5
         * url_3w : http://news.163.com/18/0227/08/DBKVDBJP000189FH.html
         * url : http://3g.163.com/news/18/0227/08/DBKVDBJP000189FH.html
         * ltitle : 为了共产党人的使命
         * imgextra : [{"imgsrc":"http://cms-bucket.nosdn.127.net/9ad1163926a9486ea2a4e6fa32ff990520180227173833.jpeg"},{"imgsrc":"http://cms-bucket.nosdn.127.net/16b27cc2232444269a6aa4813ea9b65d20180227173833.jpeg"}]
         */

        private String template;
        private String skipID;
        private String lmodify;
        private String postid;
        private String source;
        private String title;
        private String mtime;
        private int hasImg;
        private String topic_background;
        private String digest;
        private String photosetID;
        private String boardid;
        private String alias;
        private int hasAD;
        private String imgsrc;
        private String ptime;
        private String daynum;
        private int hasHead;
        private int imgType;
        private int order;
        private int votecount;
        private boolean hasCover;
        private String docid;
        private String tname;
        private int priority;
        private String ename;
        private int replyCount;
        private int imgsum;
        private boolean hasIcon;
        private String skipType;
        private String cid;
        private String url_3w;
        private String url;
        private String ltitle;
        private String subtitle;
        private List<?> editor;
        private List<AdsBean> ads;
        private List<ImgextraBean> imgextra;

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getSkipID() {
            return skipID;
        }

        public void setSkipID(String skipID) {
            this.skipID = skipID;
        }

        public String getLmodify() {
            return lmodify;
        }

        public void setLmodify(String lmodify) {
            this.lmodify = lmodify;
        }

        public String getPostid() {
            return postid;
        }

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMtime() {
            return mtime;
        }

        public void setMtime(String mtime) {
            this.mtime = mtime;
        }

        public int getHasImg() {
            return hasImg;
        }

        public void setHasImg(int hasImg) {
            this.hasImg = hasImg;
        }

        public String getTopic_background() {
            return topic_background;
        }

        public void setTopic_background(String topic_background) {
            this.topic_background = topic_background;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public String getPhotosetID() {
            return photosetID;
        }

        public void setPhotosetID(String photosetID) {
            this.photosetID = photosetID;
        }

        public String getBoardid() {
            return boardid;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public int getHasAD() {
            return hasAD;
        }

        public void setHasAD(int hasAD) {
            this.hasAD = hasAD;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public String getDaynum() {
            return daynum;
        }

        public void setDaynum(String daynum) {
            this.daynum = daynum;
        }

        public int getHasHead() {
            return hasHead;
        }

        public void setHasHead(int hasHead) {
            this.hasHead = hasHead;
        }

        public int getImgType() {
            return imgType;
        }

        public void setImgType(int imgType) {
            this.imgType = imgType;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getVotecount() {
            return votecount;
        }

        public void setVotecount(int votecount) {
            this.votecount = votecount;
        }

        public boolean isHasCover() {
            return hasCover;
        }

        public void setHasCover(boolean hasCover) {
            this.hasCover = hasCover;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public int getImgsum() {
            return imgsum;
        }

        public void setImgsum(int imgsum) {
            this.imgsum = imgsum;
        }

        public boolean isHasIcon() {
            return hasIcon;
        }

        public void setHasIcon(boolean hasIcon) {
            this.hasIcon = hasIcon;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getUrl_3w() {
            return url_3w;
        }

        public void setUrl_3w(String url_3w) {
            this.url_3w = url_3w;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getLtitle() {
            return ltitle;
        }

        public void setLtitle(String ltitle) {
            this.ltitle = ltitle;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public List<?> getEditor() {
            return editor;
        }

        public void setEditor(List<?> editor) {
            this.editor = editor;
        }

        public List<AdsBean> getAds() {
            return ads;
        }

        public void setAds(List<AdsBean> ads) {
            this.ads = ads;
        }

        public List<ImgextraBean> getImgextra() {
            return imgextra;
        }

        public void setImgextra(List<ImgextraBean> imgextra) {
            this.imgextra = imgextra;
        }

        public static class AdsBean {
            /**
             * subtitle :
             * skipType : photoset
             * skipID : 00AP0001|2290898
             * tag : photoset
             * title : 俊男美女亮相北电 报考人次再创新高
             * imgsrc : bigimg
             * url : 00AP0001|2290898
             */

            private String subtitle;
            private String skipType;
            private String skipID;
            private String tag;
            private String title;
            private String imgsrc;
            private String url;

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getSkipType() {
                return skipType;
            }

            public void setSkipType(String skipType) {
                this.skipType = skipType;
            }

            public String getSkipID() {
                return skipID;
            }

            public void setSkipID(String skipID) {
                this.skipID = skipID;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class ImgextraBean {
            /**
             * imgsrc : http://cms-bucket.nosdn.127.net/9ad1163926a9486ea2a4e6fa32ff990520180227173833.jpeg
             */

            private String imgsrc;

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }
        }
    }
}
