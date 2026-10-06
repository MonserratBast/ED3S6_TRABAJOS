/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed3s6_ejem3;

/**
 *
 * @author Giru
 * @param <T>
 * @param <U>
 */
public class TipoDato2<T,U>{
    T dato1; 
    U dato2;
    public TipoDato2(T dato1, U dato2){
        this.dato1=dato1;
        this.dato2=dato2;
    }
    public void MostrarDato(){
    System.out.println("Resultado de tipo de Dato 2");
    System.out.println("Tipo Dato1 " + dato1.getClass().getName());
    System.out.println("Valor dato1 " + dato1);
    System.out.println("Tipo Dato2 " + dato2.getClass().getName());
    System.out.println("Valor dato2 " + dato2);
    }
}
