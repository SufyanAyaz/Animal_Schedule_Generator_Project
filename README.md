# ENSF380-Final-Project-2023-Group26
Repository for Group 26 ENSF 380 final project.


The following are instructions on how the code can be run:

Once the zip folder is downloaded and unzipped, please proceed to the “ENSF380 Final Project Group 26” directory through your command line. Once in this directory, run the following command to compile the code:

javac -cp .;lib/mysql-connector-java-8.0.23.jar;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar edu/ucalgary/oop/*.java

After running this command there are two ways to further proceed. If you want to run the code itself, run the following command in the command line:

java -cp .;lib/mysql-connector-java-8.0.23.jar edu.ucalgary.oop.ScheduleGeneration

If you want run the testing file, please run the following command in the command line:

java -cp .;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore edu.ucalgary.oop.ScheduleTest
