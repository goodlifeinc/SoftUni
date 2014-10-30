import java.util.Scanner;

public class _06_formattingNumbers {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		input.close();
		String hexa = Integer.toHexString(a);
		String binary = Integer.toBinaryString(a);
		int binarystr = Integer.parseInt(binary);		
		
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hexa.toUpperCase(),binarystr,b,c);
		
	}
}
