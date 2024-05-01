public class Pessoa {
    String nome;
    String email;
    int idade;

    Endereco endereco = new Endereco();

    void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
        System.out.println("Rua: " + endereco.rua);
        System.out.println("Bairro: " + endereco.bairro);
        System.out.println("Cep: " + endereco.cep);
        System.out.println("Cidade: " + endereco.cidade);
        System.out.println("Numero: " + endereco.numero);
        System.out.println("Estado: " + endereco.estado);
    }
}
