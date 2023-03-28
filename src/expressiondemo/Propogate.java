package expressiondemo;

public class Propogate {
    public static void main(String[] args) {

        String o = "-";
        switch ("FRED".toLowerCase().substring(1, 3)) {
            case "yellow":
                o += "y";
            case "red":
                o += "r";
            case "green":
                o += "g";
        }
        System.out.println(o);
        int val = 8;
        int ans = val * (++val);
        System.out.println(ans);
        ans = (++val) * val;
        System.out.println(ans);
    }
}
