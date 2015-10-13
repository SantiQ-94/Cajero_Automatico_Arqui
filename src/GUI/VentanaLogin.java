package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author FamiliaQuiroga
 */
public class VentanaLogin extends JFrame{
    
    private JLabel etiqueta;
    private JTextField campoTexto;
    private JButton boton;
    
     public VentanaLogin() {
         
         
         etiqueta = new JLabel("Nro de Cuenta");
         campoTexto = new JTextField(200);
         boton = new JButton("Acceptar");
         
         
         
         
         
         boton.setBounds(220,150, 100, 35);
         campoTexto.setBounds(250,50,200,25);
         etiqueta.setBounds(150, 50, 90, 25);
         
         add(boton);
         add(campoTexto);
         add(etiqueta);
         
        
         
         
         setLayout(null);
         setSize(550,300);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setTitle("Bienvenido");
     }
}
