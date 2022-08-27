package config;


import org.aeonbits.owner.Config;

//класс посредник между файлом в ресурсах credentials.properties и классом OwnerTests
//смотрит на файл credentials.properties
@Config.Sources("classpath:config/credentials.properties")
public interface CredentialsConfig extends Config {
    String login();
    String password();
}