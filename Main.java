import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		int input = -1;
		
		
		School school = new School();
		while(input != 7)
		{
			System.out.println("Please choose one of the following to display: ");
			System.out.println("1. List the Students");
			System.out.println("2. List the Teachers");
			System.out.println("3. List the Courses");
			System.out.println("4. List the Students by ID");
			System.out.println("5. List the Teachers by ID");
			System.out.println("6. List the Courses by ID");
			
			input = kb.nextInt();
			
		switch(input)
		{
			case 1:
				
			break;
			
			case 2:
			
			break;
			
			case 3:
				school.listCourses();
			break;
			
			case 4:
				
			break;
			
			case 5:
				
			break;
			
			case 6:
				
			break;
			
			default:
				
				System.out.println("Error - Invalid choice");
		}
		
		
		}
	}


		
}
