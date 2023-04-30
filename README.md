<h1>Development Environment:</h1>

This project is build using Maven framework and developed using IntelliJ IDE. Unit testing is performed using JUnit library with Maven.

<h1>Prerequisites:</h1>
Maven and JDK has to be installed

<h1>Setting up Maven</h1>
<h2>Install Maven:</h2>

1. Download the latest Maven distribution from the official website (https://maven.apache.org/download.cgi).
2. Extract the downloaded archive to a folder on your computer (e.g: C:\Program Files\Apache\maven).

<h2>Add MAVEN_HOME System Variable:</h2>

1. Open the Start menu and search for "Environment Variables".<br>
2. Click on "Edit the system environment variables". <br>
3. Click on the "Environment Variables" button at the bottom right corner. <br>
4. Under "System Variables", click on "New" and enter "MAVEN_HOME" as the variable name. <br>
5. In the "Variable value" field, enter the path to the Maven directory, for example "e.g: C:\Program Files\Apache\maven". <br>
6. Click "OK" to save the environment variable.

<h2>Add MAVEN_HOME Directory in PATH Variable:</h2>

1. Open the Start menu and search for "Environment Variables" and click on "Edit the system environment variables".
2. Click on the "Environment Variables" button.
3. Under "System Variables", find the "Path" variable and click "Edit".
4. Click "New" and add the path to the bin folder inside the Maven installation directory (e.g: C:\Program Files\Apache\maven\bin).
5. Click "OK" to close all the windows.

<h2>Verify maven installation:</h2>

In the command prompt, use the following command:
`mvn -version`

<h1>Running the project</h1>

1. Go to the root directory where pom.xml file is located
`cd <folderpath>`
2. Then execute command: `jar cfm WordAnalysisProject-1.0-SNAPSHOT.jar target/META-INF/MANIFEST.MF -C target/classes .`
3. JAR file named WordAnalysisProject-1.0-SNAPSHOT.jar will be created.
4. Then execute the following command to get the output:
`java -cp WordAnalysisProject-1.0-SNAPSHOT.jar WordReplace`

<h1>Unit Testing</h1>

1: Input string with a single occurrence of a word in a string<br>
2: Input string with multiple occurrences of a word in a string<br>
3: Input string which has a replacement word as a part of another word<br>
4: Input string with no replacement word<br>
5: Input string which doesn’t have a replacement word<br>
6: Input string which has replacement word with different case(uppercase or lowercase)<br>


All test cases are passed.

![image](https://user-images.githubusercontent.com/71215436/229411299-fe38df42-d78e-48a8-b61d-e55c6c56d364.png)

Command used to test:

`mvn test`
