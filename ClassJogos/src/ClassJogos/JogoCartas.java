package ClassJogos;

import java.util.ArrayList;

public class JogoCartas extends Jogo {
    private int qtdJogadores;
    private ArrayList<String> deck;
    public JogoCartas(String nome, float precoUnitario, int clasEtaria,ArrayList<String> deck,int qtdJogadores){
        super(nome, precoUnitario, clasEtaria);
        this.deck = new ArrayList<>(deck);
        this.qtdJogadores = qtdJogadores;
        
    }
    public String getDeck(){
        String decks = "";
        for (String deck : deck) {
            decks+= deck+ "; ";
        }
        return "deck: " + decks + "\n";
        
    }
    @Override
    public String toString(){
        return getInfoJogo() +" | Qtf. Jogadores: " + qtdJogadores;
              
    }
    
}
