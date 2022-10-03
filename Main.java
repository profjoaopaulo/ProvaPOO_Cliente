import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        //Obtendo so dados de entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite o sexo do Cliente (masculino ou feminino): ");
        String sexo = sc.nextLine();
        System.out.println("Digite a idade do Cliente: ");
        int idade = sc.nextInt();

        //Instanciando o objeto Cliente com os dados pedidos
        Cliente cli = new Cliente(nome, sexo, idade);

        //Exibindo a saudação adequada e o ano de nascimento do Cliente (questão 03)
        System.out.println(cli.saudacao());
        System.out.println("Este cliente nasceu em: " + cli.anoNascimento(2022));
    }
}
