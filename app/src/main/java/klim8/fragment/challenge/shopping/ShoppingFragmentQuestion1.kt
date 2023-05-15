package klim8.fragment.challenge.shopping

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion1Binding
import com.inmortal.klim8.databinding.FragmentShoppingQuestion1Binding


class ShoppingFragmentQuestion1 : Fragment() {
    lateinit var binding: FragmentShoppingQuestion1Binding
    lateinit var fragReplace:FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentShoppingQuestion1Binding.inflate(layoutInflater,container,false)
        onClick()
        manageVisiblity()
        return binding.root
    }
    private fun onClick(){
        binding.btnContinueShopQ1.setOnClickListener {
            fragReplace=requireFragmentManager().beginTransaction()
            fragReplace.replace(R.id.frame_challenge_shopping,ShoppingFragmentQuestion2())
            fragReplace.commit()

        }


    }
    private fun manageVisiblity(){
        binding.shoppingQ1Option1.setOnClickListener {
            binding.imgShoppingQ1SelectedOption1.visibility=View.VISIBLE
            binding.imgShoppingQ1SelectedOption2.visibility=View.INVISIBLE
            binding.imgShoppingQ1SelectedOption3.visibility=View.INVISIBLE

        }
        binding.shoppingQ1Option2.setOnClickListener {
            binding.imgShoppingQ1SelectedOption2.visibility=View.VISIBLE
            binding.imgShoppingQ1SelectedOption1.visibility=View.INVISIBLE
            binding.imgShoppingQ1SelectedOption3.visibility=View.INVISIBLE

        }
        binding.shoppingQ1Option3.setOnClickListener {
            binding.imgShoppingQ1SelectedOption3.visibility=View.VISIBLE
            binding.imgShoppingQ1SelectedOption2.visibility=View.INVISIBLE
            binding.imgShoppingQ1SelectedOption1.visibility=View.INVISIBLE

        }



    }

}