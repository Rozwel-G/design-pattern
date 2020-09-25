package com.reol.code.builderPattern;

public abstract class food implements Item{
	public abstract float weight();

	@Override
	public abstract float price();

	@Override
	public abstract String name();


}
