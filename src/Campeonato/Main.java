package Campeonato;

public class Main {
    public static void main(String[] args) {

        Jogos jogos = new Jogos();
//        jogos.marcarJogo();
        Jogadores j []=  new Jogadores[8];

//        j[0]=new Jogadores("Roger Federer",35, "Suica",0);
//        j[1]= new Jogadores("Novak Djokovic",29,"Tcheco",0);
//        j[2]=new Jogadores("Rafael Nadal",34,"Espanha", 0);
//        j[3]=new Jogadores("Steve",28,"Americano", 0);
//        j[4]= new Jogadores("Gabriel",23,"Brasil",0);
//        j[5]=new Jogadores("Putin",46,"Russia",0);
//        j[6]=new Jogadores("Drogba",32,"Senegal",0);
//        j[7]=new Jogadores("Lionel",33,"Argentina",0);

        Jogos torneio = new Jogos();
        torneio.marcarJogo1();
        torneio.jogar();
        torneio.marcarJogo1();
        torneio.jogar();
        torneio.marcarJogo1();
        torneio.jogar();
        torneio.marcarJogo1();
        torneio.jogar();

//        torneio.marcarJogo2(j[3],j[2]);
//        torneio.jogar();
//        torneio.marcarJogo2(j[1],j[0]);
//        torneio.jogar();
//
//        torneio.marcarFinal(j[3],j[1]);
//        torneio.jogar();
//
//        torneio.marcarVencedor();




    }
}
