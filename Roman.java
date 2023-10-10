import java.util.Scanner;
public class Roman
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String rnum = scanner.nextLine().toUpperCase();
        int result = 0;
        int preValue = 0;
        for (int i = rnum.length() - 1; i >= 0; i--) 
		{
            char rChar = rnum.charAt(i);
            int rValue;
            if (rChar == 'I')
                rValue = 1;
            else if (rChar == 'V')
                rValue = 5;
            else if (rChar == 'X')
                rValue = 10;
            else if (rChar == 'L')
                rValue = 50;
            else if (rChar == 'C')
                rValue = 100;
            else if (rChar == 'D')
                rValue = 500;
            else if (rChar == 'M')
                rValue = 1000;
            else {
                System.out.println("Invalid Roman numeral: " + rChar);
                return;
            }
            if (rValue < preValue) 
			{
                result -= rValue;
            } else {
                result += rValue;
            }   
            preValue = rValue;
        }
        System.out.println("Roman To Integer Value : " + result);
    }
}
