package com.reol.code.factory;

public class FactoryPattern {
	public Draw getShape(String type) {
		if("circle".equals(type))
		{
			return new Circle();
		}else if("rectangle".equals(type)) {
			return new Rectangle();
		}else {
			return null;
		}
	}
}
