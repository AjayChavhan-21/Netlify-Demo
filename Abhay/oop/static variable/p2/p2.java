class Codex{
	static int a=10;
}

class Demo{
	public static void main(String[]args){
		System.out.println(Codex.a);
		Codex obj = new Codex();
		Codex obj1 = new Codex();

		obj.a++;
		System.out.println(obj.a);
		System.out.println(obj1.a);



	}
}