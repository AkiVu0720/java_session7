package LMS.Bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyClass myClass = new MyClass("Rikri Academy");
        System.out.println("Gia Tri ban dau: "+ myClass.getMyString());
        System.out.println("Thay doi gia tri: ");
        myClass.setMyString(scanner.nextLine());
        System.out.println("Gia Tri Sau khi thay doi: "+ myClass.getMyString());
    }
}
