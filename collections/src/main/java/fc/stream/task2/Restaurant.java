package fc.stream.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Restaurant {
    public static void main(String[] args) {
        List<Ingredients> ingredientsOne = Arrays.asList(Ingredients.CEBULA, Ingredients.MOZARELLA,
                Ingredients.POMIDOR);
        List<Ingredients> ingredientsTwo = Arrays.asList(Ingredients.SALAMI, Ingredients.MOZARELLA,
                Ingredients.POMIDOR);
        List<Ingredients> ingredientsThree = Arrays.asList(Ingredients.SELER, Ingredients.MOZARELLA,
                Ingredients.POMIDOR);
        List<Ingredients> ingredientsFour = Arrays.asList(Ingredients.CEBULA, Ingredients.MOZARELLA,
                Ingredients.POMIDOR, Ingredients.PIECZARKI);
        List<Ingredients> ingredientsFive = Arrays.asList(Ingredients.CEBULA, Ingredients.MOZARELLA,
                Ingredients.POMIDOR, Ingredients.SELER);
        List<Ingredients> ingredientsSix = Arrays.asList(Ingredients.CEBULA, Ingredients.MOZARELLA,
                Ingredients.POMIDOR, Ingredients.PAPRYKA);
        List<Ingredients> ingredientsSeven = Arrays.asList(Ingredients.CEBULA, Ingredients.MOZARELLA,
                Ingredients.POMIDOR, Ingredients.PAPRYKA, Ingredients.PIECZARKI);
        List<Ingredients> ingredientsEight = Arrays.asList(Ingredients.SALAMI, Ingredients.MOZARELLA,
                Ingredients.POMIDOR, Ingredients.PAPRYKA);
        List<Ingredients> ingredientsNine = Arrays.asList(Ingredients.SALAMI, Ingredients.SELER,
                Ingredients.POMIDOR);
        List<Ingredients> ingredientsTen = Arrays.asList(Ingredients.PIECZARKI, Ingredients.MOZARELLA,
                Ingredients.POMIDOR);

        Pizza pizzaOne = new Pizza(ingredientsOne, true, 550, "pizzaOne");
        Pizza pizzaTwo = new Pizza(ingredientsTwo, false, 480, "pizzaTwo");
        Pizza pizzaThree = new Pizza(ingredientsThree, true, 750, "pizzaThree");
        Pizza pizzaFour = new Pizza(ingredientsFour, true, 620, "pizzaFour");
        Pizza pizzaFive = new Pizza(ingredientsFive, true, 370, "pizzaFive");
        Pizza pizzaSix = new Pizza(ingredientsSix, true, 920, "pizzaSix");
        Pizza pizzaSeven = new Pizza(ingredientsSeven, true, 800, "pizzaSeven");
        Pizza pizzaEight = new Pizza(ingredientsEight, false, 600, "pizzaEight");
        Pizza pizzaNine = new Pizza(ingredientsNine, false, 500, "pizzaNine");
        Pizza pizzaTen = new Pizza(ingredientsTen, true, 690, "pizzaTen");

        List<Pizza> menu = Arrays.asList(pizzaOne, pizzaTwo, pizzaThree, pizzaFour, pizzaFive, pizzaSix, pizzaSeven,
                pizzaEight, pizzaNine, pizzaTen);

        System.out.println("List of vegan pizzas:");
        printVegan(menu);
        System.out.println();
        System.out.println("List of pizzas contains celery:");
        printContainsSeler(menu);
        System.out.println();
        System.out.println("Is there a vegan pizza that contains tomato and pepper? " + checkIsVeganAndContainsPomidorAndPapryka(menu));
        System.out.println();
        System.out.println("Whether all dishes contain mozzarella? " + doesContainsMozarella(menu));
        System.out.println();
        getPizzaWithHighestCalories(menu);
        System.out.println();
        getPizzaWithLowestCalories(menu);


    }

    public static void printVegan(List<Pizza> menu) {
        Stream<Pizza> pizzaStream = menu.stream();
        pizzaStream.filter(pizza -> pizza.isVegan())
                .forEach(pizza -> System.out.println(pizza.getName()));
    }

    public static void printContainsSeler(List<Pizza> menu) {
        Stream<Pizza> pizzaStream = menu.stream();
        pizzaStream.filter(pizza -> pizza.getIngredients().contains(Ingredients.SELER))
                .forEach(pizza -> System.out.println(pizza.getName()));
    }

    public static boolean checkIsVeganAndContainsPomidorAndPapryka(List<Pizza> menu) {
        Stream<Pizza> pizzaStream = menu.stream();
        return pizzaStream.filter(pizza -> pizza.isVegan() && pizza.getIngredients().contains(Ingredients.POMIDOR) && pizza.getIngredients().contains(Ingredients.PAPRYKA))
                .count() > 0;
    }

    public static boolean doesContainsMozarella(List<Pizza> menu) {
        Stream<Pizza> pizzaStream = menu.stream();
        return pizzaStream.filter(pizza -> pizza.getIngredients().contains(Ingredients.MOZARELLA))
                .count() == menu.size();
    }

    public static void getPizzaWithHighestCalories(List<Pizza> menu) {
        Pizza maxCalories = menu
                .stream()
                .max(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println("Pizza with highest calories is: " + maxCalories);
    }

    public static void getPizzaWithLowestCalories(List<Pizza> menu) {
        Pizza minCalories = menu
                .stream()
                .max(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println("Pizza with lowest calories is: " + minCalories);
    }
}
