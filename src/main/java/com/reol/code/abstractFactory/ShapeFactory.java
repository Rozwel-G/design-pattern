package com.reol.code.abstractFactory;

public class ShapeFactory extends AbstractFactory{
	public Shape getShape(String type) {
		if("circle".equals(type)){
			return new Circle();
		}else if("rectangle".equals(type)) {
			return new Rectangle();
		}else {
			return null;
		}
	}

	@Override
	public Color getColor(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
