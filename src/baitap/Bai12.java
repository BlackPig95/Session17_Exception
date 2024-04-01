package baitap;

public class Bai12
{
    public static void findGCD()
    {
        System.out.println("Nhập số thứ nhất");
        int num1 = 0;
        int num2 = 0;
        try
        {
            num1 = Integer.parseInt(Bai1.scanner.nextLine());
        } catch (NumberFormatException e)
        {
//            e.printStackTrace();
            throw e;
        }
        System.out.println("Nhập số thứ hai");
        try
        {
            num2 = Integer.parseInt(Bai1.scanner.nextLine());
        } catch (NumberFormatException e)
        {
            throw new RuntimeException("Hãy nhập số nguyên");
        }
        if (num1 == 0 && num2 == 0)
        {
            throw new RuntimeException("Một trong hai số phải khác 0");
        }
        if (num1 == 0 && num2 != 0)
        {
            System.out.println("Ước chung lớn nhất là: " + num2);
        } else if (num1 != 0 && num2 == 0)
        {
            System.out.println("Ước chung lớn nhất là: " + num2);
        } else
        {
            int dividend = Math.max(num1, num2);//Lấy số lớn hơn làm số bị chia
            int divisor = Math.min(num1, num2);//Số nhỏ hơn là số chia
            int remainder = dividend % divisor;//Lấy phần dư để tiếp tục thực hiện phép chia
            //Lấy số lớn hơn chia cho số nhỏ hơn, sau đó lấy số nhỏ hơn chia cho phần dư
            //Chia đến khi nào số dư đạt đến 0, thì số bị chia (divisor) chính là GCD
            //Không cần quan tâm thương số
//            dividend = divisor*quotient + remainder;
//            dividend / divisor = quotient + remainder;
//            divisor / remainder = quotient1 + remainder1;
//            remainder / remainder1 = quotient2 + remainder2;
            while (remainder != 0)
            {
                dividend = divisor;//Lấy số chia ở phép tính trước thành số bị chia
                divisor = remainder;//Lấy số dư ở phép tính trước thành số chia
                remainder = dividend % remainder;//Tính toán số dư của phép chia tiếp theo
            }
            System.out.println("Ước chung lớn nhất là: " + divisor);
        }
    }
}
