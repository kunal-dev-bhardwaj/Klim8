package klim8.activities

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityMyCarbonFootPrintBinding
import klim8.activities.authentication.MainActivity

class MyCarbonFootPrintActivity : AppCompatActivity() {
    lateinit var binding:ActivityMyCarbonFootPrintBinding
    lateinit var view:View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMyCarbonFootPrintBinding.inflate(layoutInflater)
        view=binding.root
        setContentView(view)
        onClick()
    }

    private fun onClick(){
        binding.btnSave.setOnClickListener {
            startActivity(Intent(this@MyCarbonFootPrintActivity,MainActivity::class.java))
            finish()

        }

    }


}