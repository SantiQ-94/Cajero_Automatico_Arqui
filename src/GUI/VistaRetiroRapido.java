package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author FamiliaQuiroga
 */
public class VistaRetiroRapido extends JFrame{
    
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JButton monto1;
    private JButton monto2;
    private JButton monto3;
    private JButton monto4;
    private JButton monto5;
    private JButton otrosMontos;
                            
    
    public VistaRetiroRapido() {
        setLayout(null);
        
        etiqueta1 = new JLabel("Seleccione el monto que desea retira");
        etiqueta2 = new JLabel("¿Desea retirar otro monto?");
        monto1 = new JButton("10");
        monto2 = new JButton("20");
        monto3 = new JButton("50");
        monto4 = new JButton("100");
        monto5 = new JButton("200");
        otrosMontos = new JButton("Otros Montos");
                
        add(etiqueta1);
        add(etiqueta2);
        add(monto1);
        add(monto2);
        add(monto3);
        add(monto4);
        add(monto5);
        add(otrosMontos);
        
        etiqueta1.setBounds(130, 15, 300, 20);
       
        monto1.setBounds(50, 75, 80, 35);
        monto2.setBounds(185, 75, 80, 35);
        monto3.setBounds(320, 75, 80, 35);
        
        monto4.setBounds(50, 130, 80, 35);
        monto5.setBounds(185, 130, 80, 35);
       
        etiqueta2.setBounds(80, 215, 270, 20);
        otrosMontos.setBounds(280, 205, 120, 35);
        
        
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Retiro Rápido");
       // setResizable(false);
    }
}
