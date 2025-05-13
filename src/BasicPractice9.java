import java.util.Scanner;

public class BasicPractice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to convert Fahrenheit to Celsius.
		Scanner sc = new Scanner(System.in);
		float temp;
		System.out.println("Enter the temprature/n");
		temp=sc.nextFloat();
		temp=((temp - 32) * 5)/9;
		System.out.println("Celsius temp is:" +temp);
	}

}
