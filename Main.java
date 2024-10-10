import java.util.List;
/**
 * TODO//
 * Comment all current code with Javadoc comments
 * Consider the following:
 * Password Storage
 * Accounts linked to Passwords
 * Encryption for stored passwords
 * Finally - GUI
 */
public class Main {
    public static void main(String [] args) {

        List<Character> charArray = null;
        try {
            readTxt file = new readTxt("AllowedCharacters.txt");
            charArray = file.readFile();
            GeneratePassword pass = new GeneratePassword(10, charArray);
            userInterface ui = new userInterface(pass);

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}