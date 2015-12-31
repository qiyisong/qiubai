package com.runingsong.qiubai.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 15-12-30.
 */
public class Comment {

    /**
     * count : 30
     * items : [{"liked":false,"floor":31,"created_at":1451438764,"content":"然后老师说原来是我的面到了，你们先自由活动，我先吃面。","like_count":0,"user":{"last_visited_at":1443351216,"created_at":1443351216,"last_device":"android_8.1.1","email":"","state":"active","role":"n","login":"挞沙鱼","id":30353168,"icon":""},"id":346432013}]
     */

    @SerializedName("count")
    private int count;
    /**
     * liked : false
     * floor : 31
     * created_at : 1451438764
     * content : 然后老师说原来是我的面到了，你们先自由活动，我先吃面。
     * like_count : 0
     * user : {"last_visited_at":1443351216,"created_at":1443351216,"last_device":"android_8.1.1","email":"","state":"active","role":"n","login":"挞沙鱼","id":30353168,"icon":""}
     * id : 346432013
     */

    @SerializedName("items")
    private List<ItemsEntity> items;

    public void setCount(int count) {
        this.count = count;
    }

    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public static class ItemsEntity {
        @SerializedName("liked")
        private boolean liked;
        @SerializedName("floor")
        private int floor;
        @SerializedName("created_at")
        private int createdAt;
        @SerializedName("content")
        private String content;
        @SerializedName("like_count")
        private int likeCount;
        /**
         * last_visited_at : 1443351216
         * created_at : 1443351216
         * last_device : android_8.1.1
         * email :
         * state : active
         * role : n
         * login : 挞沙鱼
         * id : 30353168
         * icon :
         */

        @SerializedName("user")
        private UserEntity user;
        @SerializedName("id")
        private int id;

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public void setFloor(int floor) {
            this.floor = floor;
        }

        public void setCreatedAt(int createdAt) {
            this.createdAt = createdAt;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setLikeCount(int likeCount) {
            this.likeCount = likeCount;
        }

        public void setUser(UserEntity user) {
            this.user = user;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isLiked() {
            return liked;
        }

        public int getFloor() {
            return floor;
        }

        public int getCreatedAt() {
            return createdAt;
        }

        public String getContent() {
            return content;
        }

        public int getLikeCount() {
            return likeCount;
        }

        public UserEntity getUser() {
            return user;
        }

        public int getId() {
            return id;
        }

        public static class UserEntity {
            @SerializedName("last_visited_at")
            private int lastVisitedAt;
            @SerializedName("created_at")
            private int createdAt;
            @SerializedName("last_device")
            private String lastDevice;
            @SerializedName("email")
            private String email;
            @SerializedName("state")
            private String state;
            @SerializedName("role")
            private String role;
            @SerializedName("login")
            private String login;
            @SerializedName("id")
            private int id;
            @SerializedName("icon")
            private String icon;

            public void setLastVisitedAt(int lastVisitedAt) {
                this.lastVisitedAt = lastVisitedAt;
            }

            public void setCreatedAt(int createdAt) {
                this.createdAt = createdAt;
            }

            public void setLastDevice(String lastDevice) {
                this.lastDevice = lastDevice;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public void setState(String state) {
                this.state = state;
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

            public int getLastVisitedAt() {
                return lastVisitedAt;
            }

            public int getCreatedAt() {
                return createdAt;
            }

            public String getLastDevice() {
                return lastDevice;
            }

            public String getEmail() {
                return email;
            }

            public String getState() {
                return state;
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
    }
}
