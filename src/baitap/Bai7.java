package baitap;

public class Bai7
{
    public static void findBiggerNumber()
    {
        int num1, num2;
        System.out.println("Nhập số thứ nhất");
        while (true)
        {
            try
            {
                num1 = Integer.parseInt(Bai1.scanner.nextLine());
                break;
            } catch (NumberFormatException e)
            {
                System.out.println("Vui lòng nhập vào một số nguyên");
            }
        }
        System.out.println("Nhập số thứ hai");
        while (true)
        {
            try
            {
                num2 = Integer.parseInt(Bai1.scanner.nextLine());
                break;
            } catch (NumberFormatException e)
            {
                System.out.println("Vui lòng nhập vào một số nguyên");
            }
        }
        if (num1 < num2)
            System.out.println("Số lớn hơn là: " + num2);
        else if (num1 > num2) System.out.println("Số lớn hơn là: " + num1);
        else System.out.println("Hai số bằng nhau");
    }
}
