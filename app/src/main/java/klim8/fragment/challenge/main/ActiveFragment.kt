package klim8.fragment.challenge.main

import ChallengesActiveAdapter
import ChallengesAllAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.inmortal.klim8.databinding.FragmentActive2Binding


class ActiveFragment : Fragment() {
    lateinit var binding: FragmentActive2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentActive2Binding.inflate(inflater,container,false)

        setUpAdapter()
        return binding.root
    }
    private fun setUpAdapter() {

        binding.rvCtiveFrag.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvCtiveFrag.adapter=ChallengesActiveAdapter(requireContext())


    }


}