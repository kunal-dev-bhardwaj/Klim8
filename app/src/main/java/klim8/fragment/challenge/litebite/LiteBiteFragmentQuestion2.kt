package klim8.fragment.challenge.litebite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion1Binding
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion2Binding


class LiteBiteFragmentQuestion2 : Fragment() {
    lateinit var binding: FragmentLiteBiteQuestion2Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLiteBiteQuestion2Binding.inflate(inflater,container,false)
        onclick()
        manageVisiblity()
        return binding.root
    }
    private fun onclick() {
        binding.btnContinueQ2.setOnClickListener{
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_litebite , LiteBiteFragmentQuestion3())
            ft.commit()


        }
    }
    private fun manageVisiblity(){
        binding.foodQ2Option1.setOnClickListener {
            binding.imgFoodQ2SelectedOption1.visibility=View.VISIBLE
            binding.imgFoodQ2SelectedOption2.visibility=View.INVISIBLE
            binding.imgFoodQ2SelectedOption3.visibility=View.INVISIBLE

        }
        binding.foodQ2Option2.setOnClickListener {
            binding.imgFoodQ2SelectedOption2.visibility=View.VISIBLE
            binding.imgFoodQ2SelectedOption1.visibility=View.INVISIBLE
            binding.imgFoodQ2SelectedOption3.visibility=View.INVISIBLE

        }
        binding.foodQ2Option3.setOnClickListener {
            binding.imgFoodQ2SelectedOption3.visibility=View.VISIBLE
            binding.imgFoodQ2SelectedOption2.visibility=View.INVISIBLE
            binding.imgFoodQ2SelectedOption1.visibility=View.INVISIBLE

        }



    }

}