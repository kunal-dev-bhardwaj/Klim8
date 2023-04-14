package klim8.activities.viewmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityReadMoreClimateGamesBinding

class ReadMoreClimateGamesActivity : AppCompatActivity() {
    lateinit var binding: ActivityReadMoreClimateGamesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityReadMoreClimateGamesBinding.inflate(layoutInflater)
        setUpAdapter()
        setContentView(binding.root)
    }
    private fun setUpAdapter(){
        binding.rvReadmoreGame.adapter=ReadMoreClimateGsamesAdapter(this)
    }
}