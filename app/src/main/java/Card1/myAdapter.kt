package Card1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelx.R

class myAdapter(val itemList : ArrayList<itemData>): RecyclerView.Adapter<myAdapter.myViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ): myViewHolder
    {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view,parent,false)
        return myViewHolder(v)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int, )
    {
        holder.name.setText(itemList[position].name)
        holder.Img.setImageResource(itemList[position].Imag)
    }

    override fun getItemCount(): Int {
      return itemList.size
    }

    inner class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var name : TextView
        var Img : ImageView

        init {
            name = itemView.findViewById<TextView>(R.id.name)
            Img = itemView.findViewById<ImageView>(R.id.img)
        }
    }


}