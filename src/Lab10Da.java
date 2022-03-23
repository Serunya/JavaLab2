import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab10Da {
    public static void main(String[] args) {
        String text = "Мои номера 220-30-40 и 8904-378-16-61 не считая служебных";
        Pattern pattern = Pattern.compile("(\\d{3}\\-\\d{2}\\-\\d{2})|(\\+7|8)([\\(]\\d{3}[\\)]|[\\- ]?\\d{3}[\\- ]?)[\\- ]?\\d{3}[\\- ]?\\d{2}[\\- ]?\\d{2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
