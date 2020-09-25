package com.reol.code.PrototypePattern;

import java.util.Hashtable;

public class PcCache {
	private static Hashtable<Integer, Computer> pcMap = new Hashtable<>();
	
	public static Computer getPc(int i) {
		Computer pc = pcMap.get(i);
		return (Computer) pc.clone();
	}
	
	public static void init() {
		Pc001 pc1 = new Pc001();
		pc1.init();
		pcMap.put(1, pc1);
		
		Pc002 pc2 = new Pc002();
		pc2.init();
		pcMap.put(2, pc2);
	}

}
