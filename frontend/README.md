# web-consumer-provider






## Minimum requirements
- NodeJS 10+ -  [https://nodejs.org/en/](https://nodejs.org/en/)
- JDK 1.8 - [https://www.oracle.com/java/technologies/javase-jdk8-downloads.html](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- Maven 3.6 -  [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

## setup environment
Setting environment variables:

- add on the PATH variable: "C:\Program Files\Java\jdk1.8.0_181"

- add the JAVA_HOME variable: "C:\Program Files\Java\jdk1.8.0_181\bin"


## Getting started
 
This application is divided into front-end and back-end and must have both servers initialized.

## Front-end - Angular

Run the commands into the "frontend' folder.

Install project dependencies 
```cmd
npm install
```

Start the frontend server  
```cmd
ng serve --proxy-config proxy.config.json
```
The server will be run on [http://localhost:4200/](http://localhost:4200/)

## Back-end - Springboot

Run the commands into the "backend" folder.

There are 2 ways to start the back-end server:

1.  Import the project into an Java IDE and run the com.ul.test.TestApplication.java file.

2. Execute the following comands into back-end folder:
```cmd
mvn clean install

[INFO] ------------------------------------------------------------------------  
[INFO] BUILD SUCCESS  
[INFO] ------------------------------------------------------------------------  
[INFO] Total time: 9.707 s  
[INFO] Finished at: 2019-06-05T11:08:20-03:00  
[INFO] ------------------------------------------------------------------------

cd target
java -jar test-0.0.1-SNAPSHOT.jar
```
The server will be run on [http://localhost:8080/](http://localhost:8280/)
