package mx.edu.ittepic.tpdm_u1_practica1_robertoaguilar

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var ima1 : ImageView ?= null
    var ima2 : ImageView ?= null
    var ima3 : ImageView ?= null
    var ima4 : ImageView ?= null
    var ima5 : ImageView ?= null
    var ima6 : ImageView ?= null
    var ima7 : ImageView ?= null
    var ima8 : ImageView ?= null
    var ima9 : ImageView ?= null
    var ima10 : ImageView ?= null
    var ima11 : ImageView ?= null
    var ima12 : ImageView ?= null
    var ima13 : ImageView ?= null
    var ima14 : ImageView ?= null
    var ima15 : ImageView ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ima1 = findViewById(R.id.ima1)
        ima2 = findViewById(R.id.ima2)
        ima3 = findViewById(R.id.ima3)
        ima4 = findViewById(R.id.ima4)
        ima5 = findViewById(R.id.ima5)
        ima6 = findViewById(R.id.ima6)
        ima7 = findViewById(R.id.ima7)
        ima8 = findViewById(R.id.ima8)
        ima9 = findViewById(R.id.ima9)
        ima10 = findViewById(R.id.ima10)
        ima11 = findViewById(R.id.ima11)
        ima12 = findViewById(R.id.ima12)
        ima13 = findViewById(R.id.ima13)
        ima14 = findViewById(R.id.ima14)
        ima15 = findViewById(R.id.ima15)


        ima1?.setOnClickListener {
            var otraActivity1 = Intent(this, Main2Activity::class.java )
            startActivity(otraActivity1)
        }

        ima2?.setOnClickListener {
            var otraActivity2 = Intent(this, Main3Activity::class.java)
            startActivity(otraActivity2)
        }

        ima3?.setOnClickListener {
            var otraActivity3 = Intent(this, Main4Activity::class.java)
            startActivity(otraActivity3)
        }

        ima4?.setOnClickListener {
            var otraActivity4 = Intent(this, Main5Activity::class.java)
            startActivity(otraActivity4)
        }

        ima5?.setOnClickListener {
            var otraActivity5 = Intent(this, Main6Activity::class.java)
            startActivity(otraActivity5)
        }

        ima6?.setOnClickListener {
            var otraActivity6 = Intent(this, Main7Activity::class.java)
            startActivity(otraActivity6)
        }

        ima7?.setOnClickListener {
            var otraActivity7 = Intent(this, Main8Activity::class.java)
            startActivity(otraActivity7)
        }

        ima8?.setOnClickListener {
            var otraActivity8 = Intent(this, Main9Activity::class.java)
            startActivity(otraActivity8)
        }
        ima9?.setOnClickListener {
            var otraActivity9 = Intent(this, Main10Activity::class.java)
            startActivity(otraActivity9)
        }

        ima10?.setOnClickListener {
            var otraActivity10 = Intent(this, Main11Activity::class.java)
            startActivity(otraActivity10)
        }
        ima11?.setOnClickListener {
            var otraActivity11 = Intent(this, Main12Activity::class.java)
            startActivity(otraActivity11)
        }
        ima12?.setOnClickListener {
            var otraActivity12 = Intent(this, Main13Activity::class.java)
            startActivity(otraActivity12)
        }
        ima13?.setOnClickListener {
            var otraActivity13 = Intent(this, Main14Activity::class.java)
            startActivity(otraActivity13)
        }
        ima14?.setOnClickListener {
            var otraActivity14 = Intent(this, Main15Activity::class.java)
            startActivity(otraActivity14)
        }
        ima15?.setOnClickListener {
            var otraActivity15 = Intent(this, Main16Activity::class.java)
            startActivity(otraActivity15)
        }
    }
}
