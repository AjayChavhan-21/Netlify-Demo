class Demo{
	public static void main(String[]args){
	
	Student s1 = new Student(20, "Abhay");
	s1.fun();

	Student s2 = new Student(21, "Ajay");
	
	s2.fun();
	
	}
}

class Student{
	int age;
	String name;
	Student(int age,String name){
		this.age=age;
		this.name=name;
	}

	void fun(){
		System.out.println(age);
		System.out.println(name);

	}

}