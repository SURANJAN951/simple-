import java.util.Scanner;

class Main{
	public static void main(String[] args) {
	Addition a = new Addition();
	a.add();
	
	}
}
class Addition {
	void add(){
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of num1");
	int num1 = scan.nextInt();
	System.out.println("Enter the value of num2");
	int num2 = scan.nextInt(); 
	if(num1 > 0 && num2 < 100) {
		int res = num1 + num2;
		System.out.println("The sum of num1 and num2 is"+res);
	}
	else {
		System.out.println("Invalid");
	}
	
		
}