package baitap;

import java.util.Map;

public class Bai8
{
    public static void checkPrimeNumber()
    {
        System.out.println("Nhập vào một số để kiểm tra tính nguyên tố");
        int number;
        while (true)
        {
            try
            {
                number = Integer.parseInt(Bai1.scanner.nextLine());
                break;
            } catch (NumberFormatException e)
            {
                System.out.println("Vui lòng nhập vào số nguyên");
            }
        }
        if (number <= 1)
        {
            throw new RuntimeException("Số nhập vào phải là số nguyên dương lớn hơn 1");
        }
        for (int i = 2; i <= number / 2; i++)
        {
            if (number % i == 0)
            {
                throw new RuntimeException("Không phải số nguyên tố");
            }
        }
        System.out.println("Là số nguyên tố");
    }
}
