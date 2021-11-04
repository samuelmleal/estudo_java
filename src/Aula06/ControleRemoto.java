//package Aula06;
//
//public class ControleRemoto implements Botoes {
//
//    private int volume;
//    private boolean ligado;
//    private boolean tocando;
//
//    public ControleRemoto() {
//        this.volume = 70;
//        this.ligado = false;
//        this.tocando = false;
//    }
//
//    private int getVolume() {
//        return volume;
//    }
//
//    private void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    private boolean getLigado() {
//        return ligado;
//    }
//
//    private void setLigado(boolean ligado) {
//        this.ligado = ligado;
//    }
//
//    private boolean getTocando() {
//        return tocando;
//    }
//
//    private void setTocando(boolean tocando) {
//        this.tocando = tocando;
//    }
//
//    @Override
//    public void ligar() {
//        this.setLigado(true);
//    }
//
//    @Override
//    public void desligar() {
//        this.setLigado(false);
//    }
//
//    @Override
//    public void menu() {
//        System.out.println("Esta ligado? " + getLigado());
//        System.out.println("Esta tocando ? "+ getTocando());
//        System.out.println("Volume : " + getVolume());
//        for(int i=0; i<=this.getVolume();i+=10) {
//            System.out.println("|");
//        }
//    }
//
//    @Override
//    public void aumentarVolume() {
//        if(getLigado()){
//            setVolume(getVolume()+5);
//        }
//
//
//    }
//
//    @Override
//    public void diminuirVolume() {
//        if(getLigado()){
//            setVolume(getVolume()-5);
//        }
//
//    }
//
//    @Override
//    public void ligarMudo() {
//        if (getLigado() && getVolume()>0){
//            setVolume(0);
//        }
//
//    }
//
//    @Override
//    public void desligarMudo() {
//        if(getLigado() && getVolume()==0){
//            setVolume(50);
//        }
//
//    }
//
//    @Override
//    public void play() {
//        if(getLigado() && !getTocando()){
//            setTocando(true);
//        }
//
//    }
//
//    @Override
//    public void pause() {
//        if (getLigado() && getTocando()) {
//            setTocando(false);
//        }
//    }
//}
