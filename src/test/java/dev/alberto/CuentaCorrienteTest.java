package dev.alberto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaCorrienteTest {

    @Test
    void testSobregiro() {
        CuentaCorriente cc = new CuentaCorriente(2000, 12);
        cc.retirar(5000); // queda en sobregiro
        assertTrue(cc.imprimir().contains("Sobregiro"));
    }

    @Test
    void testConsignarCubriendoSobregiro() {
        CuentaCorriente cc = new CuentaCorriente(2000, 12);
        cc.retirar(5000);
        cc.consignar(4000); // cubre sobregiro
        assertTrue(cc.imprimir().contains("Saldo"));
    }
}
