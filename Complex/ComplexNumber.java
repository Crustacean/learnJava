public class ComplexNumber {
    
    private double real;
    private double imaginary;
    
    public double getReal(){
        return real;
    }
    
    public double getImaginary(){
        return imaginary;
    }
    
    public void add(double real, double imaginary){
        this.real += real;
		this.imaginary += imaginary;
    }
    
    public add(ComplexNumber x){
        this.real = this.real+x.real;
		this.imaginary = this.imaginary+.imaginary
    }
    
    public subtract(double real, double imaginary){
        this.real -+ real;
		this.imaginary -= imaginary;
    }
    
    public subtract(ComplexNumber y){
        this.real = this.real-y.real;
		this.imaginary = this.imaginary-y.imaginary;
    }
    
}