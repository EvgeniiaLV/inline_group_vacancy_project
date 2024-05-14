## Training project for the company's website [Inline Group](https://inlinegroup.ru/)

<image src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/assets/153442050/329cb0b4-53b8-483e-8a9a-f74b0f5c790d" width="150" height="150"/>

---
### Content
1. [Tools and technologies](#tools-and-technologies)
2. [CI/CD: Jenkins](#ci-cd-jenkins)
3. [How to launch](#how-to-launch)
4. [Allure reporting](#allure-reporting)
5. [Integration with Allure TestOps](#integration-with-allure-testops)
6. [Integration with Jira](#integration-with-jira)
7. [Notifications in Telegram](#notifications-in-telegram)
8. [Test execution example](#test-execution-example)
---
### Tools and technologies
<p align="left">
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/gitHub.svg" height="40" width="40" /> 
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/java.svg" height="40" width="40" />
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/IntelliJIdea.svg" height="40" width="40" />
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/gradle.svg" height="40" width="40" />
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/jenkins.svg" height="40" width="40" />
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/junit5.svg" height="40" width="40" />       
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/jira.svg" height="40" width="40" />
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/allure.svg" height="40" width="40" />
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/allureTestOps.svg" height="40" width="40" />
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/selenide.svg" height="40" width="40" />
  <img align="center" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/icons/telegram.svg" height="40" width="40" />
</p>
---

### Test scenarios
#### Automated check list:
1. Check that search with valid value returns not empty result
2. Check that search with invalid value returns empty result
3. Check that default language is RUS
4. Check that by clicking on language icon language is changed to EN
5. Check error message when not existing page is opened
6. Check that by clicking on VK icon a new tab is opened
7. Check that by clicking on YouTube icon a new tab is opened
#### Manual check list:
1. By clicking on Telegram icon the Telegram App opened or a new tab which asks for confirmation to open the Telegram App
2. By clicking on right arrow on the central slider opens next advertisement slide
3. By clicking on left arrow on the central slider opens previous advertisement slide
---
### CI CD Jenkins
<pre>
<img align="left" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/images/jenkinsProject.jpg"/>

</pre>

#### Parameters:
BROWSER - browser (Chrome by default)  
BROWSER_SIZE - browser window size (1920x1080 by default)  
BROWSER_VERSION - browser version (120.0 by default)  
REMOTE_DRIVER_URL - remote Selenoid server, login & password

---
### How to launch
#### Locally
gradle clean vacancyProjectRegress
#### From Jenkins
clean vacancyProjectRegress
-DremoteDriverURL=${REMOTE_DRIVER_URL}
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserVersion=${BROWSER_VERSION}

### Allure reporting
<pre>
<img align="left" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/images/allureReport.jpg"/>  

</pre>

Shows test details: steps, page source, screenshots of last test step, video, browser console logs.
<pre>
<img align="left" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/images/allureReportTaskSteps.jpg"/>

</pre>
---
### Integration with Allure TestOps
<pre>
<img align="left" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/images/allureTestOpsDashboard.jpg"/>

</pre>

Test run statistics in Allure TestOps:
<pre>
<img align="left" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/images/allureTestOpsAutomatedTestCases.jpg"/>

</pre>

Launches:
<pre>
<img align="left" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/images/allureTestOpsLaunches.jpg"/>

</pre>

### Integration with Jira
<pre>
<img align="left" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/images/jiraTask.jpg"/>

</pre>

### Notifications in Telegram
<pre>
<img align="left" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/images/telegramBotNotifications.jpg"/>  

</pre>

### Test execution example
<pre>
<img align="left" src="https://github.com/EvgeniiaLV/inline_group_vacancy_project/blob/master/static.files/video/VideoTestExample.gif"/>  

</pre>