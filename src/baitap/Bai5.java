package baitap;

import java.util.Arrays;

public class Bai5
{
    public static void binarySearch(int[] arr)
    {
        System.out.println("Nhập vào giá trị cần tìm");
        int searchValue = Integer.parseInt(Bai1.scanner.nextLine());
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int middle = low + (high - low) / 2;
            if (searchValue == arr[middle])
            {
                System.out.println("Giá trị cần tìm có index là: " + middle);
                return;
            } else if (searchValue < arr[middle])
            {
                high = middle - 1;
            } else low = middle + 1;
        }
        throw new RuntimeException("Không tìm thấy");
    }

    public static int[] getArr()
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
        System.out.println("Trước sắp xếp: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sau sắp xếp: " + Arrays.toString(arr));
        return arr;
    }

    private static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)//Đệ quy cho đến khi low >= high => Mọi sub array đều đã sắp xếp xong
        {
            int j = partition(arr, low, high);//J = Index của pivot sau mỗi lần sắp xếp
            quickSort(arr, low, j - 1);//Đệ quy nửa bên trái
            quickSort(arr, j + 1, high);//Đệ quy nửa bên phải
        }
    }

    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j)
        {
            System.out.println("Called");
            while (arr[i] <= pivot)//Duyệt cho đến khi tìm thấy element lớn hơn pivot
            {
                i++;
            }
            while (arr[j] > pivot)//Duyệt cho đến khi tìm thấy element nhỏ hơn hoặc bằng pivot
            {
                j--;
            }
            if (i < j)//i nằm trước j thì swap để đảm bảo các element < pivot nằm bên trái, element > pivot bên phải
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Kết thúc while, j đã nằm sau i => Nửa bên trái là nửa bé hơn pivot
        //Swap pivot vào index sau cùng của nửa bên trái
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
}
