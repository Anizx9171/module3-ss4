
import java.util.regex.Pattern;

public class TH3 {
    public static void main(String[] args) {
        String text = "";
        String regex = "";
        boolean validateText = Pattern.matches(regex, text);
        if (validateText){
            System.err.println("Chuỗi rỗng");
        }else{
            System.err.println("Chuỗi có kí tự");
        }
    }
}
