package baitap;

public class Bai11
{
    public static void checkDateInput()
    {
        int year;
        try
        {
            year = DateCheckedException.checkYear();
            if (year <= 0)
                throw new DateCheckedException("Năm phải > 0");
        } catch (DateCheckedException e)
        {
            throw new RuntimeException("Năm phải lớn hơn 0");
        }
        System.out.println("Done");
        int month = 0;
        try
        {
            month = DateCheckedException.checkMonth();
            if (month < 1 || month > 12)
                throw new DateCheckedException("Số tháng phải trong khoảng 1-12");
        } catch (DateCheckedException exceptionMonth)
        {
            System.out.println("Catched Month Exception");
            throw new RuntimeException(exceptionMonth);
        }
        int date;
        date = DateCheckedException.checkDate(month);
        System.out.printf("Ngày đã nhập: %d/%d/%d", date, month, year);
    }
}

class DateCheckedException extends Exception
{
    public DateCheckedException(String message)
    {
        super(message);
    }

    public static int checkYear() throws DateCheckedException
    {
        System.out.println("Nhập năm");
        int year = Integer.parseInt(Bai1.scanner.nextLine());
//        if (year <= 0)
//            throw new DateCheckedException("Số năm phải lớn hơn 0");
        return year;
    }

    public static int checkMonth() throws DateCheckedException
    {
        System.out.println("Nhập tháng");
        return Integer.parseInt(Bai1.scanner.nextLine());
    }

    public static int checkDate(int month)
    {
        System.out.println("Nhập ngày");
        int date = Integer.parseInt(Bai1.scanner.nextLine());
        switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                try
                {
                    if (date < 1 || date > 31)
                        throw new DateCheckedException("Số ngày không hợp lệ (1-31)");
                } catch (DateCheckedException e)
                {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                try
                {
                    if (date < 1 || date > 29)
                        throw new DateCheckedException("Số ngày không hợp lệ (1-29)");
                } catch (DateCheckedException e)
                {
                    throw new RuntimeException(e);
                }
                break;
            case 4, 6, 9, 11:
                try
                {
                    if (date < 1 || date > 30)
                        throw new DateCheckedException("Số ngày không hợp lệ (1-30)");
                } catch (DateCheckedException e)
                {
                    throw new RuntimeException(e);
                }
                break;
            default:
                throw new RuntimeException("Tháng không hợp lệ");
        }
        return date;
    }
}
