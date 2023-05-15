package klim8.fragment.challenge.litebite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion2Binding
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion3Binding


class LiteBiteFragmentQuestion3 : Fragment() {
    lateinit var binding: FragmentLiteBiteQuestion3Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLiteBiteQuestion3Binding.inflate(inflater, container, false)
        onclick()
        manageVisiblity()
        return binding.root
    }

    private fun onclick() {
        binding.btnContinueQ3.setOnClickListener {
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_litebite, LiteBiteFragmentQuestion4())
            ft.commit()


        }

    }
    private fun manageVisiblity(){
        binding.foodQ3Option1.setOnClickListener {
            binding.imgFoodQ3SelectedOption1.visibility=View.VISIBLE
            binding.imgFoodQ3SelectedOption2.visibility=View.INVISIBLE
            binding.imgFoodQ3SelectedOption3.visibility=View.INVISIBLE

        }
        binding.foodQ3Option2.setOnClickListener {
            binding.imgFoodQ3SelectedOption2.visibility=View.VISIBLE
            binding.imgFoodQ3SelectedOption1.visibility=View.INVISIBLE
            binding.imgFoodQ3SelectedOption3.visibility=View.INVISIBLE

        }
        binding.foodQ3Option3.setOnClickListener {
            binding.imgFoodQ3SelectedOption3.visibility=View.VISIBLE
            binding.imgFoodQ3SelectedOption2.visibility=View.INVISIBLE
            binding.imgFoodQ3SelectedOption1.visibility=View.INVISIBLE

        }



    }
}