import java.util.Scanner;
public class UVA1583 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 100000;
		int []list_array=new int[N+1];
		for(int i=1;i<=N;i++)
		{
			int num=i,n=i;
			//System.out.println("while外面"+i);
			while(num!=0)
			{
				n += num%10;	//將n= n+(num%10)
				num/=10;
				//System.out.println("while裡面"+num);
			}
			if(n<=N && list_array[n]==0) 
				list_array[n]=i;
				//System.out.println("while完結後"+n);
		}
		/*for(int i=0;i<list_array.length;i++) {
			System.out.println("["+i+"]"+list_array[i]);
		}*/
		
		int n=sc.nextInt();
		for(int i=0;i<n;++i)
			System.out.println(list_array[sc.nextInt()]);
	
	}

}
