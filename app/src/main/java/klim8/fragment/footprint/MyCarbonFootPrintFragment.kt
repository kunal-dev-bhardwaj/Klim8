package klim8.fragment.footprint

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityCreateAccountBinding.inflate
import com.inmortal.klim8.databinding.FragmentMyCarbonFootPrint2Binding
import com.inmortal.klim8.databinding.FragmentMyCarbonFootPrintBinding
import com.inmortal.klim8.databinding.FragmentStep8Binding
import com.inmortal.klim8.databinding.FragmentStep9Binding
import klim8.activities.authentication.MainActivity


class MyCarbonFootPrintFragment : Fragment() {
    lateinit var binding: FragmentMyCarbonFootPrint2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentMyCarbonFootPrint2Binding.inflate(inflater,container,false)

        onClick()



        return binding.root
        // Inflate the layout for this fragment

    }
    private fun onClick(){
        binding.btnSaveFrg.setOnClickListener {
            startActivity(Intent(context,MainActivity::class.java))



        }

    }


}