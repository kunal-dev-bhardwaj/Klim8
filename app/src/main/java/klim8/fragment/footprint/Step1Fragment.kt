package klim8.fragment.footprint

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentStep1Binding


class Step1Fragment : Fragment() {

lateinit var binding:FragmentStep1Binding
    lateinit var ft: FragmentTransaction
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding=FragmentStep1Binding.inflate(inflater,container,false)
        onClick()
        // Inflate the layout for this fragment
        return binding.root
    }
    private fun onClick(){
        binding.icArrwBackStp1.setOnClickListener{


        }
        binding.btnContinueStep1.setOnClickListener {
            ft = fragmentManager?.beginTransaction()!!
//            val fragOne: Fragment = Step1Fragment()
//            val arguments = Bundle()
            ft.add(R.id.frame_footprint ,Step2Fragment())
            ft.commit()
        }

    }

}


