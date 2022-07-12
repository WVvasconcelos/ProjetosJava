package lanchonete;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Filipe
 */
public abstract class Sabores {
    public enum Sabor { QUEIJO, PRESUNTO, CALABRESA, CEBOLA, COGUMELO, PALMITO}
    final Set<Sabor> sabores;
    
    abstract static class Builder<P extends Builder<P>> {
        EnumSet<Sabor> sabores = EnumSet.noneOf(Sabor.class);
        public P addSabor(Sabor sabor){
            sabores.add(Objects.requireNonNull(sabor));
            return self() ;
            
        }
        
        abstract Sabores build();
        protected abstract P self();
    }
    
    Sabores(Builder<?> builder){
        sabores = builder.sabores.clone();
    }
    
}
