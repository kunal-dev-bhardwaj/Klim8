package klim8.fragment.challenge.commuting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentCommutingQuestion3Binding
import com.inmortal.klim8.databinding.FragmentCommutingQuestion4Binding

class CommutingFragmentQuestion4 : Fragment() {


    lateinit var binding: FragmentCommutingQuestion4Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommutingQuestion4Binding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root
    }
    private fun onclick() {
        binding.btnContinueQuestion1.setOnClickListener{
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_commuting , CommutingFragmentQuestion5())
            ft.commit()


        }
    }
    private fun manageVisiblity(){
        binding.commutingQ4Option1.setOnClickListener {
            binding.imgCommutingQ4SelectedOption1.visibility=View.VISIBLE
            binding.imgCommutingQ4SelectedOption2.visibility=View.INVISIBLE
            binding.imgCommutingQ4SelectedOption3.visibility=View.INVISIBLE


        }
        binding.commutingQ4Option2.setOnClickListener {
            binding.imgCommutingQ4SelectedOption2.visibility=View.VISIBLE
            binding.imgCommutingQ4SelectedOption1.visibility=View.INVISIBLE
            binding.imgCommutingQ4SelectedOption3.visibility=View.INVISIBLE


        }
        binding.commutingQ4Option3.setOnClickListener {
            binding.imgCommutingQ4SelectedOption3.visibility=View.VISIBLE
            binding.imgCommutingQ4SelectedOption1.visibility=View.INVISIBLE
            binding.imgCommutingQ4SelectedOption2.visibility=View.INVISIBLE


        }




    }


}