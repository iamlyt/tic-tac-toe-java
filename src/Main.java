import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Symbol s = new Symbol();
//        s.arrayFromInput();
        Scanner scn = new Scanner(System.in);
        char[] s = scn.nextLine().toCharArray();

        System.out.println(Arrays.toString(s));
    }
}
