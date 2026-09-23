import java.util.*;
public class bubblesorting {
    public static void printArray(int num[]){
        for ( int i = 0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[]={7,8,3,1,2};
        //Time complexity = O(n^2)
        for (int i = 0 ; i < num.length-1 ; i++){ 
            for ( int j = 0 ;j<num.length-1-i;j++){ 
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        printArray(num);
    }
}
