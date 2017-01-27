/*
*Nohely Monserrat Cortés del Ángel
*A01410768
*Ingeniería Mecatrónica
 */
package spp.ncortésd.t01p1;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPNCortésDT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de Promedio");
        // Declaración de Variables
        int mat;
        double C1, C2, C3, C4, C5, Pro;
        String Res;
        //Indicar que se utilizará el teclado
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduce tu matrícula");
        mat=kb.nextInt();
        System.out.println("Introduce Calificación 1");
        C1=kb.nextDouble();
        System.out.println("Introduce Calificación 2");
        C2=kb.nextDouble();
        System.out.println("Introduce Calificación 3");
        C3=kb.nextDouble();
        System.out.println("Introduce Califcación4");
        C4=kb.nextDouble();
        System.out.println("Introduce Calificación5");
        C5=kb.nextDouble();
        //Calcular Promedio
        Pro= (C1+C2+C3+C4+C5)/5;
        //Evaluar Promedio
        if (Pro>7.0){
            Res="Aprobado";
        }
        else {
            Res="Reprobado";
        }
        //Mostrar Resultados
        System.out.println(Pro + Res);
        
    }
    
}
