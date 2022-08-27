package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    void someTest1() {
        String browser = System.getProperty("browser");
        System.out.println(browser); //null
    }

    @Test
    void someTest2() {
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser");
        System.out.println(browser); //safari
    }

    @Test
    void someTest3() {
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); //opera
    }

    @Test
    void someTest4() {
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser", "opera"); //устанавиливает дефолтное значение, те если нет set, то вернет то, что в get
        System.out.println(browser); //safari
    }

    @Test
    void someTest5() {
        System.setProperty("anyValue", "any text");
        String text = System.getProperty("anyValue", "some text");
        System.out.println(text); //safari
    }

    @Test
    @Tag("test6") //gradle clean properties_test6 или gradle clean properties_test6 -Dbrowser=opera или  gradle clean properties_test6 -Dbrowser=opera -Dversion=102
    void someTest6() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "101");
        String browserSize = System.getProperty("browserSize", "1920x1080");
        System.out.println(browser); //chrome
        System.out.println(version); //101
        System.out.println(browserSize); //1920x1080
    }

    @Test
    @Tag("test7") //gradle clean properties_test7 -DanyText=world!
    void someTest7() {
        System.out.println("hello " + System.getProperty("anyText"));
    }
}