package com.reol.code;

import com.reol.code.PrototypePattern.Computer;
import com.reol.code.PrototypePattern.PcCache;

public class PartternDemo {
	
	
	public static void main(String args[]) {
		PcCache.init();
		
		Computer pc1 = PcCache.getPc(1);
		
		pc1.addGame("ssd");
		
		pc1.showSystem();
		
		Computer anotherPc1 = PcCache.getPc(1);
		
		
		anotherPc1.showSystem();
	}
	
}
