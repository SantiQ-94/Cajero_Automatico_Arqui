/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroAutomatico;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;



/**
 *
 * @author FamiliaQuiroga
 */
public class CuentaTest {
    
    private Cuenta cuenta;
    private int saldo,tasaDeInteres;
    private String tipoDeCuenta;
    
    public CuentaTest() {
        cuenta = new CuentaCorriente();
    }


    @Test
    public void tetsRealizarDeposito() {
        int montoDeposito = 2500, saldoEsperado = 2500;
        cuenta.depositar(montoDeposito);
        assertEquals(saldoEsperado, cuenta.mostrarSaldo());
        
    }
    
    @Test
    public void testRealizarRetiroInvalido() {
       int montoRetiro = 1700;
        cuenta.depositar(1700);
        int saldoCuenta = cuenta.mostrarSaldo();
        cuenta.retirar(montoRetiro);
        int saldoEsperado = saldoCuenta - montoRetiro;
        assertFalse(saldoEsperado == cuenta.mostrarSaldo());
        
    }
    
    @Test
    public void testRealizarRetiro(){
        int montoRetiro = 150;
        cuenta.depositar(500);
        int saldoCuenta = cuenta.mostrarSaldo();
        cuenta.retirar(montoRetiro);
        int saldoEsperado = saldoCuenta - montoRetiro;
        assertEquals(saldoEsperado, cuenta.mostrarSaldo());
        
    }
    
    @Test
    public void testCuentaCorriente() {
        String tipoEsperado = "Cuenta Corriente";
        Cuenta cuentaCorriente = new CuentaCorriente();
        assertEquals(tipoEsperado, cuentaCorriente.mostrarTipoDeCuenta());
    }
    
    @Test
    public void testCuentaDeAhorros() {
        String tipoEsperado = "Cuenta De Ahorros";
        Cuenta cuentaDeAhorros = new CuentaDeAhorros();
        assertEquals(tipoEsperado, cuentaDeAhorros.mostrarTipoDeCuenta());
    }
}
