import javax.swing.*;
import java.awt.event.*;
//output on VScode opened a new small window with a button, when the button is clicked, it will show a message dialog that says "Button was clicked!"
public class Example2 {
    public static void main(String[] args) {
    
      
        JFrame frame = new JFrame("Example 2");
        JButton button = new JButton("Click Me");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button was clicked!");
            }
        });
        
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
