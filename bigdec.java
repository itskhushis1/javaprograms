import java.io.*;

public class GCD_Of_N_Num{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int t = Integer.parseInt(br.readLine());
			while(t-- > 0){
				String[] input = br.readLine().split(" ");
				int size = input.length;
				int[] array = new int[size];
				for (int i=0; i<size; i++)
					array[i] = Integer.parseInt(input[i]);

				System.out.println(gcd_Array(array, size));
			}
		}catch(Exception e){}
	}
	private static int gcd_A_and_B(int a, int b){
		return a % b == 0 ? b : gcd_A_and_B(b, a%b);
	}
	private static int gcd_Array(int[] array, int size){
		if (size == 1) {
			return array[0];
		}
		int temp = array[0];
		for (int i=1; i<size; i++){
			temp = gcd_A_and_B(array[i], temp);
		}
		return temp;
	}
}
