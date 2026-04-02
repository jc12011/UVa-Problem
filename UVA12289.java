import java.util.Scanner;
public class UVA12289 {

	public static void main(String[] args){
		int n;
		String str;
		int match_count;
		Scanner sc = new Scanner(System.in);
		n=Integer.parseInt((sc.nextLine()));
		for(int i = 0; i<n;i++) {			
			str = sc.nextLine();
			if(str.length()==5) {
				System.out.println("3");
			}
			else {
				match_count = 0;
				if(str.charAt(0)=='o') {
					match_count++;
				}
				if(str.charAt(1)=='n') {
					match_count++;
				}
				if(str.charAt(2)=='e') {
					match_count++;
				}
				if(match_count>=2) {
					System.out.println("1");
				}
				else {
					System.out.println("2");
				}
			}//else
		}//for
	}//main

}
