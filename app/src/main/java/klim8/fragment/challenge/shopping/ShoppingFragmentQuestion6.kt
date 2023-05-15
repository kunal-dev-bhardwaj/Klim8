package klim8.fragment.challenge.shopping

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentShoppingQuestion5Binding
import com.inmortal.klim8.databinding.FragmentShoppingQuestion6Binding


class ShoppingFragmentQuestion6 : Fragment() {
    lateinit var binding: FragmentShoppingQuestion6Binding
    lateinit var fragReplace: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentShoppingQuestion6Binding.inflate(layoutInflater,container,false)
        onClick()
        manageVisiblity()
        return binding.root

    }
    private fun onClick() {
        binding.btnContinueShopQ6.setOnClickListener {
            fragReplace = requireFragmentManager().beginTransaction()
            fragReplace.replace(R.id.frame_challenge_shopping, ShoppingFragmentQuestion7())
            fragReplace.commit()

        }
    }
    private fun manageVisiblity(){
        binding.shoppingQ6Option1.setOnClickListener {
            binding.imgShoppingQ6SelectedOption1.visibility=View.VISIBLE
            binding.imgShoppingQ6SelectedOption2.visibility=View.INVISIBLE
            binding.imgShoppingQ6SelectedOption3.visibility=View.INVISIBLE

        }
        binding.shoppingQ6Option2.setOnClickListener {
            binding.imgShoppingQ6SelectedOption2.visibility=View.VISIBLE
            binding.imgShoppingQ6SelectedOption1.visibility=View.INVISIBLE
            binding.imgShoppingQ6SelectedOption3.visibility=View.INVISIBLE

        }
        binding.shoppingQ6Option3.setOnClickListener {
            binding.imgShoppingQ6SelectedOption3.visibility=View.VISIBLE
            binding.imgShoppingQ6SelectedOption2.visibility=View.INVISIBLE
            binding.imgShoppingQ6SelectedOption1.visibility=View.INVISIBLE

        }



    }

}