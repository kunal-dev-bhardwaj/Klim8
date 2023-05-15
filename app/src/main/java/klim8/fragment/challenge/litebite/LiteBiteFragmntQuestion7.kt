package klim8.fragment.challenge.litebite

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentLiteBiteFragmntQuestion7Binding
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion6Binding
import klim8.activities.QuesAnsActivity

class LiteBiteFragmntQuestion7 : Fragment() {
    lateinit var binding: FragmentLiteBiteFragmntQuestion7Binding
    lateinit var ft: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLiteBiteFragmntQuestion7Binding.inflate(inflater, container, false)
        onclick()
        manageVisiblity()
        return binding.root
    }

    private fun onclick() {
        binding.btnContinueQ7.setOnClickListener {
            startActivity(Intent(activity,QuesAnsActivity::class.java))


        }
    }
    private fun manageVisiblity(){
        binding.foodQ7Option1.setOnClickListener {
            binding.imgFoodQ7SelectedOption1.visibility=View.VISIBLE
            binding.imgFoodQ7SelectedOption2.visibility=View.INVISIBLE
            binding.imgFoodQ7SelectedOption3.visibility=View.INVISIBLE

        }
        binding.foodQ7Option2.setOnClickListener {
            binding.imgFoodQ7SelectedOption2.visibility=View.VISIBLE
            binding.imgFoodQ7SelectedOption1.visibility=View.INVISIBLE
            binding.imgFoodQ7SelectedOption3.visibility=View.INVISIBLE

        }
        binding.foodQ7Option3.setOnClickListener {
            binding.imgFoodQ7SelectedOption3.visibility=View.VISIBLE
            binding.imgFoodQ7SelectedOption2.visibility=View.INVISIBLE
            binding.imgFoodQ7SelectedOption1.visibility=View.INVISIBLE

        }



    }
}