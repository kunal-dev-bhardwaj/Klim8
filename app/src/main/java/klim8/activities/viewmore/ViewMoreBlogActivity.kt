package klim8.activities.viewmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityViewMoreBlogBinding

class ViewMoreBlogActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewMoreBlogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewMoreBlogBinding.inflate(layoutInflater)
        binding.rvLatestBlogViewMore.adapter=ViewMoreBlogAdapter(this)

        setContentView(binding.root)
    }

}