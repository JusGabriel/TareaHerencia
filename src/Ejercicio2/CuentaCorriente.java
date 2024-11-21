package Ejercicio2;

public class CuentaCorriente extends CuentaBancaria{

    CuentaCorriente( Cliente cliente, String numeroCuenta){
        super(cliente, numeroCuenta,1000.00);
    }

    @Override
    public double retirar(double monto) {
        double comision = monto * 0.02;
        if (this.getSaldo() >= (monto+comision)) {
            return super.retirar(monto +comision);
        } 
            return this.getSaldo();
    }
}
