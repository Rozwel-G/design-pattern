package com.reol.code.builderPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hunburg extends food {
	private String name = "香辣鸡腿堡";
	
	private float price = 9.9f;
	
	private float weight = 2.3f;

	@Override
	public float weight() {
		return this.weight;
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
