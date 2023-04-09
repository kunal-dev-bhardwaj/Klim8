package klim8.activities.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityFootBinding
import klim8.fragment.footprint.FootPrintFragment
import klim8.fragment.footprint.Step1Fragment

class FootPrintActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFootBinding
    lateinit var view: View
    private lateinit var fragReplace: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFootBinding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)
        fragReplace = supportFragmentManager.beginTransaction()
        fragReplace.replace(R.id.frame_footprint, FootPrintFragment())
        fragReplace.commit()

    }


}