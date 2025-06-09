import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {
    private  String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public void listarClientes(){
        System.out.println("==================================");
        System.out.println("=== Clientes do Banco " + this.nome + " ===");

        Set<String> nomesClientes = new HashSet<>();
        for(Conta conta : contas){
            nomesClientes.add(conta.getCliente().getNome());
        }
        for (String nome : nomesClientes){
            System.out.println("_" + nome);
        }
        System.out.println("==================================");
    }

    public List<Conta> getContas() {
        return contas;
    }
}
