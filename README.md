
# Introduction

This project demonstrates how katalon studio helps users to use their existing selenium based project into Katalon Studio. Katalon supports selenium testNG and selenium based framework both.

# Requirements

* [Katalon Studio][KS]
* Basic understanding of Junit and TestNG
* TestNG/Junit Keywords. [Here][2]


# Use case

We have two different application which we have used for our sample project
* BBC **(http://www.bbc.com)**
* Heroku application **(https://signup.heroku.com/)**		

Normal test script execution
Data driven test execution

# How to migrate

* Downlaod and extract the testNG or junit based framework.

* Add all your project file into Include >> Script >>groovy

![image](https://user-images.githubusercontent.com/84115288/206732309-a571e320-d51b-4e80-81be-62f2e9999adf.png)

* Change web driver configurion as per screenshot mentioned below.

![image](https://user-images.githubusercontent.com/84115288/215331198-37dd231b-aa50-475c-8d9d-63e23b62ae53.png)

* Users have to fix all the errors.(most of the errors are related to the project import so users have to add a proper path for package structure into the import section.)

* Create a resource folder and add the testng.xml file.

![image](https://user-images.githubusercontent.com/84115288/206732800-a19cc136-ec15-4c14-8454-5fbc2a683e69.png)


* Create a test case by using testNG or junit custom keyword.

![image](https://user-images.githubusercontent.com/84115288/206733103-858a3fd5-3403-4a8d-84f8-44ef782f984a.png)

* Run the test on the browser and verify the results

![image](https://user-images.githubusercontent.com/84115288/206733323-c1c4338d-ff7b-4c57-9bcb-441a58cf3a42.png)

For More Details - [Selenium/TestNG/JUnit Migration to Katalon Studio][1]

**Repository for the Sample Project:**
https://github.com/katalon-studio-samples/katalon-selenium-migration-sample.git

[1]: <https://docs.katalon.com/docs/get-started/migration-from-other-tools/seleniumtestngjunit-migration-to-katalon-studio#ariaid-title1> "Selenium/TestNG/JUnit Migration to Katalon Studio"
[2]: <https://store.katalon.com/product/180/TestNG-JUnit-Keywords> "Here"
[KS]: <https://docs.katalon.com/docs/get-started/katalon-studio-installation/install-katalon-studio-on-macoswindows#download-katalon-studio> "Katalon Studio"
