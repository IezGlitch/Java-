import java.util.*;
public class normal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n , reverse = 0;
        while( temp != 0){
            reverse = reverse * 10 + temp % 10;
            temp = temp /10;
        }
        if ( n == reverse){
            System.out.println(n + "It is a palindrome number");
         }
         else
            System.out.println("Not a palindrome number");
         
    }
    
}
