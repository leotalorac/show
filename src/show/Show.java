/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show;
import javax.swing.*;

/**
 *
 * @author lotalorafox
 */
public class Show {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Whats is your name?");
        
        int choice = JOptionPane.showConfirmDialog(null,"DO you like care, " + name + "?");
        
        if(choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Of curse");
        }else{
            JOptionPane.showMessageDialog(null, "disagree");
        }
    }
    
}
