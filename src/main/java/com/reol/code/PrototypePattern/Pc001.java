package com.reol.code.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Pc001 extends Computer{
	private List<String> list = new ArrayList<String>();
	
	public void addGame(String str) {
		list.add(str);
	}
	
	public void init() {
		list.removeAll(list);
		list.add("wow");
		list.add("starcraft");
	}
	public void showSystem() {
		for(String str:list) {
			System.out.println(str);
		}
	}
}
