import org.w3c.dom.ls.LSOutput;

public class Tema2Ex4var2 {
    public static void main(String[] args) {
        String fullEmail =  createEmail("Carmen", "gmail.com");
        System.out.println(fullEmail);
    }
        public static String createEmail(String nume, String domeniu){
            String result = nume + '@' + domeniu;
            return result;

        }

}
