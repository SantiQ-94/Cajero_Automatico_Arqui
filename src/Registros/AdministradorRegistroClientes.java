package Registros;


/**
 *
 * @author FamiliaQuiroga
 */
public class AdministradorRegistroClientes {
    private RegistroClientes registroClientes;
    
    public AdministradorRegistroClientes() {
        registroClientes = new RegistroClientes();
    }

    public void registrarCliente(String nombres, String apellidos) {
        registroClientes.registrarCliente(nombres, apellidos);
    }

    public boolean existeCliente(int nroDeCuenta) {
        boolean respuesta;
        if(registroClientes.contieneCliente(nroDeCuenta))
            respuesta = true;
        else { 
            respuesta = false;
        }
        return respuesta;
    }
    
    public void cambianPin(int nroDeCuenta, int pin) {
        registroClientes.cambiarPin(nroDeCuenta, pin);
    }

}
