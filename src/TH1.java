import java.util.*;
import java.util.regex.Pattern;

public class TH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        do {
            System.out.println("Nhap email cua ban");
            String email = scanner.nextLine();
            boolean validateEmail = Pattern.matches(regex, email);
            if (validateEmail){
                System.out.println("email của bạn là " + email);
                break;
            }else{
                System.out.println("email không hợp lệ");
            }
        }while (true);
    }
}

