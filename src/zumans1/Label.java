/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zumans1;

import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author agila
 */
public class Label {
     JLabel LP;
    Label(String N ,int w,int h,int X,int Y,Icon I,JPanel P){
        LP =new JLabel(I);
        LP.setSize(w,h);
        LP.setLocation(X, Y);
        P.add(LP);
        
}
}