/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author lotalorafox
 */
public class Component1 {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300,100));
        frame.setTitle("Component");
        frame.setLayout(new FlowLayout());
        
        JButton button1 = new JButton();
        button1.setText("button 1");
        button1.setBackground(Color.BLUE);
        frame.add(button1);
        
        JButton button2 = new JButton();
        button2.setText("button 2");
        button2.setIcon(new ImageIcon("icon.png"));
        button2.setBackground(Color.RED);
        frame.add(button2);
        
        JTextField field = new JTextField();
        frame.add(field);
        
        frame.setVisible(true);
    }
}
