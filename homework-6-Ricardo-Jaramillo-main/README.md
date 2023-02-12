<h6>
CS-207-3: Programming II <br> 
Spring 2021 <br> 
Northeastern Illinois University <br> 
Homework #6 <br> 
Due Date: 03/10/21 at 9:00 p.m. (CT) <br> 
Polymorphism
</h6>

#### Getting Started

1. Clone the assignment to your computer.
2. Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is
   set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.
3. Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build
   Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from:
   is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.
4. Project SDK and Gradle JVM should be set to the same Java version.
5. Create the `main/java` directory in the `src` directory. This is where you will be creating your Java 
   classes for your assignment. Right click `src` and go to `New > Directory` and select `main/java`. 

#### Submitting your assignment

1. Make sure that all your code is committed to GitHub and that all the code analyzers and unit tests
   pass.
2. You will have the opportunity to make corrections on any code that is a complete/valid attempt at
   solving the problem. Code that does not compile or run does not constitute a complete/valid attempt.
3. In IntelliJ, go to File, select Export to Zip File. This will create a zip file of the entire project 
   directory.
4. Submit the .zip file to the Homework 6 Assignment folder on D2L.

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

### Problem 1: Polymorphism

1. `Employee.java`: In the `src/main` directory, create a java class named `Employee.java` with the 
   following:
      - Two encapsulated instance variables: A `String` named `name` and an integer named `hireYear`.
      - A constructor that takes a `String` and an integer and sets the instance variables.
      - An instance method named `monthlyPay` that does not take any parameters and returns a double. This 
        method should return `0`.
      - An instance method named `annualPay` that does not take any parameters and returns a double. This
        method should return `0`.
      - Override the `toString` method to return a `String` that has the word `"Name: "` concatenated with 
        the `name` instance variable concatenated with a space and the word `"Hired: "` concatenated with 
        the `hireYear` instance variable.
      - Override the `equals` method. You should use the `instanceof` keyword because we are going to be 
        creating a large inheritance hierarchy. Follow the steps presented in Lecture 7.3, Slide 5, however
        two `Employee` objects are considered "equal" if their `annualPay` and their `monthlyPay` are the same.
      - Do **not** add any additional methods other than what is described in the instructions.
      - In the `src/test/java/EmployeeTest.java` file, uncomment the tests and run them.
      - Run the code analyzers.
      - Commit your code to GitHub.
2. `SalariedEmployee.java`: In the `src/main` directory, create a java class named `SalariedEmployee.java` 
   that inherits from `Employee` with the following:
   - An encapsulated instance variable: An integer named `annualSalary`.
   - A constructor that takes a `String` and an integer and sets the superclass instance variables.
   - A setter method for the `annualSalary` instance variable.
   - Override the `monthlyPay` method to return the `annualSalary` divided by 12.
   - Override the `annualPay` method to return the `annualSalary`.
   - Do **not** add any additional methods other than what is described in the instructions.
   - In the `src/test/java/SalariedEmployeeTest.java` file, uncomment the tests and run them.
   - Run the code analyzers.
   - Commit your code to GitHub.
3. `HourlyEmployee.java`: In the `src/main` directory, create a java class named `HourlyEmployee.java`
   that inherits from `Employee` with the following:
   - Two encapsulated instance variable: An integer named `hoursPerWeek` and a double named `hourlyWage`.
   - A constructor that takes a `String` and an integer and sets the superclass instance variables.
   - Setter methods for both the instance variables.
   - Override the `monthlyPay` method to return the `hourlyWage` x 4 x `hoursPerWeek`.
   - Do **not** add any additional methods other than what is described in the instructions.
   - In the `src/test/java/HourlyEmployeeTest.java` file, uncomment the tests and run them.
   - Run the code analyzers.
   - Commit your code to GitHub.
4. `Manager.java`: In the `src/main` directory, create a java class named `Manager.java`
   that inherits from `SalariedEmployee` with the following:
   - A constructor that takes a `String` and an integer and sets the superclass instance variables.
   - Override the `annualPay` method to return the annual pay + a 10% bonus.
   - Do **not** add any additional methods other than what is described in the instructions.
   - In the `src/test/java/ManagerTest.java` file, uncomment the tests and run them.
   - Run the code analyzers.
   - Commit your code to GitHub.
5. `Staff.java`: In the `src/main` directory, create a java class named `Staff.java`
   that inherits from `SalariedEmployee` with the following:
   - A constructor that takes a `String` and an integer and sets the superclass instance variables.
   - Override the `annualPay` method to return the annual pay + a 2% bonus.
   - Do **not** add any additional methods other than what is described in the instructions.
   - In the `src/test/java/StaffTest.java` file, uncomment the tests and run them.
   - Run the code analyzers.
   - Commit your code to GitHub.
6. `FullTime.java`: In the `src/main` directory, create a java class named `FullTime.java`
   that inherits from `HourlyEmployee` with the following:
   - A constructor that takes a `String` and an integer and sets the superclass instance variables.
   - Override the `annualPay` method to return 50 weeks of wages + 2 weeks wages as bonus.
   - Do **not** add any additional methods other than what is described in the instructions.
   - In the `src/test/java/FullTimeTest.java` file, uncomment the tests and run them.
   - Run the code analyzers.
   - Commit your code to GitHub.
7. `PartTime.java`: In the `src/main` directory, create a java class named `PartTime.java`
   that inherits from `HourlyEmployee` with the following:
   - A constructor that takes a `String` and an integer and sets the superclass instance variables.
   - Override the `annualPay` method to return 50 weeks of wages (no bonus).
   - Do **not** add any additional methods other than what is described in the instructions.
   - In the `src/test/java/PartTime.java` file, uncomment the tests and run them.
   - Run the code analyzers.
   - Commit your code to GitHub.
8. In the `src/main` directory, a class named `EmployeeDemo` has already been created for you, along with 
   the `main` method.
   - Uncomment the code in the `main` method.
   - Write the code need to print out the name, hire year, monthly pay and annual pay of each employee in 
     the `employees` array so that it looks like the following:
     ```
     Name: Employee1 Hired: 1992
     Monthly Pay: 0.0
     Annual Pay: 0.0
     Name: Hourly1 Hired: 1908
     Monthly Pay: 800.0
     Annual Pay: 0.0
     Name: Salaried1 Hired: 1986
     Monthly Pay: 6666.0
     Annual Pay: 80000.0
     Name: Manager1 Hired: 2009
     Monthly Pay: 6666.0
     Annual Pay: 88000.0
     Name: Staff1 Hired: 2005
     Monthly Pay: 4166.0
     Annual Pay: 51000.0
     Name: PartTime1 Hired: 1998
     Monthly Pay: 1600.0
     Annual Pay: 20000.0
     Name: FullTime1 Hired: 2020
     Monthly Pay: 1600.0
     Annual Pay: 20800.0
     Name: Manager2 Hired: 2003
     Monthly Pay: 6666.0
     Annual Pay: 88000.0
     ```
   - Write the code need to compare each element in the `employees` array with all the employees that occur
     after it in the array using the `equals` method. Print out each employee's information followed by whether
     or not they are "equal". Note that only one pair of employees in the array will evaluate to true. For example:
     ```
     Name: Employee1 Hired: 1992
     Name: Hourly1 Hired: 1908
     false
     Name: Employee1 Hired: 1992
     Name: Salaried1 Hired: 1986
     false
     ...
     ```
     
