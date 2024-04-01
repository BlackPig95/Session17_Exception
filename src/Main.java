import java.text.SimpleDateFormat;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        sdf.parse("11/11/1998"); // ParseException

        // Chia cho 0
//        System.out.println(9/0); // ArithmeticException
        // index mangr sai
        int[] arr = {1, 2, 3};
//        arr[4] = 10; // ArrayIndexOutOfBoundsException
        // co gang truy xuat thanh phan cua doi tuong (thuoc tinh, phuong thuc) cua 1 gia tri null
        List<String> list = null;
        int[] arrInt = null;
//        System.out.println(arrInt.length);
//        Exception exception = new Exception("Loi mo ta ");
//        exception.printStackTrace();
        try
        {
            checkTriangle(0, 1, 2);
        }
//        catch (TriangleCheckedException e)
//        {
//            // xu li o  day
////            e.printStackTrace();
//            System.err.println(e.getMessage());
//        }
        catch (TriangleUncheckedException e)
        {
            System.err.println(e.getMessage());
//            e.printStackTrace();
        } finally
        {
            // du co catch sinh ra hay ko thi van vao
            System.out.println("ket thuc try catch");
        }
        System.out.println("Van thuc thi binh thuong");
    }

    // bai toan
    // kiem tra 3 canh co phai tao thanh 1 tam giac hay ko
    public static void checkTriangle(double a, double b, double c)
//            throws TriangleCheckedException
    {
//        TriangleCheckedException checkedException = new TriangleCheckedException("e");
        {
            try
            {
                if (a <= 0 || b <= 0 || c <= 0)
                    throw new TriangleCheckedException("Canh tam giac phai lon hon 0");
            } catch (TriangleCheckedException e)
            {
                throw new RuntimeException(e);
            }
        }
//        if (a <= 0 || b <= 0 || c <= 0)
//        {
//            throw new TriangleCheckedException("Canh tam giac phai lon hon -1");
//        }
        if (a + b <= c || b + c <= a || a + c <= b)
        {
            throw new TriangleUncheckedException("Tong 2 canh ko phai lon hon canh con lai");
        }
        System.out.printf("3 canh %s, %s, %s laf 3 canh cua 1 tam giac ", a, b, c);
    }
}