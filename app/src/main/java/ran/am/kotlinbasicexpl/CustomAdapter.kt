package ran.am.kotlinbasicexpl

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ran.am.kotlinbasicexpl.databinding.CardViewDesignBinding

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>()
{
    inner class ViewHolder(val binding: CardViewDesignBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            CardViewDesignBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        holder.binding.imageview.setImageResource(ItemsViewModel.image)
        holder.binding.textView.text = ItemsViewModel.text

    }

    override fun getItemCount(): Int {
        return mList.size
    }}

data class ItemsViewModel(val image: Int, val text: String) {
}

