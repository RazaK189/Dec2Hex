
import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {
        Arg1 = Integer.parseInt(args[0]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
      
        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;

        System.out.println("Hexadecimal representation is: " + hexadecimal);
        System.out.println("Program ended");
    }


       


    }

 public static int userInputValidation() {

        Scanner scan = new Scanner(System.in);

        boolean x;
        int userInput = 0;
       

        do {
            x = true;
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                scan.nextLine();

                if (userInput < 0) {
                    System.out.println("Enter valid input");
                    x = false;
                }

            } 
            
            else {
                System.out.println("Enter valid inpu");
                x = false;
                scan.next();
            }
        } while (!x);
        return userInput;
    }
}

