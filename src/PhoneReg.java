public class PhoneReg {

    public static void main(String[] args) {
        String Number = "+7904-37816";
        System.out.println(Number.matches("^(\\+7|8)([\\(]\\d{3}[\\)]|[\\- ]?\\d{3}[\\- ]?)[\\- ]?\\d{3}[\\- ]?\\d{2}[\\- ]?\\d{2}$"));
    }
}