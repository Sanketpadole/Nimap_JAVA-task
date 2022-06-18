package constructor;

public class student {
	int stdid;
	String name;
	student(int stdid,String name){
		this.stdid=stdid;
		this.name=name;
		
	}
	public static void main(String [] args) {
		student s=new student(123,"sanket");
		System.out.println(s.stdid+""+s.name);
	}

}
