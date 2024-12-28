package Card2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelx.R

class myAdapter2(val itemList2 : ArrayList<itemData2>): RecyclerView.Adapter<myAdapter2.myViewHolder2>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ): myViewHolder2 {

        val v2 = LayoutInflater.from(parent.context)
            .inflate(R.layout.card2_layout,parent,false)
        return myViewHolder2(v2)
    }

    override fun onBindViewHolder(holder: myViewHolder2, position: Int) {

        holder.namecountry.setText(itemList2[position].NameCountry)
        holder.backImg.setImageResource(itemList2[position].backImg)
        holder.StarImg.setImageResource(itemList2[position].starImg)
    }

    override fun getItemCount(): Int {
        return itemList2.size
    }

    inner class myViewHolder2(itemView2: View): RecyclerView.ViewHolder(itemView2)
    {
        var namecountry : TextView
        var backImg : ImageView
        var StarImg : ImageView

        init {
            namecountry = itemView2.findViewById<TextView>(R.id.NameCountry)
            backImg = itemView2.findViewById<ImageView>(R.id.backImg)
            StarImg = itemView2.findViewById<ImageView>(R.id.starImg)
        }
    }
}