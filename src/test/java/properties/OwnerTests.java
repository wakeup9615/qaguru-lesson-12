package properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class OwnerTests {
    //создаем экземпляр класса CredentialsConfig чтобы что то из него достать
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
    @Test
    @Tag("owner")
    void someTest1() {
        String login = config.login();
        String password = config.password();

        System.out.println("Login: " + login);
        System.out.println("Password: " + password);

        String message = format("I logged in as %s with password %s", login, password);
        System.out.println("Message: " + message);
    }
}