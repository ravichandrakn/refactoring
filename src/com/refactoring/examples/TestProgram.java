package com.refactoring.examples;

public class TestProgram {
	
	public static void main(String[] v){
		
		Customer customer =  new Customer("John");
		Movie titanic= new Movie("Titanic", Movie.REGULAR);
		customer.addRental(new Rental(titanic, 2));
		Movie kungFuPanda= new Movie("Kung Fu Panda", Movie.CHILDRENS);
		customer.addRental(new Rental(kungFuPanda, 1));
		System.out.println(customer.statement());
	}

}
