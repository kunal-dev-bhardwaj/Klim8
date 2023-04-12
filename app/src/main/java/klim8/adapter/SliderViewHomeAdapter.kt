package klim8.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inmortal.klim8.R
import com.smarteist.autoimageslider.SliderViewAdapter

class SliderViewHomeAdapter(context: Context) :
    SliderViewAdapter<SliderViewHomeAdapter.SliderAdapterViewHolder>() {
    var context: Context

    init {
        this.context = context

    }

    override fun getCount(): Int {
        return 5
    }

    override fun onCreateViewHolder(parent: ViewGroup?): SliderAdapterViewHolder {
        return SliderAdapterViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.recycler_item_sliderview_home, parent, false)
        )
    }

    override fun onBindViewHolder(viewHolder: SliderAdapterViewHolder?, position: Int) {

    }

    class SliderAdapterViewHolder(item: View) : SliderViewAdapter.ViewHolder(item) {

    }
}