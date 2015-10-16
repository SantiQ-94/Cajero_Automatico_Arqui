package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import principal.Cajero;

/**
 *
 * @author FamiliaQuiroga
 */
public class VistaRetiro extends JFrame {
    
    private JLabel etiqueta1;
    private JTextField campoMonto;
    private JButton botonConfirmar;
    private Cajero cajero;
    
    public VistaRetiro(Cajero cajero){
        this.cajero = cajero;
        setLayout(null);
        
        etiqueta1 = new JLabel("Introduzca el monto que desea retirar");
        campoMonto = new JTextField(250);
        botonConfirmar = new JButton("Aceptar");
        
        add(etiqueta1);
        add(campoMonto);
        add(botonConfirmar);
        
        etiqueta1.setBounds(50, 50, 300, 25);
        campoMonto.setBounds(50,90,175,25);
        botonConfirmar.setBounds(235,90,80,25);
        
        
        setSize(350,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Retiro");
        
        
    }
}
