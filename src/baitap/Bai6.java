package baitap;

public class Bai6
{
    public static void divideInteger()
    {
        System.out.println("Nhập số bị chia");
        int number1 = Integer.parseInt(Bai1.scanner.nextLine());
        System.out.println("Nhập số chia");
        int number2 = Integer.parseInt(Bai1.scanner.nextLine());
        int remainder = 0;
        try
        {
            remainder = number1 / number2;
        } catch (ArithmeticException e)
        {
            throw new ArithmeticException("Số chia phải khác 0");
//            throw new RuntimeException(e);
        }
        System.out.println("Thương số: " + remainder);
    }
}
