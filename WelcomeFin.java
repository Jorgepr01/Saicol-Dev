import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class WelcomeFin extends JFrame{
    public static void main(String args[]){
        Welcome ventanabienvenida = new Welcome();
        ventanabienvenida.setBounds(0,0,350,500);
        ventanabienvenida.setVisible(true);
        // ventanabienvenida.setResizable(false);
        // ventanabienvenida.setLocationRelativeTo(null);
        // ventanabienvenida.setIconImage(new ImageIcon(getClass().getResource("imagenes/imagenprotada2.png")).getImage());

        
        }
}
