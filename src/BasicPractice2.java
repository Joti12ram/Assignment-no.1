import java.util.Scanner;

public class BasicPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to take User ID as input and print Jake's name & age if the ID matches
		Scanner scanner = new Scanner(System.in);
		
		String UserId= "MH09";
		System.out.print("Enter User ID: ");
        String enteredID = scanner.nextLine();
		if(UserId.equals(enteredID) ) {
			String name = "John";
			int age = 28;
			System.out.println("UserID matched");
			System.out.println("name:" +name);
			System.out.println("age:" +age);
		}else {
			System.out.println("Invalid UserId");
		}
	}

}
