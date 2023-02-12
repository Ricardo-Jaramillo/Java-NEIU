<h6>
CS-207-3: Programming II <br> 
Spring 2021 <br> 
Northeastern Illinois University <br> 
Homework #9 <br> 
Due Date: 04/19/21 at 9:00 p.m. (CT) <br> 
File I/O and Intro to Data Structures
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

### Problem 1: File Input

1. In the `src/main` directory, you have been provided with a `resources` directory that contains several
   text files. Each file contains lines that have a name followed by *at least* 4 numbers each separated by
   a comma and a space.
2. In the `src/main/java` directory, create a package named `problem1`. In this directory, create a class 
   named `FileAverage` with the following:
    - A private constructor that does not do anything.
    - In the `src/test/java/problem1/FileAverageTest.java` file, uncomment the test that begins with the word
      `constructor` and run it.
    - Create a static method named `averageOfLineAverages` that takes a String as a parameter and returns a
      double. The parameter represents the name and path of the file. For example, if the file is
      `file1.txt`, then the String passed in would be `"src/main/resources/file1.txt"` on Mac and
      `"src\main\resources\file1.txt"`on Windows. The path is relative to the project root directory.
        - The method should find the average of the numbers in each line and then find the average of the line averages. 
          Use the `FileReader` and `BufferedReader` classes to do this.
        - Make sure to handle the checked exceptions. If no file can be found, print out the `toString` 
          method of the exception object on its own line and return an average of 0.
        - In the `src/test/java/problem1/FileAverageTest.java` file, uncomment the tests that begin with the 
          words `averageOf...` and run them.
3. Create a `main` method and test your code.
4. Run the code analyzers.
5. Commit your code to GitHub.

### Problem 2: File Output

1. In the `src/main/java` directory, create a package named `problem2`. In this directory, create a class
   named `RandomNumberFile` with the following:
   - A private constructor that does not do anything.
   - In the `src/test/java/problem2/RandomNumberFileTest.java` file, uncomment the test that begins with the word
     `constructor` and run it. 
2. Create a static method named `writeRandomNumbersPrintWriter` that takes a String (`fileName`) and two integers 
   (`n` and `lineCount`) as parameters and does not return anything. The String parameter represents the name and 
   path of the file. For example, if the file is `file1.txt`, then the String passed in would be `"src/main/resources/rand1.txt"` 
   on Mac and `"src\main\resources\rand1.txt"`on Windows. The path is relative to the project root directory. 
      - The method should print the numbers 1 through `n` to `fileName` such that there are `lineCount` integers on
        each line. For example, if `n` is 10 and `lineCount` is 5, the file would have the numbers `1, 2, 3, 4, 5`
        on one line and the numbers `6, 7, 8, 9, 10` on another line. The numbers should be separated by a comma
        and a space and there should not be a comma or a space at the end of each line. 
      - Use the `PrintWriter` class to do this.
      - Make sure to handle the checked exception associated with the `PrintWriter` class by printing out 
        the `toString` method of the exception object on its own line.
      - In the `src/test/java/problem2/RandomNumberFileTest.java` file, uncomment the tests that begin with 
        the words `writeRandomNumbersPrintWriter...` and run them.
3. Create a static method named `writeRandomNumbersBufferedWriter` that takes a String (`fileName`) and two integers
   (`n` and `lineCount`) as parameters and does not return anything. The String parameter represents the name and
   path of the file. For example, if the file is `file1.txt`, then the String passed in would be 
   `"src/main/resources/rand1.txt"` on Mac and `"src\main\resources\rand1.txt"`on Windows. The path is relative to 
   the project root directory.
   - The method should print the numbers 1 through `n` to `filename` such that there are `lineCount` integers on
     each line. For example, if `n` is 10 and `lineCount` is 5, the file would have the numbers `1, 2, 3, 4, 5`
     on one line and the numbers `6, 7, 8, 9, 10` on another line. The numbers should be separated by a comma
     and a space and there should not be a comma or a space at the end of each line.
   - Use the `BufferedWriter` class to do this.
   - Make sure to handle the checked exceptions by printing out the `toString` method of the exception 
     object on its own line.
   - In the `src/test/java/problem2/RandomNumberFileTest.java` file, uncomment the tests that begin with
     the words `writeRandomNumbersBufferedWriter...` and run them.
4. Create a `main` method and test your code.
5. Run the code analyzers.
6. Commit your code to GitHub.

### Problem 3: Arrays, Generics, and Collections

1. In the `src/main/java/problem3` package, create a class named `Attendee` with the following:
    - Three private final instance variables: A String named `lastName`, a String named `firstName`, and
      an integer named `id`.
    - A private boolean instance variable named `paid`.
    - A constructor that takes two Strings and an integer as parameters and sets the associated instance
      variables. If either of the String parameters are null, throw a `NullPointerException` with the message
      "Last name or first name cannot be null".
    - A getter and setter for the `paid` instance variable. Remember that getters for booleans should start 
      with the word `is` instead of `get`.
    - Override the `equals` method to return true if the parameter passed in has the same values for the `lastName`, 
      `firstName`, and `id` instance variables and false otherwise. Make sure to handle null and type checks.
    - Override the `toString` method to return the values of the `firstName`, `lastName`, and `paid` instance
      variables in the following format: `lastName-firstName Paid: true/false`
    - Override the `hashCode` method. This can be an implementation of your choice, but needs to follow the
      rules for `hashCode` methods.
    - In the `src/test/java/problem3/AttendeeTest.java` file, uncomment the tests that begin with the following:
        - `constructor...`
        - `isPaid...` and `setPaid...`
        - `equals...`
        - `toString...`
        - `hashCode...`
    - Run the code analyzers and commit your code to GitHub.
2. In the `Attendee` class, implement the `Comparable` interface and override the `compareTo` method. The
   `compareTo` method should return a positive value if the last name of the parameter reference comes before 
   the last name of the reference calling the method alphabetically, a negative value if it comes after, and 0 
   if they are the same. Hint: The String class also has a`compareTo` method. Look at the documentation!
   - In the `src/test/java/problem3/AttendeeTest.java` file, uncomment the tests that begin with `compareTo`.
   - Run the code analyzers and commit your code to GitHub.
3. In the `AttendeeDemo` class, uncomment the code where indicated. All of this code should compile. Where
   it says "Code for Problem 3, #3 goes here:", use the `Arrays` class to do the following:
   - Print out whether `attendees1` is equal to `attendees2`.
   - Print out whether `attendees1` is equal to `attendees3`.
   - Sort `attendees1`.
   - Print out `attendees1` (no loops allowed!).
   - Print out whether `attendees1` is equal to `attendees2`.
   - Run the code analyzers and push to GitHub.
4. In the `Attendee` class, create a static method named `removeNonPaid` that takes `List` of `Attendee`
   as a parameter. Remember that `List` is an interface, so it can be a declared type!. The actual object
   will be something that implements `List`. The method should not return anything.
   - Iterate over the list and remove any `Attendee` references that are currently not paid (i.e. 
     `paid` is false).
   - In the `src/test/java/problem3/AttendeeTest.java` file, uncomment the tests that begin with 
     `removeNonPaid`.
   - Run the code analyzers and push to GitHub.
5. In the `AttendeeDemo` class, go to where it says "Code for Problem 3, #5 goes here:", and do the 
   following:
   - Create a new `ArrayList` of `Attendee` and add the `a1`, `a2`, `a3`, and `a4` reference variabels to
     it. 
   - Print out the `ArrayList` (do not use a loop).
   - Call the `removeNonPaid` method and pass in the `ArrayList` that you just created.
   - Print out the `ArrayList` (do not use a loop).
   - Run the code analyzers and push to GitHub.
6. Rejoice! You have finished the last homework assignment!