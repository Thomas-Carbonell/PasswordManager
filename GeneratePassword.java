import java.security.SecureRandom;
import java.util.List;

public class GeneratePassword {

    private final String password;
    private final int ArrayLength;
    private final List<Character> PermittedCharacters;

    public GeneratePassword(int length, List<Character> PermittedCharacters) {
        this.ArrayLength = length;
        this.PermittedCharacters = PermittedCharacters;
        this.password = generateRandomPassword();
    }

    public String generateRandomPassword() {
        SecureRandom secureRandom = new SecureRandom();
        char [] passChars = new char[this.ArrayLength];
        System.out.println(passChars.length);

        for(int i = 0;i<ArrayLength;i++){
            int randomInt = secureRandom.nextInt(this.PermittedCharacters.size());
            passChars[i] = this.PermittedCharacters.get(randomInt);
        }
        return new String(passChars);         
    }

    public String ReturnPassword(){
        return password;
    }

}
