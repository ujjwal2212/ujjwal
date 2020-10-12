import java.util.Scanner;
class Factorial
{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
int fact=1;
	System.out.print("Enter Number : ");
	int a = scan.nextInt();
	fact=1;
	for(int i=a; i>0; i--)
		fact=fact*i;
	System.out.println("Factorial of " + a +" = " + fact);
	}
}