package com.teja;

public class Customer implements SimpleInterest, CompoundInterest{
	double principal_amount;
	double time_period;
	double rate_of_interest;
	Customer(double amount, double time, double rate){
		this.principal_amount = amount;
		this.time_period = time;
		this.rate_of_interest = rate;
	}
	@Override
	public double simpleInterest() {
		return (principal_amount * time_period * rate_of_interest)/100;
	}
	
	@Override
	public double compoundInterest() {
		return (principal_amount * Math.pow((1+rate_of_interest/100),time_period));
	}
}
