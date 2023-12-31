package tacos;

import lombok.Data;

@Data
public class Ingredient {
  
  private final String id;
  private final String name;
  private final Type type;

//  public Ingredient(String id, String name, Type type) {
//    this.id = id;
//    this.name = name;
//    this.type = type;
//  }

  public enum Type {
    /**
     * 包，蛋白质，蔬菜，奶酪，酱汁
     */
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

//  public Type getType() {
//    return type;
//  }
}
