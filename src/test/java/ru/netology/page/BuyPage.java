package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class BuyPage {
    private SelenideElement buyHeader = $(withText("Оплата по карте"));
    private SelenideElement cardNumberField = $(withText("Номер карты"));
    private SelenideElement monthField = $(withText("Месяц"));
    private SelenideElement yearField = $(withText("Год"));
    private SelenideElement ownerField = $(withText("Владелец"));
    private SelenideElement cvcCvvField = $(withText("CVC/CVV"));
    private SelenideElement continueButton = $(withText("Продолжить"));

    public BuyPage() {
        buyHeader.shouldBe(visible);
    }
}
