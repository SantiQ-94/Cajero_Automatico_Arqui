package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author FamiliaQuiroga
 */
public class LoginNroDeCuenta extends JFrame{
    
    private JLabel etiqueta;
    private JTextField campoTexto;
    private JButton boton;
    
     public LoginNroDeCuenta() {
         
         
         etiqueta = new JLabel("Nro de Cuenta");
         campoTexto = new JTextField(200);
         boton = new JButton("Aceptar");
       
         etiqueta.setBounds(50, 30, 90, 20);
         campoTexto.setBounds(150,30,150,20);
         boton.setBounds(115,75, 100, 25);
         
         add(boton);
         add(campoTexto);
         add(etiqueta);
         
        
         
         
         setLayout(null);
         setSize(350,150);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setTitle("Bienvenido");
     }
}
