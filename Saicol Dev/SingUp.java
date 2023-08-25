import java.awt.*;
import javax.swing.*;


public class SingUp extends Menu{
    private JLabel label1, label2, label3, label4,label5,label6,label7,label8;
    private JTextField textfield1,textfield2,textfield3,textfield4,textfield5,textfield6,textfield7;
    private JButton boton1;
    
    public SingUp(){
            setLayout(null);
            setTitle("Bienvenido");
            getContentPane().setBackground(new Color(10,0,10));
            setIconImage(new ImageIcon(getClass().getResource("imagenes/imagenprotada2.png")).getImage());
            
            ImageIcon imagen = new ImageIcon("imagenes/imagenprotada3.png");
            label1 = new JLabel(imagen);
            label1.setBounds(25,15,630,150);
            add(label1);
            
            label2 = new JLabel("Ingrese su nombre");
            label2.setBounds(45,212,200,30);
            label2.setFont(new Font("Andale Mono", 1, 11));
            label2.setForeground(new Color(255,255,255));
            add(label2);

            textfield1 = new JTextField ();
            textfield1.setBounds(45,240,200,25);
            textfield1.setBackground(new Color(224,224,224));
            textfield1.setFont(new Font("Andale Mono", 1, 13));
            textfield1.setForeground(new Color(255,0,0));
            add(textfield1);

            label3 = new JLabel("Ingrese su nombre");
            label3.setBounds(45,275,200,30);
            label3.setFont(new Font("Andale Mono", 1, 11));
            label3.setForeground(new Color(255,255,255));
            add(label3);

            textfield2 = new JTextField ();
            textfield2.setBounds(45,303,200,25);
            textfield2.setBackground(new Color(224,224,224));
            textfield2.setFont(new Font("Andale Mono", 1, 13));
            textfield2.setForeground(new Color(255,0,0));
            add(textfield2);

            label4 = new JLabel("Ingrese su nombre");
            label4.setBounds(45,342,200,30);
            label4.setFont(new Font("Andale Mono", 1, 11));
            label4.setForeground(new Color(255,255,255));
            add(label4);

            textfield3 = new JTextField ();
            textfield3.setBounds(45,370,200,25);
            textfield3.setBackground(new Color(224,224,224));
            textfield3.setFont(new Font("Andale Mono", 1, 13));
            textfield3.setForeground(new Color(255,0,0));
            add(textfield3);

            label5 = new JLabel("Ingrese su nombre");
            label5.setBounds(45,410,200,30);
            label5.setFont(new Font("Andale Mono", 1, 11));
            label5.setForeground(new Color(255,255,255));
            add(label5);

            textfield4 = new JTextField ();
            textfield4.setBounds(45,438,200,25);
            textfield4.setBackground(new Color(224,224,224));
            textfield4.setFont(new Font("Andale Mono", 1, 13));
            textfield4.setForeground(new Color(255,0,0));
            add(textfield4);




            label6 = new JLabel("Ingrese su nombre");
            label6.setBounds(400,222,200,30);
            label6.setFont(new Font("Andale Mono", 1, 11));
            label6.setForeground(new Color(255,255,255));
            add(label6);

            textfield5 = new JTextField ();
            textfield5.setBounds(400,250,200,25);
            textfield5.setBackground(new Color(224,224,224));
            textfield5.setFont(new Font("Andale Mono", 1, 13));
            textfield5.setForeground(new Color(255,0,0));
            add(textfield5);

            label7 = new JLabel("Ingrese su nombre");
            label7.setBounds(400,285,200,30);
            label7.setFont(new Font("Andale Mono", 1, 11));
            label7.setForeground(new Color(255,255,255));
            add(label7);

            textfield6 = new JTextField ();
            textfield6.setBounds(400,313,200,25);
            textfield6.setBackground(new Color(224,224,224));
            textfield6.setFont(new Font("Andale Mono", 1, 13));
            textfield6.setForeground(new Color(255,0,0));
            add(textfield6);

            label8 = new JLabel("Ingrese su nombre");
            label8.setBounds(400,352,200,30);
            label8.setFont(new Font("Andale Mono", 1, 11));
            label8.setForeground(new Color(255,255,255));
            add(label8);

            textfield1 = new JTextField ();
            textfield1.setBounds(400,385,200,25);
            textfield1.setBackground(new Color(224,224,224));
            textfield1.setFont(new Font("Andale Mono", 1, 13));
            textfield1.setForeground(new Color(255,0,0));
            add(textfield1);

            // label3 = new JLabel("Ingrese su nombre");
            // label3.setBounds(400,410,200,30);
            // label3.setFont(new Font("Andale Mono", 1, 11));
            // label3.setForeground(new Color(255,255,255));
            // add(label3);

            // textfield7 = new JTextField ();
            // textfield7.setBounds(400,438,200,25);
            // textfield7.setBackground(new Color(224,224,224));
            // textfield7.setFont(new Font("Andale Mono", 1, 13));
            // textfield7.setForeground(new Color(255,0,0));
            // add(textfield7);

            boton1 = new JButton("Ingresar");
            boton1.setBounds(400,435,200,30);
            boton1.setBackground(new Color(255,255,255));
            boton1.setFont(new Font("Andale Mono", 1, 14));
            boton1.setForeground(new Color(255,0,0));
            boton1.addActionListener(this);
            add(boton1);

    }
    public static void main(String args[]){
        SingUp ventanabienvenida = new SingUp();
         ventanabienvenida.setBounds(0,0,700,600);
         ventanabienvenida.setVisible(true);
         ventanabienvenida.setResizable(false);
         ventanabienvenida.setLocationRelativeTo(null);
       }
}
