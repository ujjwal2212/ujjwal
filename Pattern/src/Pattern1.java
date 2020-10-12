
public class Pattern1 {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		int lines=7;
		int numcount=7;
		int num=1;
		for(int i=1; i<=lines;i++)
		{
			for(int j=1;j<=numcount;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
			numcount--;
			num=1;
			}
		System.out.println("Program Ended");
	}

}
