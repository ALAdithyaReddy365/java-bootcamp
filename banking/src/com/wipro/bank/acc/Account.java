package com.wipro.bank.acc;

public abstract class Account {
	
	int tenure;
	float principal;
	float rateOfInterest;
   
	public void setInterest(int age, String gender) {
		
		if(gender.equalsIgnoreCase("male")&&age<60) {
			   rateOfInterest=9.8f;
			  }
			  else if(gender.equalsIgnoreCase("male")&&age>=60) {
			   rateOfInterest=10.5f;
			  }
			  else if(gender.equalsIgnoreCase("female")&&age<58) {
			   rateOfInterest=10.2f;
			  }
			  else if(gender.equalsIgnoreCase("female")&&age>=58) {
			   rateOfInterest=10.8f;
			  }
		
	}
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest) {
		return maturityInterest;
		
	}
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();


}
