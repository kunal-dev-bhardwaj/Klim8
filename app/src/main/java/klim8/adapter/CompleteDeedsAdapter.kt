package klim8.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inmortal.klim8.R


class CompleteDeedsAdapter(var context: Context) :
    RecyclerView.Adapter<CompleteDeedsAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.recyler_item_complete_deeds, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}