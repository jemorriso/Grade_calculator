# Grade_calculator

# Description
This project automates grade calculation so you don't have to punch in the same numbers into your calculator everytime you want to calculate your grade! It saves user data in files for easy update. Everytime the user makes an update to their grades, updated statistics are printed to the command line. 

The classCalculator file is all about File I/O, reading from and writing to the correct files in the directory. 

The GradeCalculator program is the main program that the user is communicating with, and it references the results of classCalculator to produce more detailed statistics for the user. 

# Installation
To install the project simply download the two files, classCalculator and GradeCalculator to a local directory, which in addition to those two files will store the text files representing the data for each class. 

# Usage
To run the program, open the terminal or command prompt and navigate to the folder containing the two program files. Then run the command "javac GradeCalculator.java" to compile the programs, and then type the command "java GradeCalculator" to execute the program. 

If you want to create a new class for which you'd like to track and update your grades,  simply type in the name of the file to update, and if that text file is not there, the file is created. If you choose to update the file with new data points, you can do so following the format of score total weight (for example, if a midterm is worth 15% and you got 22 out of 25 on the test, enter 22 25 15 and hit return). The program takes care of writing to the file in the correct format.

After you are finished updating the class grades, the program reads the data inside the file, and prints output to the command line telling you what your grade is so far, and how much of your grade has been decided. Based on the calculations of classCalculator, GradeCalculator tells you what your grade was before the update, what your grade is after the update, what the min and max grades you can get are, and what level of performance you must achieve to get your desired grade. 

Below, a sample class creation is shown, with the output that it produces. 

![Screenshot](../master/GradeExample.PNG)
