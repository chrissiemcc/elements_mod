package net.apixelmelon.elementsmod.datagen;

import net.apixelmelon.elementsmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Staff Recipes
        // Wooden Dormant Staff
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODEN_DORMANT_STAFF.get())
                .pattern(" O ")
                .pattern(" S ")
                .define('S', ModItems.WOODEN_STAFF.get())
                .define('O', ModItems.DORMANT_ORB.get())
                .unlockedBy(getHasName(ModItems.DORMANT_ORB.get()), has(ModItems.DORMANT_ORB.get()))
                .save(pWriter);
    }
}
