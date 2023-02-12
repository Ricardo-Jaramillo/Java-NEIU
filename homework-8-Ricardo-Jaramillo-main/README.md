<h6>
CS-207-3: Programming II <br> 
Spring 2021 <br> 
Northeastern Illinois University <br> 
Homework #8 <br> 
Due Date: 04/07/21 at 9:00 p.m. (CT) <br> 
Abstract Classes and Interfaces
</h6>

#### Getting Started

1. Clone the assignment to your computer.
2. Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is
   set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.
3. Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build
   Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from:
   is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.
4. Project SDK and Gradle JVM should be set to the same Java version.
5. If not already created, create the `main/java` directory in the `src` directory. This is where you will 
   be creating your Java classes for your assignment. Right click `src` and go to `New > Directory` and 
   select `main/java`. 

#### Submitting your assignment

1. Make sure that all your code is committed to GitHub and that all the code analyzers and unit tests
   pass.
2. You will have the opportunity to make corrections on any code that is a complete/valid attempt at
   solving the problem. Code that does not compile or run does not constitute a complete/valid attempt.
3. In IntelliJ, go to File, select Export to Zip File. This will create a zip file of the entire project 
   directory.
4. Submit the .zip file to the Homework 7 Assignment folder on D2L.

#### Running Tests and Code Analyzers

1. To run unit tests: Click the green arrow to the left of each header to run the tests individually or click the
   green arrow to the left of the class header to run all the tests. If they do not pass, your code is incorrect.
2. To run code analyzers: On the right side of IntelliJ, click Gradle, expand Tasks > other.
    - Double-click the checkstyleMain task to run it.
    - Double-click on the pmdMain task in the same panel.
    - If there are errors: You can click the link provided, then choose your browser of choice at the top-right corner to view the
      error description or in the bottom left panel, click the middle red exclamation point to view the error.
      Fix the issue and rerun checkstyleMain, repeat if necessary.
3. Note that while having all the unit tests and pmd/checkstyle tests is the first step for your code to be
   considered correct, this does not necessarily mean the algorithm is correct.
4. Once unit tests and code analyzers all pass, open GitHub Desktop. You will be able to see the files that
   have been changed in the left panel. Enter a summary in the bottom left then click "Commit to main". Then click Push
   Origin in the right panel at the top.
5. If you go to your GitHub account and go to the Actions tab for this assignment repository, you can see the
   workflow running.

### Problem 1: Abstract Classes and Interfaces

1. In the `src/main/java` directory, create a package named `problem1`.
2. In the `problem1` directory, create an interface named `Scoreable`. To do this, right-click on the package
   and choose `New > Java Class` and select `Interface`.
   - In the `Scoreable` interface, create an abstract method named `getResults` that does not take any
     parameters and returns a 1D integer array.
   - In the `Scoreable` interface, create an abstract method named `addResult` that takes one parameter,
     an integer, and does not return anything.
3. In the `problem1` directory, create an abstract class named `Sport` with the following:
   - The `Sport` class should implement the `Scoreable` interface.
   - Two encapsulated instance variables: A `String` named `name` and an integer named `numberOfPlayers`.
   - A constructor that takes two parameters, a `String` and an integer and sets the instance variables.
   - Getters for both the instance variables.
   - A method named `isTeamSport` that does not take any parameters and returns a boolean. The method should
     return true if the `numberOfPlayers` is greater than 1 and false otherwise.
   - An abstract method named `printCurrentStanding` that does not take any parameters and does not return
     anything.
       - In the `src/test/java/problem1/SportTest.java` file, uncomment the test and run it. Note that this file is
         only testing one small portion of the `Sport` class. The rest will be tested after creating subclasses.
       - Run the code analyzers and commit your code to GitHub.
4. In the `problem1` directory, create a concrete class named `Baseball` with the following:
   - The `Baseball` class should inherit from the `Sport` class.
   - An encapsulated 1D integer array instance variable named `results`.
   - Your code will not compile until you override all the abstract methods. To get your code to compile, 
     temporarily override the `getResults` method to return `null`, override the `addResult` method to be
     empty, and override the `printCurrentStanding` to be empty.
   - The code will still not compile until we handle inheritance. Create a default constructor (above the
     methods you already overrode). This constructor should set the superclass instance variables to `Baseball`
     and `9`. It should also initialize the `results` instance variable to be an integer array of length 0.
        - In the `src/test/java/problem1/BaseballTest.java` file, uncomment the tests beginning with `getName...`,
          `getNumber...`, and `isTeamSport`.
        - Run the code analyzers and commit your code to GitHub.
   - Modify the `getResults` method to return a clone of the `results` instance variable. Hint: Arrays have
     a `clone` method!
   - Modify the `addResult` method to add the parameter to the `results` array. If the parameter is not a
     0 or 1, throw an `IllegalArgumentException` with the message "Value must be 0 or 1". To add the value
     to the `results` array, you will need to make a new array that has all the values of the `results` array, 
     plus one extra element for the new value. Then assign this to the `results` array.
        - In the `src/test/java/problem1/BaseballTest.java` file, uncomment the tests beginning with `addResult...` and
          `getResults...`.
        - Run the code analyzers and commit your code to GitHub.
   - Modify the `printCurrentStanding` method such that if there are no results stored yet, the method prints
     out "No standing yet" on its own line. Otherwise, the method should calculate the ratio of wins as the total
     number of wins (1's) divided by the number of results. (Note, losses are represented by 0's).
       - In the `src/test/java/problem1/BaseballTest.java` file, uncomment the tests beginning with `printCurrent...`.
       - Run the code analyzers and commit your code to GitHub.
5. In the `problem1` directory, create a concrete class named `Swimming` with the following:
    - The `Swimming` class should inherit from the `Sport` class.
    - An encapsulated 1D integer array instance variable named `results`.
    - Your code will not compile until you override all the abstract methods. To get your code to compile,
      temporarily override the `getResults` method to return `null`, override the `addResult` method to be
      empty, and override the `printCurrentStanding` to be empty.
    - The code will still not compile until we handle inheritance. Create a default constructor (above the
      methods you already overrode). This constructor should set the superclass instance variables to `Swimming`
      and `1`. It should also initialize the `results` instance variable to be an integer array of length 0.
        - In the `src/test/java/problem1/SwimmingTest.java` file, uncomment the tests beginning with `getName...`,
          `getNumber...`, and `isTeamSport`.
        - Run the code analyzers and commit your code to GitHub.
    - Modify the `getResults` method to return a clone of the `results` instance variable. 
    - Modify the `addResult` method to add the parameter to the `results` array. If the parameter is not a
      positive integer, throw an `IllegalArgumentException` with the message "Value must be 1 or higher". 
      Add the value using a similar approach as described for the `Baseball` class.
        - In the `src/test/java/problem1/SwimmingTest.java` file, uncomment the tests beginning with `addResult...` and
          `getResults...`.
        - Run the code analyzers and commit your code to GitHub.
    - Modify the `printCurrentStanding` method such that if there are no results stored yet, the method prints
      out "No standing yet" on its own line. Otherwise, the method should calculate the average of the results.
        - In the `src/test/java/problem1/BaseballTest.java` file, uncomment the tests beginning with `printCurrent...`.
        - Run the code analyzers and commit your code to GitHub.
6. Create a `main` method and test your code. Make sure to create at least one `Baseball` object and one
   `Swimming` object and to call all the public methods (and print out their results).
7. Run the code analyzers.
8. Commit your code to GitHub.

### Problem 2: The `Comparable` Interface

1. In the `src/main/java` directory, create a package named `problem2`.
2. In the `problem2` package, create a class named `ComplexNumber`. A complex number is a number in the form
   *a + bi* where *a* and *b* are real numbers and *i* is the square root of -1. The number *a* is known as
   the "real" part, and the number *b* is known as the "imaginary" part.
3. Create two encapsulated integer instance variables named `a` and `b`.
4. Create a default constructor that does not take and parameters and sets the instance variables to 0.
5. Create an overloaded constructor that takes one integer parameter and sets the `a` instance variable to
   the parameter and the `b` instance variable to 0.
6. Create an overloaded constructor that takes two integer parameters and sets the instance variables.
7. Override the `toString` method to return a String in the form `a + bi`. However, if b is negative, the
   String should be in the form `a - bi`.
    - In the `src/test/java/problem2/ComplexNumberTest.java` file, uncomment the tests beginning with 
      `toString` and run them.
    - Run the code analyzers and commit your code to GitHub.
8. Override the `equals` method to return true if the reference calling the method and the method parameter
   have the same real and imaginary values, and false otherwise.
    - In the `src/test/java/problem2/ComplexNumberTest.java` file, uncomment the tests beginning with
      `equals` and run them.
    - Run the code analyzers and commit your code to GitHub.
9. Modify the class header so that the class implements the `Comparable` interface. Make sure to include the
   Generic type! 
10. Override the `compareTo` method to return the result of subtracting the real part of the method parameter
    from the real part of the reference calling the `compareTo` method. 
    - In the `src/test/java/problem2/ComplexNumberTest.java` file, uncomment the tests beginning with
      `compareTo` and run them.
    - Run the code analyzers and commit your code to GitHub.
11. Create a `main` method and test your code. Make sure to test all the public methods (and print out 
    their results).
12. Run the code analyzers.
13. Commit your code to GitHub.

### Problem 3: Functional Interfaces and Lambdas

1. In the `src/main/java/problem3` directory, look at the code in `InterfaceFoo` (a functional interface). For 
   each of the provided lambdas, explain whether the lambda can be used with the functional interface
   and whether it is a valid lambda (and why or why not). Your answer should go in the commented section
   where `YOUR RESPONSE HERE:` is written.
2. In the `src/main/java/problem3` directory, look at the code in `InterfaceBaz` (a functional interface). 
   Write a valid lambda for the interface and explain why it is a valid lambda for this interface. Your 
   answer should go in the commented section where `YOUR RESPONSE HERE:` is written. 
3. Commit your code to GitHub.