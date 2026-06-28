//charAt of String builder
public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Happy");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'P');
        System.out.println(sb);
    }
}
