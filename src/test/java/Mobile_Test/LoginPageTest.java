package Mobile_Test;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class LoginPageTest extends LoginPageClass{

    //@Test()
    public void LoginDemoUser() throws Exception {
        loginDemoUser();
    }

    @Test
    @Description("Test Description: Login test with QA username and password.")
    public void LoginTestQA() throws Exception {
        loginQAUser();
    }
}
