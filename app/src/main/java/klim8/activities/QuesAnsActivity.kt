package klim8.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityCreateAccountBinding
import com.inmortal.klim8.databinding.ActivityQuesAnsBinding
import klim8.activities.authentication.MainActivity

class QuesAnsActivity : AppCompatActivity() {
    lateinit var binding:ActivityQuesAnsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuesAnsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnContinueQuesAns.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }


}