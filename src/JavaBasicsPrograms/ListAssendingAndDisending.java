package JavaBasicsPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAssendingAndDisending {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,5,4,3,2,9,8,7,6);
		System.out.println("Unorderd List:"+list);
		//Collections.sort(list);
		System.out.println("Orderd List : "+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("List in Desecnding Order"+list);
	}

}
