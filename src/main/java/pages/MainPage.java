package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class MainPage {
    WebDriver driver;
    //локатор кнопки принятия cookie
    public By cookieAcceptButton = By.className("App_CookieButton__3cvqF");
    //локатор кнопок вопросов
    public By accordionButton = By.xpath(".//div[@class = 'accordion__button']");

    //локатор верхней кнопки "Заказать"
    private By upOrderButton = By.className("Button_Button__ra12g");
    //локатор нижней копки "Заказать"
    private By downOrderButton = By.className("Button_Middle__1CSJM");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //метод для проверки отображения кнопки cookie и нажатия на неё
    public void acceptCookie() {
        WebElement cookieButton = driver.findElement(cookieAcceptButton);
        if (cookieButton.isDisplayed()) {
            cookieButton.click();
        }
        }
     //метод получения текста ответа
       public String getAnswerText(int index) {
           By answerLocator = By.id("accordion__panel-" + index);
           WebElement answerElement = driver.findElement(answerLocator);
           return answerElement.getText();
       }
       //метод клика на кнопку вопроса
        public void clickButtonQuestions (int index){
            List<WebElement> questions = driver.findElements(accordionButton);
            WebElement question = questions.get(index);
            question.click();
        }

    //метод для нажатия верхней кнопки "Заказать"
    public void clickUpOrderButton() {
        driver.findElement(upOrderButton).click();
    }
    //метод для нажатия нижней кнопки "Заказать"
    public void clickDownOrderButton() {
        driver.findElement(downOrderButton).click();
    }
    }
