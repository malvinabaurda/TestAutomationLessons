
package lesson3.preintermediate;
/*
Write a method which calculates a sum of first 100 odd elements of Fibonacci sequence
http://stackoverflow.com/questions/8965006/java-recursive-fibonacci-sequence
*/

public class Task8 {
	int size = 1475;
	double [] fibonacci = new double [size];
	
    public double createFibonacciSequence (){
    	
    	double sum = 2;
    	try {fibonacci[0] = 0;
    	fibonacci[1] = 1;
    	
    	for( int i = 2; i<size; i++) {
    		fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
    		if (fibonacci[i]%2==0) 
    			sum +=fibonacci[i];}
		return sum;}
    	catch (ArrayIndexOutOfBoundsException ex){
    		System.out.println("This array is too small for me!");
    		return 0;
    	}
    }
	
	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		System.out.println("Sum of first "+myInstance.size+" odd elements of Fibonacci sequence: " + myInstance.createFibonacciSequence());
	}

}
