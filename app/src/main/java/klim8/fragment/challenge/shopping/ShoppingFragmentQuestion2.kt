package klim8.fragment.challenge.shopping

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentShoppingQuestion1Binding
import com.inmortal.klim8.databinding.FragmentShoppingQuestion2Binding

class ShoppingFragmentQuestion2 : Fragment() {
    lateinit var binding: FragmentShoppingQuestion2Binding
    lateinit var fragReplace: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentShoppingQuestion2Binding.inflate(layoutInflater,container,false)
        onClick()
        return binding.root
    }
    private fun onClick() {
        binding.btnContinueShopQ2.setOnClickListener {
            fragReplace = requireFragmentManager().beginTransaction()
            fragReplace.replace(R.id.frame_challenge_shopping, ShoppingFragmentQuestion3())
            fragReplace.commit()

        }
    }

}