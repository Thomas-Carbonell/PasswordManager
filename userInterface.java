import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;  
import java.util.List;

public class userInterface extends Frame implements ActionListener{
    JTextField tf;
    JLabel l1; 
    JLabel l2; 
    JButton b;
    GeneratePassword passCreate;

    userInterface(int length, List<Character> PermittedCharacters){ 
        JFrame f = new JFrame("Label Example");
        this.passCreate = new GeneratePassword(length, PermittedCharacters);
        l1 = new JLabel("Click the Button to Generate a Password");
        b = new JButton("Click");
        l2 = new JLabel();

        b.setBounds(50, 100, 100, 50);
        l1.setBounds(50,50,300,30);
        l2.setBounds(50,150,100,30);

        b.addActionListener(this);

        f.add(l1);
        f.add(l2);
        f.add(b);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Ensure program closes properly
    }

    public void actionPerformed(ActionEvent e) {  
        try{
            System.out.println("Password");  
            l2.setText(passCreate.generateRandomPassword());
        }catch(Exception ex){System.out.println(ex);}  
    }  

}
