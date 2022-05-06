import java.util.Arrays;
import java.util.Scanner;

public class Test_JAVA{
    public static void main(String[] args) {
        // String s="Hello World";
        // String[] s2 =s.split(" ");
        // System.out.println(Arrays.toString(s2));

         String s3="Hello World. How are you?, I am fine";
         String[] s4 =s3.split("\\.|\\,| ");
         System.out.println(Arrays.toString(s4));

//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine();
//        String[] str2 = str.split(" ");
//        System.out.print("Ten nguoi dung nhap vao: "+str2[str2.length-1]);

//        input.close();
    }
}