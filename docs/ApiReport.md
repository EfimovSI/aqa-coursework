# Отчет о тестировании API

Настоящий отчет содержит информацию об автоматизации тестирования комплексного сервиса для покупки тура, взаимодействующего с СУБД и API банка в части API.

## Тест-кейсы
В рамках тестирования API было проведено 5 тестов, 3 (60%) из них прошли успешно, 2 (40%) - не прошли.

![AllureReport3](https://user-images.githubusercontent.com/91226368/172935580-2c036a7f-f215-42cf-9b41-8e13975b01e0.png)

## Рекомендации по итогам тестирования API
1. Проработать ответ сервера на запрос с неизвестным номером карты. В настоящее время SUT отвечает статусом 500: Internal Server Error. Ожидается ответ, информирующий о неизвестном номере карты или статус 400 
