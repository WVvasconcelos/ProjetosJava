/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

import java.util.Objects;

/**
 *
 * @author Filipe
 */

    public class Pizza extends Sabores{
    public enum Tamanho {BROTINHO,PEQUENA,MEDIA, GRANDE}
    private Tamanho tamanho;
    
        public static class Builder extends Sabores.Builder<Builder>{
        private final Tamanho tamanho;
        
        public Builder(Tamanho tamanho){
            this.tamanho = Objects.requireNonNull(tamanho);
        }
        
        @Override public Pizza build(){
            return new Pizza(this);
        }
        
        @Override protected Builder self() {return this;}
        
        
    }
    private Pizza (Builder builder){
        super(builder);
        tamanho = builder.tamanho;
    }
    
}


