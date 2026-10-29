class Demo{
	public static void main(String[]args){
		Student.fun();
		Student.a=10;
		System.out.println(Student.a);
		
	}
}

class Student{
	int a;
	static void fun(){
		System.out.println("Hello");
		System.out.println();
	}
}