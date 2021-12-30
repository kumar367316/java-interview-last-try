package com.core.designpattern.abstractfactory;

class BankFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else {
			 throw new InvalidDataException("This Bank facility is not available now");
		}
	}

	public Loan getLoan(String loan) {
		return null;
	}
}