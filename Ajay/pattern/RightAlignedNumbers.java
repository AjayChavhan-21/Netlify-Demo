class Demo{
	public static void main(String[]args){
		int jcount=4;
		for(int i=1; i<=5; i++){
			int count=1;
			for(int j=1; j<=5; j++){

				if(j<=jcount ){
				System.out.print(" ");
				}else{
				System.out.print(count);
				count++;
				}
				
			}
			jcount--;
			System.out.println();
		}
	}
}