
class Moto {
    String modelo;
    String marca;
    String cor;
    int ano;

    
    Moto(String modelo, String marca, String cor, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    
    void exibirInformacoes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Moto minhaMoto = new Moto("Bros", "Honda", "Vermelha", 2025);

    
        minhaMoto.exibirInformacoes();
    }
}
