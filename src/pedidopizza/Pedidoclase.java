/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidopizza;

/**
 *
 * @author usuario
 */
public class Pedidoclase {

    private String tamaño;
    private String tipo;
    private String estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pedidoclase(String tipo, String tamaño) {
        this.estado = "pedida";
        this.tipo = tipo;
        this.tamaño = tamaño;
        Pedidoclase.totalPedidas++;
    }

    @Override
    public String toString() {
        return "Pizza " + this.tamaño + ", " + this.tipo + ", " + this.estado;
    }

    public static int getTotalPedidas() {
        return Pedidoclase.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pedidoclase.totalServidas;
    }

    public void servicio() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            Pedidoclase.totalServidas++;
        } else {
            System.out.println("La pizza ha sido servida");
        }
    }
}
