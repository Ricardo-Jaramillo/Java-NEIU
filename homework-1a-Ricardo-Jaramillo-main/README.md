###### CS-207-3: Programming II <br> Spring 2021 <br> Northeastern Illinois University <br> Homework #1A <br> Due Date: 01/20/21 at 9:00 p.m. (CT) <br> GitHub Review

**Getting Started**

**1.** For this course, please download IntelliJ IDEA Ultimate and Java version 11 or higher. You will need to sign up using your NEIU email to access the downloads. 
- For IntelliJ, you can either download and install the IDE directly or download JetBrains Toolbox. 
    - Just the IDE: https://www.jetbrains.com/idea/download/#section=windows 
    - JetBrains Toolbox: https://www.jetbrains.com/toolbox-app/ 
- For Java, you will need to create an Oracle account to access the download.
    - https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
- Code With Me plugin: Please install this plugin for IntelliJ. Go to File > Settings > Plugins. Make sure you have Marketplace selected, and search for Code With Me and install the plugin.  
  
    
**2.** Detailed instructions are located in the tutorial videos and in the initial (this) assignment.<br>
**3.** Accept the assignment invitation on D2L.<br>
**4.** Clone the assignment to your computer.<br>
**5.** Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.<br>
**6.** Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from: is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.<br>
**7.** Project SDK and Gradle JVM should be set to the same Java version.<br>
**8.** Create the main/java directory in the src directory. This is where you will be creating your Java classes for your assignment. Right click src and go to New > Directory and select main/java.<br>

**Submitting your assignment**

**1.** Once you have completed all the problems, commit your final code to GitHub. <br>
- Please also commit code after each step of each problem and remember to run the unit tests (where applicable) and code analyzers before you commit.

**2.** Then in IntelliJ, go to File, select Export to Zip File. This will a create a zip file of the entire project directory.<br>
**3.** Submit the .zip file to the Homework 1A Assignment folder on D2L.<br>

**Problem 1**

**1.** In the main/java directory, create a class named `GitHubReview`. 
- Create a static method named `isOdd`. This method should take an integer parameter and return a boolean that indicates if the parameter is odd. 
    - Uncomment the body of the tests with headers that start with "isOddShouldReturn..." in the TestingArrayFunctions class in the test/java directory to test this method. To run the tests, click the green arrow to the left of each header to run the tests individually or click the green arrow to the left of the class header to run all the tests. If they do not pass, your code is incorrect and you should continue to work on the problem. 
    - If the unit tests pass, you can run the code analyzers. On the right side, click Gradle, expand Tasks > other. Double click the checkstyleMain task to run it. If any rules were violated, you will be shown your errors. You can click the link provided then choose your browser of choice at the top right corner to view the error description or in the bottom left panel, click the middle red exclamation point to view the error. Fix the issue and rerun the checkstyleMain, repeat if necessary.
    - Once the checkstyleMain task has passed, double click on the pmdMain task in the same panel. If a rule violation was found, click the provided link, then choose your preferred browser in the top right to view the error description. Fix the issue and rerun the pmdMain task, repeat if necessary.
    - When the unit tests and code analyzers have passed, open GitHub Desktop. You will be able to see the files that have been changed in the left panel. Enter a summary in the bottom left then click "Commit to main". Then click Push Origin in the right panel at the top. 
    - If you go to your GitHub account and go to the Actions tab for this assignment repository, you can see the Workflow running.
- Create a static method named `isEven`. This method should take an integer parameter and return a boolean that indicates if the parameter is even. 
    - Uncomment the body of the tests with headers that start with "isEvenShouldReturn..." in the TestingArrayFunctions class in the test/java directory to test this method. Run the code analyzers and commit your code now. The process you went through for IsOdd will be the same for this method, and future assignments. The detailed instructions will not be explicity stated but you will need to follow the same steps. If you need a reminder, look back to this assignment's first method or rewatch the tutorial detailing this process if necessary.
