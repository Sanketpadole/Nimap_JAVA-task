package Static_variable_and_method;

public class Employee {
	int empid;
	String name;
	static String company="SP";
	Employee(int empid,String name){
		this.empid=empid;
		this.name=name;
	}
	void display() {
		System.out.println(empid+" "+name+" "+company);
	}
	public static void main(String [] args) {
		Employee e1=new Employee(101,"amit");
		e1.display();
	
	Employee e2=new Employee(102,"Deepak");
	e2.display();

}
}
