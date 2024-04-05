package javapractice;
import java.util.Arrays;
import java.util.Collections;
public class main
{
	public static void f2(){
        String[] colours = {"blue", "pink", "purple", "orange", "grey", "red", "black"};
        Arrays.sort(colours, Collections.reverseOrder());
        System.out.println(Arrays.toString(colours));
    }
    public static void f1(){
        int[] numbers = {5, 3, 2, 6, 8, 7, 1, 0};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void main(String[] args) {
      f1();
      f2();
      
      //comparison
      String s1 = "abc";
      String s2 = "abc";
      System.out.println(s1.compareTo(s2));
    }
}
