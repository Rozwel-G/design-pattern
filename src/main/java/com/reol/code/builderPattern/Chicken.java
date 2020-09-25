package com.reol.code.builderPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chicken extends food{
	private float price = 15.3f;
	
	private float weight = 2.3f;
	
	private String name = "炸鸡";
	@Override
	public float price() {
		return this.price;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public float weight() {
		return this.weight;
	}
	
	

}
