package modulo01_fundamentos;

public class CalcularConsumoCombustivel {

    public static void main(String[] args) {
        double distancia = 350.0, consumo = 28.0;
        double mediaPorLitro = distancia / consumo;
        
        System.out.printf("A média de KM por litro é: %.2f\n",mediaPorLitro);

    }

}
