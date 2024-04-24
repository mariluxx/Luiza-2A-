import java.util.LinkedList;
import java.util.Queue;

public class fila  {
    public static void main(String[] args) {
        Queue <String> carros  = new LinkedList();

        carros.add("HR-V");
        carros.add("RAM");
        carros.add("Renegade");
        carros.add("Compass");

        String front = carros.poll();
        System.out.println(" O carro que sera retirado é " + front);

        System.out.println("O carro que esta no inicio da fila é " + carros.peek());

        boolean Queue = carros.isEmpty();
        System.out.println("A fila esta vazia? " + Queue);

    }
}