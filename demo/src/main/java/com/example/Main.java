package com.example;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.mostrarInformacion();
        p1.actualizarStock(0);
        p1.calcularPrecioTotal();;
        
        Tienda tienda = new Tienda();
        
        producto.agregarProducto();
        producto.buscarProductoPorNombre();
        producto.calcularValorTotalInventario();
    }
}