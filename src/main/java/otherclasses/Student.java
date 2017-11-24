package otherclasses;


import java.text.DecimalFormat;

public class Student extends Person {
	//Attributes
	private double firstGrade = 0.0;
	private double secondGrade= 0.0;
	private double thirdGrade= 0.0;	
	private double averageGrade= 0.0;
	

	//Constructors
	public Student(String firstName, String lastName, int age, char gender) {
		super(firstName, lastName,age, gender);
		

	}		

	public Student( String firstName, String lastName, int age, char gender, double firstGrade, double secondGrade,
			double thirdGrade) {
		super(firstName, lastName, age, gender);
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;		
		
	}

	//Getters and setters
	public double getFirstGrade() {
		return firstGrade;
	}

	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}

	public double getSecondGrade() {
		return secondGrade;
	}

	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}

	public double getThirdGrade() {
		return thirdGrade;
	}

	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}

	
	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}

	//calculating Average with firstGrade as input
	public double calculateAverage(double firstGrade){
		double sum = firstGrade +secondGrade +thirdGrade;
		double average = sum /3;
		this.setAverageGrade(average);
		return average;
	}
	
	public double calculateAverage(){
		double sum = this.firstGrade +this.secondGrade +this.thirdGrade;
		double average = sum /3;
		this.setAverageGrade(average);
		return average;
	}
	
		
	public double calculateAverage(double firstGrade, double secondGrade, double thirdGrade){
		double sum = firstGrade +secondGrade +thirdGrade;
		double average = sum /3;
		this.setAverageGrade(average);
		return average;
	}
	
	public boolean hasClearedTheCourse(){
		if (this.getAverageGrade() >=6.0){
			return true;
		}
		return false;
		
	}
	//ToString()
	public String toString() {
		calculateAverage(getFirstGrade(), getSecondGrade(), getThirdGrade());
		DecimalFormat df = new DecimalFormat("#.0");

		if (hasClearedTheCourse()) {
			return
					"Student: " + getFirstName() + " " + getLastName() + "\n" +
					"Grades: " + firstGrade + ", "  + secondGrade + ", " + thirdGrade + "\n" +
					"FinalGrade: " + df.format(getAverageGrade()) + "\n" +
					"The student has cleared the course\n"+
					"-----------------------";
		}

		return
				"Student: " + getFirstName() + " " + getLastName() + "\n" +
				"Grades: " + firstGrade + ", "  + secondGrade + ", " + thirdGrade + "\n" +
				"FinalGrade: " + df.format(getAverageGrade()) + "\n" +
				"The student has not cleared the course\n"+
				"-----------------------";
	}
}