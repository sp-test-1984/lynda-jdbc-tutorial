package jdbc;

/**
 * Hello world!
 *
 */
public class App 
{

    private static String value = "one";

    public static void main( String[] args )
    {
        switch (value){
            case "one":
                System.out.println("value is one");
                break;

                default:
                    System.out.println("value is not one");
                    break;
        }
    }
}
