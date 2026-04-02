import java.util.Scanner;
import java.lang.Math;
public class UVA1524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Max_exponent;
		while(((Max_exponent=sc.nextInt())!=0)&&Max_exponent<100) {
			sc.nextLine();
			double coefficients[]=new double[Max_exponent+1];
			double start_time = 0,over_time = 0;			
			for(int i=(coefficients.length-1);i>=0;i--) {
				coefficients[i]=sc.nextDouble();//輸入係數
				coefficients[i]/= (i+1); //poly[i]= poly[i]/(i+1),poly[i]是積分的係數轉成(1/n+1)放入a[i],由最高項至最少項
			}
			/*for(int i=(coefficients.length-1);i>=0;i--) {
				System.out.print(coefficients[i]+"\n");
			}*/
			start_time=sc.nextDouble();
			over_time=sc.nextDouble();
			if(start_time>over_time) break;
			System.out.printf("%.3f\n",(polyFunc(over_time,coefficients)-polyFunc(start_time,coefficients))/(over_time-start_time));
		}
		
	}
	public  static double polyFunc(double x,double[] eq) {
		double result=0;
		for(int i=(eq.length-1);i>=0;i--) {
			//System.out.println("polyFunc_i:"+i);
			//System.out.println("eq["+i+"]:"+eq[i]);
			result+=eq[i]*(Math.pow(x,i+1));
			//System.out.println("polyFunc_i_result:"+result);
		}
		//System.out.println("polyFunc_result:"+result);
		return result;
	}

}
