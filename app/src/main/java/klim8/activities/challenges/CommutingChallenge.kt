package klim8.activities.challenges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityCommutingChallengeBinding
import com.inmortal.klim8.databinding.ActivityLiteBiteChallengeBinding
import klim8.fragment.challenge.commuting.CommutingFragmentQuestion1
import klim8.fragment.challenge.litebite.LiteBiteQuestion1Fragment

class CommutingChallenge : AppCompatActivity() {
    lateinit var binding:ActivityCommutingChallengeBinding
    lateinit var fragReplace:FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCommutingChallengeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragReplace = supportFragmentManager.beginTransaction()
        fragReplace.replace(R.id.frame_challenge_commuting, CommutingFragmentQuestion1())
        fragReplace.commit()
    }
}