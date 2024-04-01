package baitap;

public class Bai15
{
    public static void inputTriangle() throws IllegelTriangleException
    {
        int side1, side2, side3;

        System.out.println("Nhập cạnh thứ nhất");
        side1 = Integer.parseInt(Bai1.scanner.nextLine());
        System.out.println("Nhập cạnh thứ hai");
        side2 = Integer.parseInt(Bai1.scanner.nextLine());
        System.out.println("Nhập cạnh thứ ba");
        side3 = Integer.parseInt(Bai1.scanner.nextLine());
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            throw new IllegelTriangleException("Cạnh phải lớn hơn 0");
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2)
            throw new IllegelTriangleException("Tổng 2 cạnh của 1 tam giác luôn lớn hơn cạnh còn lại");
        System.out.println("3 cạnh của tam giác là: " + side1 + ", " + side2 + ", " + side3);
    }
}

class IllegelTriangleException extends Exception
{
    public IllegelTriangleException(String message)
    {
        super(message);
    }
}
