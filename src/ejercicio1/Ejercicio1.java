/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author dario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Producto aceite = new Producto( 12345,"girasol",450.50,1979 );
    
        System.out.println("codigo: " + aceite.getCodigo());
        System.out.println("descripcion: " + aceite.getDescripcion());
        System.out.println("precio: $ " + aceite.getPrecio());
        System.out.println("stock: " + aceite.getStock());
    
        
    }
    
}

