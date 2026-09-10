// import java.util.*;
// public class normal {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n , reverse = 0;
//         while( temp != 0){
//             reverse = reverse * 10 + temp % 10;
//             temp = temp /10;
//         }
//         if ( n == reverse){
//             System.out.println(n + "It is a palindrome number");
//          }
//          else
//             System.out.println("Not a palindrome number");
         
//     }
    
// }
//Print First and Last Digit

// import java.util.*;
// public class normal{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int LastDigit = n%10;
//         int FirstDigit = n;
//         while(FirstDigit>=10){
//             FirstDigit =FirstDigit/10;
//         }
//         System.out.println(FirstDigit);
//         System.out.println(LastDigit);
//     }
// }
import java.util.*;
public class normal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int FirstDigit = num;
        int LastDigit = num % 10;
        while (FirstDigit >= 10){
            FirstDigit/=10;
        }
        System.out.println("Sum of FirstDigit and LastDigit :" + (FirstDigit+LastDigit));
    }
}
