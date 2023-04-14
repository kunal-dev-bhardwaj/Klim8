package klim8.activities.viewmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.inmortal.klim8.databinding.ActivityViewMoreYoutubeVideoBinding


class ViewMoreYoutubeVideoActivity : AppCompatActivity(){
    lateinit var binding: ActivityViewMoreYoutubeVideoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewMoreYoutubeVideoBinding.inflate(layoutInflater)
        setUpAdapter()
        setContentView(binding.root)
    }

    private fun setUpAdapter() {
        binding.rvYtvideoViewmore.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.VERTICAL, false
        )
        binding.rvYtvideoViewmore.adapter= ViewMoreYoutubeVideoAdapter(this)

    }


}