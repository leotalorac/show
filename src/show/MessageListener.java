/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author lotalorafox
 */
public class MessageListener implements ActionListener{
    JTextField field ;
    public MessageListener(JTextField f){
        field = f;
    }
    
    
    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null,"you have clicked " + field.getText());
    }
}
