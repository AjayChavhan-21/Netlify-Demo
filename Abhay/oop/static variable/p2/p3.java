class Codex{
	
	static void display(){
		System.out.println("Hello");
	}
}

class Demo{
	public static void main(String[]args){
		Codex.display();
		Codex obj = new Codex();
		Codex obj1 = new Codex();

		obj.display();
		obj1.display();

		
	}
}