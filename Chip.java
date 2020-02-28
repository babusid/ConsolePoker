public class Chip {
    private int value; //Instance variable: Value of the chips in the object

    //Default constructor with a value of 500 chips(int for computation)
    public Chip(){
        value = 500;
    }

    //Mutator Method
	public void setValue(int a){
		a = value;
    }
    
    //Accessor Method
	public int getValue(){
		return value;
    }

    //toString method
	public String toString(){
		return ("Value is " + value);
	}






}