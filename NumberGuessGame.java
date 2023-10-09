import java.util.Random;
import java.util.Scanner;
class NumberGuessGame
{
    public static void main(String []args)
    {
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        System.out.println("you have to guess a Number to win the game");
        System.out.println("you have maximum 5 attempt limit");
        Scanner sc=new Scanner(System.in);
        Random randomnum=new Random();
        int num=randomnum.nextInt(100);
        int counter=1;
        for(int increment=4;increment>=0;increment--)
        {
            System.out.println("Enter any NO");
            int inputNum=sc.nextInt();
            if(inputNum==num)
            {
                System.out.println("you win the game" +increment+ "th attempt");
                counter=1;
                break;

            }
            else if(inputNum<num)
            {
                System.out.println("your guessed number is smaller than actual number");
                System.out.println(increment+ "attempt are remained");
            }
            else
            {
                System.out.println("your guessed number is greater than actaul number");
                System.out.println(increment+ "attempt are remained");
            }
        }
        if(counter!=1)
        {
            System.out.println("sorry !....you loss the game");
        }
    }
}