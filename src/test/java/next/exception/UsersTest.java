package next.exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsersTest {

    @Test
    public void getUser() {
        Users users = new Users();
        assertEquals(new User("crong", 35), users.getUser("crong"));
    }

    
    @Test
    public void getDefaultUser() {
        Users users = new Users();
        assertEquals(Users.DEFAULT_USER, users.getUser("codesquard"));
    }
}
