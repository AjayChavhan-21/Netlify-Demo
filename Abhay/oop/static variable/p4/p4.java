class Codex{
	int age =10;

	void display(){
		System.out.println(age);
	}

	static void show(){
		System.out.println("");
	}
}

class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();
		Codex obj1 = new Codex();
		
		System.out.println(obj.age);
		System.out.println(obj1.age);
		
		obj.display();
		obj1.display();

		obj.show();
		obj1.show();

		

	}
}