package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author FamiliaQuiroga
 */
public class LoginPin extends JFrame{
    
    private JLabel etiqueta;
    private JTextField campoTexto;
    private JButton boton;
    
    public LoginPin() {
        
        setLayout(null);
       
        etiqueta = new JLabel("PIN");
        campoTexto = new JTextField(200);
        boton = new JButton("Aceptar");
        
        
        
        etiqueta.setBounds(65, 30, 50, 20);
        campoTexto.setBounds(150, 30, 120, 20);
        boton.setBounds(115, 75, 100, 25);
        
        add(etiqueta);
        add(campoTexto);
        add(boton);
        setLocationRelativeTo(null);
        setSize(350, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Introduce tu Pin");
        
    }
}
