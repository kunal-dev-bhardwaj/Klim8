package klim8.fragment.footprint

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentStep2Binding
import com.inmortal.klim8.databinding.FragmentStep3Binding


class Step2Fragment : Fragment() {

    lateinit var binding: FragmentStep2Binding
    private lateinit var fragAdd: FragmentTransaction


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentStep2Binding.inflate(inflater,container,false)

        onClick()
        return binding.root

    }

    private fun onClick(){
        binding.btnContinueStep2.setOnClickListener {
            fragAdd= fragmentManager?.beginTransaction()!!
            fragAdd.add(R.id.frame_footprint,Step3Fragment())
            fragAdd.commit()

        }
    }


}