package klim8.fragment.challenge.commuting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentCommutingQuestion4Binding
import com.inmortal.klim8.databinding.FragmentCommutingQuestion5Binding


class CommutingFragmentQuestion5 : Fragment() {
    lateinit var binding: FragmentCommutingQuestion5Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommutingQuestion5Binding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root
    }
    private fun onclick() {
        binding.btnContinueQuestion1.setOnClickListener{
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_commuting , CommutingFragmentQuestion6())
            ft.commit()


        }
    }
    private fun manageVisiblity(){
        binding.commutingQ5Option1.setOnClickListener {
            binding.imgCommutingQ5SelectedOption1.visibility=View.VISIBLE
            binding.imgCommutingQ5SelectedOption2.visibility=View.INVISIBLE
            binding.imgCommutingQ5SelectedOption3.visibility=View.INVISIBLE


        }
        binding.commutingQ5Option2.setOnClickListener {
            binding.imgCommutingQ5SelectedOption2.visibility=View.VISIBLE
            binding.imgCommutingQ5SelectedOption1.visibility=View.INVISIBLE
            binding.imgCommutingQ5SelectedOption3.visibility=View.INVISIBLE
            binding.imgCommutingQ5SelectedOption4.visibility=View.INVISIBLE


        }
        binding.commutingQ5Option3.setOnClickListener {
            binding.imgCommutingQ5SelectedOption3.visibility=View.VISIBLE
            binding.imgCommutingQ5SelectedOption1.visibility=View.INVISIBLE
            binding.imgCommutingQ5SelectedOption2.visibility=View.INVISIBLE
            binding.imgCommutingQ5SelectedOption4.visibility=View.INVISIBLE


        }
        binding.commutingQ5Option4.setOnClickListener {
            binding.imgCommutingQ5SelectedOption4.visibility=View.VISIBLE
            binding.imgCommutingQ5SelectedOption1.visibility=View.INVISIBLE
            binding.imgCommutingQ5SelectedOption2.visibility=View.INVISIBLE
            binding.imgCommutingQ5SelectedOption3.visibility=View.INVISIBLE


        }




    }


}