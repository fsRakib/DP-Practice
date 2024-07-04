package Creational.Builder.Pracrice1;

class User {

    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder builder) {
        // initialize
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return this.userName + " : " + this.emailId + " : " + this.userId;
    }

    // ---------- inner class to create obj-------------------------------
    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;
        private String emailId2=;

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}