class Employee{
	private int age;
        private String name;
        String company;

	Employee(int age,String name,String company){
		this.age=age;
		this.name=name;
		this.company=company;
	
	}
	void display(){
		System.out.println("age : "+age+ " name : "+name +" company : "+company);
	}
	void setAge(int age,String name){
		this.age = age;
		this.name = name;
	}
	void setOnlyage(int age){
		this.age = age;
	}

}
class Demo{
	public static void main(String[]args){

	
	Employee e1 = new Employee(10,"Abhay","TCS");
	e1.display();
	Employee e2 = new Employee(20,"Ajay","google");
	e2.display();
	System.out.println("after modification");
 	
	e1.setAge(50,"saad");
	e1.display();
	e2.setOnlyage(100);
	e2.display();
	
	}
}
	
		