package klim8.fragment.navi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentChallengeBinding
import klim8.fragment.challenge.main.ActiveFragment

import klim8.fragment.challenge.main.AllFragment
import klim8.fragment.challenge.main.EndedFragment


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

        binding.cvAllWhite.setOnClickListener{
            fragReplace(AllFragment())
            binding.cvAllGreen.visibility=View.VISIBLE
            binding.cvAllWhite.visibility=View.INVISIBLE
            binding.cvActiveWhite.visibility=View.VISIBLE
            binding.cvEndedWhite.visibility=View.VISIBLE
            binding.cvEndedGreen.visibility=View.INVISIBLE

        }


        binding.cvActiveWhite.setOnClickListener{
            fragReplace(ActiveFragment())
            binding.cvAllWhite.visibility=View.VISIBLE
            binding.cvAllGreen.visibility= View.INVISIBLE
            binding.cvActiveWhite.visibility=View.INVISIBLE
            binding.cvActiveGreen.visibility=View.VISIBLE
            binding.cvEndedWhite.visibility=View.VISIBLE
            binding.cvEndedGreen.visibility=View.INVISIBLE


        }

        binding.cvEndedWhite.setOnClickListener{
            fragReplace(EndedFragment())
            binding.cvEndedGreen.visibility=View.VISIBLE
            binding.cvEndedWhite.visibility=View.INVISIBLE
            binding.cvAllGreen.visibility=View.INVISIBLE
            binding.cvAllWhite.visibility=View.VISIBLE
            binding.cvActiveWhite.visibility=View.VISIBLE
            binding.cvActiveGreen.visibility=View.INVISIBLE
        }

    }

    private fun fragReplace( fragment: Fragment){
        fragreplace = fragmentManager?.beginTransaction()!!
        fragreplace.replace(R.id.frame_challange, fragment)
        fragreplace.commit()


    }



}