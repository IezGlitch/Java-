public class patternq8 {
    public static void main(String args[]){
        int n =5;
        pattern8(n);
    }  
    public static void pattern8(int n) {
        for (int i = 1;i<=n;i++){
            for(int j = 1; j<i;j++){
                System.out.print(" ");
            }
            for (int x=1;x<=(2*(n-i+1));x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}