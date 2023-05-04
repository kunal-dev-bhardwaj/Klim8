package klim8.fragment.challenge.main

import ChallengesAllAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.inmortal.klim8.databinding.FragmentAllFargmentBinding


class AllFragment : Fragment() {
  lateinit var binding: FragmentAllFargmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentAllFargmentBinding.inflate(inflater,container,false)

        setUpAdapter()
        return binding.root
    }
    private fun setUpAdapter() {

        binding.rvAllFrag.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false )
        binding.rvAllFrag.adapter=ChallengesAllAdapter(requireContext())


    }


}