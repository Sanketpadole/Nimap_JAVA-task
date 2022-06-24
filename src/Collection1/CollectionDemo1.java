package Collection1;

import java.util.ArrayList;

public class CollectionDemo1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);
	
		ArrayList al2=new ArrayList();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
	}

}
