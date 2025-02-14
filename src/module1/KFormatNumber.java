package module1;

import java.text.NumberFormat;
import java.util.Locale;

public class KFormatNumber {
    public static void execute() {
        Locale locale = Locale.forLanguageTag("en-US");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String result = numberFormat.format(10.9990); // MX$11.00
        System.out.println(result);

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println(percentFormat.format(0.15)); // 15%
    }
}
