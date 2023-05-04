package klim8.activities.challenges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityShoppingChallengeBinding
import klim8.fragment.challenge.shopping.ShoppingFragmentQuestion1

class ShoppingChallenge : AppCompatActivity() {
    lateinit var binding:ActivityShoppingChallengeBinding
    lateinit var fragReplace:FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_challenge)
        fragReplace=supportFragmentManager.beginTransaction()
        fragReplace.replace(R.id.frame_challenge_shopping,ShoppingFragmentQuestion1())
        fragReplace.commit()

    }
}