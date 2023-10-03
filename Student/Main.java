import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
		String studentName;
		String studentDateOfBirth;
		String studentClassList;
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		
		while(i<=5){
			
			System.out.print("Enter student's name: ");
			studentName = sc.nextLine();
			System.out.print("Enter student's Date of Birth: ");
			studentDateOfBirth = sc.nextLine();
			System.out.print("Enter student's class list: ");
			studentClassList=sc.nextLine();
			
			Student student = new Student("IMTJO-"+i, studentName, studentDateOfBirth, studentClassList);
			
			i++;
			
			System.out.println(student);
			
		} //while closed
		
		sc.close();
		
		for(i=1; i<=5; i++){
			System.out.println("ID: "+student.getId()+" | Name: "+student.getName()+" | DoB: "+student.getDateOfBirth()+" | Class List: "+student.getClassList());
		} //for closed
		
	} //main closed
	
} //class closed