import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {

        //scanner multi values in one line
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        

        sc.close();
    }
}