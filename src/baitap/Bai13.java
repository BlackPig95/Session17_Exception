package baitap;

import java.util.stream.Stream;

public class Bai13
{
    public static void reverseString()
    {
        System.out.println("Nhập vào một chuỗi");
        String input = Bai1.scanner.nextLine();
        if (input == null || input.isBlank())
        {
            throw new emptyStringException("Không được rỗng");
        }
        String reversed = String.valueOf(new StringBuilder(input).reverse());
        System.out.println(reversed);
    }
}

class emptyStringException extends RuntimeException
{
    public emptyStringException(String message)
    {
        super(message);
    }
}
