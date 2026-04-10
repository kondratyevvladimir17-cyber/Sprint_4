import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class OrderFlowTests extends BaseUITest {

//тест для верхней кнопки "Заказать"
    @Test
    public void upOrdersTest() {
        mainPage.acceptCookie();
        mainPage.clickUpOrderButton();
        orderPage.fillingfieldName("Владимир");
        orderPage.fillingfieldSurname("Королевский");
        orderPage.fillingfieldAdress("Воронина, 31");
        orderPage.fillingfieldMetro("Лубянка");
        orderPage.fillingfieldPhone("+79115556677");
        orderPage.clickfurtherButton();
        orderPage.fillingdeliveryTime("11.04.2026");
        orderPage.fillingfieldRentTime();
        orderPage.clickblackBoxScooter();
        orderPage.fillingcommentCourier("Будем ждать!");
        orderPage.clickbuttonOrder();
        orderPage.clickbuttonConfirm(); //на данном методе в браузере Chrome тест падает из-за бага(не нажимается кнопка "да")
        String actualText = orderPage.checktextOrder();
        String expectedText = "Заказ оформлен";
        assertTrue(actualText.contains(expectedText));

    }
    //тест для нижней кнопки "Заказать"
    @Test
    public void downOrdersTest() {
        mainPage.acceptCookie();
        mainPage.clickDownOrderButton();
        orderPage.fillingfieldName("Сергей");
        orderPage.fillingfieldSurname("Сергеев");
        orderPage.fillingfieldAdress("Русанова, 15");
        orderPage.fillingfieldMetro("Чистые пруды");
        orderPage.fillingfieldPhone("+79398996787");
        orderPage.clickfurtherButton();
        orderPage.fillingdeliveryTime("11.04.2026");
        orderPage.fillingfieldRentTime();
        orderPage.clickgreyBoxScooter();
        orderPage.fillingcommentCourier("Спасибо!");
        orderPage.clickbuttonOrder();
        orderPage.clickbuttonConfirm();//на данном методе в браузере Chrome тест падает из-за бага(не нажимается кнопка "да")
        String actualText = orderPage.checktextOrder();
        String expectedText = "Заказ оформлен";
        assertTrue(actualText.contains(expectedText));
    }

}