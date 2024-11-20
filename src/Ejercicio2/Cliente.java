package Ejercicio2;

public class Cliente{
    private String nombreDelCliente;
    private String identificacion;


    Cliente(String nombreDelCliente, String identificacion){
        this.nombreDelCliente = nombreDelCliente;
        this.identificacion = identificacion;

    }

    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del cliente: " + nombreDelCliente+"\nIdentificacion: " + identificacion);
    }




}
