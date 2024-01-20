package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
  <b>Exercise from Mastering Java 100+ exercises (Ruhan Conceiçao)</b>
  <br>
 <br>
  <b>Exercise 1:</b>
 Write a program that prompts the user for two numbers and display
  the addition, subtraction, multiplication and division between them.
  <br>
  <br>
  <strong>
 The original exercise solution does not include:Gradle + testing + Exceptions handling.
 </strong>
 <br>
  Implementation of the Calculator class with input from console.
  To Run the program:
  <ol>
  <li> From IntelliJIdea: Ctrl + Ctrl + gradle run or Ctrl + Ctrl +./gradlew run</li>
  <li> From terminal:
  <ol>
  <li> Go to <strong>build/libs</strong> folder and execute: java -jar Calculadora-1.0.0.jar</li>
  <li> Go to <strong>build/distributions</strong> folder and extract any of the files located (.tar or .zip).
       Go to the <strong>/bin folder</strong> and execute: <strong>./IntellijIdeaProject1</strong>
 </li>
 </ol>
 </li>
 </ol>
 <p>
 To see test result, go to <strong>build/reports/tests/test</strong> folder and open the index.html in a
 browser <a href="../../../../reports/tests/test/index.html">Go to Test</a>
 </p>
 <p>
 To generate the documentation: <strong>Ctrl + Ctrl + gradle javadoc</strong>
 Class documentation can be found in <strong>build/docs/javadoc</strong>. Open the index.html file or
 <a href="../../../../docs/javadoc/index.html">click here</a>
 </p>

 */
@ClassPreamble(
        author = "Mauricio Bedoya",
        date = "01/01/2024",
        currentRevision = 3,
        lastModified = "17/01/2024",
        lastModifiedBy = "Mauricio Bedoya"
)
public class Main {
    /**
     * @hidden
     */
    public Main(){}
    /**
     * Entry point method for executing a java program.
     * @param args - Extra arguments passed to the function Main when the app runs in the console.
     */
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Type number1: ");
            var value1 = scan.nextInt();
            System.out.print("Type number2: ");
            var value2 = scan.nextInt();

            Calculator calculator = new Calculator(value1, value2);
            calculator.OperationSummary();

        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex){
            System.out.println("Program terminates due to incorrect input from user !!");
        }

    }
}