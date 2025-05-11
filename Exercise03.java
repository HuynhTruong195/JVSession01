import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập bán kính: ");
        Double radius = Double.valueOf(sc.nextLine());
        Double area = Math.PI * radius * radius;
        System.out.printf("Diện tích : %.2f.%n", area);

    }
}