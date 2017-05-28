/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author lotalorafox
 */
public class Border {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300,100));
        frame.setTitle("Border");
        frame.setLayout(new FlowLayout());
        frame.setLayout(new BorderLayout());
        
        JButton button = new JButton("Submit");
        JTextField field = new JTextField(5);
        button.addActionListener(new MessageListener(field));
        
        
        frame.add(field, BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("East"), BorderLayout.EAST);
        
        frame.add(button, BorderLayout.CENTER);
        
        
        
        frame.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2,
                dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
        
        
        
        
        
        
        
    }
}
