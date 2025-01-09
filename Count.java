import java.util.*;
class Count
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem = 0;
		int sum = 0;
		if(n==0){
			System.out.println(1);
		}
		else{
			while(n>0){
				sum += n%10;
				++rem;
				n=n/10;
			}
			if(rem<9) {
				System.out.println("Count: "+ "0"+ rem);
			}
			else{
				System.out.println("Count: "+ rem);
			}
			
			System.out.println("Sum: "+ sum);
		}
	}
}
	