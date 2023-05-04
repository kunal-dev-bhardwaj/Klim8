package klim8.fragment.reward

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inmortal.klim8.databinding.FragmentRewardHistoryBinding
import klim8.adapter.RewardHistoryAdapter


class RewardHistoryFragment : Fragment() {
    lateinit var binding: FragmentRewardHistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRewardHistoryBinding.inflate(inflater, container, false)
        binding.rvRewardHistory.adapter=RewardHistoryAdapter(requireContext())
        return binding.root
    }


}