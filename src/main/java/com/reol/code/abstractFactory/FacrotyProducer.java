package com.reol.code.abstractFactory;

public class FacrotyProducer {
	public AbstractFactory getFactory(String type) {
		if("color".equals(type)){
			return new ColorFactory();
		}else if("shape".equals(type)) {
			return new ShapeFactory();
		}else {
			return null;
		}
	}
}
