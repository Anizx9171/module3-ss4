import java.util.regex.Pattern;

public class BT2 {
    public static void main(String[] args) {
        String text = "anizx";
        String regex = "anizx";
        boolean validateText = Pattern.matches(regex, text);
        if (validateText){
            System.err.println("Chuỗi giong");
        }else{
            System.err.println("Chuỗi khong giong");
        }
    }
}

