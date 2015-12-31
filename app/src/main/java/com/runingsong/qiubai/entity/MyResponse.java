package com.runingsong.qiubai.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 15-12-29.
 */
public class MyResponse {

    /**
     * count : 30
     * err : 0
     * items : [{"format":"word","image":null,"published_at":1451374502,"tag":"","user":{"avatar_updated_at":1450601756,"last_visited_at":1378213948,"created_at":1378213948,"state":"active","email":"","last_device":"ios_2.6","role":"n","login":"凯歌改名大美丽","id":11065042,"icon":"20151220085556.jpg"},"image_size":null,"id":114467360,"votes":{"down":-281,"up":9812},"created_at":1451372620,"content":"我们这边结婚都要闹新娘，结婚当晚，我问老公，为什么今天结婚没人闹我？老公说，我提前给他们说好了，谁闹谁领走，谁领走。领走。。\n那一个都没闹的是几个意思。。。","state":"publish","comments_count":93,"allow_comment":true,"share_count":61,"type":"hot","pic_url":"http://qiubai-video.qiushibaike.com/DCZ6Y069QR96MDDI.jpg"}]
     * total : 300
     * page : 1
     * refresh : 300
     */

    @SerializedName("count")
    private int count;
    @SerializedName("err")
    private int err;
    @SerializedName("total")
    private int total;
    @SerializedName("page")
    private int page;
    @SerializedName("refresh")
    private int refresh;
    /**
     * format : word
     * image : null
     * published_at : 1451374502
     * tag :
     * user : {"avatar_updated_at":1450601756,"last_visited_at":1378213948,"created_at":1378213948,"state":"active","email":"","last_device":"ios_2.6","role":"n","login":"凯歌改名大美丽","id":11065042,"icon":"20151220085556.jpg"}
     * image_size : null
     * id : 114467360
     * votes : {"down":-281,"up":9812}
     * created_at : 1451372620
     * content : 我们这边结婚都要闹新娘，结婚当晚，我问老公，为什么今天结婚没人闹我？老公说，我提前给他们说好了，谁闹谁领走，谁领走。领走。。
     那一个都没闹的是几个意思。。。
     * state : publish
     * comments_count : 93
     * allow_comment : true
     * share_count : 61
     * type : hot
     * pic_url : http://qiubai-video.qiushibaike.com/DCZ6Y069QR96MDDI.jpg
     */

    @SerializedName("items")
    private List<ItemsEntity> items;

    public void setCount(int count) {
        this.count = count;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setRefresh(int refresh) {
        this.refresh = refresh;
    }

    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public int getErr() {
        return err;
    }

    public int getTotal() {
        return total;
    }

    public int getPage() {
        return page;
    }

    public int getRefresh() {
        return refresh;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public static class ItemsEntity implements Serializable {
        @SerializedName("format")
        private String format;
        @SerializedName("image")
        private Object image;
        @SerializedName("published_at")
        private int publishedAt;
        @SerializedName("tag")
        private String tag;
        /**
         * avatar_updated_at : 1450601756
         * last_visited_at : 1378213948
         * created_at : 1378213948
         * state : active
         * email :
         * last_device : ios_2.6
         * role : n
         * login : 凯歌改名大美丽
         * id : 11065042
         * icon : 20151220085556.jpg
         */

        @SerializedName("user")
        private UserEntity user;
        @SerializedName("image_size")
        private Object imageSize;
        @SerializedName("id")
        private int id;
        /**
         * down : -281
         * up : 9812
         */

        @SerializedName("votes")
        private VotesEntity votes;
        @SerializedName("created_at")
        private int createdAt;
        @SerializedName("content")
        private String content;
        @SerializedName("state")
        private String state;
        @SerializedName("comments_count")
        private int commentsCount;
        @SerializedName("allow_comment")
        private boolean allowComment;
        @SerializedName("share_count")
        private int shareCount;
        @SerializedName("type")
        private String type;
        @SerializedName("pic_url")
        private String picUrl;

        public void setFormat(String format) {
            this.format = format;
        }

        public void setImage(Object image) {
            this.image = image;
        }

        public void setPublishedAt(int publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public void setUser(UserEntity user) {
            this.user = user;
        }

        public void setImageSize(Object imageSize) {
            this.imageSize = imageSize;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setVotes(VotesEntity votes) {
            this.votes = votes;
        }

        public void setCreatedAt(int createdAt) {
            this.createdAt = createdAt;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setCommentsCount(int commentsCount) {
            this.commentsCount = commentsCount;
        }

        public void setAllowComment(boolean allowComment) {
            this.allowComment = allowComment;
        }

        public void setShareCount(int shareCount) {
            this.shareCount = shareCount;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getFormat() {
            return format;
        }

        public Object getImage() {
            return image;
        }

        public int getPublishedAt() {
            return publishedAt;
        }

        public String getTag() {
            return tag;
        }

        public UserEntity getUser() {
            return user;
        }

        public Object getImageSize() {
            return imageSize;
        }

        public int getId() {
            return id;
        }

        public VotesEntity getVotes() {
            return votes;
        }

        public int getCreatedAt() {
            return createdAt;
        }

        public String getContent() {
            return content;
        }

        public String getState() {
            return state;
        }

        public int getCommentsCount() {
            return commentsCount;
        }

        public boolean isAllowComment() {
            return allowComment;
        }

        public int getShareCount() {
            return shareCount;
        }

        public String getType() {
            return type;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public static class UserEntity implements Serializable {
            @SerializedName("avatar_updated_at")
            private int avatarUpdatedAt;
            @SerializedName("last_visited_at")
            private int lastVisitedAt;
            @SerializedName("created_at")
            private int createdAt;
            @SerializedName("state")
            private String state;
            @SerializedName("email")
            private String email;
            @SerializedName("last_device")
            private String lastDevice;
            @SerializedName("role")
            private String role;
            @SerializedName("login")
            private String login;
            @SerializedName("id")
            private int id;
            @SerializedName("icon")
            private String icon;

            public void setAvatarUpdatedAt(int avatarUpdatedAt) {
                this.avatarUpdatedAt = avatarUpdatedAt;
            }

            public void setLastVisitedAt(int lastVisitedAt) {
                this.lastVisitedAt = lastVisitedAt;
            }

            public void setCreatedAt(int createdAt) {
                this.createdAt = createdAt;
            }

            public void setState(String state) {
                this.state = state;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public void setLastDevice(String lastDevice) {
                this.lastDevice = lastDevice;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getAvatarUpdatedAt() {
                return avatarUpdatedAt;
            }

            public int getLastVisitedAt() {
                return lastVisitedAt;
            }

            public int getCreatedAt() {
                return createdAt;
            }

            public String getState() {
                return state;
            }

            public String getEmail() {
                return email;
            }

            public String getLastDevice() {
                return lastDevice;
            }

            public String getRole() {
                return role;
            }

            public String getLogin() {
                return login;
            }

            public int getId() {
                return id;
            }

            public String getIcon() {
                return icon;
            }
        }

        public static class VotesEntity implements Serializable {
            @SerializedName("down")
            private int down;
            @SerializedName("up")
            private int up;

            public void setDown(int down) {
                this.down = down;
            }

            public void setUp(int up) {
                this.up = up;
            }

            public int getDown() {
                return down;
            }

            public int getUp() {
                return up;
            }
        }
    }
}
