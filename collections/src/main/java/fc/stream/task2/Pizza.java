package fc.stream.task2;

import java.util.List;

public class Pizza {

    private List<Ingredients> ingredients;
    private boolean isVegan;
    private Integer calories;
    private String name;

    public Pizza(List<Ingredients> ingredients, boolean isVegan, Integer calories, String name) {
        this.ingredients = ingredients;
        this.isVegan = isVegan;
        this.calories = calories;
        this.name = name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public Integer getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public String toString() {
//        return  name + ":" +
//                " ingredients = " + ingredients +
//                ", isVegan = " + isVegan +
//                ", calories = " + calories;
//
//    }

    @Override
    public String toString() {
        return name;

    }
}
