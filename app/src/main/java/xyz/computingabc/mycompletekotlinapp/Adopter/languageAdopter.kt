package xyz.computingabc.mycompletekotlinapp.Adopter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.list_item.view.*
import xyz.computingabc.mycompletekotlinapp.Modle.Supplier.language
import xyz.computingabc.mycompletekotlinapp.Modle.languages
import xyz.computingabc.mycompletekotlinapp.R
import xyz.computingabc.mycompletekotlinapp.R.id.root_layout
import xyz.computingabc.mycompletekotlinapp.R.id.shareImg

class LanguageAdopter(val context:Context,val Language:List<languages>):RecyclerView.Adapter<LanguageAdopter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
          val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
           return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
          return language.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
          val complanguage = Language[position]
          holder.setDate(complanguage,position)

    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var selectedLang:languages? =null
        var selectedPostion:Int = 0
        init {
            itemView.setOnClickListener {
             Toast.makeText(context,selectedLang!!.title +" Clicked",Toast.LENGTH_SHORT).show()
            }
            itemView.shareImg.setOnClickListener {
                val message:String = "I am Learning "+selectedLang!!.title+" Language Join Me"
                val share = Intent()
                share.action=Intent.ACTION_SEND
                share.putExtra(Intent.EXTRA_TEXT,message)
                share.type="text/plain"
                context.startActivity(share)
            }
        }

        fun setDate(language:languages? , pos:Int){
             itemView.title.text = language!!.title
            this.selectedLang =language
            this.selectedPostion=pos
         }
    }
}