package autotests.tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class GameMobileTests extends TestBase {


    @Test
    @DisplayName("Запускаем игру")
    void loadingTheGameTest() {
        // switchTo().alert().accept();
        step("Запускаем игру и нажимаем на всех всплывающих окнах ОК ", () ->
                $(AppiumBy.xpath("//android.widget.Button[@text='OK' and @index='0']")).click());
                $(AppiumBy.xpath("//android.widget.Button[@text='OK' and @index='2']")).click();
        step("Проверяем что игра загрузилась  ", () ->
                $(AppiumBy.xpath("//android.widget.FrameLayout[@index='0']")).shouldBe(Condition.visible));
    }

}
