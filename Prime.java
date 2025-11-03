import java.util.Scanner;


class Prime{
	public static void main(String args[]){
		System.out.println("Enter your Number");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		if(num1%2==0){
			System.out.println("This is Prime Number");
		}else{
			System.out.println("This is Not Prime Number");
		}
		
	}
}