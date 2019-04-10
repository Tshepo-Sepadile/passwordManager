package ac.za.cput.factory;

import ac.za.cput.domain.User;

public class UserFactory
{
    public static User getUser(String name, String password) {
        return new User.Builder().name(name).password(password).build();
    }
}
