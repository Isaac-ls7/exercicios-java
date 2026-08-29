
package modulo04_estruturas_condicionais;
import  java.util.Scanner;

public class VerificarStatusBateria {

   
    public static void main(String[] args) {
        try(Scanner ler = new Scanner(System.in)){
            System.out.println("Qual o percentual da sua bateria: ");
            int carga = ler.nextInt();
            
            if(carga <= 20){
                System.out.println("Carga crítica! Conecte o carregador.");
            }else if(carga > 20 && carga <= 80){
                System.out.println("Carga em nível normal.");
            }else{
                System.out.println("Carga completa / alta");
            }
            
        }
    }

}
