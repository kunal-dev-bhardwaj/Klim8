package klim8.fragment.challenge

import ChallengesAllAdapter
import ChallengesEndedAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.inmortal.klim8.databinding.FragmentAllFargmentBinding
import com.inmortal.klim8.databinding.FragmentEnded2Binding


class EndedFragment : Fragment() {
    lateinit var binding: FragmentEnded2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentEnded2Binding.inflate(inflater,container,false)

        setUpAdapter()
        return binding.root
    }
    private fun setUpAdapter() {

        binding.rvEndedFrag.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, true)
        binding.rvEndedFrag.adapter=ChallengesEndedAdapter(requireContext())


    }


}