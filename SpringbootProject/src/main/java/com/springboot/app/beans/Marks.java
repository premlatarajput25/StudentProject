package com.springboot.app.beans;

public class Marks {
	
	private int english;
	private int maths;
	private int science;
	
	public Marks(int english, int maths, int science) {
		super();
		this.english = english;
		this.maths = maths;
		this.science = science;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	

}
