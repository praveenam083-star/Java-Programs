import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System .in);
        System.out.print("enter name");
        String name = sc.nextLine();
        System .out.print("enter age");
        int age = sc.nextInt();

        System .out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    
}
