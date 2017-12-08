package julius.barde.com.recipelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false  )
        val myRecipes = ArrayList<Recipe>()


        var adoboIngred = ArrayList<String>()
        var adoboProcedure = ArrayList<String>()
        adoboIngred.add("2 lbs pork belly")
        adoboIngred.add("2 tbsp garlic, minced or crushed")
        adoboIngred.add("5 pieces dried bay leaves")
        adoboIngred.add("4 tbsp vinegar")
        adoboIngred.add("1 tbsp whole peppercorn")
        adoboIngred.add("1/2 cup soy sauce")
        adoboIngred.add("1 tbsp whole peppercorn")
        adoboIngred.add("1 to 2 cups of water")
        adoboIngred.add("1 to 2 cups of water")

        adoboProcedure.add("1. Combine the pork belly, soy sauce, and garlic then marinade for at least 1 hour")
        adoboProcedure.add("2. Heat the pot and put-in the marinated pork belly then cook for a few minutes")
        adoboProcedure.add("3. Add water, whole pepper corn, and dried bay leaves then bring to a boil. Simmer for 40 minutes to 1 hour")
        adoboProcedure.add("4. Put-in the vinegar and simmer for 12 to 15 minutes")
        adoboProcedure.add("5. Add salt to taste")
        adoboProcedure.add("6. Serve hot. Share and enjoy!")
        myRecipes.add(Recipe("Pork Adobo","Pork Adobo is pork cooked in soy sauce, vinegar, and garlic. This is considered by many as the Philippine’s national dish because of its popularity, ease in preparation, and long storage life."
                ,321,adoboIngred,adoboProcedure))

        var adapter = CustomeAdapter(myRecipes)
        recyclerView.adapter = adapter
    }
}
