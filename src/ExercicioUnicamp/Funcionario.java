//package ExercicioUnicamp;
//
//public class Funcionario {
//
//    String nome;
//    double salario;
//    double novoSalario;
//
//    public double getNovoSalario() {
//        return novoSalario;
//    }
//
//    public void setNovoSalario(double novoSalario) {
//        this.novoSalario = novoSalario;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public double getSalario() {
//        return salario;
//    }
//
//    public void setSalario(double salario) {
//        this.salario = salario;
//    }
//
//    public void novoSalario() {
//        if (this.salario < 150) {
//            setNovoSalario(0.25 * getSalario()+getSalario());
//        } else if (getSalario() <= 300) {
//            setNovoSalario(0.2 * getSalario()+getSalario());
//        } else if (getSalario() <= 600) {
//            setNovoSalario(0.15 * getSalario()+getSalario());
//        } else {
//            setNovoSalario(0.1 * getSalario()+getSalario());
//        }
//
//    }
//    public void status() {
//        System.out.println("Nome: " + getNome());
//        System.out.println("Salario atual: " + getSalario());
//        System.out.println("Salario reajustado: " + getNovoSalario());
//    }
//
//}
