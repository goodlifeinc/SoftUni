import java.util.Scanner;

public class _02_triangleArea {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int ax = input.nextInt();
		int ay = input.nextInt();
		int bx = input.nextInt();
		int by = input.nextInt();
		int cx = input.nextInt();
		int cy = input.nextInt();
		input.close();
		
		int result = (ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2;
		String resultstr = Integer.toString(result);
		if (resultstr.contains("-"))
		{
			String s = resultstr.replace("-", "");
			System.out.println(s);
		}
		else 
		{
			System.out.println(resultstr);
		}
	}
}
