class Student{
	int a;
	Student(int b){
		a=b;
	}
	Student(){

	}
	void fun(){
		System.out.println(a);
	}
}
class Demo{
	public static void main(String[]args){
		Student s1= new Student(10);
		Student s2= new Student(20);
		Student s3= new Student();
		s3.a=40;

		s1.fun();
		s2.fun();
		s3.fun();

	}
}