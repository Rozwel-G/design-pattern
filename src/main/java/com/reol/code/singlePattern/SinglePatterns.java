package com.reol.code.singlePattern;

public class SinglePatterns {
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private volatile static SinglePatterns instance;
	
	private int value;
	
	private SinglePatterns() {};
	
	public static SinglePatterns getInstance() {
		if(instance == null) {
			synchronized (SinglePatterns.class) {
				if(instance == null) {
					instance = new SinglePatterns();
				}
			}
		}
		return instance;
	}
}
