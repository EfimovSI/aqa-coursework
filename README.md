[![Build status](https://ci.appveyor.com/api/projects/status/wpssgrhwajsx5erk?svg=true)](https://ci.appveyor.com/project/EfimovSI/aqa-coursework-scwli)
# Проект автоматизации тестирования комплексного сервиса для покупки тура

В рамках настоящего проекта планируется осуществить автоматизацию тестирования комплексного сервиса для покупки тура, взаимодействующего с СУБД и API банка.

Приложение представляет из себя веб-сервис.

<img width="705" alt="service" src="https://user-images.githubusercontent.com/91226368/171269689-18911cd9-085a-4ac0-8a36-d0a123af2d72.png">

Приложение предлагает купить тур по определённой цене с помощью двух способов:

1. Обычная оплата по дебетовой карте
2. Уникальная технология: выдача кредита по данным банковской карты

Само приложение не обрабатывает данные по картам, а пересылает их банковским сервисам:

* сервису платежей (далее - Payment Gate)
* кредитному сервису (далее - Credit Gate)

Приложение должно в собственной СУБД сохранять информацию о том, каким способом был совершён платёж и успешно ли он был совершён (при этом данные карт сохранять не допускается).

## Запуск SUT

### На ПК должны быть установлены:

1. Git
2. Docker Desktop
3. IntelliJ IDEA
4. Java 11
5. Любой современный браузер

### Установка и запуск SUT

1. Клонировать репозиторий командой git clone
2. Открыть проект в IntelliJ IDEA
3. Запустить контейнеры БД командой  docker-compose up -d
4. Ввести в терминале команду  java -jar ./aqa-shop.jar
5. Перейти в браузере по ссылке http://localhost:8080/

### Запуск тестов и отчетов Allure
1. Для запуска тестов и генерации отчета в терминале ввести команду  ./gradlew clean test allureReport
2. Для просмотра отчетов в терминале ввести команду  ./gradlew allureServe


## Перечень проектной документации
1. [План автоматизации](https://github.com/EfimovSI/aqa-coursework/blob/bd34b0c8296c9a93fbf74f755abc9cfe9222e747/docs/Plan.md)
2. [Отчет о тестировании UI](https://github.com/EfimovSI/aqa-coursework/blob/f30d3cf2174bdfe0bac80caed1b8d6cbbb16973f/docs/UiReport.md)
3. [Отчет о тестировании API](https://github.com/EfimovSI/aqa-coursework/blob/7877d9d50adec4ddc39eec5f92c0d9bbc0e0cd9d/docs/ApiReport.md)
4. [Отчет по итогам автоматизации](https://github.com/EfimovSI/aqa-coursework/blob/f00aef2812133355d60d20d5e53fd3297d30bdc4/docs/Summary.md)
