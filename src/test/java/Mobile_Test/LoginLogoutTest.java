package Mobile_Test;
import org.testng.annotations.Test;

public class LoginLogoutTest extends RegressionClass {

    @Test
    public void LoginLogoutQA() throws Exception {
        // Login
        loginQAUser();

        // logout
        logoutMasterUser();

    }

    @Test
    public void LoginLogoutDemoUser() throws Exception {
        // Login demo user
        loginDemoUser();

        // logout
        logoutMasterUser();

    }
}
