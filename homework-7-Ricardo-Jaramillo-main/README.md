<h6>
CS-207-3: Programming II <br> 
Spring 2021 <br> 
Northeastern Illinois University <br> 
Homework #7 <br> 
Due Date: 03/24/21 at 9:00 p.m. (CT) <br> 
Exception Handling
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

### Problem 1: Handling Exceptions

1. In the `src/main/java` directory, create a java class named `StringParser.java` with the following:
   - A private constructor that does not do anything.
      - In the `src/test/java/StringParserTest.java` file, uncomment the test that begins with the word
        `constructor` and run it.
   - Create a static method named `findInteger` that takes a `String` and two `char` variables as 
     parameters (in that order) and does not return anything.
   - The `findInteger` method should find the integer value that is located between the two character
     parameters. You can assume that the second `char` parameter will always occur after the first `char`
     parameter and that each value will only occur once in the String parameter.
   - If the value between the character parameters is a valid integer, divide it by the number of digits
     in the integer (use integer division) and add one. On its own line, print out `Result: ` followed by the result. Remember the
     difference between `System.out.println` and `System.out.print`!
   - For example, `findInteger("fert45%dol", 't', '%')` will print out: 
     ```
     Result: 23
     ```
   - If the value between the character parameters is not a valid integer, print out `Invalid integer` on
     its own line, followed by printing out the result of calling the `toString` method on the exception
     object (on its own line).
   - Make sure to handle the specific exception class (i.e. do **not** use the superclass `Exception` to 
     catch the exception object).
   - Hint: Take a look at the `parseInt` method in the Integer wrapper class - does it throw any exceptions?: 
     [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#parseInt(java.lang.String))
   - In the `src/test/java/StringParserTest.java` file, uncomment the tests that begin with the words
     `findInteger` and run them.
2. Create a `main` method and test your code.
3. Run the code analyzers.
4. Commit your code to GitHub.

### Problem 2: Throwing Exceptions

1. In the `src/main/java` directory, create a java class named `Complement.java` with the following:
   - One encapsulated instance variable: A `String` named `binary`.
   - A constructor that takes one parameter. 
      - It the parameter is `null`, throw a `NullPointerException` with the message `Null binary String`.
      - If the parameter is not a valid binary number - i.e. a String that only has 0s and 1s - you 
        should throw an `IllegalArgumentException` with the message `Not a valid binary number`. If 
        the parameter is a valid binary number, set the instance variable.
      - In the `src/test/java/ComplementTest.java` file, uncomment the tests that begin with the words
        `constructor` and run them.
   - A getter for the instance variable.
      - In the `src/test/java/ComplementTest.java` file, uncomment the test that begins with the words
        `getBinary` and run it.
   - Create an instance method named `onesComplement` that does not take any parameters and returns a String
     that is the 1's complement of the parameter. The 1's complement of a binary number is a binary number
     with the 1's switched to 0's and the 0's switched to 1's. For example, 0011 is the 1's complement 
     of 1100. Do **not** modify the instance variable!
      - In the `src/test/java/ComplementTest.java` file, uncomment the tests that begin with the words
        `onesComplement` and run them.
2. Create a `main` method and test your code.
3. Run the code analyzers.
4. Commit your code to GitHub.

### Problem 3: Files and Handling Checked Exceptions

1. In the `src/main` directory, you have been provided with a `resources` directory that contains several
   text files. Each file contains lines that have integers - a different number of integers per line.
2. In the `src/main/java` directory, create a class named `FileReader` with the following:
    - A private constructor that does not do anything.
    - In the `src/test/java/FileReaderTest.java` file, uncomment the test that begins with the word
      `constructor` and run it.
    - Create a static method named `findSumFromFile` that takes a String as a parameter and returns an
      integer. This parameter represents the name and path of the file. For example, if the file is 
      `file1.txt`, then the String passed in would be `"src/main/resources/file1.txt"` on Mac and 
      `"src\main\resources\file1.txt"`on Windows. The path is relative to the project root directory. 
        - The method should read all the integers from the file and calculate and return the sum. Use the
          `Scanner` and `File` classes to do this. 
        - Make sure to handle the checked exception associated with the `Scanner` class. If no file can 
          be found, print out the `toString` method of the exception object on its own line and return 
          a sum of zero.
        - In the `src/test/java/FileReaderTest.java` file, uncomment the tests that begin with the words
          `findSum` and run them.
3. Create a `main` method and test your code.
4. Run the code analyzers.
5. Commit your code to GitHub. 