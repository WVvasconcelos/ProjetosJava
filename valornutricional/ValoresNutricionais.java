
package valornutricional;

/**
 *
 * @author Filipe
 */
public class ValoresNutricionais {
    private final int porcao;  // referida em (ml) required
    private final int calorias; // referida em (kcal) required
    private final int carboLiquidos; // referida em (g) opcional
    private final int proteinas;// referida em (g) opcional
    private final int gorduraTotal;//referida em (g) opcional
    private final int gorduraSaturada;// referida em (g) opcional
    private final int fibra;// referida em (g) opcional
    private final int sodio;// referida em (mg) opcional
    
    /*
    Neste momento, poderia ter começado a construção de um construtor adquirindo essas informações
    
    EX:
    
    public ValoresNutricionais(int porcao, int calorias, int carboLiquidos, int proteinas, int gorduraTotal,
            int gorduraSaturada, int fibra, int sodio){
        this.porcao = porcao;
        this.calorias = calorias;
        this.carboLiquidos = carboLiquidos;
        this.proteinas = proteinas;
        this.gorduraTotal = gorduraTotal;
        this.gorduraSaturada = gorduraSaturada;
        this.fibra = fibra;
        this.sodio = sodio;
    }
    
    mas neste caso esse não seria o unico construtor a ser utilizado e seria bem mais complicado de manipular-lo,
    já que porção e calorias são required, teriamos que criar outros construtores para pegar esses valores, além de 
    passar um valor qualquer como 0 para os outros opcionais toda vez que inicializarmos um novo construtor
    
    EX:
    
    public ValoresNutricionais(int porcao, int calorias){
        this.porcao = porcao;
        this.calorias = calorias;
    }
    
    public ValoresNutricionais(int porcao, int calorias, int carboLiquidos){
        this.porcao = porcao;
        this.calorias = calorias;
        this.carboLiquidos = carboLiquidos;
    }
    ... etc
    */
   
    public static class BuilderNutricional{
        //parametros required
        private final int porcao;
        private final int calorias;
        
        //parametros opcionais
        private int carboLiquidos = 0;
        private int proteinas = 0;
        private int gorduraTotal = 0;
        private int gorduraSaturada = 0;
        private int fibra = 0;
        private int sodio = 0;
    
        public BuilderNutricional(int porcao, int calorias){
        this.porcao = porcao;
        this.calorias = calorias;
    }
        
        public BuilderNutricional carboLiquidos(int valor)
                    { carboLiquidos = valor; return this;}
        
        public BuilderNutricional proteinas(int valor)
                    {proteinas = valor; return this;}
        
        public BuilderNutricional gorduraTotal(int valor)
                    {gorduraTotal = valor; return this;}
        
        public BuilderNutricional gorduraSaturada(int valor)
                    {gorduraSaturada = valor; return this;}
        
        public BuilderNutricional fibra(int valor)
                    {fibra = valor; return this;} 
        
        public BuilderNutricional sodio(int valor)
                    {sodio = valor; return this;}
        
        public ValoresNutricionais build(){
            return new ValoresNutricionais(this);
        }
    
    }
    private ValoresNutricionais(BuilderNutricional builder){
        this.porcao = builder.porcao;
        this.calorias = builder.calorias;
        this.carboLiquidos = builder.carboLiquidos;
        this.proteinas = builder.proteinas;
        this.gorduraTotal = builder.gorduraTotal;
        this.gorduraSaturada = builder.gorduraSaturada;
        this.fibra = builder.fibra;
        this.sodio = builder.sodio;
    }
    
    public String getInfo(){
        return "===== Valores Nutricionais =====\n" 
                +"Porcao: " + porcao
                +"\nCalorias: " + calorias
                +"\nCarboLiquidos: " + carboLiquidos
                +"\nProteinas: " + proteinas
                +"\nGorduras Totais: "+ gorduraTotal
                +"\nGordura Saturada: " + gorduraSaturada
                +"\nFibras: " + fibra
                +"\nSodio: " + sodio + "\n"
                + "=================================\n";
    }
}
