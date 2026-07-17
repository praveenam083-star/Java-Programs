import java .util.Scanner;
 class div{
    public static void main (String[] args)
    {
    Scanner S= new Scanner(System.in);
        System.out.println("enter a number");
        int n= S.nextInt();
          if (n % 4==0){
            System.out.println(n+ " is divisible by 4");
        }
        else{
          System.out.println(n+ "is not divisible");
        }
    }
 }

