package Set_Collection;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
	public static void main(String[] args) {
		Set<Integer>values=new HashSet<>();
		values.add(5);
		values.add(6);
		values.add(9);
		
		for (int i:values)
		{
			System.out.println(i);
		}
	}
	

}
