package com.teja;
import java.io.*;

public class Main {
	
	public static void main(String args[]) {
		Customer customer = new Customer(1000,2,4);
		PrintStream ps =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		ps.println("Simple interest: " + customer.simpleInterest());
		ps.println("Compound interest: " + customer.compoundInterest());
		
	}

}
