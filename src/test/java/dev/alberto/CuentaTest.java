package dev.alberto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testConsignarYRetirar() {
        Cuenta cuenta = new Cuenta(10000, 12);
        cuenta.consignar(2000);
        cuenta.retirar(5000);
        assertTrue(cuenta.imprimir().contains("Saldo"));
    }

    @Test
    void testExtractoMensual() {
        Cuenta cuenta = new Cuenta(10000, 12);
        cuenta.extractoMensual();
        assertTrue(cuenta.saldo > 10000);
    }
}
