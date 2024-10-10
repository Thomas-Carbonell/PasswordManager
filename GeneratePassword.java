import java.security.SecureRandom;
import java.util.List;

public class GeneratePassword {

    private String password;
    private int PassLength;
    private final List<Character> PermittedCharacters;

    public GeneratePassword(int length, List<Character> PermittedCharacters) {
        this.PassLength = length;
        this.PermittedCharacters = PermittedCharacters;
    }

    public String generateRandomPassword() {
        SecureRandom secureRandom = new SecureRandom();
        char [] passChars = new char[this.PassLength];
        System.out.println(passChars.length);

        for(int i = 0;i<PassLength;i++){
            int randomInt = secureRandom.nextInt(this.PermittedCharacters.size());
            passChars[i] = this.PermittedCharacters.get(randomInt);
        }
        return new String(passChars);         
    }

    public void setPassLength(int length){
        this.PassLength = length;
    }
    public String ReturnPassword(){
        if(password != null && !password.isEmpty()){
            return password;
        }
        else{
            System.out.println("Warning! Password not initialised");
            this.generateRandomPassword();
            return password;
        }
    }

}
