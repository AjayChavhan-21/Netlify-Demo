class Employee{
	private int id;
	String name;
	String company;

	Employee(int id,String name,String company){
		this.id = id;
		this.name=name;
		this.company=company;
	}

	void display(){
		System.out.println(" id: "+id+" name: "+name+"  company: "+company );
	}
	void setId(int id){
		this.id=id;
	}
}

class Demo{
	public static void main(String[]args){
		Employee e1 = new Employee(10,"Prem","Google");
		Employee e2 = new Employee(20,"Abhay","Microsoft");
		Employee e3 = new Employee(30,"Soham","Amazon");
		
		e1.display();
		e2.display();
		e3.display();
		System.out.println(" after Modification");
		e1.setId(50);
		e1.display();


	}	
}		