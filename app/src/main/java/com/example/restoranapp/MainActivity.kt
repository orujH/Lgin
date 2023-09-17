package com.example.restoranapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.restoranapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener{
            val number=binding.editTextNumber.text.toString()
            var faiz=0.0

            if (number.isNotEmpty()){

                val secilenButton=binding.radioGroup.checkedRadioButtonId

                when(secilenButton){
                    R.id.radioButton20->faiz=0.2
                    R.id.radioButton15->faiz=0.15
                    R.id.radioButton10->faiz=0.1
                }
                var bexsis=number.toDouble()*faiz

                val switch=binding.switch1.isChecked

                if(switch){
                    bexsis=kotlin.math.ceil(bexsis)
                }



                binding.textViewCount.text=bexsis.toString()

            }else{
                Toast.makeText(applicationContext, "Bir Eded yazin", Toast.LENGTH_SHORT).show()
                binding.textViewCount.text=""
            }
        }



    }
}