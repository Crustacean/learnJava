public class SimpleCalculator {
	
	private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber(){
        return firstNumber;
    }
    
    public double getSecondNumber(){
        return secondNumber;
    }
    
    public void setFirstNumber(double myFirstNumber){
        this.firstNumber=myFirstNumber;
    }
    
    public void setSecondNumber(double mySecondNumber){
        this.secondNumber=mySecondNumber;
    }
    
    public double getAdditionResult(){
        return (firstNumber+secondNumber);
    }
    
    public double getSubtractionResult(){
        return (firstNumber-secondNumber);
    }
    
    public double getMultiplicationResult(){
        return (firstNumber*secondNumber);
    }
    
    public double getDivisionResult(){
        
        if(secondNumber==0){
            return 0;
        }else{
            return (firstNumber/secondNumber);
        }
        
    }
	
}