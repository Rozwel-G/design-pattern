package com.reol.code.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class BuilderPattern {
	private List<Item> list = new ArrayList<Item>();
	
	public void addItem(Item item) {
		list.add(item);
	}
	
	public void showMenu() {
		for(Item item:list) {
			System.out.print(item.name()+"======"+item.price());
			System.out.println();
		}
	}
}
