package klim8.fragment.footprint

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentStep8Binding


class Step8Fragment : Fragment() {
lateinit var binding: FragmentStep8Binding
private lateinit var fragAdd:FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentStep8Binding.inflate(inflater,container,false)

        onclick()
       return binding.root
    }

    private fun onclick(){
        binding.btnRadio2Step8.setOnClickListener {
            binding.llCheckboxStep8.visibility=View.VISIBLE

        }
        binding.btnRadio1Step8.setOnClickListener {
            binding.llCheckboxStep8.visibility=View.INVISIBLE

        }


        binding.btnContinueStep8.setOnClickListener {
            fragAdd = fragmentManager?.beginTransaction()!!
            fragAdd.add(R.id.frame_footprint, Step9Fragment())
            fragAdd.commit()

        }




    }




}