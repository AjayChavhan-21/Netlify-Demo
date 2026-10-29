class Codex{
	private int age;

	Codex(int age){
	this.age= age;
	}

	
	void display(){
		
		System.out.println(age);
	}
	void setage(int age){
		this.age =age;
		System.out.println(age);
	}
	
}

class Demo{
	public static void main(String[]args){
		Codex obj1 = new Codex(10);
		obj1.display();
		
		System.out.println("after reintiallicinf");
		obj1.setage(30);
		obj1.display();
	}
}