import javax.swing.*;
import java.awt.event.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.*;

public class Welcome extends Menu{

  private JTextField textfield1;
  private JLabel label1, label2, label3, label4;
  private JButton boton1,boton2;
  private URI uri;

  public Welcome(){
    setLayout(null);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(10,0,10));
    setIconImage(new ImageIcon(getClass().getResource("imagenes/imagenprotada2.png")).getImage());
    
    ImageIcon imagen = new ImageIcon("imagenes/imagenprotada3.png");
    label1 = new JLabel(imagen);
    label1.setBounds(25,15,300,150);
    add(label1);

    label2 = new JLabel("Sistema de Control Vacacional");
    label2.setBounds(35,135,300,30);
    label2.setFont(new Font("Andale Mono", 3, 18));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese su nombre");
    label3.setBounds(45,212,200,30);
    label3.setFont(new Font("Andale Mono", 1, 12));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel("°2022 Saicol Dev - Saicol Tech");
    label4.setBounds(85,375,300,30);
    label4.setFont(new Font("Andale Mono", 1, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);

    textfield1 = new JTextField ();
    textfield1.setBounds(45,240,255,25);
    textfield1.setBackground(new Color(224,224,224));
    textfield1.setFont(new Font("Andale Mono", 1, 14));
    textfield1.setForeground(new Color(255,0,0));
    add(textfield1);

    boton1 = new JButton("Ingresar");
    boton1.setBounds(45,280,120,30);
    boton1.setBackground(new Color(10,0,10));
    boton1.setFont(new Font("Andale Mono", 1, 14));
    boton1.setForeground(new Color(255,0,0));
    boton1.addActionListener(this);
    add(boton1);


    boton2 = new JButton("Registrarse");
    boton2.setBounds(180,280,120,30);
    boton2.setBackground(new Color(10,0,10));
    boton2.setFont(new Font("Andale Mono", 1, 14));
    boton2.setForeground(new Color(255,0,0));
    boton2.addActionListener(this);
    add(boton2);

  }


   public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){
       
     }
     if(e.getSource() == boton2){
        SingUp SingUp1 = new SingUp();
        SingUp1.setBounds(0,0,700,600);
        SingUp1.setVisible(true);
        SingUp1.setResizable(false);
        SingUp1.setLocationRelativeTo(null);
     }
   }

    public void setLink( String link ){   

        try {
            uri = new URI(link);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }   


   public static void main(String args[]){
    Welcome ventanabienvenida = new Welcome();
     ventanabienvenida.setBounds(0,0,350,500);
     ventanabienvenida.setVisible(true);
     ventanabienvenida.setResizable(false);
     ventanabienvenida.setLocationRelativeTo(null);
   }


public JTextField getTextfield1() {
    return textfield1;
}


public void setTextfield1(JTextField textfield1) {
    this.textfield1 = textfield1;
}


public JLabel getLabel1() {
    return label1;
}


public void setLabel1(JLabel label1) {
    this.label1 = label1;
}


public JLabel getLabel2() {
    return label2;
}


public void setLabel2(JLabel label2) {
    this.label2 = label2;
}


public JLabel getLabel3() {
    return label3;
}


public void setLabel3(JLabel label3) {
    this.label3 = label3;
}


public JLabel getLabel4() {
    return label4;
}


public void setLabel4(JLabel label4) {
    this.label4 = label4;
}


public JButton getBoton1() {
    return boton1;
}


public void setBoton1(JButton boton1) {
    this.boton1 = boton1;
}
}