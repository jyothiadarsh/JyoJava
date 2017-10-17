package Patterns;

public class emptytrianglepattern 
{
public static void main(String[] args) 
{
	/*for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==j||i==4||j==1)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
		
}

}*/
	int row=5;
	int star=5;
	for(int i=1;i<=star;i++)
	{
		for(int j=1;j<=row;j++)
		{
			if(j==row-i+1||i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}


