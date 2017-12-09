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




        var adoboIngred ="\n2 lbs pork belly"+"\n2 tbsp garlic, minced or crushed"+"\n5 pieces dried bay leaves"+"\n4 tbsp vinegar"+"\n1 tbsp whole peppercorn"+"\n1/2 cup soy sauce"+"\n1 tbsp whole peppercorn"+"\n1 to 2 cups of water"
        var adoboProcedure = "\n1. Combine the pork belly, soy sauce, and garlic then marinade for at least 1 hour"+ "\n2. Heat the pot and put-in the marinated pork belly then cook for a few minutes"+ "\n3. Add water, whole pepper corn, and dried bay leaves then bring to a boil. Simmer for 40 minutes to 1 hour"+ "\n4. Put-in the vinegar and simmer for 12 to 15 minutes"+ "\n5. Add salt to taste"+ "\n6. Serve hot. Share and enjoy!"
        myRecipes.add(Recipe("Pork Adobo","Pork Adobo is pork cooked in soy sauce, vinegar, and garlic. This is considered by many as the Philippine’s national dish because of its popularity, ease in preparation, and long storage life.",R.drawable.recipe1,adoboIngred,adoboProcedure))

        var bicolIngred="3 cups coconut milk\n" + "2 lbs pork belly, cut into strips\n" + "½ cup Shrimp Paste\n" + "1 tbsp Garlic, minced\n" + "6 pieces Thai chili or Serrano pepper\n" + "3 tablespoons minced ginger\n" + "1 medium onion, minced\n" +"2 tablespoons cooking oil\n" + "Salt and Pepper to taste"
        var bicolProcedures="1. Heat a pan and then pour-in the cooking oil.\n" + "2. Sauté the garlic, onion, and ginger\n" + "3. Add the pork and then continue cooking for 5 to 7 minutes or until the color becomes light brown\n" + "4. Put-in the shrimp paste and Thai chili or Serrano pepper. Stir.\n" + "5. Pour the coconut milk in. Bring to a boil. Simmer for 40 minutes or until the pork is tender\n" + "6. Add salt and ground black pepper to taste\n" + "7.Serve Hot. Enjoy!"
        myRecipes.add(Recipe("Bicol Express","The outcome of this Bicol Express Recipe can be described as pork cooked in coconut milk with shrimp paste and chilies. No wonder the name of this dish was derived from a Philippine region (Bicol) wherein Coconuts are abundant and the use of chilies is emphasized in most local meals.",R.drawable.recipe2,bicolIngred,bicolProcedures))

        var lapazIngred="3 pounds pork bones\n" + "2 pounds beef bones (with marrow)\n" + "water\n" + "½ pork shoulder\n" + "½ pound pork intestines, cleaned\n" + "½ pound pork liver\n" + "1 small red onion, peeled and minced\n" + "2 cloves garlic, peeled and minced\n" + "1 tablespoon sauteed shrimp paste\n" + "2 tablespoons sugar\n" + "¼ teaspoon MSG\n" + "rock salt and pepp"
        var lapazProcedure="1. In a deep pot, bring enough water to cover bones into a boil. Add bones and boil, skimming scum that floats on top, for about 10 minutes. Drain bones and discard liquid. Under cold running water, rinse bones to rid of any scum. Rinse pot. Return bones to pot and enough cold water (about 10 to 12 cups) to cover. Bring to a boil, skimming scum that floats on top. Lower heat, cover and simmer for about 3 hours.\n" + "2. Using a colander, strain broth. Scrape off any attached meat from bones and set aside. Using a small spoon, scoop out marrow from beef bones and set aside. Discard bones.\n" + "3. Return broth to pot and bring to a boil. Add pork shoulder and pork intestines. Cook for about 30 to 40 minutes or until tender. With a slotted spoon, remove from pot and allow to slightly cool to touch. Slice into strips and set aside.\n" + "4. Add liver to pot and cook for about 7 to 10 minutes. With a slotted spoon, remove from pot and allow to slight cool to touch. Slice into strips and set aside.\n" + "5. Add onions and garlic to pot of hot broth. Cook for about 2 to 3 minutes or until onions and garlic are softened. Add shrimp paste and stir until dispersed. Add sugar and MSG. Season with rock salt and pepper to taste.\n" + "6. In a saucepot, bring about 3 quarts to a boil. Using a strainer basket, submerge noodles for about 30 to 40 seconds. Drain well and divide into serving bowls.\n" + "7. Ladle hot broth over noodles. Top with sliced pork, intestines, liver and any scrap meat from bones. Divide bone into each bowl, if desired. Garnish with chicharon, fried garlic bits and green onions. Crack a raw egg into each bowl, if desired. Serve hot."
        myRecipes.add(Recipe("La Paz Batchoy","Batchoy is a noodle soup made with pork organs, crushed pork cracklings, chicken stock, beef loin and round noodles. Its origins can be traced to the district of La Paz, Iloilo City in the Philippines, hence it is often referred to as La Paz Batchoy",R.drawable.recipe3,lapazIngred,lapazProcedure))

        var sisigIngred="1 cup Filipino soy sauce\n" + "1/2 cup coconut vinegar\n" + "3 tablespoons salt\n" + "1 1/2 tablespoons sugar\n" + "1 teaspoon whole peppercorns\n" + "10 cloves garlic\n"+"1 pig ear \n" + "1 pork jowl\n" + "1/2 pork snout\n" + "1/2 pork tongue "
        var sisigProcedure="1. For the braised pork: Combine the soy sauce, vinegar, salt, sugar, peppercorns, garlic, pig ear, jowl, snout and tongue in a large stockpot and add enough water to completely cover the pork. Simmer on low heat until the pork is soft but not completely tender, 1 hour 30 minutes. Remove the pork and chill.\n" + "\n" + "2. For the pork sisig: Preheat a charcoal grill to high heat, preferably using lump charcoal. Grill the pork parts until the skin is crispy and slightly charred, and then refrigerate.\n" + "\n" + "3. Dice the pork parts into small pieces. Saute the ginger, garlic, chiles and onions in a large saute pan for 1 minute. Add the pork and saute for 4 minutes. Add the Filipino soy sauce, calamansi juice and coconut vinegar.\n" + "\n" + "4.Divide the pork among 4 pre-heated fajita platters. Crack 1 egg onto each platter and mix the egg and pork together. Serve atop the rice.\n" + "\n"
        myRecipes.add(Recipe("Sizzling Pork Sisig","Sisig is a Filipino dish made from parts of pig's head and liver, usually seasoned with calamansi and chili peppers. Sisig was first mentioned in a Kapampangan dictionary in the 17th Century meaning \"to snack on something sour\" and \"salad\"+",R.drawable.recipe4,sisigIngred,sisigProcedure))


        var lanciaoIngred="1 kilo soup no. 5 set\n" + "2 slices oxtail, skin on\n" + "1 small packet sibot mix herb\n" + "1 whole garlic\n" + "1/2 head garlic, chopped\n" + "1 thumb size ginger, cut into slivers\n" + "1 thumb size ginger, cut into thin strips\n" + "2 large size onion, quartered\n" + "1 medium size onion, chopped\n" + "1 tbsp. peppercorns\n" + "1 small bundle spring onion chopped\n" + "1/4 cup fish sauce\n" + "salt and pepp"
        var lanciaoProcedure="1. Clean and wash the bull organ and oxtail, place in a large pot.\n" + "2. Pour enough water to cover meat bring to a boil and let boil for 5 to 10 minutes.\n" + "3. Remove from heat and discard water, wash off all scum from the meat and return to the pot. Pour fresh water to cover meat at about 2 inches.\n" + "4. Add in the whole garlic, sliced ginger, quartered onion peppercorns and sibot mix herb.\n" + "5. Bring to a boil and simmer for 4 to 6 hours at low to moderate heat.\n" + "6. Add more water as necessary.\n" + "7. When done remove pot from heat separate the broth from the meat. Using a sieve strain off all solid residue from the broth.\n" + "8. Discard residue and keep aside broth.\n" + "9. Slice the bull organ and oxtail into thin slices.\n" + "10. Discard oxtail bones.\n" + "11. In sauce pan sauté chopped garlic, ginger and onion.\n" + "12. Add in the sliced meats and continue to stir fry for 2 to 3 minutes.\n" + "13. Add in the fish sauce and stir cook for another 1 to 2 minutes.\n" + "14. Add in the reserved broth, bring to a boil and simmer for 10 to 15 minutes.\n" + "15. Season with salt and pepper to taste.\n" + "16. Add in the chopped spring onion and cook for another minute.\n" + "17. Serve"
        myRecipes.add(Recipe("Lanciao"," it is a soup made from bull's testes or penis. The dish originates from Filipino cuisine. It is believed to have aphrodisiac properties.",R.drawable.recipe5,lanciaoIngred,lanciaoProcedure))

        var adapter = CustomeAdapter(myRecipes)
        recyclerView.adapter = adapter
    }
}
