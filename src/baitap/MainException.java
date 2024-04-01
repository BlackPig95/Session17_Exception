package baitap;

import java.awt.*;

public class MainException
{
    public static void main(String[] args)
    {
        Bai1.sum2Int();
        Bai2.findLargestNum();
        Bai3.sumArrayInt();
        Bai4.stringToInt();
        Bai5.binarySearch(Bai5.getArr());
        Bai6.divideInteger();
        Bai7.findBiggerNumber();
        Bai8.checkPrimeNumber();
        Bai9.findFibonacci();
        Bai10.calculateCircleArea();
        Bai11.checkDateInput();
        Bai12.findGCD();
        Bai13.reverseString();
        Bai14.calculateAverage();
        try
        {
            Bai15.inputTriangle();
        } catch (IllegelTriangleException exception)
        {
            throw new RuntimeException(exception);
        }
    }
}
