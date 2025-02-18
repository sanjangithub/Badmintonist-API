package com.sanjan.Badmintonistapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class MaritialStatus {

	private boolean isMarried;

	public MaritialStatus(boolean isMarried) {
		super();
		this.isMarried = isMarried;
	}

	@Override
	public String toString() {
		return "MaritialStatus [isMarried=" + isMarried + "]";
	}
	
	public MaritialStatus() {}

	
	public String maritialMethod() {

		if(isMarried)
		{
			return ("This person is Married");
		}
		else
		{
			return ("This person is single...");
		}
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
}
