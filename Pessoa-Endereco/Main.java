import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do Cliente");
        p1.nome = leitor.nextLine();

        System.out.println("Digite o email do Cliente");
        p1.email = leitor.nextLine();


        System.out.println("Digite a idade do Cliente");
        p1.idade = leitor.nextInt();


        System.out.println("Digite o nome da Rua");
        leitor.next();
        p1.endereco.rua = leitor.nextLine();

        System.out.println("Digite o número da Casa");
        p1.endereco.numero = leitor.nextInt();

        System.out.println("Digite o nome do Bairro");
        leitor.next();
        p1.endereco.bairro = leitor.nextLine();

        System.out.println("Digite o nome da Cidade");
        p1.endereco.cidade = leitor.nextLine();

        System.out.println("Digite o nome do Estado");
        p1.endereco.estado = leitor.nextLine();

        System.out.println("Digite o Cep");
        p1.endereco.cep = leitor.nextLine();

        p1.mostrarDados();

        if(p1.idade > 17)
            System.out.println("O cliente é maior de idade");
        else
            System.out.println("O cliente é menor de idade");


    }
}
