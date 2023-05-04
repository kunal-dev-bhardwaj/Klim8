package klim8.fragment.reward

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentRedeemNowBinding
import klim8.adapter.RedeemNowAdapter

class RedeemNowFragment : Fragment() {
    lateinit var binding: FragmentRedeemNowBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRedeemNowBinding.inflate(inflater,container,false)
//        binding.rvRedeemMain.layoutManager=LinearLayoutManager
        binding.rvRedeemMain.adapter = RedeemNowAdapter(requireContext())
        return binding.root
    }


}