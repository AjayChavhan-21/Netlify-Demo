class Codex{
	private int a;

	void display(){
		System.out.println(a);
	}
}

class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();
		obj.a=10;
		obj.didplay();

		Codex obj = new Codex();
		obj.a=20;
		obj.didplay();
		
	}
}