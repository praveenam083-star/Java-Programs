public class butterfly {
    public static void main(String[] args) {
        int n=5;
        //upper
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");

            }
            //space
                int spaces = 2 * (n - i);
                for (int j = 1; j <= spaces; j++){
                    System.out.print("");
                    
                }
               // right
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    
                }
                System.out.println();
            }
          //lower
                for (int i = n; i >= 1; i--) {
                    //left
                    for (int j = 1; j <= i; j++){
                        System.out.print("*");
                        
                    }
                    //space
                    int space = 2 * (n-i);
                    for (int j = 1; j <= space; j++){
                        System.out.println();
                        
                    }
                    //right
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                        
                    } 
                    System.out.println();          
                    }
                        
                    }
                    
                }    
                
            
     
        
         
        
            
        
    
    

