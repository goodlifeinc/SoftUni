import java.util.Scanner;

public class _04_theSmallestOf3Numbers {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String numbers = input.nextLine();
		input.close();
		
		String[] number = numbers.split(" ");
		float a = Float.parseFloat(number[0]);
		float b = Float.parseFloat(number[1]);
		float c = Float.parseFloat(number[2]);

		float first = Math.min(a, b);
		float last = Math.min(first, c);
		
		System.out.println(last);
	}
}
//TODO : CUT 0 AFTER .0;
