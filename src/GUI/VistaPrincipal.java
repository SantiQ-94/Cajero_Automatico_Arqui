package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author FamiliaQuiroga
 */
public class VistaPrincipal extends JFrame{
    
    private JButton botonRetiro;
    private JButton botonRetiroRapido;
    private JButton botonDeposito;
    private JButton botonCambioDePin;
    private JLabel etiqueta;
    
    
    public VistaPrincipal() {
        setLayout(null);
        
        
        botonRetiro = new JButton("Retiro");
        botonRetiroRapido = new JButton("Retiro Rapido");
        botonDeposito = new JButton("Deposito");
        botonCambioDePin = new JButton("Cambio de Pin");
        etiqueta = new JLabel("Seleccione la accion que desea realizar");
                        
        add(botonRetiro);
        add(botonRetiroRapido);
        add(botonDeposito);
        add(botonCambioDePin);
        add(etiqueta);
        
        
        botonRetiro.setBounds(50, 75, 150, 35);
        botonRetiroRapido.setBounds(280, 75, 150, 35);
        
        botonDeposito.setBounds(50, 150, 150, 35);
        botonCambioDePin.setBounds(280, 150, 150, 35);
        
        etiqueta.setBounds(130, 15, 300, 20);
        
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cajero Automatico");
        setResizable(false);
    }
}
