package Set_Collection;

import java.util.HashSet;
import java.util.Set;

public class Set3 {
	public static void main(String[] args) {
		Set<Integer>values=new HashSet<>();
		System.out.println(values.add(87));
		System.out.println(values.add(97));
		System.out.println(values.add(34));
		System.out.println(values.add(92));
		
		for (int i : values)
		{
			System.out.println(i);
		}
	}

}
