package klim8.fragment.footprint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentStep9Binding


class Step9Fragment : Fragment() {
    lateinit var binding: FragmentStep9Binding
    private lateinit var fragAdd: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStep9Binding.inflate(inflater, container, false)
        onClick()



        return binding.root
    }

    private fun onClick() {
        binding.btnContinueStep9.setOnClickListener {
//            startActivity(Intent(context, MyCarbonFootPrintActivity::class.java))
            fragAdd = fragmentManager?.beginTransaction()!!
            fragAdd.add(R.id.frame_footprint, MyCarbonFootPrintFragment())
            fragAdd.commit()


        }
        checkBox()


    }

    private fun checkBox() {
        binding.chckPersonal.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {

                binding.personalUpDd.visibility = View.VISIBLE
                binding.personalDownDd.visibility = View.GONE
                binding.hiddnlayoutPersonal.visibility = View.VISIBLE
                binding.layoutFlights.visibility = View.GONE
                binding.layoutPublic.visibility = View.GONE

            } else if (!b) {
                binding.hiddnlayoutPersonal.visibility = View.GONE
                binding.personalUpDd.visibility = View.GONE
                binding.personalDownDd.visibility = View.VISIBLE
                binding.layoutFlights.visibility = View.VISIBLE
                binding.layoutPublic.visibility = View.VISIBLE


            }


        })

        binding.chckPublic.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                binding.layoutPersonal.visibility = View.GONE
                binding.layoutFlights.visibility = View.GONE
                binding.publicDowndd.visibility = View.GONE
                binding.publicUpdd.visibility = View.VISIBLE
                binding.hiddnlayoutPublic.visibility = View.VISIBLE

            } else if (!b) {

                binding.layoutPersonal.visibility = View.VISIBLE
                binding.layoutFlights.visibility = View.VISIBLE
                binding.publicDowndd.visibility = View.VISIBLE
                binding.publicUpdd.visibility = View.GONE
                binding.hiddnlayoutPublic.visibility = View.GONE
            }


        })
        binding.chckFights.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                binding.layoutPublic.visibility = View.GONE
                binding.layoutPersonal.visibility = View.GONE
                binding.flightsDownDd.visibility=View.GONE
                binding.flightsUpDd.visibility=View.VISIBLE
                binding.hiddnlayoutFlights.visibility=View.VISIBLE


            } else if (!b) {
                binding.layoutPublic.visibility = View.VISIBLE
                binding.layoutPersonal.visibility = View.VISIBLE
                binding.flightsDownDd.visibility=View.VISIBLE
                binding.flightsUpDd.visibility=View.GONE
                binding.hiddnlayoutFlights.visibility=View.GONE

            }


        })


    }


}