package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OrderPage {
    WebDriver driver;

    //локаторы полей первой страницы заказа
    private By fieldName = By.xpath("//input[@placeholder='* Имя']"); //локатор поля "Имя"
    private By fieldSurname = By.xpath("//input[@placeholder='* Фамилия']"); //локатор поля "Фамилия"
    private By fieldAdress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"); //локатор поля "Адрес"
    private By fieldMetro = By.xpath("//input[@placeholder='* Станция метро']");//локатор поля "Станция метро"
    private By fieldMetross = By.className("select-search__select");//локатор станции в выпадающем списке;
    private By fieldPhone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"); //локатор поля "Телефон"
    private By furtherButton = By.xpath("//button[contains(text(), 'Далее')]"); //локатор кнопки "Далее"
    //локаторы полей выбора данных аренды
    private By deliveryTime = By.xpath("//input[@placeholder='* Когда привезти самокат']"); //локатор поля выбора даты
    private By dateButton = By.className("react-datepicker__day--011");// локатор кнопки выбора даты на календаре
    private By fieldRentTime = By.className("Dropdown-placeholder"); // Локатор нажатия на поле срока аренды
    private By choiceRentTime = By.xpath("//div[@role='option'][contains(text(), 'двое суток')]"); // Локатор выбора срока аренды из списка
    private By blackBoxScooter = By.id("black"); // Локатор чёрного цвета
    private By greyBoxScooter = By.id("grey"); // Локатор серого цвета
    private By commentCourier = By.xpath("//input[@placeholder='Комментарий для курьера']"); // Локатор поля «Комментарий»
    private By buttonOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Заказать']");  //Локатор кнопки «Заказать»
    private By buttonConfirm = By.xpath("//button[contains(text(), 'Да')]"); // Локатор кнопки «Да» в модальном окне
    private By textOrder = By.xpath("//div[text()='Заказ оформлен']");//локатор текста "Заказ оформлен"

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    //метод заполнение поля "Имя"
    public void fillingfieldName(String name) {
        driver.findElement(fieldName).sendKeys(name);
    }

    //метод заполнение поля "Фамилия"
    public void fillingfieldSurname(String surname) {
        driver.findElement(fieldSurname).sendKeys(surname);
    }

    //метод заполнение поля "Адрес"
    public void fillingfieldAdress(String adress) {
        driver.findElement(fieldAdress).sendKeys(adress);
    }

    //метод заполнение поля "Станция метро"
    public void fillingfieldMetro(String metro) {
        driver.findElement(fieldMetro).click();
        driver.findElement(fieldMetro).sendKeys(metro);
        driver.findElement(fieldMetross).click();
    }

    //метод заполнение поля "Телефон"
    public void fillingfieldPhone(String number) {
        driver.findElement(fieldPhone).sendKeys(number);
    }

    //метод для нажатия верхней кнопки "Заказать"
    public void clickfurtherButton() {
        driver.findElement(furtherButton).click();
    }
    //метод выбора даты
    public void fillingdeliveryTime(String date) {
        driver.findElement(deliveryTime).sendKeys(date);
        driver.findElement(dateButton).click();
    }

    public void fillingfieldRentTime() {
        driver.findElement(fieldRentTime).click();
        driver.findElement(choiceRentTime).click();
    }
   //метод выбора чёрного цвета
    public void clickblackBoxScooter() {
        driver.findElement(blackBoxScooter).click();
    }
    //метод выбора серого цвета
    public void clickgreyBoxScooter() {
        driver.findElement(greyBoxScooter).click();
    }
    //метод комментария курьеру
    public void fillingcommentCourier(String comment) {
        driver.findElement(commentCourier).sendKeys(comment);
    }
    //метод нажатия на кнопку "Заказать"
    public void clickbuttonOrder() {
        driver.findElement(buttonOrder).click();
    }
    //метод нажатия на кнопку "Да" в окне подтверждения заказа
    public void clickbuttonConfirm() {
        driver.findElement(buttonConfirm).click();
    }
    //метод возвращает текст "Заказ оформлен"
    public String checktextOrder() {
        WebElement ordertext = driver.findElement(textOrder);
        return ordertext.getText();
    }
}
