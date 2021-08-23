
public class TestaBanco {
    public static void main(String[] args) {
       Cliente paulo = new Cliente();
       paulo.nome = "Paulo Silveira";
       paulo.cpf = "232454565-78";
       paulo.profissao = "Programador";
        
        Conta contaDoPaulo = new Conta();
        
        contaDoPaulo.agencia = 1234;
        contaDoPaulo.numero = 12334567;
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular.cpf);
        System.out.println(contaDoPaulo.titular.profissao);
        
    }
}
