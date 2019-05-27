package throne.springreacto.recipe.services;

import throne.springreacto.recipe.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdByIngredientId(String recipeId, String id);

    IngredientCommand saveIngredientCommand(IngredientCommand ingredientCommand, String recipeId);

    void deleteById(String recipeId, String idToDelete);
}
