import java.util.Scanner;
public class Pangram 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        boolean isPangram = true;
        for (char c = 'a'; c <= 'z'; c++) 
		{
            if (input.indexOf(c) == -1) 
			{
                isPangram = false;
                break;
            }
        }
        if (isPangram) 
		{
            System.out.println("The input is a pangram.");
        } else 
		{
            System.out.println("The input is not a pangram.");
        }
    }
}
