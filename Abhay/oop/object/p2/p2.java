class Demo{
	public static void main(String[]args){
		Student s1 = new Student();
		s1.fun();
		s1.run();

		Teacher t1 = new Teacher();
		t1.fun();
		t1.run();

		

	}
}

class Student{
	int a;

	void fun(){
		System.out.println("Hello");
		System.out.println(a);

	}

	void run(){
		System.out.println("Hello");
		System.out.println(a);

	}
}

class Teacher{
	
	int a;

	void fun(){
		System.out.println("by");
		System.out.println(a);

	}

	void run(){
		System.out.println("by");
		System.out.println(a);
	}

}