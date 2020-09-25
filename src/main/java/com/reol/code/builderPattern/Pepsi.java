package com.reol.code.builderPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pepsi extends cola{
	private String name = "百事可乐";
	
	private float capacity = 0.4f;
	
	private float price = 3.5f;

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
