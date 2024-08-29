package com.example;

import java.util.ArrayList;

public class Tienda {

     
    //Atributo
    private ArrayList<Producto> producto;

    //Constructor 
    public Tienda(){
        this.producto = new ArrayList<>();
    }

    
    //Métodos para agregar producto
    public void agregarProducto(Producto producto) {
        this.producto.add(producto);
        System.out.println("Agregar producto: " + producto.getNombre());
    }

    //Método para buscar producto
    public Producto buscarProductoPorNombre(String nombre){
        for (Producto producto : producto){
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                return producto;
            }
        }
        return null;
    }

    //Método para calcular valor total del inventario
    public double calcularValorTotalInventario() {
        double total = 0;
        for (Producto producto : producto) {
            total = producto.getPrecio() * producto.getStock(); 
        }
        return total; 
        
    }

    //Método para mostrar productos con stock bajo
    public void mostrarProductosConStockBajo(int limite){
        System.out.println("Prodcutos con su cantidad inferior a " + limite + " : ");
        for (Producto p : producto){
            if (producto.getStock() < limite){
                System.out.println("Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio() + " Stock: " + producto.getStock());
            }
        }
        }
    }

    /* 
    // Atributo
    private ArrayList<Producto> productos; // Cambiado a plural

    // Constructor 
    public Tienda() {
        this.productos = new ArrayList<>(); // Inicializa la lista de productos
    }

    // Método para agregar producto
    public void agregarProducto(Producto nuevoProducto) { // Cambiado el parámetro
        this.productos.add(nuevoProducto);
        System.out.println("Producto agregado: " + nuevoProducto.getNombre());
    }

    // Método para buscar producto por nombre
    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto p : productos) { // Cambiado el nombre de la variable
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p; // Devuelve el producto si se encuentra
            }
        }
        return null; // Devuelve null si no se encuentra
    }
    */   

    

}

