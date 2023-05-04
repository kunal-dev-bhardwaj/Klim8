package klim8.fragment.challenge.shopping

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentShoppingQuestion2Binding
import com.inmortal.klim8.databinding.FragmentShoppingQuestion3Binding


class ShoppingFragmentQuestion3 : Fragment() {
    lateinit var binding: FragmentShoppingQuestion3Binding
    lateinit var fragReplace: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentShoppingQuestion3Binding.inflate(layoutInflater,container,false)
        onClick()
        return binding.root
    }
    private fun onClick() {
        binding.btnContinueShopQ3.setOnClickListener {
            fragReplace = requireFragmentManager().beginTransaction()
            fragReplace.replace(R.id.frame_challenge_shopping, ShoppingFragmentQuestion4())
            fragReplace.commit()

        }
    }

}