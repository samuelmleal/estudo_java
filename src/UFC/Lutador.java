//package UFC;
//
//public class Lutador {
//
//    private String nome;
//    private String nacionalidade;
//    private String categoria;
//    private int idade;
//    private double altura;
//    private double peso;
//    private int vitorias;
//    private int derrotas;
//    private int empates;
//
//    public Lutador(String no, String na, int id, double al, double pe, int vit, int der, int emp) {
//        this.nome = no;
//        this.nacionalidade = na;
//        this.idade = id;
//        this.altura = al;
//        setPeso(pe);
//        this.vitorias = vit;
//        this.derrotas = der;
//        this.empates = emp;
//    }
//
//    public   String getNome() {
//        return nome;
//    }
//
//    private String getNacionalidade() {
//        return nacionalidade;
//    }
//
//    private void setNacionalidade(String nacionalidade) {
//        this.nacionalidade = nacionalidade;
//    }
//
//    private int getIdade() {
//        return idade;
//    }
//
//    private void setIdade(int idade) {
//        this.idade = idade;
//    }
//
//    private double getAltura() {
//        return altura;
//    }
//
//    private void setAltura(double altura) {
//        this.altura = altura;
//    }
//
//    private double getPeso() {
//        return peso;
//    }
//
//    private void setPeso(double peso) {
//        this.peso = peso;
//        this.setCategoria();
//    }
//
//    private int getVitorias() {
//        return vitorias;
//    }
//
//    private void setVitorias(int vitorias) {
//        this.vitorias = vitorias;
//    }
//
//    private int getDerrotas() {
//        return derrotas;
//    }
//
//    private void setDerrotas(int derrotas) {
//        this.derrotas = derrotas;
//    }
//
//    private int getEmpates() {
//        return empates;
//    }
//
//    private void setEmpates(int empates) {
//        this.empates = empates;
//    }
//
//    public String getCategoria() {
//        return categoria;
//    }
//
//    public void setCategoria() {
//        if (getPeso()<52.2){
//            System.out.println("Invalido");
//        }
//        else if (getPeso()<=70.3){
//            this.categoria="Leve";
//        }
//        else if (getPeso()<=83.9){
//            this.categoria="Medio";
//        }
//        else if(getPeso()<=120.2){
//            this.categoria="Pesado";
//        }
//        else{
//            System.out.println("Peso invalido");
//        }
//    }
//
//    private void setNome(String nome) {
//        this.nome = nome;
//    }
//    public void apresentar() {
//        System.out.println("Lutador :" + getNome());
//        System.out.println("Origem :" + getNacionalidade());
//        System.out.println("Peso: " + getPeso() + "Kg");
//        System.out.println(getIdade()+" anos");
//        System.out.println(getAltura()+ " m de altura");
//        System.out.println("Categoria :" + getCategoria());
//        System.out.println("Vitorias: " + getVitorias());
//        System.out.println("Derrotas :" + getDerrotas());
//        System.out.println("Empates: " + getEmpates());
//    }
//
//    public void ganharLuta() {
//        setVitorias(getVitorias()+1);
//    }
//    public void perderLuta () {
//        setDerrotas(getDerrotas()+1);
//    }
//    public void empatarLuta(){
//        setEmpates(getEmpates()+1);
//    }
//
//}
