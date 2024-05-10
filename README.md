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
8. [Test execution exanple](#test-execution-exanple)
---
### Tools and technologies
<p align="left">
  <img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original-wordmark.svg" height="40" width="40" /> 
  <img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" height="40" width="40" />
  <img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" height="40" width="40" />
  <img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" height="40" width="40" />
  <img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" height="40" width="40" />
  <img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-plain-wordmark.svg" height="40" width="40" />       
  <img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jira/jira-original-wordmark.svg" height="40" width="40" />
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
Shows test details: steps, page source, screenshots of last test step, video, browser console logs.

### Integration with Allure TestOps
Test run statistics in Allure TestOps:

---
### Integration with Jira

---
### Notifications in Telegram

---
### Test execution exanple