/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3trifiv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class V3TRIFIV {    
    public static void main(String[] args) throws IOException {
           //Variables
               BufferedReader bufEntrada= new BufferedReader(new InputStreamReader(System.in));
               int num;
           //Entrada de Datos
               System.out.println("Dame el numero");
               num= Integer.parseInt(bufEntrada.readLine());
           //Salida de Datos
               System.out.println(retornaMultiplo(num));
       }
   public static String retornaMultiplo(int num){
      //Variables
           int mult3, mult5;
      //Proceso de Datos
           mult3=num%3;
           mult5=num%5;
       //Salida de datos    
           if(mult3==0 && mult5==0){return "TRIFIV";}
           else if(mult5==0){return "FIV";}
           else if(mult3==0){return "TRI";}
           else return "Ningun valor";}
}