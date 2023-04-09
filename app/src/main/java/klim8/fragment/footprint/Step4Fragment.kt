package klim8.fragment.footprint

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentFootPrintBinding
import com.inmortal.klim8.databinding.FragmentStep4Binding


class Step4Fragment : Fragment() {
lateinit var binding: FragmentStep4Binding
private lateinit var fragAdd:FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentStep4Binding.inflate(inflater, container, false) //view binding
        onClick()

        return binding.root
    }

    private fun onClick(){
            binding.btnContinueStep4.setOnClickListener {
                fragAdd= fragmentManager?.beginTransaction()!!
                fragAdd.add(R.id.frame_footprint,Step5Fragment())
                fragAdd.commit()

            }
    }

}