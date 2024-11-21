package Ejercicio2;

import java.util.Scanner;

public class CuentaBancaria {
    private Cliente cliente;
    private String numeroCuenta;
    private double saldo;

    CuentaBancaria(Cliente cliente, String numeroCuenta, double saldo) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double depositar(double montoDepositar) {
        this.saldo += montoDepositar;
        return this.saldo;
    }

    public double retirar(double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
        }
        return this.saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Cliente: " + cliente + "\nNumero Cuenta: " + numeroCuenta + "\nSaldo: " + saldo);
    }

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Elkin Diaz", "1727660902");
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(c1, "22895475");
        /*cuentaAhorro1.mostrarInformacion();*/

        Cliente c2 = new Cliente("Justin Imbaquingo", "1766094812");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(c2, "22874169");
        /*cuentaCorriente1.mostrarInformacion();*/


        Cliente c3 = new Cliente("Diego Mullo", "1726487532");
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(c3, "22875321");
        /*cuentaAhorro2.mostrarInformacion();*/

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- SISTEMA BANCARIO ---");
            System.out.println("1. Ver información del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Información de las Cuentas ---");
                    cuentaAhorro1.mostrarInformacion();
                    cuentaCorriente1.mostrarInformacion();
                    cuentaAhorro2.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("Ingrese el monto a transferir: ");
                    double montoTransferir = scanner.nextDouble();
                        cuentaAhorro1.retirar(montoTransferir);
                        cuentaCorriente1.depositar(montoTransferir);
                        System.out.println("Transferencia realizada con éxito.");

                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double monto = scanner.nextDouble();
                    cuentaCorriente1.retirar(monto);
                    System.out.println("Retiro realizado con exito");
                    break;

                case 4:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDepositar = scanner.nextDouble();
                    cuentaAhorro1.depositar(montoDepositar);
                    System.out.println("Depósito realizado con éxito.");
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema bancario.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}



