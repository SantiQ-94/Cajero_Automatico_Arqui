/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        botonRetiro.setBounds(10, 10, 80, 25);
        
        add(botonRetiroRapido);
        botonRetiroRapido.setBounds(150, 10, 80, 25);
        
        add(botonDeposito);
        botonDeposito.setBounds(10, 50, 80, 25);
        
        add(botonCambioDePin);
        botonCambioDePin.setBounds(150, 50, 80, 25);
        
        add(etiqueta);
        etiqueta.setBounds(5, 5, 300, 20);
        
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cajero Automatico");
    }
}
