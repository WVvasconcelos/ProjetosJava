/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassJogos;

import java.util.ArrayList;

/**
 *
 * @author Filipe
 */
public class JogoEletronico extends Jogo {
      private ArrayList<String> plataformas;
      private String categoria;
      private String[] categorias = {"Ação", "Esporte", "Estrategia"};
      
      public JogoEletronico(String nome, float precoUnitario, int clasEtaria, ArrayList<String> plataformas, int numCateg){
          super(nome, precoUnitario, clasEtaria);
          this.plataformas = new ArrayList<>(plataformas);
          this.categoria = categorias[numCateg];
          
      }
      public String getPlataformas(){
          String plat= "";
          for(String plataformas : plataformas){
              plat += plataformas + "; ";
          }
          return "Plataformas: " + plat;
      }
      
      @Override
      public String toString(){
          return getInfoJogo() + " | Categoria: " + categoria;
      }
}
