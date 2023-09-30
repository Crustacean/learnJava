public class Person {
    
    private String firstName;
    private String lastName;
    private int age;
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setFirstName(String myFirstName){
        this.firstName=myFirstName;
    }
    
    public void setLastName(String myLastName){
        this.lastName=myLastName;
    }
    
    public void setAge(int myAge){
        
        if(myAge<0 || myAge>100){
            this.age=0;
        }else{
            this.age=myAge;
        }
        
    }
    
    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }else{
            return false;
        }
    }
    
    public String getFullName(){
        
        if(firstName==null && firstName.trim().isEmpty() && lastName==null && lastName.trim().isEmpty()){
            return "";
        }else if(lastName.trim().isEmpty()){
            return firstName;
        }else if(firstName.trim().isEmpty()){
            return lastName;
        }else{
            return firstName+" "+lastName;
        }
        
    }
    
}