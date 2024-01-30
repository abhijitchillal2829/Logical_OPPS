package Logical;

public class Prime {
	public static void main(String[] args) {
		int no = 7;
		for(int i =1 ;i<=no ; i++)
		{
			if(no%i==0)
			{
				System.out.println("its a prime no");
				return;
			}
				else
				{
					System.out.println("its not a prime no");

				}
			}
		}
	}



