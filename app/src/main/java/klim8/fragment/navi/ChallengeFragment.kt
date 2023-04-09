package klim8.fragment.navi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentChallengeBinding

import klim8.fragment.challenge.AllFragment


class ChallengeFragment : Fragment() {
    lateinit var binding: FragmentChallengeBinding
    private lateinit var fragreplace: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentChallengeBinding.inflate(inflater, container, false)

        fragReplace(AllFragment())



        onCLick()

        return binding.root
    }
    private fun onCLick(){
        binding.cvAllGreen.setOnClickListener{
            fragReplace(AllFragment())

        }
    }

    private fun fragReplace( fragment: Fragment){
        fragreplace = fragmentManager?.beginTransaction()!!
        fragreplace.replace(R.id.frame_challange, fragment)
        fragreplace.commit()


    }



}