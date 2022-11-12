# Проект по автоматизации тестирования X5 Retail

# Содержание:

- [Технологии и инструменты](#rocket-технологии-и-инструменты)
- [Реализованные проверки](#scroll-реализованные-проверки)
- [Сборка в Jenkins](#-jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#-отчет-в-allure-report)
- [Отчет в Telegram](#-уведомление-в-telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#-примеры-видео-о-прохождении-тестов)

# Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

# Реализованные проверки

- ✓ Проверка отображения второго уровня меню для подпункта 'Компания' на главной странице.
- ✓ Проверка отображения второго уровня меню для подпункта 'Карьера' на главной странице.
- ✓ Проверка смены языка на EN на сайте Х5.
- ✓ Проверка отображения страницы с вакансиями компании на сайте Х5.
- ✓ Проверка отображения вакансий Х5 на сайте HH.

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job

<a target="_blank" href="https://jenkins.autotests.cloud/job/Ponomarev_DZ_15//">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/Ponomarev_DZ_15/"><img src="images/jenkins_job_results.png" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

* browser (default chrome)
* browserVersion (default 105.0)
* browserSize (default 1920x1080)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)

# Запуск тестов из терминала

```bash
gradle clean test
```

### Удаленный запуск:

```bash
clean test
-Dbrowser_name=${BROWSER_NAME}
-Dbrowser_version=${BROWSER_VERSION}
-Dbrowser_size=${BROWSER_SIZE} 
-Dselenide.remote=${REMOTE_URL}
```

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/Ponomarev_DZ_15/10/allure/">Allure report</a>



<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main_page.png">
</p>


## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/telegram_bot.png">
</p>

### <img src="images/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Пример видео о прохождении тестов

<p align="center">
 <img title="Selenoid Video" src="images/test_video.gif" width="250" height="153"  alt="video"> 
</p>

