public class Main{
	public static void main(String[]args){
		for(int i = 1 ;i<=2;i++){
		System.out.println("身長(cm):");
		double height = new java.util.Scanner(System.in).nextInt();
		height = height/100;
		System.out.println("体重(kg):");
		double weight = new java.util.Scanner(System.in).nextInt();
		double bmi = weight / (height*height);
		System.out.println("BMI : " + String.format("%.2f",bmi));
		}
	}
}
