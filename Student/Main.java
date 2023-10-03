import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
		String studentName;
		String studentDateOfBirth;
		String studentClassList;
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
			
			StudentRecord student = new StudentRecord("IMTJO-"+i, sc.nextLine(), sc.nextLine(), sc.nextLine());
			
			/*System.out.print("Enter student's name: ");
			studentName = sc.nextLine();
			System.out.print("Enter student's Date of Birth: ");
			studentDateOfBirth = sc.nextLine();
			System.out.print("Enter student's class list: ");
			studentClassList=sc.nextLine();
			
			Student student = new Student("IMTJO-"+i, studentName, studentDateOfBirth, studentClassList);*/
			
			System.out.println(student);
			
		} //while closed
		
		sc.close();
		
	} //main closed
	
} //class closed