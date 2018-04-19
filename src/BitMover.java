import java.util.Scanner;

public class BitMover
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the name of the file: ");
		String filename = kb.nextLine();
		System.out.print("Enter the amount of bits to shift over: ");
		int shift = kb.nextInt(); kb.nextLine();

		shiftFile(filename, shift);
	}

	public static void shiftFile(String filename, int shift)
	{
		
	}
}
