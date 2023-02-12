###### CS-207-3: Programming II <br>
Spring 2021 <br>
Northeastern Illinois University <br>
Workshop Week 8 <br>
Inheritance, Part I

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

### Problem 1

**Part I** Create a class called `Video`. This class should have:
1. Two properly encapsulated instance variables:
    - A `String` called `title`
    - An integer called `awardsWon`
2. One constructor, which takes 2 parameters and sets the instance variables.
3. A getter and setter for the `awardsWon` instance variable.
    - Uncomment the tests named `getAwardsWon_shouldReturnAwardsWon` and `setAwardsWon_shouldReturnAwardsWon` in the `VideoTest` class
      (in the test/java directory). Run the code analyzers and commit your code now.
4. An overridden `toString` method which returns a `String` that has each of the instance variable 
   values on their own lines. The method should print the instance variable name followed by a colon (:), then the value. Example below.
    - `Title: Gone With the Wind`
    - `Awards Won: 10`  
    - Uncomment the test named `toString_shouldReturnInstanceVariables` in the `VideoTest` class
      (in the test/java directory). Run the code analyzers and commit your code now.

**Part II** Create a class called `TVShow` that inherits from `Video`. This class should have:
1. Two properly encapsulated instance variables: 
    - An integer called `numEpisodes`
    - An integer called `startYear`
2. One constructor, which takes 4 parameters and sets the superclass and class instance variables. 
3. Getters for the instance variables.
    - Uncomment the tests named `getters_shouldReturnRespectiveVariables` and `superClassVariablesShouldGetSet` in the `TVShowTest` class
      (in the test/java directory). Run the code analyzers and commit your code now.
4. A method named `printInfo` that does not take any parameters and does not return anything. 
   It should print out the values of all 4 of the instance variables - be careful accessing the 
   superclass instance variables! The method should print the instance variable name followed by a colon (:), then the value. Example below.
    - `Title: Modern Family`
    - `Awards Won: 73`
    - `Num Episodes: 250`
    - `Start Year: 2009`

**Part III** Create a class called `Movie`, which inherits from `Video`. This class should have:
1. Two properly encapsulated instance variables:
    - An integer called `length`
    - A `String` called `director`
2. One constructor, which takes 4 parameters, and sets all the instance variables.
3. Getters for the instance variables.
    - Uncomment the tests named `getters_shouldReturnRespectiveVariables` and `superClassVariablesShouldGetSet` in the `MovieTest` class
      (in the test/java directory). Run the code analyzers and commit your code now.
4. An overridden `toString` method which returns a `String` that has each of the instance variables 
   on their own lines. Example below.
    - `Title: Gone With the Wind`
    - `Awards Won: 10`
    - `Length: 221`
    - `Director: Victor Fleming`
    - Uncomment the test named `toString_shouldReturnAllVariables` in the `MovieTest` class
      (in the test/java directory). Run the code analyzers and commit your code now.

**Part IV** Create a `VideoDemo` class, to show off your newly written code. In the main method:
1. Create an object of each type of class and assign them to reference variables.
2. For each reference variable, call each public method. For those methods that are not void, 
   print out the results.