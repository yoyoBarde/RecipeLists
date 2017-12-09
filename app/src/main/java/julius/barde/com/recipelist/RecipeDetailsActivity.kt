package julius.barde.com.recipelist

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.recipe_activity.*

class RecipeDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_activity)

        val recipe:Recipe = intent.getParcelableExtra("123")
        photoTV.setImageResource(recipe.photo)
        ingredientsTV.text= recipe.ingredients
        proceduresTV.text= recipe.procedures


    }

}
