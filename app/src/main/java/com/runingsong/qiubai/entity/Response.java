package com.runingsong.qiubai.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 15-12-29.
 */
public class Response {

    /**
     * format : word
     * image : null
     * published_at : 1451346901
     * tag :
     * user : {"avatar_updated_at":1451392978,"last_visited_at":1327836426,"created_at":1327836426,"state":"active","email":" ","last_device":"ios_1.0","role":"n","login":"潇湘墨兰","id":441420,"icon":"20151229124258.jpg"}
     * image_size : null
     * id : 114462277
     * votes : {"down":-276,"up":11329}
     * created_at : 1451344564
     * content : 见学长夫妇，说是最近俩人一直分床睡，已经好几个月了。我还以为是关系冷淡期，关切地问怎么回事。学长含羞一笑，说俩人共同爱好太多，三观太和，永远有聊不完的话题，一不小心就唠到三四点，再愉快地啪啪一下，第二天根本没法起床上班...秀得我泪流满面…
     * state : publish
     * comments_count : 103
     * allow_comment : true
     * share_count : 383
     * type : hot
     */

    @SerializedName("items")
    private List<ItemsEntity> items;
    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public static class ItemsEntity {
        @SerializedName("format")
        private String format;
        @SerializedName("image")
        private Object image;
        @SerializedName("published_at")
        private int publishedAt;
        @SerializedName("tag")
        private String tag;
        /**
         * avatar_updated_at : 1451392978
         * last_visited_at : 1327836426
         * created_at : 1327836426
         * state : active
         * email :
         * last_device : ios_1.0
         * role : n
         * login : 潇湘墨兰
         * id : 441420
         * icon : 20151229124258.jpg
         */

        @SerializedName("user")
        private UserEntity user;
        @SerializedName("image_size")
        private Object imageSize;
        @SerializedName("id")
        private int id;
        /**
         * down : -276
         * up : 11329
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

        public static class UserEntity {
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

        public static class VotesEntity {
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
