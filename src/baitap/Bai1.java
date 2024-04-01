package baitap;

import java.util.Scanner;

public class Bai1
{
    public static final Scanner scanner = new Scanner(System.in);

    public static void sum2Int()
    {
        int num1, num2;
        System.out.println("Nhập số thứ nhất");
        while (true)
        {
            try
            {
                num1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e)
            {
                System.out.println("Vui lòng nhập chính xác số nguyên");
            }
        }
        System.out.println("Nhập số thứ hai");
        while (true)
        {
            try
            {
                num2 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e)
            {
                System.out.println("Vui lòng nhập chính xác số nguyên");
            }
        }
        System.out.println("Tổng 2 số: " + (num1 + num2));
    }
}
