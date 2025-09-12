import problems.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("P1 Username user_123 -> " + Problem1_Username.solve("user_123"));
        System.out.println("P2 LicensePlate AB1234 -> " + Problem2_LicensePlate.solve("AB1234"));
        System.out.println("P3 HexColor #FFA500 -> " + Problem3_HexColor.solve("#FFA500"));
        System.out.println("P4 Emails -> " + Problem4_Emails.solve("abc@test.com hi def@x.org"));
        System.out.println("P5 Caps -> " + Problem5_CapitalizedWords.solve("The Eiffel Tower in Paris"));
        System.out.println("P6 Dates -> " + Problem6_Dates.solve("12/05/2023 15/08/2024"));
        System.out.println("P7 Links -> " + Problem7_Links.solve("http://example.com https://test.org"));
        System.out.println("P8 Spaces -> " + Problem8_SqueezeSpaces.solve("a   b    c"));
        System.out.println("P9 Censor -> " + Problem9_Censor.solve("this is stupid bad", Arrays.asList("stupid","bad")));
        System.out.println("P10 IPv4 192.168.1.1 -> " + Problem10_IPv4.solve("192.168.1.1"));
        System.out.println("P11 Visa -> " + Problem11_CreditCard.visa("4111111111111111"));
        System.out.println("P12 Langs -> " + Problem12_Languages.solve("Java Python Go JS JavaScript"));
        System.out.println("P13 Currency -> " + Problem13_Currency.solve("Price $45.99 discount 10.50"));
        System.out.println("P14 Repeats -> " + Problem14_RepeatingWords.solve("this is is a test test"));
        System.out.println("P15 SSN -> " + Problem15_SSN.solve("123-45-6789"));
    }
}
