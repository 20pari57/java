// import java.io.*;

// public class evenodd {
//     public static void main(String[]args) {
//         int number = 9;
//         if (number%2==0) {
//             System.out.println("THe number is even");
//         }
//         else {
//             System.out.println("The number is odd");
//         }
//     }
// }


import java.util.*;
public class evenodd 

{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}