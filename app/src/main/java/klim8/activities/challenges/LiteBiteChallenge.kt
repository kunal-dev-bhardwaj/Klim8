package klim8.activities.challenges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityLiteBiteChallengeBinding
import klim8.fragment.challenge.litebite.LiteBiteQuestion1Fragment

class LiteBiteChallenge : AppCompatActivity() {
    lateinit var binding:ActivityLiteBiteChallengeBinding
    lateinit var fragReplace:FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLiteBiteChallengeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragReplace = supportFragmentManager.beginTransaction()
        fragReplace.replace(R.id.frame_challenge_litebite,LiteBiteQuestion1Fragment())
        fragReplace.commit()
    }
}