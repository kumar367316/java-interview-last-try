package com.core.designpattern.abstractfactory;

class FactoryCreator {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		} else if (choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}else {
			throw new InvalidDataException("Only Bank and Loan factory is allowed");
		}
	}
}