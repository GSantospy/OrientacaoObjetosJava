public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 30, 3000);
        f1.imprimirInfo();
        System.out.println("-----------------------");

        Funcionario f2 = new Funcionario("Rodrigo", 48, 8000);
        f2.imprimirInfo();
        System.out.println("-----------------------");

        Gerente g1 = new Gerente("Maria", 35, 10000, 0.2);
        g1.imprimirInfo();
        System.out.println("-----------------------");

        g1.aumentarSalario(1000);
        g1.imprimirInfo();
    }
}
