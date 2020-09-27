package kz.edu.astanait;

public class User
{
    public static String userField = "user field";

    public static String userMethod_1()
    {
        return "calling static method";
    }

    public static String userMethod_2(String text)
    {
        return "calling static method:"+text;
    }
}
