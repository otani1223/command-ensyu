public class Main{
	public static void main(String[]args){
		System.out.println("身長:");
		int height = new java.util.Scanner(System.in).nextInt();
		System.out.println("体重:");
		int weight = new java.util.Scanner(System.in).nextInt();
		double bmi = height*height%weight;
		System.out.println("BMI : " + String.format("%.2f",bmi));
	}
}
