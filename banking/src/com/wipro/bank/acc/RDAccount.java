package com.wipro.bank.acc;

public class RDAccount extends Account {
	
	public RDAccount(int tenure, float principal) {
		this.tenure=tenure;
		this.principal=principal;
		
	}

	@Override
	public float calculateInterest() {
		
		float Intrest=0;
		int tn=tenure*12;
		float r=rateOfInterest/100;
		int n=4;
		for(int i=0;i<tn;i++) {
			Intrest=Intrest+principal*(float)((Math.pow(1+(r/n),n*((tn-i)/12.0)))-1);

		}
		return Intrest;
			
		
	}

	@Override
	public float calculateAmountDeposited() {
		
		
		return principal*tenure*12;
	}

}
