package List_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List2 {
	public static void main(String[] args) {
		List<Integer>values=new ArrayList<Integer>();
		values.add(3);
		values.add(99);
		values.add(77);
		values.add(2);
		values.add(88);
//		Collections.sort(values);
		values.add(88);

//		System.out.println(values.get(1));
		
		System.out.println(values);
		values.clear();
		System.out.println(values);


}
}
