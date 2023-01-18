
public class Gerente extends Funcionario {

    private String senha;

    public Gerente(String nome, double salario,String cpf ,String senha){
        super(nome, cpf, salario);
        this.senha = senha;
    }
    public Gerente(){
        setSalario(5000);
    }

    public double getBonificacao() {
        return getSalario() + 1000;
    }

    public boolean autentica(String senha) {
        if (senha == this.senha) {
            return true;
        } else {
            return false;
        }
    }

}
