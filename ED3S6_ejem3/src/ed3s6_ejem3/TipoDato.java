/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed3s6_ejem3;

/**
 *
 * @author Giru
 */
public class TipoDato<T> {
    T dato;
    public TipoDato(T dato){
        this.dato=dato;
}
public void MostrarDato(){
    System.out.println("El tipo de dato es " + dato.getClass().getName());
    System.out.println("El valor contenido es " + dato);
    if (dato instanceof Integer) {
            System.out.println("Puedes realizar operaciones");
        } 
        else if (dato instanceof Double) {
            System.out.println("Puedes realizar operaciones");
        } 
        else if (dato instanceof Float) {
            System.out.println("Puedes realizar operaciones");
        } 
        else if (dato instanceof Boolean) {
            System.out.println("No puedes realizar operaciones");
        } 
        else if (dato instanceof String) {
            System.out.println("Se puede concatenar");
        } 
        else if (dato instanceof Character) {
            System.out.println("No se puede concatenar");
        }
    }
    
}
