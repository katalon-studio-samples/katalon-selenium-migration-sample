

# Introduction

This project demonstrates how katalon studio helps users to use their existing selenium based project into Katalon Studio. Katalon support Selenium TestNG and Selenium Based farmework both.

# Requriments

* Katalon Studio
* Basic understanding of Junit and TestNG
* TestNG/Junit Keywords(https://store.katalon.com/product/180/TestNG-JUnit-Keywords)


# Use case

We have two different application which we have used for our sample project
* BBC **(http://www.bbc.com)**
* Heroku application **(https://signup.heroku.com/)**		

Normal Test script execution
Data driven test execution

# How to migrate

* Downlaod and extract the TestNG or Junit based framework.

* Add all your project file into Include >> Script >>groovy

![image](https://user-images.githubusercontent.com/84115288/206732309-a571e320-d51b-4e80-81be-62f2e9999adf.png)

* Users have to fix all the errors.)Most of the errors are related to the project import so users have to add a proper path for package structure into the import section.)

* Create a resource folder and add the testng.xml file.

![image](https://user-images.githubusercontent.com/84115288/206732800-a19cc136-ec15-4c14-8454-5fbc2a683e69.png)


* Create a test case by using TestNg or Junit Custom keyword.

![image](https://user-images.githubusercontent.com/84115288/206733103-858a3fd5-3403-4a8d-84f8-44ef782f984a.png)

* Run the test on the browser and Verify the results

![image](https://user-images.githubusercontent.com/84115288/206733323-c1c4338d-ff7b-4c57-9bcb-441a58cf3a42.png)



**Repository for the Sample Project:**
https://github.com/katalon-studio-samples/katalon-selenium-migration-sample.git

Thanks.
