package julius.barde.com.recipelist

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

/**
 * Created by JBluee on 12/8/2017.
 */
class CustomeAdapter(val recipeList:ArrayList<Recipe>) : RecyclerView.Adapter<CustomeAdapter.ViewHolder>(){


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
    val recipe: Recipe = recipeList[position]
        holder?.name?.text = recipe.name
        holder?.description?.text =recipe.description

holder?.name?.setOnClickListener(object: View.OnClick{
         fun onClick(v: View){
       Toast.makeText(this,"success",Toast.LENGTH_LONG).show()
    }
}

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.activity_list,parent,false)
        return ViewHolder(v)
    }qwsqqweqwqeqq

    override fun getItemCount(): Int {
        return recipeList.size
    }

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
     val name = itemView.findViewById<TextView>(R.id.recipeTV)
     val description = itemView.findViewById<TextView>(R.id.descriptionTV)
    }
}