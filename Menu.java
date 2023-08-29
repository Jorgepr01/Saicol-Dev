import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Menu extends JFrame implements ActionListener{
    private JMenuBar mainMenu;
    private JMenu option,calculate,mas,tamaño,style;
    private JMenuItem nuevo,exit,prgramada,acercade;
    private JMenuItem big,small,black,claro,red;
    
    public Menu(){
        mainMenu =new JMenuBar();
        mainMenu.setBackground(new Color(10,0,10));
        setJMenuBar(mainMenu);

        option=new JMenu("Opciones");
        mainMenu.add(option);

        calculate=new JMenu("calculate");
        mainMenu.add(calculate);
        mas=new JMenu("mas");
        mainMenu.add(mas);
        tamaño=new JMenu("tama\u00F1o");

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

        acercade=new JMenuItem("acerca de");
        // acercade.setFont(new Font("Andale Mono", 1, 14));
        acercade.setForeground(new Color(255, 0, 0));
        mas.add(acercade);
        acercade.addActionListener(this);
        
        big=new JMenuItem("big");
        big.addActionListener(this);
        tamaño.add(big);
        small=new JMenuItem("small");
        small.addActionListener(this);
        tamaño.add(small);
        black=new JMenuItem("black");
        black.addActionListener(this);
        style.add(black);

        red=new JMenuItem("red");
        red.addActionListener(this);
        style.add(red);

        claro=new JMenuItem("claro");
        claro.addActionListener(this);
        claro.setText("Nuevo");
        style.add(claro);
        

        option.setForeground(new Color(250,250,250));
        calculate.setForeground(new Color(250,250,250));
        mas.setForeground(new Color(250,250,250));

        tamaño.setBackground(new Color(10,0,10));
        option.setBackground(new Color(10,0,10));
        calculate.setBackground(new Color(10,0,10));
        mas.setBackground(new Color(10,0,10));

        // tamaño.addSeparator();
        
    }



    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == red){
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (arg0.getSource() == black){
            getContentPane().setBackground(new Color(0,0,0));
        }
	    if (arg0.getSource() == claro){
            getContentPane().setBackground(new Color(155,155,155));
        }
        if (arg0.getSource() == nuevo){	

	    // txtNombreTrabajador.setText("");
	    // txtAPaternoTrabajador.setText("");
	    // txtAMaternoTrabajador.setText("");
        //     comboDepartamento.setSelectedIndex(0);
	    // comboAntiguedad.setSelectedIndex(0);
	    // textarea1.setText("\n   Aqu� aparece el resultado del c�lculo de las vacaciones.");	 
   
        }
	    if (arg0.getSource() == exit){

            Welcome ventanabienvenida = new Welcome();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            // ventanabienvenida.setResizable(false);
            // ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);

	}
        if (arg0.getSource() == acercade){

            JOptionPane.showMessageDialog(null,"Desarrollado por La Geekipedia de Ernesto\n"+
                                               "       www.youtube.com/ErnestoPerezM");
        }
    }
    // public static void main(String args[]) {
    //     Menu ventanaPrincipal = new Menu();
    //     ventanaPrincipal.setBounds(0,0,640,535);
    //     ventanaPrincipal.setVisible(true);
    //     ventanaPrincipal.setResizable(false);
    //     ventanaPrincipal.setLocationRelativeTo(null);
    // }
}
