package project1;
import java.util.Scanner;
public class StudentGradeCalculator {
	public static void main(String[]args ) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the totalMarks :");
		double totalMarks = sc.nextDouble();
		System.out.print("Enter the marks in English :");
		double English = sc.nextDouble();
		System.out.print("Enter the marks in Maths :");
		double Maths = sc.nextDouble();
		System.out.print("Enter the marks in Physics :");
		double Physics = sc.nextDouble();
		System.out.print("Enter the marks in Chemestry :");
		double Chemestry = sc.nextDouble();
		System.out.print("Enter the marks in Computer Science :");
		double Computer_Science = sc.nextDouble();
		double total =English+Maths+Physics+Chemestry+Computer_Science;
		System.out.println("The total marks :"+total);
		double percentage = (total/totalMarks) * 100;
		System.out.println("The Percentage :"+percentage);
        if(percentage>=90) {
			System.out.println("Grade A");
		   }else if(percentage>=80){
			   System.out.println("Grade B");
		   }else if(percentage>=70) {
			   System.out.println("Grade C");
		   }else if(percentage>=60) {
			   System.out.println("Grade D");
		   }else if (percentage>=40) {
			   System.out.println("Grade E");
		   }else {
			   System.out.println("Fail");
			}
			
		sc.close();}

}
