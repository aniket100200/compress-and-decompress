/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import comp_decom.compressor;
import comp_decom.deCompressor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KHANGAR SIR
 */
public class AppFrame extends JFrame implements ActionListener
{
    JButton compressButton;
    JButton decompressButton;
    AppFrame()
    {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //operations for compression of the perticular file.. here we go..
        compressButton=new JButton("Select file to compress");
        compressButton.setBounds(20,100,200,30);        
        compressButton.addActionListener(this);
        
        //this is the decompressor...
        decompressButton=new JButton("Select file to Decompress");
        decompressButton.setBounds(250,100,200,30);
        decompressButton.addActionListener(this);
        
        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(100,500);
        this.getContentPane().setBackground(Color.blue);
        this.setVisible(true);
        
    }
    
 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==compressButton)
        {
            JFileChooser filechooser=new JFileChooser();
            int response=filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION)
            {
               File path=new File(filechooser.getSelectedFile().getAbsolutePath());
               System.out.print(path);
               try{
                   compressor.method(path);
               }
               catch(Exception ee)
               {
                   JOptionPane.showMessageDialog(null, ee.toString());                
               }
            }
        }
        
        if(e.getSource()==decompressButton)
        {
           JFileChooser filechooser=new JFileChooser();
            int response=filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION)
            {
               File path=new File(filechooser.getSelectedFile().getAbsolutePath());
               System.out.print(path);
               try{
                   deCompressor.method(path);
               }
               catch(Exception ee)
               {
                   JOptionPane.showMessageDialog(null, ee.toString());                
               }
            } 
        }
    }
}
