// Type 1 syntax where we dont know the size and variables of arrays
// public class array{
//     public static void main(String args[]){
//         int[]marks= new int[3];
//         marks[0]=10;
//         marks[1]=9;
//         marks[2]=8;
//         System.out.println(marks[0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//         for (int i = 0;i<3;i++){
//             System.out.println(marks[i]);

//         }
        
//     }
// }
//Type 2
// public class array{
//     public static void main(String args[]){
//         int marks[]={89,23,88};
//         for (int i = 0 ; i<3;i++){
//             System.out.println(marks[i]);
//         }

//     }
// }
// 
// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int marks[]= new int[size];
//          for(int i = 0 ;i<size;i++){
//             marks[i]=sc.nextInt();
//         }
//         for(int i = 0 ; i<size;i++){
//             System.out.print(marks[i]);
//         }
       
//     }

// }
//q.Create a array take input from user search a indices of a provided number
// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Size of your Array");
//         int n = sc.nextInt();
//         int numbers[] = new int[n];
//         System.out.println("Enter the number of whom you want to find its index");
//         int x = sc.nextInt();
//         for (int i = 0;i<n;i++){
//             numbers[i]=sc.nextInt();}
//         for (int i =0;i<numbers.length;i++){
//             if(numbers[i]==x) {
//            System.out.println("Index of that given number is "+i);
//         } }
//         }
// }


// Q.Take names as input create an array and print it

// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The size of the array");
//         int size = sc.nextInt();
//         String Names[] = new String[size];
//         for(int i = 0;i<size;i++){
//             Names[i] = sc.next();
//         }
//         for(int i = 0;i<size;i++){
//             System.out.print(Names[i]+",");
//         }

//     }
// }