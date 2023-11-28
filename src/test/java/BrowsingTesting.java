import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowsingTesting {

    WebDriver wd;


    @Test
    public void test(){
        wd = new ChromeDriver();

        wd.navigate().to("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        wd.close();
    }
}
