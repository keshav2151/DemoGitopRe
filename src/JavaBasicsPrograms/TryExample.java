package JavaBasicsPrograms;

import java.util.HashMap;

public class TryExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"AA");
		hm.put(1,"BB");
		System.out.println("HashMap Contains:"+hm);
	}

}
