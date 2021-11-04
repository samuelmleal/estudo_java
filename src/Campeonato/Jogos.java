package Campeonato;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogos {

//    private Jogadores jogadores;
//    private boolean aprovada;
    List<Jogadores> lista = new ArrayList<>();

    public Jogadores criarJogador(String nome, int idade, String nacionalidade, int vitoria, boolean mandante){
        return new Jogadores(nome, idade, nacionalidade, vitoria, mandante);
    }

    private List<Jogadores> cadastro(){
        Jogadores jogador1 = criarJogador("Fernando",21,"br",0,false);
        Jogadores jogador2 = criarJogador("Fernando",21,"br",0,false);
        Jogadores jogador3 = criarJogador("Fernando",21,"br",0,false);
        Jogadores jogador4 = criarJogador("Fernando",21,"br",0,false);
        Jogadores jogador5 = criarJogador("Fernando",21,"br",0,false);
        Jogadores jogador6 = criarJogador("Fernando",21,"br",0,false);
        Jogadores jogador7 = criarJogador("Fernando",21,"br",0,false);
        Jogadores jogador8 = criarJogador("Fernando",21,"br",0,false);
        lista.add(jogador1);
        lista.add(jogador2);
        lista.add(jogador3);
        lista.add(jogador4);
        lista.add(jogador5);
        lista.add(jogador6);
        lista.add(jogador7);
        lista.add(jogador8);
        return lista;
    }

    public void marcarJogo(Jogadores j1, Jogadores j2){
        Random random = new Random();
        for(int i = 0; i < lista.size(); i++){
            Integer n1 = random.nextInt(8);
            Integer n2 = random.nextInt(8);
            j1 = lista.get(n1);
            j2 = lista.get(n2);
        }
    }



    public void marcarJogo1() {

//        Random aleatorio = new Random();
//        Integer n = aleatorio.nextInt(9);
//        int i= aleatorio.nextInt(9);
    }







    public void marcarSemi() {



//        if (j1.getVitorias() > 0 && j2.getVitorias() > 0) {
//            System.out.println("###SEMIFINAL###");
//            this.aprovada = true;
//            this.mandante = j1;
//            this.visitante = j2;
//        } else {
//            System.out.println("Jogo nao realizavel, o jogador nao passou da primeira fase");
//        }
    }








    public void marcarFinal() {



//        if (j1.getVitorias() > 1 && j2.getVitorias() > 1) {
//            System.out.println("####FINAL###");
//            this.aprovada = true;
//            this.mandante = j1;
//            this.visitante = j2;;
//        }
    }










    public void jogar() {






//        if (this.aprovada == true) {
//            System.out.println("###MANDANTE###");
//            this.mandante.status();
//            System.out.println("###VISITANTE###");
//            this.visitante.status();
//            Random aleatorio = new Random();
//            int vencedor = aleatorio.nextInt(1);
//            System.out.println("=======RESULTADO DO JOGO======");
//            switch (vencedor) {
//                case 0: // VITORIA MANDANTE
//                    System.out.println("Vitoria do " + this.mandante.getNome());
//                    this.mandante.ganharJogo();
//                    break;
//                case 1: // VITORIA VISITANTE
//                    System.out.println("Vitoria do " + this.visitante.getNome());
//                    this.visitante.ganharJogo();
//                    break;
//            }
//        }else if (this.mandante.getVitorias()==3){
//            System.out.println("O CAMPEAO E O JOGADOR " + mandante.getNome());
//        }else if(this.visitante.getVitorias()==3){
//            System.out.println("O CAMPEAO E O JOGADOR " + visitante.getNome());
//        }
//        else{
//            System.out.println("Um jogador nao passou da semifinal");
//        }

    }










//    public void marcarVencedor(){
//        if(this.mandante.getVitorias()==3){
//            System.out.println("### O CAMPEAO DO CAMPEONATO E " + this.mandante.getNome() + "###");
//        }
//        else if (this.visitante.getVitorias()==3){
//            System.out.println("### O CAMPEAO DO CAMPEONATO E " + this.visitante.getNome()+ "###");
//        }
//    }

}






