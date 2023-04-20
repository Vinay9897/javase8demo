package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    public static void main(String[] args) {
        RegexDemo regexDemo = new RegexDemo();
        System.out.println(regexDemo.validateMobileNo("111-222-333"));
        System.out.println(regexDemo.validateMobileNo("111-222-3333"));
    }

    private boolean validateMobileNo(String mobileNumber) {
        Pattern regex = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher mobileMatcher = regex.matcher(mobileNumber);
        return mobileMatcher.matches();
    }
}
