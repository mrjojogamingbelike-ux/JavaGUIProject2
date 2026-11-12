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
public class MainFrame extends JFrame{
    JLabel jl1,jl2,jl3,jl4;
    JTextField tf1,tf2;
    JList listSports;
    JRadioButton jrb1,jrb2;
    JCheckBox cb1,cb2,cb3,cb4;
    JButton b1,b2,b3;
    
    MainFrame(){
        super();
        createGUI();
    }
    
    MainFrame(String t){
        super(t);
        createGUI();
    }
    
    private void createGUI(){
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    JPanel upLeftP = new JPanel();
    upLeftP.setLayout(new GridLayout(2,2));
    
    //create
    jl1 = new JLabel("Text 1");
    jl2 = new JLabel("Text 2");
    tf1 = new JTextField(12);
    tf2 = new JTextField(12);
    
    
    upLeftP.add(jl1);
    upLeftP.add(tf1);
    upLeftP.add(jl2);
    upLeftP.add(tf2);
    
    JPanel glossaP = new JPanel();
    glossaP.setLayout(new GridLayout(4,2));
    
    jl4 = new JLabel("Checkbox");
    cb1 = new JCheckBox("Java");
    cb2 = new JCheckBox("Python");
    cb3 = new JCheckBox("PHP");
    cb4 = new JCheckBox("C++");
    
    glossaP.add(jl4);
    glossaP.add(cb1);
    glossaP.add(new JLabel(" "));
    glossaP.add(cb2);
    glossaP.add(new JLabel(" "));
    glossaP.add(cb3);
    glossaP.add(new JLabel(" "));
    glossaP.add(cb4);
    
    //Create a Jpanel and add 1x-3y.
    JPanel downButtonP = new JPanel();
    downButtonP.setLayout(new GridLayout(1,3));
    b1 = new JButton("File");
    b2 = new JButton("Language");
    b3 = new JButton("Close");
    downButtonP.add(b1);
    downButtonP.add(b2);
    downButtonP.add(b3);
    
    DefaultListModel dlm = new DefaultListModel();
    dlm.addElement("Swimming");
    dlm.addElement("Running");
    dlm.addElement("Jumping");
    dlm.addElement("Exploding");
    listSports = new JList(dlm);
    listSports.setLayoutOrientation(JList.VERTICAL);
    listSports.setVisibleRowCount(4);
    ScrollPane sp = new ScrollPane();
    sp.add(listSports);
    
    
    //Create a ButtonGroup and insert all the two RadioButtons.
    
    JPanel fyloP = new JPanel();
    fyloP.setLayout(new GridLayout(2,2));
    
    jl3 = new JLabel("Gender");
    jrb1 = new JRadioButton("Male");
    jrb2 = new JRadioButton("Female");
    
    fyloP.add(jl3);
    fyloP.add(jrb1);
    fyloP.add(new JLabel(" "));
    fyloP.add(jrb2);
    
    
    ButtonGroup bg = new ButtonGroup();
    bg.add(jrb1);
    bg.add(jrb2);
    jrb2.setSelected(true);
    
    //wall of the text
    c.insets = new Insets(5,5,5,5);
    c.anchor = GridBagConstraints.LINE_START;
    c.fill = GridBagConstraints.BOTH;
    
    //add
    c.gridx=0;
    c.gridy=0;
    c.gridheight=2;
    add(upLeftP,c);
    
    c.gridx=1;
    c.gridy=0;
    c.gridheight = 2;
    c.fill = GridBagConstraints.BOTH;
    add(listSports, c);
    
    c.gridx=0;
    c.gridy=2;
    c.gridheight=2;
    c.fill = GridBagConstraints.BOTH;
    add(fyloP,c);
    
    c.gridx=1;
    c.gridy=2;
    c.gridheight=2;
    c.fill = GridBagConstraints.BOTH;
    add(glossaP,c);
    
    c.gridx=0;
    c.gridy=4;
    c.gridwidth = 2;
    c.gridheight = 1;
    add(downButtonP,c);
    
    pack();
    }
    
    private void createGUIOld(){
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    //create
    jl1 = new JLabel("Text 1");
    jl2 = new JLabel("Text 2");
    jl3 = new JLabel("Gender");
    jl4 = new JLabel("Checkbox");
    
    tf1 = new JTextField(12);
    tf2 = new JTextField(12);
    
    cb1 = new JCheckBox("Java");
    cb2 = new JCheckBox("Python");
    cb3 = new JCheckBox("PHP");
    
    
    //Create a Jpanel and add 1x-3y.
    JPanel downButtonP = new JPanel();
    downButtonP.setLayout(new GridLayout(1,3));
    b1 = new JButton("File");
    b2 = new JButton("Language");
    b3 = new JButton("Close");
    downButtonP.add(b1);
    downButtonP.add(b2);
    downButtonP.add(b3);
    
    
    DefaultListModel dlm = new DefaultListModel();
    dlm.addElement("Swimming");
    dlm.addElement("Running");
    dlm.addElement("Jumping");
    dlm.addElement("Exploding");
    listSports = new JList(dlm);
    
    //Create a ButtonGroup and insert all the two RadioButtons.
    jrb1 = new JRadioButton("Male");
    jrb2 = new JRadioButton("Female");
    ButtonGroup bg = new ButtonGroup();
    bg.add(jrb1);
    bg.add(jrb2);
    jrb2.setSelected(true);
    
    //wall of the text
    c.insets = new Insets(5,5,5,5);
    c.anchor = GridBagConstraints.LINE_START;
    
    //add
    c.gridx=0;
    c.gridy=0;
    add(jl1,c);
    
    c.gridx=0;
    c.gridy=1;
    add(jl2,c);
    
    c.gridx=1;
    c.gridy=0;
    add(tf1,c);
    
    c.gridx=1;
    c.gridy=1;
    add(tf2,c);
    
    c.gridx=0;
    c.gridy=2;
    c.gridwidth = 2;
    c.gridheight = 3;
    add(listSports, c);
    
    c.gridx=0;
    c.gridy=5;
    c.gridwidth = 1;
    c.gridheight = 1;
    c.fill = GridBagConstraints.NONE;
    add(jl3, c);
    
    c.gridx=1;
    c.gridy=5;
    add(jrb1, c);
    
    c.gridx=1;
    c.gridy=6;
    add(jrb2, c);
    
    c.gridx=0;
    c.gridy=7;
    add(jl4,c);
    
    c.gridx=1;
    c.gridy=7;
    add(cb1,c);
    
    c.gridy=8;
    add(cb2,c);
    
    c.gridy=9;
    add(cb3,c);
    
    c.gridx=0;
    c.gridy=10;
    c.gridwidth = 2;
    add(downButtonP,c);
    
    pack();
    }
    
    
    
}