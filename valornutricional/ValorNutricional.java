package valornutricional;
/**
 * Utilizar um Builder pattern para captar os valores nutricionais;
 */

public class ValorNutricional {

    public static void main(String[] args) {
         ValoresNutricionais guaranaAnt = new ValoresNutricionais.BuilderNutricional(1000, 400).carboLiquidos(100).sodio(55).build();
    
    System.out.println(guaranaAnt.getInfo());
    }
  
}
