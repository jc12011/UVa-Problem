import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class UVA458 {//***

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		DataOutputStream output = new DataOutputStream(System.out) ;
		int C;
		while ((C =input.read()) !=-1) {
			output.write((Character.isSpace((char)C) ? C : (C-7)));
		}		
	}
}
