data class Recipe (
    val title: String,
    val mainIngredients: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
)