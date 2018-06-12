import java.util.Scanner;

public class Tinhdiemtrungbinh {
    public static void main(String[] args) {
        float d1, d2 , d3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem vat ly :");
        d1 = sc.nextFloat();
        System.out.println("Nhap diem Hoa Hoc :");
        d2 = sc.nextFloat();
        System.out.println("Nhập điểm Sinh Học :");
        d3 = sc.nextFloat();

        float total = d1 + d2 + d3;
        float dtb = total /3;
        System.out.println("Tổng điểm 3 môn : "+total);
        System.out.println("Điểm trung bình 3 môn : "+dtb);
    }
}
