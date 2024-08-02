

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhâp số");
//        float number = Float.parseFloat(sc.nextLine());
//        System.out.println("Nhập chuỗi");
//        String string = sc.nextLine();
//        System.out.println(number + " "+string);
////        System.out.println(str);
//        System.out.println(Math.pow(2,3));

        // in
        // System.out.println() // line new
//        System.out.println("1");
//        System.out.println("2");
//        // System.out.print() // giống inline
//        System.out.print("3");
//        System.out.print("4");
        // System.out.printf() // format
        /**
         * %s - String
         * %d - số nguyên
         * %f - số thực
         * */
        String text = "abcd";
        double a = 3.25633321;
        System.out.printf("| %d | %s | %.2f |\n", 1, text, a);
        System.out.printf("| %-10d | %-10s | %-10f |\n", 1, StringUtils.center(text, 10), 3.2);
        System.out.printf("| %-10d | %-10s | %-10f |\n", 1, text, 3.2);

    }
}