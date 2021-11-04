//package banco;
//
//    class Conta {
//
//    public int numConta;
//    protected String tipo;
//    private String dono;
//    private float saldo;
//    private boolean status;
//
//        public void status(){
//            System.out.println("O numero da conta e: " + getNumConta());
//            System.out.println("A conta e do tipo: " + getTipo());
//            System.out.println("O titular e: " + getDono());
//            System.out.println("O saldo da conta e: " + getSaldo());
//            System.out.println("Status: " + getStatus());
//        }
//
//        public void criarConta(String c){
//            setTipo(c);
//            setStatus(true);
//            if (c == "CC") {
//                setSaldo(50);
//            }
//            else{
//                setSaldo(150);
//            }
//        }
//        public void fecharConta(){
//            if(saldo>0){
//                System.out.println("Conta com dinheiro, pode realizar fechamento");
//            }
//            else if(saldo<0){
//                System.out.println("Conta sem dinheiro, nao pode realizar fechamento em debito");
//            }
//            else{
//                setStatus(false);
//                System.out.println("Conta fechada com sucesso");
//            }
//
//        }
//        public void depositar(float x){
//            if(status==true){
//                setSaldo(getSaldo()+x);
//                System.out.println("Deposito realizado na conta de " + getDono());
//            }
//            else{
//                System.out.println("Impossivel depositar");
//            }
//
//        }
//        public void sacar(float a){
//            try {
//                if (status == true) {
//                    if (a < getSaldo()) {
//                        setSaldo(getSaldo() - a);
//                        System.out.println("Saque realizado na conta de " + getDono());
//                    }
//                } else {
//                    System.out.println("Saldo insuficiente");
//                }
//            }
//        catch (Exception e){
//            System.out.println( "Impossivel sacar" );
//            }
//
//        }
//
//
//        public int getNumConta() {
//            return numConta;
//        }
//
//        public void setNumConta(int numConta) {
//            this.numConta = numConta;
//        }
//
//        public String getTipo() {
//            return tipo;
//        }
//
//        public void setTipo(String tipo) {
//            this.tipo = tipo;
//        }
//
//        public String getDono() {
//            return dono;
//        }
//
//        public void setDono(String dono) {
//            this.dono = dono;
//        }
//
//        public float getSaldo() {
//            return saldo;
//        }
//
//        public void setSaldo(float saldo) {
//            this.saldo = saldo;
//        }
//
//        public boolean getStatus() {
//            return status;
//        }
//
//        public void setStatus(boolean status) {
//            this.status = status;
//        }
//    }
//
//





