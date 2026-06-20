import java.util.*;
//for(initialisation;condition;updation){
    //do somthing
//}
// class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         for(int i = sc.nextInt();i<=10;i++){
//             System.out.print(i);
//         }


//     }
// }
// class loops{
//     public static void main(String[] args) {
//         int i =0;
//         while(i<10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }
// 
class loops{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =0;
    for(int i = 1;i<=n;i=i++){
        sum = sum + i;
    }
    System.out.println(sum);
}

}