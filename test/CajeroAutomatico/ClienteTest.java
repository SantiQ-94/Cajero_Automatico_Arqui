package CajeroAutomatico;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
/**
 *
 * @author FamiliaQuiroga
 */
public class ClienteTest {
    
    private int numeroDeCuenta,pin;
    private String nombre,apellido;
    private Cliente cliente;
    
    public ClienteTest() {
        numeroDeCuenta = 1234567;
        pin = 1010;
        nombre = "Derp Herp";
        apellido = "Merp Terp";
        
        cliente = new Cliente(numeroDeCuenta, pin, nombre, apellido);
    }

    @Test
    public void testRealizarDepositoCuentaCorriente() {
        int saldoEsperado = 1000;
        int montoDeposito = 1000;
        String cuentaObjetivo = "cuentaCorriente1";
        cliente.depositar(montoDeposito,cuentaObjetivo);
        assertEquals(saldoEsperado, cliente.mostrarSaldo(cuentaObjetivo));
    }
    
    @Test
    public void testRealizarRetiroCuentaCorriente() {
        int montoRetiro = 1000;
        String cuentaObjetivo = "cuentaCorriente1";
        cliente.depositar(montoRetiro, cuentaObjetivo);
        cliente.retirar(montoRetiro, cuentaObjetivo);
        assertEquals(0,cliente.mostrarSaldo(cuentaObjetivo));
    }
    
    @Test
    public void testMostrarSaldoCuentaCorriente(){
       cliente.agregarCuentaCorriente();
       cliente.depositar(1000, "cuentaCorriente2");
       assertEquals(1000, cliente.mostrarSaldo("cuentaCorriente2"));
    }
    
    @Test
    public void testAgregarCuentaAhorros() {
       cliente.agregarCuentaDeAhorros();
       cliente.depositar(1000, "cuentaDeAhorro2");
       assertEquals(1000, cliente.mostrarSaldo("cuentaDeAhorro2"));
    }
    
    @Test
    public void testMostrarSaldoTotal() {
       cliente.agregarCuentaCorriente();
       cliente.depositar(1000, "cuentaCorriente2");
       cliente.agregarCuentaDeAhorros();
       cliente.depositar(1000, "cuentaDeAhorro2");
       cliente.depositar(1000, "cuentaCorriente1");
       assertEquals(3000, cliente.mostrarSaldoTotal());
    }
}
