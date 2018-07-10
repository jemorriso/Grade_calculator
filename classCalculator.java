import java.util.Scanner;
import java.io.*;
import java.nio.file.*;


// class defines operations on grade calculation. We need to be able to read the file, write to the file, and calculate the grade
public class classCalculator
{
	String className;
	File path;
	double pointsSum, totalSum, weightSum, gradeSum;

	// constructor initiliazes file name and path, and instance variables used to calculate grade
	public classCalculator(String className)
	{
		this.className = className + ".txt";

		Path p = Paths.get("");
		String s = p.toAbsolutePath().toString();
	
		path = new File(s + "/" + className + ".txt");
		
		pointsSum = totalSum = weightSum = gradeSum = 0;
	}

	// check to see if the file already exists or not
	public boolean checkFile()
	{
		if (path.exists())
		{
			return true;
		}
		return false;
	}

	// read data in the file and give the grade
	public void readFile()
	{
		
		FileReader fileReader = null;
		
		try
		{
			//path.createNewFile();
			
			fileReader = new FileReader(className);
			Scanner reader = new Scanner(fileReader);
			double points, total, weight;
			//double pointsSum = 0;
			//double totalSum = 0;
			//double weightSum = 0;
		
			while (reader.hasNext())
			{
				points = reader.nextDouble();
				total = reader.nextDouble();
				weight = reader.nextDouble();
				//pointsSum = pointsSum + points;
				//totalSum = totalSum + total;
				gradeSum = gradeSum + (points / total) * weight;
				weightSum = weightSum + weight;
				//double dataPoint = (points / total) * weight;
				//System.out.println(dataPoint);
				
				
				//System.out.println(reader.next());
			}

			//System.out.println("points inside method: " + pointsSum);
			System.out.print(((gradeSum / weightSum) * 100) + "%");
			String grade = grade(gradeSum / weightSum * 100);
			
			if (grade.equals("A") || grade.equals("A-") || grade.equals("A+"))
			{
				System.out.println(", which is an " + grade);
			}
			else
			{
				System.out.println(", which is a " + grade);
			}
			
			System.out.println(weightSum + "% of your grade has been decided.");
		}
		catch (IOException e)
		{
			// file creation or reading failed at some stage
		}
		finally
		{
			try
			{
				fileReader.close();
			}
			catch (IOException e)
			{
				// closing the file failed
			}
		}
	
	}

	public void writeFile (Scanner input)
	{
		FileWriter writer = null;
		String s = null;

		System.out.println("How many new data points would you like to add?");
		int num = input.nextInt();
		// need to go to new line here so that for loop behaves properly
		input.nextLine();

		if (num == 0) return;

		System.out.println("Enter the data points and press return after each entry (format: score total weight)");

		try 
		{
			writer = new FileWriter(path, true);
			
			for (int i = 0; i < num; i++)
			{
				s = input.nextLine();
				writer.write(s + "\n");
			}
		}
		catch (IOException e)
		{
			// file opening or writing failed at some stage
		}
		finally
		{
			try
			{
				writer.close();
			}
			catch (IOException e)
			{
				// closing the file failed
			}
		}
	}
	
	// returns letter grade associated with percentage passed in
	private String grade (double grade)
	{
		if (grade >= 90) return "A+";
		else if (grade >= 85) return "A";
		else if (grade >= 80) return "A-";
		else if (grade >= 77) return "B+";
		else if (grade >= 73) return "B";
		else if (grade >= 70) return "B-";
		else if (grade >= 65) return "C+";
		else if (grade >= 60) return "C";
		else if (grade >= 50) return "D";
		else return "F";
	}

	






}
