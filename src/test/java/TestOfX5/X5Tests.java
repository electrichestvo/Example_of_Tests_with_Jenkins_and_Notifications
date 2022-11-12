package TestOfX5;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class X5Tests extends TestBase {
    @Test
    @DisplayName("Проверка появления меню второго уровня для 'Компания'")
    void subCompanyMenuVisibleTest() {
        step ("Открываем 'https://www.x5.ru/'", () -> {
            open ("https://www.x5.ru/ru/");
        });
        step ("Принимаем куки", () -> {
            $ (".cookie-consent__button-group").click ();
        });
        step ("Навести на пункт Компания", () -> {
            $ (byText ("Компания")).hover ();
        });
        sleep (5);
        step ("Проверка появления меню второго уровня", () -> {
            $ (".header__sub-menu-link-item").shouldBe (Condition.visible);
            sleep (5);
        });
    }

    @Test
    @DisplayName("Проверка открытия страницы о карьере'")
    void careerTest() {
        step ("Открываем 'https://www.x5.ru/'", () -> {
            open ("https://www.x5.ru/ru/");
        });

        step ("Кликнуть на пункт Карьера", () -> {
            $ (byText ("Карьера")).click ();
        });

        step ("Проверка появления меню второго уровня Карьера", () -> {
            $ (".large-image-block__header").shouldBe (text ("Динамичная компания, где вы сами определяете свое будущее и профессиональное развитие. Х5 дает возможности расти как в зрелых бизнесах, так и в стартапах. Решайте амбициозные задачи, достигайте вдохновляющих результатов. Успешны вы – успешна компания."));
        });


    }


    @Test
    @DisplayName("Проверка смены языка")
    void changeLanguageTest() {
        step ("Открываем 'https://www.x5.ru/'", () -> {
            open ("https://www.x5.ru/ru/");
        });

        step ("Меняем язык на EN", () -> {
            $ (".header__lang").click ();
        });

        step ("Проверяем, что язык изменился", () -> {
            $ (".header__content-menu").shouldHave (Condition.text ("Company"));
            $ (".header__content-menu").shouldHave (Condition.text ("Consumer"));
            $ (".header__content-menu").shouldHave (Condition.text ("For Partners"));
            $ (".header__content-menu").shouldHave (Condition.text ("Investors"));
            $ (".header__content-menu").shouldHave (Condition.text ("Press Centre"));
        });
    }

    @Test
    @DisplayName("Проверка страницы с вакансиями X5 на HH'")
    void careerTestPage() {
        step ("Открываем 'https://hh.ru/employer/4233'", () -> {
            open ("https://hh.ru/employer/4233");
        });

        step ("Проверка отображения вакансий", () -> {
            $ (".th_vacancy_block").scrollTo ();
            $ (".th_vacancy_block").shouldHave (text (" Вакансии компании «Х5 Group»"));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step ("Open url 'https://www.x5.ru/ru/", () ->
                open ("https://www.x5.ru/ru/"));

        step ("Проверка отображения заголовка на главной странице", () -> {
            String expectedTitle = "Главная - X5 Group";
            String actualTitle = title ();

            assertThat (actualTitle).isEqualTo (expectedTitle);
        });
    }

}
