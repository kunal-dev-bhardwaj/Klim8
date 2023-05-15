package klim8.fragment.challenge.commuting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentCommutingQuestion1Binding
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion1Binding
import klim8.fragment.challenge.litebite.LiteBiteFragmentQuestion2

class CommutingFragmentQuestion1 : Fragment() {
    lateinit var binding: FragmentCommutingQuestion1Binding
    lateinit var ft: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommutingQuestion1Binding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root
    }



    private fun onclick() {
        binding.btnContinueQuestion1.setOnClickListener{
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_commuting , CommutingFragmentQuestion2())
            ft.commit()


        }
    }
    private fun manageVisiblity(){
        binding.commutingQ1Option1.setOnClickListener {
            binding.imgCommutingQ1SelectedOption1.visibility=View.VISIBLE
            binding.imgCommutingQ1SelectedOption2.visibility=View.INVISIBLE
            binding.imgCommutingQ1SelectedOption3.visibility=View.INVISIBLE

        }
        binding.commutingQ1Option2.setOnClickListener {
            binding.imgCommutingQ1SelectedOption2.visibility=View.VISIBLE
            binding.imgCommutingQ1SelectedOption1.visibility=View.INVISIBLE
            binding.imgCommutingQ1SelectedOption3.visibility=View.INVISIBLE

        }
        binding.commutingQ1Option3.setOnClickListener {
            binding.imgCommutingQ1SelectedOption3.visibility=View.VISIBLE
            binding.imgCommutingQ1SelectedOption2.visibility=View.INVISIBLE
            binding.imgCommutingQ1SelectedOption1.visibility=View.INVISIBLE

        }



    }


}