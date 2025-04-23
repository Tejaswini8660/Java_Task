import java.util.*;
public class Pattern2 {
    public static int floyds(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int inverted_triangle(int n) {
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <=n-i; j++) {
              System.out.print("* ");
          }
          System.out.println();
      }
      return 0;
          }   
          public static void hallow1(int n){
        
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=n; j++) {
                  if(i==1|| i==n || j==1 || j==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
            }
                System.out.println();
            }
        }
    }
     public static void left_tri(int n) {
                for (int i = 1; i <= n; i++) {
                    // Print spaces
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    // Print stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Move to next line
                    System.out.println();
                }
            }
    public static void right_triangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void inverted_right_triangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void triangle(int n){
        for(int i=0;i<=n;i++){
          for(int j=1;j<=i;j++)  {
            if((i+j)%2==0){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
           
          }
            System.out.println();
        }
    }
    public static void number(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void alphabet(int n) {
        char ch=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                ch++;
            }
            System.out.println();
        }
    }

        public static void butterfly(int n) {
            // Upper half of the butterfly
            for (int i = 1; i <= n; i++) {
                // Left stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // Middle spaces (2*(n - i) spaces, each = "  ")
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("  ");
                }
                // Right stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    
            // Lower half of the butterfly
            for (int i = n; i >= 1; i--) {
                // Left stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // Middle spaces
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("  ");
                }
                // Right stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    public static void rombus(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();   
        }
    }
    public static void hallow_diamond(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
        }
        public static void hallow(int n){
            for(int i=1;i<=n;i++){
                for(int j=n;j>=i;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                        System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
       
           public static void yash(int n){
            for (int i = 1; i <= n; i++) {
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                } 
                for(int j=1;j<=n-i;j++){
                    System.out.print("*");
                }
                System.out.println();}
            }
    
   public static void diamond(int n) {
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        } 
        for(int j=1;j<=n-i;j++){
            System.out.print("*");
        }
        
       for(int j=1;j<=(2*i-1);j++){
      System.out.print("*");
      }
    System.out.println();
    }

for(int i=n;i>=1;i--){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    } 
    
  for(int j=1;j<=(2*i-1);j++){
    System.out.print("*");
  }

  System.out.println();
}
}

public static void mid_star(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
 
   public static void parscal_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.println(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
        n = n * (i - j) / (j + 1);
    }
    System.out.println(n);
}
    }
    public class PascalTriangle {
        public static void printPascalTriangle(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                int num = 1;
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
        public static void mid_star(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }

                    for(int j=1;j<=i;j++ ){
System.out.print("* ");

                    }
                    System.out.println();
                }
            }
        }
        public static void hallow_mid(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
  
          // floyds(n); 
          // inverted_triangle(n); 
           //hallow(n); 
        //left_tri(n); 
        //   right_triangle(n); 
         //  inverted_right_triangle(n); 
          // triangle(n);
          // number(n);
          // alphabet(n);
          // butterfly(n); 
          // rombus(n);
           hallow_diamond(n); 
          // diamond(n); 
          // diamond1(n);
         //mid_star(n);
         //hallow_mid(n);
          // yash(n);
        //  printPascalTriangle(n);
         // mid_star(n);   // hourglass(n); 
            // number_pyramid(n); 
            // inverted_number_pyramid(n); 
            // pascal_triangle(n); 
            // hollow_pyramid(n);
}  
    }
