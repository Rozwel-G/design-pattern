package com.reol.code.builderPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coca extends cola {
	private String name = "可口可乐";
	
	private float capacity = 0.5f;
	
	private float price = 4.5f;

	@Override
	public float capacity() {
		return this.capacity;
	}

	@Override
	public float price() {
		return this.price;
	}

	@Override
	public String name() {
		return this.name;
	}

}
