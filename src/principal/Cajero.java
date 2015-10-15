package principal;

import GUI.LoginNroDeCuenta;
import GUI.LoginPin;
import Registros.AdministradorRegistroClientes;

/**
 *
 * @author FamiliaQuiroga
 */
public class Cajero {
    private AdministradorRegistroClientes adminClientes;
    private LoginNroDeCuenta loginNroDeCuenta;
    private LoginPin loginPin;
    
    public Cajero() {
        adminClientes = new AdministradorRegistroClientes();
        adminClientes.registrarCliente("Derp", "Herp", 1234567);
        loginNroDeCuenta = new LoginNroDeCuenta(this);
        loginPin = new LoginPin(this);
        loginNroDeCuenta.setVisible(true);
    }
    
    public boolean validarNroCuenta(int nroCuenta) {
        return adminClientes.existeCliente(nroCuenta);
    }
    
    public void mostrarLoginPin() {
        loginNroDeCuenta.setVisible(false);
        loginPin.setVisible(true);
    }
}
