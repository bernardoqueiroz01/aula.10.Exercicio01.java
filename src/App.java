public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Carro carro1 = new Carro();
        carro1.marca = "Audi";
        carro1.modelo = "R8";
        carro1.ano = 2013;
        carro1.acelerar(60);
        carro1.frear(12);

        System.out.println(carro1.retornarDados());
    }
}