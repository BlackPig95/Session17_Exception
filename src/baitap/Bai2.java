package baitap;

public class Bai2
{
    public static void findLargestNum()
    {
        System.out.println("Nhập số phần tử muốn thêm vào mảng");
        int n = Integer.parseInt(Bai1.scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhập phần tử vào mảng số nguyên");
            try
            {
                arr[i] = Integer.parseInt(Bai1.scanner.nextLine());
            } catch (NumberFormatException ignored)
            {
            }
        }
        if (n == 0)
        {
            throw new RuntimeException("Mảng rỗng");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("Số lớn nhất trong mảng: " + max);
    }
}
