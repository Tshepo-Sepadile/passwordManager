package ac.za.cput.domain;

import java.util.Set;

public class User {
    private String name;
    private String password;
    //private Set<Password> passwords;

    private User(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    private User(Builder builder)
    {
        this.name = builder.name;
        this.password = builder.password;
    }

    public static class Builder{

        private String name;
        private String password;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder password(String password){
            this.password =password;
            return this;
        }

        public User build(){
            return new User(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}
