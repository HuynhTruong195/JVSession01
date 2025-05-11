import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập width : ");
        float width = sc.nextFloat();
        System.out.println("Nhập height : ");
        float height = sc.nextFloat();
        float area = width * height;
        float circumference = 2 * (width + height);
        System.out.printf("Diện tích: %.2f%n", area);
        System.out.printf("Chu vi: %.2f", circumference);
    }
}