//charAt of String builder
// public class stringbuilder {
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("Happy");
//         System.out.println(sb);
//         // System.out.println(sb.charAt(0)); //Print index 0
//         // sb.setCharAt(0,'P');      change in character
//         // System.out.println(sb);
//         // sb.insert(0,'S');        Insertion
//         // sb.insert(2,'e');           
//         // System.out.println(sb);
//         // sb.delete(2,3);
//         // System.out.println(sb);
//         // sb.delete(2,4);          Deletion
//         // System.out.println(sb);
//         // sb.append("Aloo");       Addtion
//         // System.out.println(sb);
//         //StringBuilder ab = new StringBuilder("Hello");
//         // ab.append("e");
//         // ab.append("l");
//         // ab.append("l");
//         // ab.append("o");
//         // System.out.println(ab);
//        // System.out.println(ab.length());
       
//     }
// }
import java.util.*;
public class stringbuilder {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int a = sc.nextInt();
    String arr[] = new String[a];

    for(int i = 0;i<a;i++){
         arr[i]= sc.next();
    }
    for(int i =a-1;i>=0;i--){
        System.out.print(arr[i]);
    }

    }

}