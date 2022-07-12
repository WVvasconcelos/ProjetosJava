package lanchonete;

import java.util.Objects;

/**
 *
 * @author Filipe
 */
    
public class Pastel extends Sabores{
        public enum Tamanho {MEDIA, GRANDE}
        private final Tamanho tamanho;
        
        public static class Builder extends Sabores.Builder<Builder>{
        private final Tamanho tamanho;
        
        public Builder(Tamanho tamanho){
            this.tamanho = Objects.requireNonNull(tamanho);
        }
        
        @Override public Pastel build(){
            return new Pastel(this);
        }
        
        @Override
        protected Builder self() {return this;}
        
        
    }
    private Pastel (Builder builder){
        super(builder);
        tamanho = builder.tamanho;
    }
    }

