import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;  
import java.util.List;

public class userInterface extends Frame implements ActionListener{
    private JLabel l1; 
    private JLabel l2;
    private JTextField textBar; 
    private JButton b;
    private GeneratePassword passwordMaker;
    private int passLength;
    private JSlider sl;
    private JButton copyPaste;


    userInterface(GeneratePassword pass){
        // Initialise the frame with a title
        JFrame f = new JFrame("PassGen");
        // Initialise GeneratePassword
        this.passwordMaker = pass;
        this.passLength = 10;
        // Initialise the global variables with the labels and buttons
        l1 = new JLabel("Click the Button to Generate a Password");
        b = new JButton("Submit");
        copyPaste = new JButton("Copy");
        JLabel l3 = new JLabel("Use the slider to input password length");
        textBar = new JTextField();
        sl = new JSlider(JSlider.HORIZONTAL,4,20,passLength);



        // Positioning for the Labels and buttons
        b.setBounds(50, 300, 100, 50);
        sl.setBounds(50,200,200,50);
        sl.setMajorTickSpacing(2);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);

        sl.addChangeListener(e -> {
            passLength = sl.getValue();  // Get the current value of the slider
            passwordMaker.setPassLength(passLength);
        });

        l1.setBounds(50,50,300,30);
        textBar.setBounds(50,350,200,30);
        copyPaste.setBounds(250, 350, 200, 30);
        l3.setBounds(50, 100, 300, 30);

        // Add action listener to the button
        b.addActionListener(this);
        copyPaste.addActionListener(this);

        // Add each of the items to the JFrame
        f.add(l1);
        f.add(textBar);
        f.add(b);
        f.add(sl);
        f.add(l3);
        f.add(copyPaste);

        // Setting the size, layout an visibility of the frame
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        // Setting the expected action when the screen is shut
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {  
        try{
            if(e.getSource() == b){
                System.out.println("Password");  
                textBar.setText(passwordMaker.generateRandomPassword());
            }
            else if(e.getSource()== copyPaste){
                copyToClipboard.copy(textBar.getText());
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);}  
    }  

}
