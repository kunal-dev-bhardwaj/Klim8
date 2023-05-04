
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inmortal.klim8.R


class ChallengesEndedAdapter(context: Context) :
    RecyclerView.Adapter<ChallengesEndedAdapter.ViewHolder>() {
    var context:Context
   init {
       this.context=context
   }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.recycler_item_ended, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val restaurantModel: RestaurantModel = list[position]
//        holder.tv_ratings.setText(restaurantModel.getRatings())
//        holder.location_add.setText(restaurantModel.getRestaurantAddress())
//        holder.location_name.setText(restaurantModel.getRestaurantName())
    }

    override fun getItemCount(): Int {
        return 1
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var location_name: TextView
//        var location_add: TextView
//        var tv_ratings: TextView

        init {
//            location_add = itemView.findViewById(R.id.location_add)
//            location_name = itemView.findViewById(R.id.location_name)
//            tv_ratings = itemView.findViewById(R.id.tv_ratings_no)
        }
    }
}