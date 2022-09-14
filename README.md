# :four_leaf_clover:Проект по мобильной автоматизации Wildscapes:four_leaf_clover:
<a id="anchor"></a>
## <a target="_blank" href="https://playrix.com/ru/games">Сайт Wildscapes</a>
![Wildscapes](images/Sc.jpeg)

## :four_leaf_clover: Содержание:

- <a href="#four_leaf_clover-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#four_leaf_clover-реализованные-проверки">Реализованные проверки</a>
- <a href="#four_leaf_clover-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#four_leaf_clover-запуск-из-терминала">Запуск из терминала</a>
- <a href="#four_leaf_clover-allure-отчет">Allure отчет</a>
- <a href="#four_leaf_clover-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#four_leaf_clover-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>


## :four_leaf_clover: Технологии и инструменты

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/Intelij_IDEA.png">
<img width="6%" title="Java" src="images/Java.png">
<img width="6%" title="Gradle" src="images/Gradle.png">
<img width="6%" title="JUnit5" src="images/JUnit5.png">
<img width="6%" title="Selenide" src="images/Selenide.png">
<img width="6%" title="Selenoid" src="images/Selenoid.png">
<img width="6%" title="Allure Report" src="images/Allure_Report.png">
<img width="6%" title="Jenkins" src="images/Jenkins.png">
<img width="6%" title="GitHub" src="images/Github.png">
<img width="6%" title="Telegram" src="images/Telegram.png">
</p>

## :four_leaf_clover: Реализованные проверки
- [x] Проверяем что игра загрузилась
- [x] Проверяем что появился текст Terms of Use
- [x] Проверяем что появился текст Privacy Policy


## :four_leaf_clover: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/GameTest/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/J1.png">
</p>  

## :four_leaf_clover: Запуск из терминала
Локальный запуск:

```
gradle clean test -DdeviceHost=browserstack
```

Удаленный запуск:

```
clean
test
-DdeviceHost=browserstack
```


## :four_leaf_clover: Allure отчет
- ### Главный экран отчета
- ### <a target="_blank" href="https://jenkins.autotests.cloud/job/GameTest/allure/#">Сборка в Allure</a>
<p align="center">
<img title="Allure Dashboard" src="images/A1.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/A2.png">
</p>

## :four_leaf_clover: Отчет в Telegram
<p align="center">
<img title="TELEGRAMBOT" src="images/T1.png">
</p>



## :four_leaf_clover: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/loadingTheGame.gif">

:arrow_up: [Вверх страницы](#anchor)

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>

