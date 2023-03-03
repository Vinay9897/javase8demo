package lambdaexpression;

interface StringFormater {
    public abstract String format(String s1, String s2);
}

public class Formater implements StringFormater {
    public static void main(String[] args) {
        StringFormater stringFormater = ((String str1, String str2) -> {
            return str1 + " - " + str2;
        });
        StringFormater stringFormater2 = ((String str1, String str2) -> {
            return str1 + " " + str2;
        });
        System.out.println(stringFormater.format("lambda", "expression"));
        System.out.println(stringFormater2.format("Lambda", "Expression"));
        System.out.println(stringFormater.format("LAMBDA", "EXPRESSION"));
    }

    @Override
    public String format(String s1, String s2) {

        return "";
    }

}
