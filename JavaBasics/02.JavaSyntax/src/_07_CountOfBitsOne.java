import java.util.Scanner;

public class _07_CountOfBitsOne {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();
		String binary = Integer.toBinaryString(a);
		int count = binary.length() - binary.replace("1", "").length();
		System.out.println(count);
		
	}
}
