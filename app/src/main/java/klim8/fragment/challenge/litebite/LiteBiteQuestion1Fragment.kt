package klim8.fragment.challenge.litebite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentLiteBiteQuestion1Binding
import klim8.fragment.footprint.Step2Fragment


class LiteBiteQuestion1Fragment : Fragment() {
    lateinit var binding: FragmentLiteBiteQuestion1Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentLiteBiteQuestion1Binding.inflate(inflater,container,false)
        onclick()
        return binding.root
    }
    private fun onclick() {
        binding.btnContinueQuestion1.setOnClickListener{
            ft = requireFragmentManager().beginTransaction()
            ft.add(R.id.frame_challenge_litebite , LiteBiteFragmentQuestion2())
            ft.commit()


        }
    }



}