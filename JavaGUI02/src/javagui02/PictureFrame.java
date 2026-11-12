/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagui02;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author iektm1-04
 */
public class PictureFrame extends JFrame{
    JLabel jlbPicture;
    JComboBox picSelect;
    
    
    PictureFrame(){
    super();
    createGUI();
    }
    
    PictureFrame(String t){
    super(t);
    createGUI();
    }
    
    private void createGUI(){
        String path = System.getProperty("user.dir");
        setSize(250,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        DefaultComboBoxModel dlm = new DefaultComboBoxModel();
        dlm.addElement("Bird.gif");
        dlm.addElement("Cat.gif");
        dlm.addElement("Dog.gif");
        dlm.addElement("Pig.gif");
        dlm.addElement("Rabbit.gif");
        
        picSelect = new JComboBox(dlm);
        jlbPicture = new JLabel("");
        ImageIcon im = new ImageIcon(path+"/resources/Bird.gif");
        ImageIcon imscaled = new ImageIcon(im.getImage().getScaledInstance(250,250,Image.SCALE_SMOOTH));
        jlbPicture.setIcon(imscaled);
        
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.PAGE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        add(picSelect,c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.gridheight = 3;
        add(jlbPicture,c);
        
    }
}