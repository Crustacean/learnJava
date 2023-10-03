public class Student{
	
	private String id;
	private String name;
	private String dateOfBirth;
	private String classList;
	
	public Student(String id, String studentName, String dateOfBirth, String classList){
		
		this.id=id;
		name=studentName;
		this.dateOfBirth=dateOfBirth;
		this.classList=classList;
		
	}
	
	public String getId(){ return id; }
	public String getName(){ return name; }
	public String getDateOfBirth(){ return dateOfBirth; }
	public String getClassList(){ return classList; }
	
}