package principal;

import GUI.LoginPin;
import GUI.LoginNroDeCuenta;
import GUI.VistaPrincipal;

/**
 *
 * @author Quiroga
 */
public class Main {
    public static void main(String []args) {
        LoginNroDeCuenta login = new LoginNroDeCuenta();
        LoginPin panelPin = new LoginPin();
        VistaPrincipal vp = new VistaPrincipal();
        login.setVisible(true);
        panelPin.setVisible(true);
        vp.setVisible(true);
    }
}
