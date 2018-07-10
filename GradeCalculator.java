import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

public class GradeCalculator
{	

	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		String yes = "y";
		
		System.out.println();
		System.out.print("Welcome to Grade Calculator! ");

		while (yes.equals("y"))
		{
		System.out.println("Please enter the filename you would like to update.");
		String className = input.nextLine();
		
		classCalculator classVar = new classCalculator(className);

		if (classVar.checkFile())
		{
			System.out.println();
			System.out.print("Your grade before the update: ");
			classVar.readFile();
		}
		
		System.out.println();
		classVar.writeFile(input);
		
		classVar.pointsSum = classVar.totalSum = classVar.weightSum = classVar.gradeSum = 0;

		System.out.println();
		System.out.print("Your grade after the update: ");
		classVar.readFile();
		
		double min = classVar.gradeSum;
		double max = min + (100 - classVar.weightSum);
		System.out.println();
		System.out.println("The minimum grade you can achieve is " + min + "%");
		System.out.println("The maximum grade you can achieve is " + max + "%");
		System.out.println();

		// min + x/leftover = 90 percent -> x = (90 - min)*leftover
		double x = ((90 - min) / (100 - classVar.weightSum)) * 100; 

		if (x < 100 && x > 0)
			System.out.println("To get an A+, you would need to get at least " + x + "% over the remainder of the course.");
		
		x = ((85 - min) / (100 - classVar.weightSum)) * 100; 
		if (x < 100 && x > 0)
			System.out.println("To get an A, you would need to get at least " + x + "% over the remainder of the course.");
		
		x = ((80 - min) / (100 - classVar.weightSum)) * 100; 
		if (x < 100 && x > 0)
			System.out.println("To get an A-, you would need to get at least " + x + "% over the remainder of the course.");

		x = ((77 - min) / (100 - classVar.weightSum)) * 100; 
		if (x < 100 && x > 0)
			System.out.println("To get a B+, you would need to get at least " + x + "% over the remainder of the course.");

		x = ((73 - min) / (100 - classVar.weightSum)) * 100; 
		if (x < 100 && x > 0)
			System.out.println("To get a B, you would need to get at least " + x + "% over the remainder of the course.");
		
		x = ((70 - min) / (100 - classVar.weightSum)) * 100; 
		if (x < 100 && x > 0)
			System.out.println("To get a B-, you would need to get at least " + x + "% over the remainder of the course.");

		x = ((65 - min) / (100 - classVar.weightSum)) * 100; 
		if (x < 100 && x > 0)
			System.out.println("To get a C+, you would need to get at least " + x + "% over the remainder of the course.");

		x = ((60 - min) / (100 - classVar.weightSum)) * 100; 
		if (x < 100 && x > 0)
			System.out.println("To get a C, you would need to get at least " + x + "% over the remainder of the course.");

		x = ((50 - min) / (100 - classVar.weightSum)) * 100; 
		if (x < 100 && x > 0)
			System.out.println("To get a D, you would need to get at least " + x + "% over the remainder of the course.");

		System.out.println();
		System.out.println("Is there another class you would like to update? Type 'y' if yes, hit return if no");
		yes = input.nextLine();
		}
		
		System.out.println("Thanks for using Grade Calculator! Have a nice day :)");
		System.out.println();
	}
}
