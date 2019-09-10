package mx.edu.ittepic.tpdm_u1_practica1_robertoaguilar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main4Activity : AppCompatActivity() {

    var botonRegresar : Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        botonRegresar = findViewById(R.id.regresar)

        botonRegresar?.setOnClickListener {
            var activityPrincipal = Intent(this, MainActivity::class.java)
            startActivity(activityPrincipal)
        }
    }
}
