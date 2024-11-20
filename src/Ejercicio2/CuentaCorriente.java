package Ejercicio2;

public class CuentaCorriente extends CuentaBancaria{

    CuentaCorriente( Cliente cliente, String numeroCuenta){
        super(cliente, numeroCuenta,1000.00);
    }

    @Override
    public double depositar(double montoDepositar) {
        return super.depositar(montoDepositar);
    }

    @Override
    public double retirar(double monto) {
        double comision = monto*2/100;
        return super.retirar(comision);
    }
}
