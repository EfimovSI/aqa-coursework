package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class BuyOnCreditPage {
    private SelenideElement buyOnCreditHeader = $(withText("Кредит по данным карты"));

    public BuyOnCreditPage() {
        buyOnCreditHeader.shouldBe(visible);
    }
}
