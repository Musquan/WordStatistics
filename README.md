Development Environment:
This project is build using Maven framework and developed using eclipse IDE. Unit testing is performed using JUnit library with Maven.
Prerequisites:
Maven and JDK has to be installed

Setting up Maven
Install Maven:
1. Download the latest Maven distribution from the official website (https://maven.apache.org/download.cgi).
2. Extract the downloaded archive to a folder on your computer (e.g., C:\Program Files\Apache\maven).

Add MAVEN_HOME System Variable
1. Open the Start menu and search for "Environment Variables".
2. Click on "Edit the system environment variables".
3. Click on the "Environment Variables" button at the bottom right corner.
4. Under "System Variables", click on "New" and enter "MAVEN_HOME" as the variable name.
5. In the "Variable value" field, enter the path to the Maven directory, for example "e.g., C:\Program Files\Apache\maven".
6. Click "OK" to save the environment variable.

Add MAVEN_HOME Directory in PATH Variable
1. Open the Start menu and search for "Environment Variables" and click on "Edit the system environment variables".
2. Click on the "Environment Variables" button.
3. Under "System Variables", find the "Path" variable and click "Edit".
4. Click "New" and add the path to the bin folder inside the Maven installation directory (e.g., C:\Program Files\Apache\maven\bin).
5. Click "OK" to close all the windows.

Verify maven installation
In the command prompt, use the following command:
$ mvn -version

Steps to run the project
1. Go to the root directory where pom.xml file is located
cd <folderpath>
2. Then execute command: jar cfm WordAnalysisProject-1.0-SNAPSHOT.jar target/META-INF/MANIFEST.MF -C target/classes .
3. JAR file named WordAnalysisProject-1.0-SNAPSHOT.jar will be created.
4. Then execute the following command to get the output:
java -cp WordAnalysisProject-1.0-SNAPSHOT.jar WordCount "This is a Sample string"
5. "This ia Sample string" can be replaced by any of the other string you want to test

Command to test the project:
$ mvn test
