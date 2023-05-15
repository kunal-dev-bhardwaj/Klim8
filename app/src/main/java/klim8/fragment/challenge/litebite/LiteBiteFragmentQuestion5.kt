package klim8.fragment.challenge.litebite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion4Binding
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion5Binding


class LiteBiteFragmentQuestion5 : Fragment() {

    lateinit var binding: FragmentLiteBiteQuestion5Binding
    lateinit var ft: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLiteBiteQuestion5Binding.inflate(inflater, container, false)
        onclick()
        manageVisiblity()
        return binding.root
    }

    private fun onclick() {
        binding.btnContinueQ5.setOnClickListener {
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_litebite, LiteBiteFragmentQuestion6())
            ft.commit()


        }

    }
    private fun manageVisiblity(){
        binding.foodQ5Option1.setOnClickListener {
            binding.imgFoodQ5SelectedOption1.visibility=View.VISIBLE
            binding.imgFoodQ5SelectedOption2.visibility=View.INVISIBLE
            binding.imgFoodQ5SelectedOption3.visibility=View.INVISIBLE

        }
        binding.foodQ5Option2.setOnClickListener {
            binding.imgFoodQ5SelectedOption2.visibility=View.VISIBLE
            binding.imgFoodQ5SelectedOption1.visibility=View.INVISIBLE
            binding.imgFoodQ5SelectedOption3.visibility=View.INVISIBLE

        }
        binding.foodQ5Option3.setOnClickListener {
            binding.imgFoodQ5SelectedOption3.visibility=View.VISIBLE
            binding.imgFoodQ5SelectedOption2.visibility=View.INVISIBLE
            binding.imgFoodQ5SelectedOption1.visibility=View.INVISIBLE

        }



    }
}