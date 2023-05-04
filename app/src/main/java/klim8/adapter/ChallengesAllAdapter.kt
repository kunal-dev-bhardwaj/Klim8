import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.inmortal.klim8.R
import klim8.activities.challenges.CommutingChallenge
import klim8.activities.challenges.LiteBiteChallenge
import klim8.activities.challenges.ShoppingChallenge


class ChallengesAllAdapter(context: Context) :
    RecyclerView.Adapter<ChallengesAllAdapter.ViewHolder>() {
    var context: Context

    init {
        this.context = context
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.recyler_item_challenges, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val restaurantModel: RestaurantModel = list[position]
//        holder.tv_ratings.setText(restaurantModel.getRatings())
        holder.img_ic_join.setOnClickListener {
            if (position == 0) {
              context.startActivity(Intent(context,LiteBiteChallenge::class.java))
            }
            else if(position==1){
                context.startActivity(Intent(context,ShoppingChallenge::class.java))
            }
            else if(position==2){
                context.startActivity(Intent(context,CommutingChallenge::class.java))
            }
            else if(position==3){
                context.startActivity(Intent(context,LiteBiteChallenge::class.java))
            }


        }

    }

    override fun getItemCount(): Int {
        return 5
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img_ic_join: ImageView

        init {
            img_ic_join = itemView.findViewById(R.id.img_ic_join)

        }
    }
}