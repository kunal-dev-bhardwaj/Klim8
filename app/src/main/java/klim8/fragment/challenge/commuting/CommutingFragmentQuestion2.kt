package klim8.fragment.challenge.commuting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentCommutingQuestion1Binding
import com.inmortal.klim8.databinding.FragmentCommutingQuestion2Binding

class CommutingFragmentQuestion2 : Fragment() {

    lateinit var binding: FragmentCommutingQuestion2Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommutingQuestion2Binding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root
    }
    private fun onclick() {
        binding.btnContinueQuestion1.setOnClickListener{
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_commuting , CommutingFragmentQuestion3())
            ft.commit()


        }
    }
    private fun manageVisiblity(){
        binding.commutingQ2Option1.setOnClickListener {
            binding.imgCommutingQ2SelectedOption1.visibility=View.VISIBLE
            binding.imgCommutingQ2SelectedOption2.visibility=View.INVISIBLE
            binding.imgCommutingQ2SelectedOption3.visibility=View.INVISIBLE

        }
        binding.commutingQ2Option2.setOnClickListener {
            binding.imgCommutingQ2SelectedOption2.visibility=View.VISIBLE
            binding.imgCommutingQ2SelectedOption1.visibility=View.INVISIBLE
            binding.imgCommutingQ2SelectedOption3.visibility=View.INVISIBLE

        }
        binding.commutingQ2Option3.setOnClickListener {
            binding.imgCommutingQ2SelectedOption3.visibility=View.VISIBLE
            binding.imgCommutingQ2SelectedOption2.visibility=View.INVISIBLE
            binding.imgCommutingQ2SelectedOption1.visibility=View.INVISIBLE

        }



    }


}