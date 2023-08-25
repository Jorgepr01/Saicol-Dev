import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Menu extends JFrame implements ActionListener{
    private JMenuBar mainMenu;
    private JMenu option,calculate,mas,tamaño,style;
    private JMenuItem nuevo,exit,prgramada,acercade;
    private JMenuItem big,small,black,claro;

    public Menu(){
        mainMenu =new JMenuBar();
        setJMenuBar(mainMenu);
        option=new JMenu("Opciones");
        mainMenu.add(option);
        calculate=new JMenu("calculate");
        mainMenu.add(calculate);
        mas=new JMenu("mas");
        mainMenu.add(mas);
        tamaño=new JMenu("tama\u00F1o");
        tamaño.addActionListener(this);
        option.add(tamaño);
        style=new JMenu("style");
        style.addActionListener(this);
        option.add(style);
        nuevo=new JMenuItem("nuevo");
        nuevo.addActionListener(this);
        option.add(nuevo);
        exit=new JMenuItem("exit");
        exit.addActionListener(this);
        option.add(exit);
        prgramada=new JMenuItem("prgramada");
        prgramada.addActionListener(this);
        calculate.add(prgramada);
        acercade=new JMenuItem("acercade");
        acercade.addActionListener(this);
        mas.add(acercade);
        big=new JMenuItem("big");
        big.addActionListener(this);
        tamaño.add(big);
        small=new JMenuItem("small");
        small.addActionListener(this);
        tamaño.add(small);
        black=new JMenuItem("black");
        black.addActionListener(this);
        style.add(black);
        claro=new JMenuItem("claro");
        claro.addActionListener(this);
        style.add(claro);
    }



    public void actionPerformed(ActionEvent e) {
        
    }
    
}
