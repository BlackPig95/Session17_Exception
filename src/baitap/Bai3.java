package baitap;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Bai3
{
    public static void sumArrayInt()
    {
        System.out.println("Nhập số phần tử muốn thêm vào mảng");
        int n = Integer.parseInt(Bai1.scanner.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhập phần tử vào mảng");
            arr[i] = Bai1.scanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        if (n == 0)
        {
            throw new RuntimeException("Mảng rỗng");
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            try
            {
                sum += Integer.parseInt(arr[i]);
            } catch (NumberFormatException e)
            {
                System.out.println(arr[i] + " không phải số nguyên");
            }
        }
        System.out.println("Sum: " + sum);
    }
}
