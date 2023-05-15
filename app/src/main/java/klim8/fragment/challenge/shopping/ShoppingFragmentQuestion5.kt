package klim8.fragment.challenge.shopping

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentShoppingQuestion5Binding


class ShoppingFragmentQuestion5 : Fragment() {
    lateinit var binding: FragmentShoppingQuestion5Binding
    lateinit var fragReplace: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentShoppingQuestion5Binding.inflate(layoutInflater,container,false)
        onClick()
        manageVisiblity()
        return binding.root

    }
    private fun onClick() {
        binding.btnContinueShopQ5.setOnClickListener {
            fragReplace = requireFragmentManager().beginTransaction()
            fragReplace.replace(R.id.frame_challenge_shopping, ShoppingFragmentQuestion6())
            fragReplace.commit()

        }
    }
    private fun manageVisiblity(){
        binding.shoppingQ5Option1.setOnClickListener {
            binding.imgShoppingQ5selectedOption1.visibility=View.VISIBLE
            binding.imgShoppingQ5selectedOption2.visibility=View.INVISIBLE
            binding.imgShoppingQ5selectedOption3.visibility=View.INVISIBLE

        }
        binding.shoppingQ5Option2.setOnClickListener {
            binding.imgShoppingQ5selectedOption2.visibility=View.VISIBLE
            binding.imgShoppingQ5selectedOption1.visibility=View.INVISIBLE
            binding.imgShoppingQ5selectedOption3.visibility=View.INVISIBLE

        }
        binding.shoppingQ5Option3.setOnClickListener {
            binding.imgShoppingQ5selectedOption3.visibility=View.VISIBLE
            binding.imgShoppingQ5selectedOption2.visibility=View.INVISIBLE
            binding.imgShoppingQ5selectedOption1.visibility=View.INVISIBLE

        }



    }

}