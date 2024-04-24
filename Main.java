import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack <String> carros  = new Stack();

        carros.push("HR-V");
        carros.push("RAM");
        carros.push("Renegade");
        carros.push("Compass");

        String front = carros.pop();
        System.out.println(" O carro que sera retirado é " + front);

        System.out.println("O carro que esta no inicio da pilha é " + carros.peek());

        boolean stack = carros.isEmpty();
        System.out.println("A pilha esta vazia? " + stack);

    }
}
