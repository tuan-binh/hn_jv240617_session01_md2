import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Nhâp số");
//        float number = Float.parseFloat(sc.nextLine());
//        System.out.println("Nhập chuỗi");
//        String string = sc.nextLine();
//        System.out.println(number + " "+string);
////        System.out.println(str);
//        System.out.println(Math.pow(2,3));

        // in
        // System.out.println() // line new
        System.out.println("1");
        System.out.println("2");
        // System.out.print() // giống inline
        System.out.print("3");
        System.out.print("4");
        // System.out.printf() // format
        /**
         * %s - String
         * %d - số nguyên
         * %f - số thực
         * */
        System.out.printf("[ %10d | %10s | %10f ]",1,"1331231",3.2);
    }
}