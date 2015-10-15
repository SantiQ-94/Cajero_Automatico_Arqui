/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FamiliaQuiroga
 */
public class RegistroClientesTest {
    
    private RegistroClientes clientes;
    
    public RegistroClientesTest() {
        
        clientes = new RegistroClientes();
    }


    @Test
    public void testContieneCliente() {
        clientes.registrarCliente("mop", "dool", 1237894);
        clientes.registrarCliente("Derp", "Herp", 1234567);
        
        assertEquals(true, clientes.contieneCliente(1234567));
    }


    @Test
    public void testCambiarPin() {
        clientes.registrarCliente("Derp", "Herp", 1234567);
        clientes.cambiarPin(1234567, 1515);
        assertEquals(true,clientes.validarAcceso(1234567,1515));
    }
    
}
