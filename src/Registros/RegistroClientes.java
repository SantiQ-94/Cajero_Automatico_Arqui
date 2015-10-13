package Registros;

import CajeroAutomatico.Cliente;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author FamiliaQuiroga
 */
public class RegistroClientes {
    private Map <Integer, Cliente> clientes;
    
    public RegistroClientes() {
        clientes = new HashMap<>();
    }

    public void registrarCliente(String nombres, String apellidos) {
        int nroCuenta = generarNumeroDeCuenta();
        Cliente cliente = new Cliente(nroCuenta,1010,nombres,apellidos);
        clientes.put(nroCuenta, cliente);
        
    }

    private int generarNumeroDeCuenta() {
        int num = (int) Math.floor(Math.random()*(1000000-9999999)+9999999);
        if(clientes.containsKey(num))
           return generarNumeroDeCuenta();
        else
            return num;
    }

    public boolean contieneCliente(int nroDeCuenta) {
        return clientes.containsKey(nroDeCuenta);
    }
    
    public void cambiarPin(int nroDeCuenta, int pin) {
        Cliente clienteAux = clientes.get(nroDeCuenta);
        clienteAux.cambiarPin(pin);
        clientes.put(nroDeCuenta, clienteAux);
    }
}
