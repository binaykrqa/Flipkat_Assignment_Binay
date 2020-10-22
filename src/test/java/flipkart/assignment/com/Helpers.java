package flipkart.assignment.com;

public class Helpers {

    public static String getNumbersFromString(String str)
    {
        str = str.replaceAll("[^0-9]", "");
        return str;
    }
}
