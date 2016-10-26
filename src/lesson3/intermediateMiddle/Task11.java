package lesson3.intermediateMiddle;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		Task11 myInstance = new Task11();
		System.out.println(myInstance.generatePassword(8));
		System.out.println(myInstance.generatePassword(5));
		System.out.println(myInstance.generatePassword(16));
		System.out.println(myInstance.generatePassword(3));
		System.out.println(myInstance.generatePassword(-3));
		System.out.println(myInstance.generatePassword(30));
		

}

	private boolean checkLetter(String myLetter, String myString) {
		boolean result = false;
		for (int i = 0; i < myString.length(); i++)
			if (myLetter.equals(myString.substring(i, i+1))) result = true;
		return result;}
	
	public String generatePassword(int lettersQuantity) {
		if (lettersQuantity<8) return "Password should have at least 8 characters.";
		else {
		String template;
		String myPassword="";
		do{ template= generateTemplate(lettersQuantity);}
		while (!checkLetter("b", template ) && checkLetter("s", template ) && checkLetter("n", template )); 
		Random random = new Random();
		for ( int i=0; i<template.length(); i++){ 
	    	
				switch(template.substring(i, i+1)) {
			    case "b": 
			    	myPassword +=  Character.toString ((char) (65+random.nextInt(26)));
				break;
				case "s": 
					myPassword +=  Character.toString ((char) (97+random.nextInt(26)));
					break;
				case "n": 
					myPassword +=  Character.toString ((char) (48+random.nextInt(10)));
					break;
			}
			
	    }
		
		return myPassword;}
		
	}

	private String generateTemplate(int value) {
	
		String template = "";
		Random random = new Random();
		for ( int i = 0; i<value; i++) {
			switch(random.nextInt(3)) {
		    case 0: 
		    	template += "b";
				break;
			case 1: 
				template += "s";
				break;
			case 2: 
				template += "n";
				break;
		
		}}
		return template;
	
		
	}
}