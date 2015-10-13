package CajeroAutomatico;

import Registros.AdministradorRegistroClientes;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
/**
 *
 * @author FamiliaQuiroga
 */
public class AdministradorRegistroClientesTest {
    
    private AdministradorRegistroClientes admin;
    public AdministradorRegistroClientesTest() {
        admin = new AdministradorRegistroClientes();
    }

    @Test
    public void testExisteCliente() {
       //Cliente cliente = new Cliente(12345,1010,"Derp Herp", "Herrpington");
       admin.registrarCliente("Derp Herp", "Herrpington");
       assertFalse(admin.existeCliente(123457));
    }
    
    @Test
    public void testCambiarPin() {
        
    }
}
