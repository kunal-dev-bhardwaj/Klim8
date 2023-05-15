package klim8.fragment.challenge.commuting

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentCommutingQuestion5Binding
import com.inmortal.klim8.databinding.FragmentCommutingQuestion6Binding
import klim8.activities.QuesAnsActivity


class CommutingFragmentQuestion6 : Fragment() {

    lateinit var binding: FragmentCommutingQuestion6Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommutingQuestion6Binding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root
    }
    private fun onclick() {
        binding.btnContinueQuestion1.setOnClickListener{
          startActivity(Intent(context,QuesAnsActivity::class.java))


        }
    }
    private fun manageVisiblity(){
        binding.commutingQ6Option1.setOnClickListener {
            binding.imgCommutingQ6SelectedOption1.visibility=View.VISIBLE
            binding.imgCommutingQ6SelectedOption2.visibility=View.INVISIBLE
            binding.imgCommutingQ6SelectedOption3.visibility=View.INVISIBLE


        }
        binding.commutingQ6Option2.setOnClickListener {
            binding.imgCommutingQ6SelectedOption2.visibility=View.VISIBLE
            binding.imgCommutingQ6SelectedOption1.visibility=View.INVISIBLE
            binding.imgCommutingQ6SelectedOption3.visibility=View.INVISIBLE


        }
        binding.commutingQ6Option3.setOnClickListener {
            binding.imgCommutingQ6SelectedOption3.visibility=View.VISIBLE
            binding.imgCommutingQ6SelectedOption1.visibility=View.INVISIBLE
            binding.imgCommutingQ6SelectedOption2.visibility=View.INVISIBLE


        }




    }


}