package klim8.fragment.footprint


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentFootPrintBinding


class FootPrintFragment : Fragment() {

    lateinit var binding: FragmentFootPrintBinding
    lateinit var ft:FragmentTransaction



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFootPrintBinding.inflate(inflater, container, false) //view binding
        onClick()

        return binding.root
    }

    private fun onClick() {
        binding.btnNext.setOnClickListener {

            ft = fragmentManager?.beginTransaction()!!
//            val fragOne: Fragment = Step1Fragment()
//            val arguments = Bundle()
            ft.add(R.id.frame_footprint ,Step1Fragment())
            ft.commit()

        }
    }


}