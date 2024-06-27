package Creational.Builder;

public class User {
    private final String username;
    private final String userId;
    private final String address;

    private User() {
    }

    public String getUsername() {
        return username;
    }

    public String getUserId() {
        return userId;
    }

    public String getAddress() {
        return address;
    }

    // inner class to create object
    static class UserBuilder {
        private String username;
        private String userId;
        private String address;

        public UserBuilder() {
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

    }
}
