package klim8.activities.viewmore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inmortal.klim8.R

class ViewMoreYoutubeVideoAdapter(context:Context):
    RecyclerView.Adapter<ViewMoreYoutubeVideoAdapter.ViewHolder>() {
    var context:Context
    init {
        this.context=context
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(context)
           .inflate(R.layout.recyler_item_viewmore_ytvideo,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
      return 5
    }
}