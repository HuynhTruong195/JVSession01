import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập tử số của số thứ Nhất %n");
        int tuSo1 = Integer.parseInt(sc.nextLine());
        System.out.printf("Nhập mẫu số của số thứ Nhất %n");
        int mauSo1 = Integer.parseInt(sc.nextLine());
        System.out.printf("Nhập tử số của số thứ Hai %n");
        int tuSo2 = Integer.parseInt(sc.nextLine());
        System.out.printf("Nhập tử số của số thứ Hai %n");
        int mauSo2 = Integer.parseInt(sc.nextLine());

        //Cộng hai phân số: (a/b) + (c/d) = (a*d + b*c) / (b*d)
        int ketQuaTuSo = tuSo1 * mauSo2 + mauSo1 * tuSo2;
        int ketQuaMauSo = mauSo1 * mauSo2;

        //rút gọn phân số
        // Gọi hàm tìm Ước chung lớn nhất để rút gọn phân số.
        int gcd = timUCLN(ketQuaMauSo, ketQuaTuSo);

        // Chia cả tử và mẫu cho gcd để có kết quả đơn giản nhất.
        ketQuaTuSo /= gcd;   // ketQuaTuSo = ketQuaTuSo / gcd;
        ketQuaMauSo /= gcd;    //ketQuaMauSo = ketQuaMauSo / gcd;

        //in kết quả
        System.out.printf("Tổng 2 phân số là : %d/%d", ketQuaTuSo, ketQuaMauSo);
    }

    //hàm tìm UCLN bằng hàm đệ quy qua thuật toán Euclid.
    public static int timUCLN(int numA, int numB) {
        if (numB == 0) return Math.abs(numA); //Khi numB = 0 → trả về trị tuyệt đối của numA (tránh số âm).
        return timUCLN(numB, numA % numB);
    }
}