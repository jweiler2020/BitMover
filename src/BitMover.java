import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.util.*;
import java.io.*;

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
		FileInputStream file = null;
		byte[] bytes;

		try
		{
			file = new FileInputStream(filename);
			int c;

			while ((c = file.read()) != -1)
			{

			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error: File not found.");
		}
		catch (IOException e)
		{
			System.out.println("Error: Something went wrong reading the file.");
		}
	}
}
