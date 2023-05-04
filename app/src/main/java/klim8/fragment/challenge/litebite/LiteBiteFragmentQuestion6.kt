package klim8.fragment.challenge.litebite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion5Binding
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion6Binding

class LiteBiteFragmentQuestion6 : Fragment() {
    lateinit var binding: FragmentLiteBiteQuestion6Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLiteBiteQuestion6Binding.inflate(inflater, container, false)
        onclick()
        return binding.root

    }
    private fun onclick() {
        binding.btnContinueQ6.setOnClickListener {
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_litebite, LiteBiteFragmntQuestion7())
            ft.commit()


        }
    }
}