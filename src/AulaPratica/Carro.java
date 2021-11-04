//package AulaPratica;
//
//public class Carro implements Acoes {
//
//    private String nome;
//    private String marca;
//    private String cor;
//    private double motor;
//    private boolean ligado;
//    private double velocidade;
//    private Piloto p;
//
//    public Carro(String nome, String marca, String cor, double motor, boolean ligado, double velocidade, Piloto p) {
//        this.nome = nome;
//        this.marca = marca;
//        this.cor = cor;
//        this.motor = motor;
//        this.ligado = ligado;
//        this.velocidade=velocidade;
//        this.p=p;
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
//    public String getMarca() {
//        return marca;
//    }
//
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }
//
//    public String getCor() {
//        return cor;
//    }
//
//    public void setCor(String cor) {
//        this.cor = cor;
//    }
//
//    public double getMotor() {
//        return motor;
//    }
//
//    public void setMotor(double motor) {
//        this.motor = motor;
//    }
//
//    public boolean getLigado() {
//        return ligado;
//    }
//
//    public void setLigado(boolean ligado) {
//        this.ligado = ligado;
//    }
//
//    public double getVelocidade() {
//        return velocidade;
//    }
//
//    public void setVelocidade(double velocidade) {
//        this.velocidade = velocidade;
//    }
//
//
//    @Override
//    public void acelerar(int x) {
//        this.velocidade+=x;
//    }
//
//    @Override
//    public void freiar(int x) {
//        this.velocidade-=x;
//    }
//
//    @Override
//    public void parar() {
//        setVelocidade(0);
//    }
//
//    @Override
//    public void ligar() {
//        this.ligado=true;
//    }
//    public void correr(){
//        if(this.ligado==true){
//            System.out.println("Preparado para correr!");
//        }
//    }
//    public void status(){
//        System.out.println(" O" + getNome() + " da marca " + getMarca());
//        System.out.println(" Velocidade: " + getVelocidade()+" Km/h");
//        System.out.println(" Cor : " + getCor());
//        System.out.println(" O carro esta " + getLigado());
//        System.out.println(" O piloto sera" + p.getNome());
//    }
//}
