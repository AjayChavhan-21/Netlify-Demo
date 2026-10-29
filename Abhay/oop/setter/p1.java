class Student{
	private int age;
	private String name;

	Student(int age, String name){
		this.age=age;
		this.name=name;
	}

	void setAge(int age){
		this.age=age;
	}

	void setName(String name){
		this.name=name;
	}

	int getAge(){
		return age;
	}

	String getName(){
		return name;
	}
}

class Demo{
	public static void main(String[]args){
		Student s1= new Student(10,"A");
		Student s2= new Student(20,"B");

		s1.setAge(50);
		s2.setName("Abhay");

		System.out.println(s1.getAge()+ " name is: " + s1.getName());
		System.out.println(s2.getAge()+ " name is: " + s2.getName());
	}
}