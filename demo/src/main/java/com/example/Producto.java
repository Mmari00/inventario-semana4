package com.example;

//Declaración de atributos
public class Producto {
    private String nombre;
    private Double precio;
    private int stock;

//Creación del constructor
    public Producto(){
        this.nombre = "No sabemos que vender";
        this.precio = 5.000;
        this.stock = 20;
    }

//Getter 
    public String getNombre(){
        return nombre;
    }
    public Double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }

//Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

//Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Cantidad del producto: " + stock);
    }
    
    public void actualizarStock(int cantidad) {
        if (cantidad < 0){
            System.out.println("¡Error!, la cantidad es negativa." );
        } else{
            stock += cantidad;
            System.out.println("El stock ha sido actualizado: " + stock  );
        }
    }

    public void calcularPrecioTotal(){
        double total = precio * stock;
        System.out.println("Precio total de los productos y la cantidad: " + total);
    }



    
}
