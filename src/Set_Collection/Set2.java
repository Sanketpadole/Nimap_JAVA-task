package Set_Collection;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
	public static void main(String[] args) {
		Set<Integer>values=new HashSet<>();
		values.add(5);
		values.add(6);
		values.add(9);
		values.add(6);
		
		for (int i:values)
		{
			System.out.println(i);
		}
	}
	

}


//list allow duplicates but set doesnt allow duplicates


