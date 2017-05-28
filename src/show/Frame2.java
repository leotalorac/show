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
public class Frame2 {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        //take icon
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
        frame.setIconImage(icon);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300,120));
        //centar la ventana
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2,
                dim.height/2-frame.getSize().height/2);
        frame.setTitle("Xamarin");
        frame.setVisible(true);
    }
}
