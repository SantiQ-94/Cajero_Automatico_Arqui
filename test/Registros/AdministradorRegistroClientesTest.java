package Registros;

import Registros.AdministradorRegistroClientes;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
       admin.registrarCliente("Derp Herp", "Herrpington",1234567);
       assertEquals(true,admin.existeCliente(1234567));
    }
    
    @Test
    public void testValidarAcceso() {
        admin.registrarCliente("Derp Herp", "Herrpington",1234567);
        admin.cambianPin(1234567, 1515);
        assertEquals(true, admin.validarAcceso(1234567,1515));
    }
}
