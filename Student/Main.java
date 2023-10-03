import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
		for(int i=1; i<=5; i++){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter student's name: ");
			String studentName = sc.nextLine();
			System.out.print("Enter student's Date of Birth: ");
			String studentDateOfBirth = sc.nextLine();
			System.out.print("Enter student's class list: ");
			String studentClassList=sc.nextLine();
			
			Student student = new Student(("IMTJO-"+i), studentName, studentDateOfBirth, studentClassList);
			
		}
		
	}
	
}