package com.reol.code.abstractFactory;

public class ColorFactory extends AbstractFactory{
	public Color getColor(String type) {
		if("red".equals(type)){
			return new Red();
		}else if("blue".equals(type)) {
			return new Blue();
		}else {
			return null;
		}
	}

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
