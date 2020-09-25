package com.reol.code.PrototypePattern;

public abstract class Computer implements Cloneable {
	@Override
	public Object clone() {
	      Computer clone = null;
	      try {
	         clone = (Computer)super.clone();
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      return clone;
	   }
	public abstract void addGame(String name);
	
	public abstract void init();

	public abstract void showSystem();
}
