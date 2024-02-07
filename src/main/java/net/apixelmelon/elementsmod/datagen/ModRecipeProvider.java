package net.apixelmelon.elementsmod.datagen;

import net.apixelmelon.elementsmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Staff Recipes
        // Wooden Staff
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODEN_STAFF.get())
                .pattern(" S ")
                .pattern(" O ")
                .pattern(" S ")
                .define('S', ItemTags.PLANKS)
                .define('O', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pWriter);
        // Wooden Air Staff
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODEN_AIR_STAFF.get())
                .pattern(" O ")
                .pattern(" S ")
                .define('S', ModItems.WOODEN_STAFF.get())
                .define('O', ModItems.AIR_ORB.get())
                .unlockedBy(getHasName(ModItems.AIR_ORB.get()), has(ModItems.AIR_ORB.get()))
                .save(pWriter);
        // Wooden Water Staff
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODEN_WATER_STAFF.get())
                .pattern(" O ")
                .pattern(" S ")
                .define('S', ModItems.WOODEN_STAFF.get())
                .define('O', ModItems.WATER_ORB.get())
                .unlockedBy(getHasName(ModItems.WATER_ORB.get()), has(ModItems.WATER_ORB.get()))
                .save(pWriter);
        // Wooden Earth Staff
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODEN_EARTH_STAFF.get())
                .pattern(" O ")
                .pattern(" S ")
                .define('S', ModItems.WOODEN_STAFF.get())
                .define('O', ModItems.EARTH_ORB.get())
                .unlockedBy(getHasName(ModItems.EARTH_ORB.get()), has(ModItems.EARTH_ORB.get()))
                .save(pWriter);
        // Wooden Fire Staff
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODEN_FIRE_STAFF.get())
                .pattern(" O ")
                .pattern(" S ")
                .define('S', ModItems.WOODEN_STAFF.get())
                .define('O', ModItems.FIRE_ORB.get())
                .unlockedBy(getHasName(ModItems.FIRE_ORB.get()), has(ModItems.FIRE_ORB.get()))
                .save(pWriter);

        // Orb Recipes
        // Air Orb
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AIR_ORB.get())
                .pattern("SSS")
                .pattern("SOS")
                .pattern("SSS")
                .define('S', ModItems.AIR_RUNE.get())
                .define('O', ModItems.DORMANT_ORB.get())
                .unlockedBy(getHasName(ModItems.AIR_RUNE.get()), has(ModItems.AIR_RUNE.get()))
                .save(pWriter);
        // Water Orb
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WATER_ORB.get())
                .pattern("SSS")
                .pattern("SOS")
                .pattern("SSS")
                .define('S', ModItems.WATER_RUNE.get())
                .define('O', ModItems.DORMANT_ORB.get())
                .unlockedBy(getHasName(ModItems.WATER_RUNE.get()), has(ModItems.WATER_RUNE.get()))
                .save(pWriter);
        // Earth Orb
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EARTH_ORB.get())
                .pattern("SSS")
                .pattern("SOS")
                .pattern("SSS")
                .define('S', ModItems.EARTH_RUNE.get())
                .define('O', ModItems.DORMANT_ORB.get())
                .unlockedBy(getHasName(ModItems.EARTH_RUNE.get()), has(ModItems.EARTH_RUNE.get()))
                .save(pWriter);
        // Fire Orb
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIRE_ORB.get())
                .pattern("SSS")
                .pattern("SOS")
                .pattern("SSS")
                .define('S', ModItems.FIRE_RUNE.get())
                .define('O', ModItems.DORMANT_ORB.get())
                .unlockedBy(getHasName(ModItems.FIRE_RUNE.get()), has(ModItems.FIRE_RUNE.get()))
                .save(pWriter);
    }
}
