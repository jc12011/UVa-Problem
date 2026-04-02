import java.util.Scanner;

public class UVA11875 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt(); //測資
		
		for(int i = 1; i<=T;i++) {
			int N = sc .nextInt(); //N 隊員數目
			for(int j=1;j<=N;j++) {
				int temp = sc.nextInt();
				if (j==(N/2)+1) { //找中位數
					System.out.println("Case " + i + ": " + temp);
				}
			}
		}

	}

}
