/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed3s6_ejem2;

/**
 *
 * @author Giru
 */
public class ED3S6_ejem2 {

    /**
     */
    public void suma(){
    int a=3;
    int b=7;
    int c=a+b;
    System.out.println("la suma de a+b es: " + c);
    mensaje();
    }
    
    private void mensaje(){
    System.out.println("Bienvenido a Estructura de datos");
    }
    
    public static void main(String[] args) {
        ED3S6_ejem2 obj = new ED3S6_ejem2();
        obj.suma();
        obj.mensaje();
    }
    
}
