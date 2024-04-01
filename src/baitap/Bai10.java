package baitap;

public class Bai10
{
    public static void calculateCircleArea()
    {
        System.out.println("Nhập bán kính hình tròn");
        double radius = NegativeNumber.checkInputNumber();
        System.out.println("Diện tích hình tròn: " + (radius * radius * Math.PI));
    }
}

class NegativeNumber extends RuntimeException
{
    public static double checkInputNumber()
    {
        double n = Double.parseDouble(Bai1.scanner.nextLine());
        if (n <= 0)
        {
            throw new RuntimeException("Vui lòng nhập số lớn hơn 0");
        }
        return n;
    }
}
