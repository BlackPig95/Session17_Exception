package baitap;

import java.util.Arrays;
import java.util.stream.Stream;

public class Bai14
{
    public static void calculateAverage()
    {
        System.out.println("Nhập số phần tử muốn thêm vào mảng");
        int n = Integer.parseInt(Bai1.scanner.nextLine());
        try
        {
            EmptyArrayException.checkArraySize(n);
        } catch (EmptyArrayException e)
        {
            throw new RuntimeException(e);
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhập phần tử vào mảng số nguyên");
            try
            {
                arr[i] = Integer.parseInt(Bai1.scanner.nextLine());
            } catch (NumberFormatException ignored)
            {
                System.out.println("Nhập số nguyên");
            }
        }
        System.out.println("Trung bình cộng của mảng: " +
                Arrays.stream(arr).reduce(0, (combiner, nextValue) -> combiner + nextValue) / arr.length);
    }
}

class EmptyArrayException extends Exception
{
    public static void checkArraySize(int n) throws EmptyArrayException
    {
        if (n <= 0)
            throw new EmptyArrayException("Không được nhỏ hơn 0");
    }

    public EmptyArrayException(String message)
    {
        super(message);
    }
}
