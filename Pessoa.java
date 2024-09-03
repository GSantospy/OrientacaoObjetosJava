public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimirInfo() {
        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("Idade: %d", idade));
    }
}
