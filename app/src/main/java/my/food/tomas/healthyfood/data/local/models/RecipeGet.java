package my.food.tomas.healthyfood.data.local.models;

import java.util.ArrayList;

/**
 * Created by Tomas on 25/10/2016.
 */

public class RecipeGet {
    private Recipe recipe;

    public RecipeGet(Recipe recipe) {
        this.recipe = recipe;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}