
import java.util.Scanner;

public class diamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //upper
        for (int i = 1; i < n; i++) {
            for (int j= 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i-1); j++) {
                System.out.print((char)(64+i));
                
            }
            System.out.println();
        }
        //lower
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j >i ; j--) {
                System.out.print(" ");
                
            }
            for (int j= 1; j <=(2*i-1); j++) {
                System.out.print((char)(64+i));
                
            }
             
            System.out.println();
            
        }
        sc.close();
    }
}
