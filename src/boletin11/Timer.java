package boletin11;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Timer {
    
    private LocalTime inicio;
    private LocalTime ultima;
    private int segundos = 0;
    
    public void introducirFrase(){
        Scanner ler = new Scanner(System.in); 
        System.out.println("ESCRIBE LA SIGUIENTE FRASE:   \n A documentación é todo aquel conxunto de manuais impresos ou en \nformato dixital que explique unha aplicación informática .");
            inicio = LocalTime.now();
        String frase = ler.next();
            ultima = LocalTime.now();
        }
    
    public void calcularTiempo(){
         long milisegundos = ChronoUnit.MILLIS.between(inicio, ultima);
         do{
             if (milisegundos >= 1000){
                 segundos ++;
                 milisegundos = milisegundos - 1000;
             }             
             }while (milisegundos >= 1000);
         System.out.println("TARDACHES " + segundos+"."+milisegundos + " SEGUNDOS EN ESCRIBIR A FRASE");
    }
}
