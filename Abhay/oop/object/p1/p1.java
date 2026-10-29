class Demo{
	public static void main(String[]args){
		System.out.println("------Student info-----");

		Student s = new Student();
		s.age=20;
		s.name="abhay";
		s.fun();

		Student s1 = new Student();
		s1.age=30;
		s1.name="Ajay";
		s1.fun();
		
		}
												
}

class Student{
	int age;
	String name;

	 void fun(){
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);

	}

}
