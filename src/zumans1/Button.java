/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zumans1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author agila
 */

public class Button implements ActionListener {
     static int k=20,i=0;
    LinkedList<JButton> BP=new LinkedList<>();
//    JButton[] BP;JLabel LP;
    Button(String N ,int w,int h,int X,int Y,Icon I,JPanel P){
        
         
         BP.push(new JButton());
        
            BP.getFirst().setIcon(I);
            BP.getFirst().setSize(w, h);
        BP.getFirst().setLocation(X, Y);
//        BP.setBorderPainted(false);
//        BP.setFocusPainted(false);
        BP.getFirst().setBorder(null);
        BP.getFirst().setBackground(new Color(0,0,0,0));
        P.add(BP.getFirst());
        BP.getFirst().addActionListener(this);
       
    }
    
    
    
//    public static void main(String[] args) {
//        new Button("@",45,46,"C:\\Users\\agila\\Documents\\JavaZumansCharacters/man_scientist_60px.png");
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ZUMANS_CHARACTER_PAGE().setVisible(true);
        
    }
}
