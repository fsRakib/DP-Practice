package Creational.Builder;

public class User {
    @Override
    public String toString() {
        return "User [username=" + username + ", userId=" + userId + ", address=" + address + "]";
    }

    private final String username;
    private final String userId;
    private final String address;

    private User(UserBuilder builder) {
        // initialize
        this.userId = builder.userId;
        this.username = builder.username;
        this.address = builder.address;
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

        public User build() {
            User user = new User(this);
            return user;
        }

    }
}
