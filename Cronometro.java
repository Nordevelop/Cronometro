package misClases;

import java.utils.*;

import java.util.concurrent.TimeUnit;

public class Main{
  public static void main(String[] args) throws InterruptedException{
    /*Cronometro usando Ciclos For anidado
    *Author Nordevelop
    */
     int n=0;
    //horas
    for (int i=1; i>=0;i--){
      //minutos
       for (int j=1;j>=0;j--){
         //segundos
           for (int k=59;k>=0;k--){
               /* escribe hora:minutos:segundos
               *  (actualizandose a medida que va pasando cada segundo)
               */
               System.out.printf("\n%02d:%02d:%02d",i,j,k); 
               TimeUnit.SECONDS.sleep(1);
               Thread.sleep(1*1000);
           }
       }
    }
  }
}
