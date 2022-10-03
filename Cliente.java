public class Cliente {

    //Atributos
    private String nome;
    private String sexo;
    private int idade;

    //Método construtor
    public Cliente(String nome, String sexo, int idade) {

        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    //Métodos pedidos na questão 02
    public String saudacao() {

        String pronome;
        if(sexo.equals("feminino"))
            pronome = "Sra";
        else
            pronome = "Sr";

        return "Seja bem-vindo " + pronome + " " + this.nome;
    }

    public int anoNascimento(int anoAtual) {

        return anoAtual - this.idade;
    }
}