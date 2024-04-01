package baitap;

public class Bai9
{
    public static void findFibonacci()
    {
        System.out.println("Nhập vào một số nguyên dương");
        int num;
        try
        {
            num = Integer.parseInt(Bai1.scanner.nextLine());
        } catch (NumberFormatException e)
        {
            throw new RuntimeException("Số đã nhập không phải số nguyên");
        }
        if (num <= 0)
        {
            throw new RuntimeException("Vui lòng nhập số nguyên lớn hơn 0");
        }
        System.out.println("Số Fibonacci thứ " + num + " là: " + fibonacciCount(num));
    }

    private static int fibonacciCount(int n)
    {
        if (n == 1 || n == 2)
        {
            return 1;
        }
        return fibonacciCount(n - 1) + fibonacciCount(n - 2);
    }
}
