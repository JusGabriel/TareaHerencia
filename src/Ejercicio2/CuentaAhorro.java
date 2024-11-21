package Ejercicio2;

public class CuentaAhorro extends CuentaBancaria{
    CuentaAhorro( Cliente cliente, String numeroCuenta){
        super(cliente, numeroCuenta, 500);
    }

    @Override
    public double retirar(double monto) {
        if (this.getSaldo()<100) {
            System.out.println("Usted no puede realizar retiros.");
            return this.getSaldo();
        }
        return super.retirar(monto);
    }
}
