package dev.alberto;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        
        CuentaAhorros ca = new CuentaAhorros(15000, 12);
        ca.consignar(2000);
        ca.retirar(1000);
        ca.extractoMensual();
        System.out.println("Cuenta de Ahorros -> " + ca.imprimir());

        
        CuentaCorriente cc = new CuentaCorriente(2000, 12);
        cc.retirar(5000); 
        cc.consignar(4000); 
        cc.extractoMensual();
        System.out.println("Cuenta Corriente -> " + cc.imprimir());
    }
}
