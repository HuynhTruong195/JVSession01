import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên...");
        String name = sc.nextLine();
        System.out.println("Nhập Tuổi...");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Địa chỉ...");
        String address = sc.nextLine();
        System.out.printf("Tôi tên là %s, tôi %d tuổi, hiện tại đang học tại PTIT-HCM. Quê quán ở %s.%n", name, age, address);
    }
}