package klim8.activities.authentication

import android.content.Intent
import android.os.Bundle

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.inmortal.klim8.databinding.ActivityWalkinBinding


class WalkinActivity : AppCompatActivity() {
    lateinit var binding:ActivityWalkinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityWalkinBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)


        binding.llRegisterNow.setOnClickListener {
            startActivity(Intent(this@WalkinActivity, CreateAccountActivity::class.java))
            finish()

        }
    }
}