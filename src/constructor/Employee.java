package constructor;

public class Employee {
	String name;
	int emp_id;
	
	Employee(String name,int emp_id){
		this.name=name;
		this.emp_id=emp_id;
	}
	public static void main(String [] args) {
		Employee e1=new Employee("deepak",101);
		Employee e2=new Employee("abc",102);
		System.out.println(e1.name+ " "+e1.emp_id);
	}
}
	
	
	
	
//	public class manager{
//		String name;
//		int id;
//		manager(String name,int id){
//			this.name=name;
//			this.id=id;
//		}
//		
//		public static void main(String[] args) {
//			manager m=new manager("deepak",111);
//			
//			System.out.println(m.id+" "+m.name);
//		}
//	}












//public class employee{
//	String name;
//	int id;
//	employee(String name,int id){
//		this.name=name;
//		this.id=id;
//	}
//	public static void main(String[] args) {
//		employee e=new employee("deepak",123);
//	}
//}
		
	


