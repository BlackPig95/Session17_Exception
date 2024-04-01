package baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai4
{
    public static void stringToInt()
    {
        System.out.println("Nhập vào chuỗi muốn đổi thành số nguyên");
        String input = Bai1.scanner.nextLine();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++)
        {
            try
            {
                integerList.add(Integer.parseInt(String.valueOf(input.charAt(i))));
            } catch (NumberFormatException e)
            {
                System.out.println(input.charAt(i) + " không phải số nguyên nên được đổi về 0");
                integerList.add(0);
            }
        }
        System.out.println(integerList);
    }
}
