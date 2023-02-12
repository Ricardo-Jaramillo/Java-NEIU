###### CS-207-3: Programming II <br> Spring 2021 <br> Northeastern Illinois University <br> Homework #4 <br> Due Date: 02/10/21 at 9:00 p.m. (CT) <br> StringBuilder and Wrapper Classes

**Getting Started**

**1.** Detailed instructions are located in the tutorial videos.<br>
**2.** Accept the assignment invitation on D2L.<br>
**3.** Clone the assignment to your computer.<br>
**4.** Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is set
to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.<br>
**5.** Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build
Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from:
is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.<br>
**6.** Project SDK and Gradle JVM should be set to the same Java version.<br>
**7.** Create the `main/java` directory in the `src` directory. This is where you will be creating your Java classes for
your assignment. Right click `src` and go to New > Directory and select `main/java`.<br>

**Submitting your assignment**

**1.** Once you have completed all the problems, commit your final code to GitHub - remember to run all
  the unit tests and the code analyzers. <br>
**2.** Then in IntelliJ, go to File, select Export to Zip File. This will create a zip file of the entire project directory.<br>
**3.** Submit the .zip file to the Homework 4 Assignment folder on D2L.<br>

### Problem 1

1. In the `main/java` directory, create a class named `MyStringBuilder`. It should include the following:
    - A private (i.e. encapsulated) String instance variable named `original`.
    - A constructor that takes one String parameter and sets the instance variable.
    - A getter for the instance variable.
      - Uncomment the test named `shouldInitializeInstanceVariable` in the `MyStringBuilderTest` class (in the `test/java`
        directory). Run the test. Run the code analyzers and commit your code now.
2. Create a method named `removeDigits` that does not take any parameters and returns a String. This method should
   remove any numerical digits (0-9) from `original` and return a String composed of just the non-digits
   with their order preserved. **When solving this problem, you may only use methods from the `StringBuilder` class and 
   wrapper classes. You may not use String methods, a nested loop, or the `OR (||)` logical operator.**<br>
   <em>Hint:</em> Remember that StringBuilder objects are mutable and changing them may shorten or lengthen
   your underlying StringBuilder value, which can cause index issues!
      - Uncomment the tests beginning with `removeDigits...` in the `MyStringBuilderTest` class (in the `test/java` directory).
        Run the tests. Run the code analyzers and commit your code now.
3. Create a method named `removeLetters` that does not take any parameters and returns a String. This method should remove
   everything that is a letter (a-z, A-Z) from `original` and return a String composed of just
   the non-letters with their order preserved. **When solving this problem, you may only use methods from the `StringBuilder` class and
   wrapper classes. You may not use String methods, a nested loop, or the `OR (||)` logical operator.**<br>
   <em>Hint: </em>Remember that StringBuilder objects are mutable and changing them may shorten or lengthen
   your underlying StringBuilder value, which can cause index issues!
      - Uncomment the tests beginning with `removeLetters...` in the `MyStringBuilderTest` class (in the `test/java` directory). 
        Run the tests. Run the code analyzers and commit your code now.

**Note.** To help you debug and understand your code, you can create a `MyStringBuilderDemo` class with the `main` method,
but it is not required as part of your grade.<br>

### Problem 2

1. In the `main/java` directory, create a class named `StringMath`. It should include the following:
    - A private (i.e. encapsulated) String instance variable named `value`.
    - A constructor that takes one String parameter and sets the instance variable.
    - A getter for the instance variable.
        - Uncomment the test named `shouldInitializeInstanceVariable` in the `StringMathTest` class (in the `test/java`
          directory). Run the test. Run the code analyzers and commit your code now.
2. Create a method named `sumDigits` that does not take any parameters and returns an `int`. This method should
   find the sum of all the numerical digits (0-9) in `value` and return the sum. **When solving this problem, you 
   may only use methods from the `StringBuilder` class and wrapper classes. You may not use String methods 
   or a nested loop.** You may use concatenation.<br>
3. In the `main/java` directory, create a class named `StringMathDemo` that has the `main` method. **This is
   required as part of your grade.** Test out your `sumDigits` method by creating `StringMath` objects in the
   `main` method and calling the `sumDigits` method. 
4. Uncomment the tests beginning with `sumDigits...` in the `StringMathTest` class (in the `test/java` directory).
   Run the tests. Run the code analyzers and commit your code now.

### Problem 3

1. In the `main/java` directory, create a class named `StarString`.
2. Create a static method named `exploding` that takes a String as a parameter and returns a String. For every
   asterisk in the parameter, insert a dash immediately to the left of the asterisk and immediately to the right. For
   example, `ab*cd` would turn into `ab-*-d` and `ab**cd` would be `ab-*--*-cd` You can assume that the String 
   parameter is not empty. **When solving this problem, you may only use methods from the `StringBuilder` class 
   and wrapper classes. You may not use String methods or a nested loop.**<br>
   <em>Hint:</em> Remember that StringBuilder objects are mutable and changing them may shorten or lengthen
   your underlying StringBuilder value, which can cause index issues!
3. In the `main/java` directory, create a class named `StarStringDemo` that has the `main` method. **This is 
   required as part of your grade.** Test out your `exploding` method by calling it in the `main` method.
4. Uncomment the tests beginning with `exploding...` in the `StringStarTest` class (in the `test/java` directory).
   Run the tests. Run the code analyzers and commit your code now.
   