package com.reol.code.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Pc002 extends Computer {
	private List<String> list = new ArrayList<String>();
	
	public void addGame(String str) {
		list.add(str);
	}
	@Override
	public void init() {
		list.removeAll(list);
		list.add("league of legends");
		list.add("battle of");
	}
	@Override
	public void showSystem() {
		for(String str:list) {
			System.out.println(str);
		}
	}
}
