package klim8.fragment.navi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentRewardBinding
import com.inmortal.klim8.databinding.FragmentShoppingQuestion2Binding
import klim8.fragment.reward.RedeemNowFragment
import klim8.fragment.reward.RewardHistoryFragment


class RewardFragment : Fragment() {
lateinit var binding:FragmentRewardBinding
lateinit var fragReplace:FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentRewardBinding.inflate(layoutInflater,container,false)
        binding.cvRewardHistory.setOnClickListener {
            fragReplace(RewardHistoryFragment())


        }
        binding.cvRedeemNow.setOnClickListener {
            fragReplace(RedeemNowFragment())
        }
        binding.cvRewardHistory.setOnClickListener {
            fragReplace(RewardHistoryFragment())
        }
        return binding.root
    }
    private fun fragReplace(fragment: Fragment){
        fragReplace=requireFragmentManager().beginTransaction()
        fragReplace.replace(R.id.frame_main,fragment)
        fragReplace.commit()



    }


}