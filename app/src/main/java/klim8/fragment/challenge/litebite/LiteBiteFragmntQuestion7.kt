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
        return binding.root
    }

    private fun onclick() {
        binding.btnContinueQ7.setOnClickListener {
            startActivity(Intent(activity,QuesAnsActivity::class.java))


        }
    }
}