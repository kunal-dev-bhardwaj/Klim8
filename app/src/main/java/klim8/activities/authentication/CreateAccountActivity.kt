package klim8.activities.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.inmortal.klim8.databinding.ActivityCreateAccountBinding


class CreateAccountActivity : AppCompatActivity() {
    lateinit var binding: ActivityCreateAccountBinding
    lateinit var view: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.arrowBackCreate.setOnClickListener {
            onBackPressed()

        }

        binding.tvLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()


        }

    }
}