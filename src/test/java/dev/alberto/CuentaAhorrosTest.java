package dev.alberto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaAhorrosTest {

    @Test
    void testCuentaActiva() {
        CuentaAhorros ca = new CuentaAhorros(15000, 12);
        ca.retirar(2000);
        ca.extractoMensual();
        assertTrue(ca.imprimir().contains("Activa"));
    }

    @Test
    void testCuentaInactiva() {
        CuentaAhorros ca = new CuentaAhorros(5000, 12);
        ca.consignar(2000);
        assertTrue(ca.imprimir().contains("Activa: false"));
    }
}
