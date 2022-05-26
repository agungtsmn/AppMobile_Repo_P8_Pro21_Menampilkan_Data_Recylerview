package id.ac.polbeng.amandaagungpermata.p8pro21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recyler.*

class RecylerActivity : AppCompatActivity() {

    var dataOrang = arrayOf("agung","putri","tito","faisal","agus", "yudani")
    var dataGambar= arrayOf(
        R.drawable.agung,
        R.drawable.putri,
        R.drawable.tito,
        R.drawable.faisal,
        R.drawable.agus,
        R.drawable.yudani)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyler)

        var adapter = CustomAdapter(this, dataOrang, dataGambar)
        var liner = LinearLayoutManager(applicationContext)
        recylerview.adapter = adapter
        recylerview.layoutManager = liner
    }
}