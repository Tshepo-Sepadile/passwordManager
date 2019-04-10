package ac.za.cput.factory;

import ac.za.cput.domain.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void getUser() {
        User u  = UserFactory.getUser("Mieshk", "12345");
        Assert.assertNotNull(u.getName());
    }
}