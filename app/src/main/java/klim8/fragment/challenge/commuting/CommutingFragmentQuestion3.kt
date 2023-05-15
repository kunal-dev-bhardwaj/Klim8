package klim8.fragment.challenge.commuting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentCommutingQuestion2Binding
import com.inmortal.klim8.databinding.FragmentCommutingQuestion3Binding


class CommutingFragmentQuestion3 : Fragment() {

    lateinit var binding: FragmentCommutingQuestion3Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommutingQuestion3Binding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root
    }
    private fun onclick() {
        binding.btnContinueQuestion1.setOnClickListener{
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_commuting , CommutingFragmentQuestion4())
            ft.commit()


        }
    }
    private fun manageVisiblity(){
        binding.commutingQ3Option1.setOnClickListener {
            binding.imgCommutingQ3SelectedOption1.visibility=View.VISIBLE
            binding.imgCommutingQ3SelectedOption2.visibility=View.INVISIBLE


        }
        binding.commutingQ3Option2.setOnClickListener {
            binding.imgCommutingQ3SelectedOption2.visibility=View.VISIBLE
            binding.imgCommutingQ3SelectedOption1.visibility=View.INVISIBLE


        }




    }


}