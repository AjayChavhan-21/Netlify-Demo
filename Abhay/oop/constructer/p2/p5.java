class Student{
	int a;
	Student(int b){
		a=b;
	}
	void fun(){
		System.out.println(a);
	}
}

class Demo{
	public static void main(String[]args){
		Student s1= new Student(10);
		Student s2= new Student(20);
		s1.fun();
		s2.fun();
	}
}