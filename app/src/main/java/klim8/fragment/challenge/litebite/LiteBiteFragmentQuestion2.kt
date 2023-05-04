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
        return binding.root
    }
    private fun onclick() {
        binding.btnContinueQ2.setOnClickListener{
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_litebite , LiteBiteFragmentQuestion3())
            ft.commit()


        }
    }

}