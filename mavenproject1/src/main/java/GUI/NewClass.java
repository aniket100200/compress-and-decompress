/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author KHANGAR SIR
 */
public class NewClass {
    public static void main(String[]args)
    {
         AppFrame frame=new AppFrame();
       
         frame.setSize(1000,700);
         frame.getContentPane().setBackground(Color.LIGHT_GRAY);
         
           /*let's leble the frame first*/
         JLabel lable=new JLabel("Compressor and Decompressor");
         
         frame.getContentPane().add(lable);
    }
}
