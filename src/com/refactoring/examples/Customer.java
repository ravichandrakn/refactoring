package com.refactoring.examples;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental) rentals.nextElement();
			// determine amounts for each line
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((aRental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && aRental.getDaysRented() > 1)
				frequentRenterPoints++;
			// show figures for this rental
			result += "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getRent()) + "\n";
			totalAmount += aRental.getRent();
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}
}
