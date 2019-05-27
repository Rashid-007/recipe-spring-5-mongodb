package throne.springreacto.recipe.services;

import throne.springreacto.recipe.commands.RecipeCommand;
import throne.springreacto.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe getById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

    RecipeCommand findCommandById(String id);

    void deleteById(String id);
}
