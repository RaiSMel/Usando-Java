public class Funcionario {

    private String nome;
    protected double salario;
    private String cpf;

    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Funcionario(String nome, double salario, String cpf){
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public Funcionario(){
        this.salario = 1000;
    }

    public double getBonificacao(){
        return salario * 0.1;
    }

}
