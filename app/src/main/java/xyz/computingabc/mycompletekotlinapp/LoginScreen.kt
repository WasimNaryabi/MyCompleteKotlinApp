package xyz.computingabc.mycompletekotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity() {

   private var emailString:String? = null
   private var passwordString:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)


        btn_login.setOnClickListener(View.OnClickListener {
            validation()
//
        })

    }

    private fun validation() {
        emailString = input_email.text.toString().trim()
        passwordString = input_password?.text.toString().trim()

        if(emailString.isNullOrEmpty()){
            input_email.error="plz enter your Email"
        }else if(passwordString.isNullOrEmpty()){
            input_password.error="plz enter your Password"
        }else{
            if(!(emailString.equals("wasim11@gmail.com") && passwordString.equals("12345678"))){
               /* val snack = Snackbar.make(root_layout,"Invalid Email Or Password",Snackbar.LENGTH_LONG)
                snack.show()*/
                Toast.makeText(this,"Invalid Email Or Password",Toast.LENGTH_SHORT).show()
            }else{
                val home = Intent(applicationContext,Home::class.java)
                startActivity(home)
                finish()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val home = Intent(applicationContext,Home::class.java)
        startActivity(home)
        finish()
    }


}
