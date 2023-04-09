package klim8.activities.authentication

import android.content.Intent
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.inmortal.klim8.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var view: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)
        onClick()



    }

    private fun onClick() {
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, FootPrintActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.imgHidePass.setOnClickListener {
            binding.imgShowPass.visibility = View.VISIBLE
            binding.imgHidePass.visibility = View.INVISIBLE
            binding.etPassword.transformationMethod = PasswordTransformationMethod()
        }
        binding.imgShowPass.setOnClickListener {
            binding.imgHidePass.visibility = View.VISIBLE
            binding.imgShowPass.visibility = View.INVISIBLE
            binding.etPassword.transformationMethod = null;

        }
    }
}