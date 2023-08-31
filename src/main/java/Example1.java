import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

    public static void main (String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // selenium manager will automatically hit the internet and will download the appropriate chrome driver .
        //you not not need to give the path .
        // another way is you give the path of the chrome driver .

        // manaually invoking the driver :

        // the pros and cons is that if we give the path means it is slightly faster .
        //if you do not mention it then selenium manger will be taking care of it .

        //System.setProperty("webdriver.chrome.driver","path need to give of the chrome driver ");

        String password = "Krishna@77";
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("krishna99@gmail.com");
        driver.findElement(By.xpath("//input[@name ='inputPassword']")).sendKeys(password);

        // thread.sleep method useage


        driver.findElement(By.xpath("//*[contains(text() ,\"Sign In\")]")).click();
        Thread.sleep(5000);
        // we need 
        String errorMsg = driver.findElement(By.xpath("//p[@class='error']")).getText();

        System.out.println(errorMsg);


        // close only the current window
        driver.close();
        // closses all the associated windows
       // driver.quit();





    }


}
