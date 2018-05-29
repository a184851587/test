package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateString = formatter.format(new Date());
        String code = new StringBuffer("123").append(dateString)
                .append(System.currentTimeMillis() / 1000)
                .append(RandomStringUtils.randomNumeric(4))
                .toString();
        System.out.println(code);


        String string = "acddff:sssssfff";

        System.out.println(string.contains("acddff"));
        System.out.println(string.contains("fadfad"));

    }
}
