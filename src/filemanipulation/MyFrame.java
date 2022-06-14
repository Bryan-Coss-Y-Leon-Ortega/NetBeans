/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanipulation;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author bryan
 */
public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);
        
        
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == button){
            
            JFileChooser fileChooser = new JFileChooser();
            
            fileChooser.setCurrentDirectory(new File("."));
            
            int response = fileChooser.showSaveDialog(null); // select file to open
            
            if(response == JFileChooser.APPROVE_OPTION){
                JFileChooser fileName = fileChooser;
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                String file2;
                file2 = fileChooser.getSelectedFile().getName();
                //File file = new File(fileChooser.getSelectedFile());
                //System.out.println(file);
                //System.out.println(fileName);
                System.out.println(file2);
            }
        }

    }

}
