//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise04 {
    public static void main(String[] args) {
        int numberA = 10;
        int numberB = 5;
        int tong = numberA + numberB;
        int hieu = numberA - numberB;
        int tich = numberA * numberB;
        int thuong = numberA / numberB;
        int soDu = numberA % numberB;
        System.out.printf("Giá trị A = %d", numberA);
        System.out.printf(" Giá trị B = %d%n", numberB);
        System.out.printf("Tổng 2 số A + B = %d%n", tong);
        System.out.printf("Hiệu 2 số A - B = %d%n", hieu);
        System.out.printf("Tích 2 số A * B = %d%n", tich);
        System.out.printf("Thương 2 số A / B = %d%n", thuong);
        System.out.printf("Số dư khi A / B = %d", soDu);
    }
}