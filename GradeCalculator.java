package CodSoft;

import java.util.Scanner;

public class GradeCalculator {

	
	double avgmarks;
	String grade;
	
	public double avgMarksCalc(int maths, int phy, int chem) {
		
		int total = maths+phy+chem;
		System.out.println("Total marks of a student: "+total);
		avgmarks = total/3;

		return avgmarks;
		
	}		
		
		public String gradeCalc(double avgmarks) {
			if(avgmarks>=90)
			{
				grade = "A";
			}
			else if(avgmarks>=75 && avgmarks<90) {
				grade = "B";
			}
			else if(avgmarks>=60 && avgmarks<75) {
				grade = "C";
			}
			else if(avgmarks>=40 && avgmarks<60) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			return grade;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Maths marks: ");
		int maths = input.nextInt();
		System.out.println("Enter Physics marks: ");
		int phy = input.nextInt();
		System.out.println("Enter Chemistry marks: ");
		int chem = input.nextInt();
		System.out.println("Marks obtained in Maths: "+maths);
		System.out.println("Marks obtained in Physics: "+phy);
		System.out.println("Marks obtained in Chemistry: "+chem);
		GradeCalculator cs = new GradeCalculator();
		double cgd = cs.avgMarksCalc(maths, phy, chem);
		//System.out.println("Average: "+cs.avgMarks(maths,phy,chem));
		System.out.println("Average : "+cgd);
		 System.out.println("Grade: "+cs.gradeCalc(cgd));
		

	}

}
