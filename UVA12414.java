import java.util.Scanner;

public class UVA12414 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		while (!(str = sc.nextLine()).isEmpty()) {
		//while (sc.hasNextLine()) {
			str = sc.nextLine();
			for(int ST=1;ST<=10000;ST++) {
				int result=calculate(ST,str);
				if(result==100) {
					System.out.println(ST);
					break;
				}
				else if(ST==10000 && result!=100) {
					System.out.println(":(");
				}
			}
			
		} // while
	}// main

	public static boolean abc(int size, int a, int b, int c) {
		if (size == 3) {
			int result = 100 * a + 10 * b + c;
			return result > 100;
		} else if (size == 2) {
			return false;
		} else {
			return true;
		}
	}//abc
	
	public static int calculate(int ST, String str) {
		String value_str = "";
		for (int i = 0; i < str.length(); i++) {
			value_str = value_str.concat(Integer.toString(Character.getNumericValue(str.charAt(i)) - 10 + ST));
			//System.out.println(value_str);
		}//for 處理輸入
		
		int[] value_arr = new int[value_str.length()];
		for (int i = 0; i < value_arr.length; i++) {
			value_arr[i] = value_str.charAt(i) - '0';
		}//for 將資料整合複製到value_arr
		
		int size = value_arr.length;

		while (abc(size, value_arr[0], value_arr[1], value_arr[2])) {
			for (int i = 0; i < size-1; i++) {
				value_arr[i] = value_arr[i] + value_arr[i + 1];
				value_arr[i] = value_arr[i] % 10;
			}
			size = size - 1;
			/*
			System.out.println("陣列內的數字");
			for (int i = 0; i < size; i++) {
				System.out.print(value_arr[i]);
			}
			System.out.println();
			*/
			
		} // while
		if(size==3) {
			return value_arr[0]*100+value_arr[1]*10+value_arr[2];
		}
		else {
			return value_arr[0]*10+value_arr[1];
		}
	}

}
