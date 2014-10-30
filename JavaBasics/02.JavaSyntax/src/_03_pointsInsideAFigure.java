import java.util.Scanner;

public class _03_pointsInsideAFigure {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String coordinates = input.nextLine();

		input.close();
		
		String[] point = coordinates.split(" ");
		float x = Float.parseFloat(point[0]);
		float y = Float.parseFloat(point[1]);
		if (((x>=12 && x<=17.5) || (x>=17.5 && x <=22.5)) && (y>=6 && y<=13.5)) 
		{
			System.out.println("Inside");
		}
		else 
		{
			System.out.println("Outside");
		}
	}
}
