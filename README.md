# Grade_calculator

This project automates grade calculation so you don't have to punch in the same numbers into your calculator everytime you want to calculate your grade!

The classCalculator file is all about File I/O, reading from and writing to the correct files in the directory. 

If the user wants to create a new class to track and update their grades for, they simply type in the name of the file they would like to update, and if that text file is not there, the file is created. If they choose to update the file with new data points, they can do so following the format of score total weight (for example, if a midterm is worth 15% and the user got 22 out of 25 on the test, they would enter 22 25 15 and hit return). The program takes care of writing to the file in the correct format.

After the user finishes writing, the program reads the data inside the file, and prints output to the command line telling the user what their grade is so far, and how much of their grade has been decided.

The GradeCalculator program is the main program that the user is communicating with, and it references the results of classCalculator to produce more detailed statistics for the user. Based on the calculations of classCalculator, GradeCalculator tells the user what their grade was before the update, what their grade is after the update, what the min and max grades the user can get are, and what level of performance the user must achieve to get their desired grade. Below, a sample class creation is shown, with the output that it produces.
