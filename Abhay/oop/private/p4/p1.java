class Hostel{
	private int age;
	private String name;
	private String comp;

	Hostel(int age,String name,String comp){
		this.age=age;
		this.name=name;
		this.comp=comp;
	
	}
	void Display(){
		System.out.println("age :"+age+"Name :"+name +"comp :"+comp);
	}
	void setAge(int age){
		this.age= age;
		System.out.println("age :"+age+"Name :"+name +"comp :"+comp);		
	}
	void setAgeandname(int age,String name){
		this.age = age;
		this.name =name;
		System.out.println("age :"+age+"Name :"+name +"comp :"+comp);
	}
	void setAll(int age,String name,String comp){
		this.age = age;
		this.name = name;
		this.comp = comp;
		System.out.println("age :"+age+"Name :"+name +"comp :"+comp);
	}
	
}
class Demo{
	public static void main(String[]args){
		Hostel h1 = new Hostel(10,"abhay","ajay");
		h1.Display();
		Hostel h2 = new Hostel(20,"saad","tanvir");
		h2.Display();
		

		System.out.println("after modifictaion ");
		h1.setAge(50);
		h2.setAgeandname(100,"Soham");
		h2.setAll(200,"srujal","pranav");
	}
}
