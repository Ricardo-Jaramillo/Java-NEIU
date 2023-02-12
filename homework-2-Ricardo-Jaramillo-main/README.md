###### CS-207-3: Programming II <br> Spring 2021 <br> Northeastern Illinois University <br> Homework #2 <br> Due Date: 01/27/21 at 9:00 p.m. (CT) <br> Strings, Part I

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
**7.** Create the main/java directory in the src directory. This is where you will be creating your Java classes for 
your assignment. Right click src and go to New > Directory and select main/java.<br>

**Submitting your assignment**

**1.** Once you have completed all the problems, commit your final code to GitHub. <br>
- Please also commit code after each step of each problem and remember to run the unit tests (where applicable) and 
  code analyzers before you commit.

**2.** Then in IntelliJ, go to File, select Export to Zip File. This will create a zip file of the entire project directory.<br>
**3.** Submit the .zip file to the Homework 2 Assignment folder on D2L.<br>

### Problem 1

**1.** In the main/java directory, create a class named `MyString` that has the following:
- A private (i.e. encapsulated) String instance variable named `original`. 
- A constructor that takes one String parameter and sets the instance variable. 
- A getter for the instance variable. 
  - Uncomment the test named `shouldInitializeInstanceVariable` in the `MyStringTest` class (in the `test/java` 
    directory). Run the test. Run the code analyzers and commit your code now.
- A method named `removeVowels` that does not take any parameters and returns a String. This method should remove the
  vowels (a/A, e/E, i/I, o/O, u/U) from `original` and return a String composed of just the consonants with their order
  preserved. You may not use any String methods other than: `length`, `charAt`, `equals`, `indexOf`
  - Uncomment the tests beginning with `removeVowels...` in the `MyStringTest` class (in the `test/java`
    directory). Run the tests. Run the code analyzers and commit your code now.
- A method named `removeNonVowels` that does not take any parameters and returns a String. This method should remove 
  everything that is not a vowel (not a/A, e/E, i/I, o/O, u/U) from `original` and return a String composed of just 
  the vowels with their order preserved. You may not use any String methods other than: `length`, `charAt`, 
  `equals`, `indexOf`
  - Uncomment the tests beginning with `removeNonVowels...` in the `MyStringTest` class (in the `test/java`
    directory). Run the tests. Run the code analyzers and commit your code now.

**Note.** To help you debug and understand your code, you can create a `MyStringDemo` class with the main method, but it 
is not required as part of your grade.<br>
<br>

### Problem 2

**1.** In the main/java directory, create a class named `StringInfo`. It should include the following:
- A private (i.e. encapsulated) String instance variable named `letters`.
- A constructor that takes one String parameter and sets the instance variable.
- A getter for the instance variable.
  - Uncomment the test named `shouldInitializeInstanceVariable` in the `StringInfoTest` class (in the `test/java`
    directory). Run the test. Run the code analyzers and commit your code now.
- A method named `moreThanThree` that takes a `char` type as a parameter and returns a `boolean`. This method should 
  return true if the parameter occurs more than 3 times in the `letters` instance variable and false otherwise. You may 
  **not** use a loop in your code, and you may **not** use any String methods other than: `length`, `charAt`, `equals`, 
  `indexOf`
  - Uncomment the tests beginning with `moreThanThree...` in the `StringInfoTest` class (in the `test/java` directory). 
    Run the tests. Run the code analyzers and commit your code now.

**Note.** To help you debug and understand your code, you can create a `StringInfoDemo` class with the main method, but it
is not required as part of your grade.<br>
<br>

### Problem 3

**1.** In the main/java directory, create a class named `StringManipulation`. It should include the following:
- A private default constructor that does nothing (i.e. it is empty).
  - Uncomment the test beginning with `constructor...` in the `StringManipulation` class (in the `test/java` directory).
    Run the test. Run the code analyzers and commit your code now.
- A method named `areRelated` that takes three Strings as parameters and returns a `boolean`. Should this method be an
  instance method or a static method? Why? This method should return true any one of the characters from the first 
  parameter can be appended to the end second parameter to turn it into the third parameter. If not, the method should 
  return false. For example, if the first parameter has the value `"pan"`, the second parameter has the value `"alumn"`, 
  and the third parameter has the value `"alumna"`, then the method would return true because an `a` can be appended to 
  `alumn` to produce `alumna`. You may **not** use any String methods other than: `length`, `charAt`, `equals`, `indexOf`
  - Uncomment the tests beginning with `areRelated...` in the `StringManipulation` class (in the `test/java` directory).
    Run the tests. Run the code analyzers and commit your code now.

**Note.** To help you debug and understand your code, you can create a `StringManipulationDemo` class with the main 
method, but it is not required as part of your grade.<br>
