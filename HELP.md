# Getting Started

## Prerequisite

Java and Maven and mysql has to be there before running this application.if not available then installed before proceeding next step.

## Technology Used

* Java 1.8
* Spring boot 2.6.4
* MYSQL

### Steps to Build 

* Goto project folder and run **mvn clean install**

### DB setup 

* Run the below query on DB
	create database universitydb;
	
* Goto project folder then src/main/resources folder  and change DB details in application.properties file
	spring.datasource.url = jdbc:mysql://localhost:3307/universitydb
	spring.datasource.username = root
	spring.datasource.password = Password@1234


### Steps to run the application

* Goto project folder and run **mvn spring-boot:run**

### Alternate Steps to run the application
* Open command prompt & go to project location where you have copied jar file
* java –jar jar_file_name.jar (check the jar file name in your target folder i.e UniversityApplication-0.0.1-SNAPSHOT.jar)

### Apis to test

* http://localhost:8090/dataPorting/353/source

* Method type : two Post --> create and PUT ---> update 

* Body 
{
    "id" : 1,
    "college_id": "353",
    "name": "applicant",
    "email": "dummy@gmail.com",
    "country_dial_code": "+91",
    "mobile": "9999999999",
    "source":"5pxl",
    "state":"Delhi",
    "city" : "New Delhi",
    "secret_key":"Hashshared",
    "campaign": "test",
    "campus": "test1",
    "medium": "test2"
}

Note : while create request don't pass any id on the request and for update id is mendatory. And if you don't pass any mendatory field it will failed.
