package dev.alberto;

public class CuentaCorriente extends Cuenta {
    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            float faltante = cantidad - saldo;
            sobregiro += faltante;
            saldo = 0;
        }
        numRetiros++;
    }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad > sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
                super.consignar(cantidad);
            } else {
                sobregiro -= cantidad;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public String imprimir() {
        return "Saldo: " + saldo +
                " | Comisión: " + comisionMensual +
                " | Transacciones: " + (numConsignaciones + numRetiros) +
                " | Sobregiro: " + sobregiro;
    }
}
