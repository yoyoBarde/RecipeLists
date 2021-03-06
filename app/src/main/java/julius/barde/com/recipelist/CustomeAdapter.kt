package julius.barde.com.recipelist

import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * Created by JBluee on 12/8/2017.
 */
class CustomeAdapter(val recipeList:ArrayList<Recipe>) : RecyclerView.Adapter<CustomeAdapter.ViewHolder>(){
    companion object {
        val KEY_PASS = "123"
    }
    override fun getItemCount(): Int {
        return recipeList.size
    }

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.recipeTV)
        val description = itemView.findViewById<TextView>(R.id.descriptionTV)
        val cardView = itemView.findViewById<CardView>(R.id.cardView)
    }
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.activity_list,parent,false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
    val recipe: Recipe = recipeList[position]
        holder?.name?.text = recipe.name
        holder?.description?.text =recipe.description

        holder?.cardView?.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View){
                val myIntent = Intent(v.context, RecipeDetailsActivity::class.java)
                myIntent.putExtra("123", recipe)
                v.context.startActivity(myIntent)
            }

        })

    }






}
