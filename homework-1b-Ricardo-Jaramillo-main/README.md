###### CS-207-3: Programming II <br> Spring 2021 <br> Northeastern Illinois University <br> Homework #1B <br> Due Date: 01/20/21 at 9:00 p.m. (CT) <br> Programming I Review

**Getting Started**

**1.** Detailed instructions are located in the tutorial videos and in the initial assignment.<br>
**2.** Accept the assignment invitation on D2L.<br>
**3.** Clone the assignment to your computer.<br>
**4.** Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.<br>
**5.** Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from: is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.<br>
**6.** Project SDK and Gradle JVM should be set to the same Java version.<br>
**7.** Create the main/java directory in the src directory. This is where you will be creating your Java classes for your assignment. Right click src and go to New > Directory and select main/java.<br>

**Submitting your assignment**

**1.** Once you have completed all the problems, commit your final code to GitHub. <br>
- Please also commit code after each step of each problem and remember to run the unit tests (where applicable) and code analyzers before you commit.

**2.** Then in IntelliJ, go to File, select Export to Zip File. This will a create a zip file of the entire project directory.<br>
**3.** Submit the .zip file to the Homework 1B Assignment folder on D2L.<br>

**Problem 1**

**1.** In the main/java directory, create an immutable class named `Time`. (Remember that objects created from an immutable class cannot have its content changed.) It should include the following:
- Three private integer instance variables named `hour`, `min`, `sec`, and a char named `meridiem`. 
- A default constructor that sets the `hour` instance variable to `12`, the `min` and `sec` instance variables to `0`, and the `meridiem` instance variable to `'A'`. 
- A constructor that takes three integer parameters (in the specific order of hours, minutes, seconds) and then a char parameter and sets the instance variables. 
- Getters for all the instance variables. Run the code analyzers and commit your code now.
- A method named `getTotalMinutes` that does not take any parameters. It should return an integer value that represents the total number of minutes from midnight to the time stored in the `hour` and `min` instance variables (you can ignore the `sec` instance variable). You will find the `meridiem` instance variable helpful). Note that for the instance variable `meridiem`, `'A'`  represents AM and `'P'`  represents PM.
    - Uncomment the body of the tests with headers that start with "getTotalMinutesShouldReturn..." in the TestingTime class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- A method named `getTotalSeconds` that does not take any parameters. It should return an integer value that represents the total number of seconds from midnight to the time stored in the `hour`, `min` and `sec` instance variables.
    - Uncomment the body of the tests with headers that start with "getTotalSecondsShouldReturn..." in the TestingTime class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- A static method named `localTimeToTimeObject` that takes a LocalTime object as a parameter. It should convert the LocalTime parameter into a Time object and return it. (Hint: https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html)
    - Uncomment the body of the "localTimeToTimeObjectShouldReturnTimeObject" method in the TestingTime class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- A static method named `getMultipleTimes` that takes a LocalTime array as a parameter. It should convert the LocalTime objects in the array parameter into Time objects and store them in an array. This array should be returned. It should utilize the `localTimeToTimeObject` static method.
    - Uncomment the body of the "getMultipleTimesShouldReturnTimeArray" method in the TestingTime class in the test/java directory to test this method. Run the code analyzers and commit your code now.
            
**2.** To test the class you just created, create a `TimeDemo` class with the following static methods: ??<br>
**3.** You can create a main method to help you debug your code, but it is not required as part of your grade.<br>
**4.** Remember to use the keyword `this` everywhere that you refer to an instance variable (with the exception of the declaration).

**Problem 2**

**1.** In the main/java directory, create a class named `ArrayFunctions`. It should include the following:
- A static method named `averageOfEvens` that takes a 2D integer array parameter and returns a double. It should return the average of all the even numbers in the 2D array. 
    - Uncomment the body of the "averageOfEvensShouldReturnCorrectAverageFor2DArray" method in the TestingArrayFunctions class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- An overloaded static method named `averageOfEvens` that takes a 2D integer array and 1D integer array parameter and returns a double. It should sum up all the even numbers in both the 2D array and the 1D array, and then return the average. 
    - Uncomment the body of the "averageOfEvensShouldReturnCorrectAverageFor2DAnd1DArrays" method in the TestingArrayFunctions class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- A static method named `countWordsStartingWithChar` that takes a 1D String array and a char as parameters, and returns an int. It should return the number of words that starts with the char parameter.
    - Uncomment the body of the "countWordsStartingWithCharShouldReturnCorrectCount" method in the TestingArrayFunctions class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- A static method named `flattenArray` that takes a 2D ragged integer array parameter and returns a 1D integer array. It should convert the 2D ragged array into a 1D array.
    - Uncomment the body of the "startsWithShouldReturnFalseForString" method in the TestingArrayFunctions class in the test/java directory to test this method. Run the code analyzers and commit your code now.