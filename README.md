# JavaConsole1
Java console application (Calculator)

> [!IMPORTANT]
> Exercise from Mastering Java 100+ exercises (Ruhan Conceiçao)

## Exercise1

Write a program that prompts the user for two numbers and display the addition, subtraction, multiplication and division between them.

### The original exercise solution does not include:Gradle + testing + Exceptions handling.

Implementation of the Calculator class with input from console. 

#### Build the application
1. Open the project in IntellijIdea
2. Execute the tasks: Ctrl + Ctrl + gradle clean build test javadoc

## To Run the program:
1. From IntelliJIdea: 

- Ctrl + Ctrl + gradle run or Ctrl + Ctrl +./gradlew run

2. From terminal:

- Go to build/libs folder and execute: java -jar Calculadora-1.0.0.jar
- Go to build/distributions folder and extract any of the files located (.tar or .zip). Go to the /bin folder and execute: ./IntellijIdeaProject1

To see test result, go to build/reports/tests/test folder and open the index.html in a browser.

To generate the documentation: Ctrl + Ctrl + gradle javadoc.

Class documentation can be found in build/docs/javadoc and open the index.html file.

> [!NOTE]
> Exercises 2 through 15 can be solve using the same methodology (Gradle + Testing + Exceptions + Docs).