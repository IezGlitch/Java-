// public class bitManipul {
//     public static void main(String args[]){
//         int n = 5;
//         int pos = 2 ;
//         int bitMask = 1<<pos;
//         if((bitMask & n)==0){
//             System.out.println("Bit was Zero");
//         }
//         else{
//             System.out.println("bit was One");
//         }
//     }
// }

//SetBit
// public class bitManipul {
//     public static void main(String args[]){
//         int n = 5;
//         int pos = 1;
//         int bitMask = 1<<pos;
//         int newNum = bitMask | n;
//         System.out.println(newNum);

//         }
//     }
 
//Clear Bit
// public class bitManipul{
//     public static void main(String args[]){
//         int no = 5;
//         int pos = 2;
//         int bitMask = 1<<2;
//         int newNum = ~bitMask & no;
//         System.out.println(newNum);
//     }
// }

//Update Bit
import java.util.*;
public class bitManipul{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int pos = 1;
        System.out.println("Press what manipulation you want to do");
        int manipulation = sc.nextInt();
        if (manipulation == 0){ //Clear Operation
            int bitMask = 1<<pos;
            int newNum = ~bitMask & num;
            System.out.println(newNum);
        }
        else{//Set operation
            int bitMask = 1<<pos;
            int newNum = bitMask | num;
            System.out.println(newNum);

        }
    }
}