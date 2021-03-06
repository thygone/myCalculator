package com.example.customcalc


//imports
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.view.View
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity(), View.OnClickListener {
    
    //text boxes
    lateinit var answer : TextView
    lateinit var number1 : EditText
    lateinit var number2 : EditText
    
    //buttons
    lateinit var add : Button
    lateinit var sub :Button
    lateinit var div : Button
    lateinit var mult : Button
    lateinit var clear : Button
    

    // this is will apply the id's to the respective objects above when the app is launched
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         add = findViewById(R.id.add)
         sub = findViewById(R.id.sub)
         div = findViewById(R.id.div)
         mult = findViewById(R.id.mult)
         number1 = findViewById(R.id.numb1)
         number2 = findViewById(R.id.numb2)
         answer = findViewById(R.id.answer)

        add.setOnClickListener(this)
        sub.setOnClickListener(this)
        div.setOnClickListener(this)
        mult.setOnClickListener(this)
        }


// these functions will acttivate when the respective button is pushed
// they will add, divide, subtract, or multiply the two inputed numbers
    fun addNumbs (a: Int, b: Int): Int {
        var c = a + b
        return c
    }

    fun divide (a: Int, b: Int): Int {
        var c = a / b
        return c
    }
    
    fun subt (a: Int, b: Int): Int {
        var c = a - b
        return c
    }
    
    fun multt (a: Int, b: Int): Int {
        var c = a * b
        return c
    }

    
    // when a button is clicked this will grab the two values and then decide what function to use
    // based on what the id of the pushed button is.
    override fun onClick(view: View?) {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        val numbb1 = number1.text.toString()
        val numb1 = numbb1.toInt()
        val numbb2 = number2.text.toString()
        val numb2 = numbb2.toInt()
        val ans: Int
        when (view?.id){
            R.id.add->{
                ans = addNumbs(numb1, numb2)
                answer.setText(ans.toString())
            }
            R.id.sub->{
                ans = subt(numb1, numb2)
                answer.setText(ans.toString())
            }
            R.id.div->{
                ans = divide(numb1, numb2)
                answer.setText(ans.toString())
            }
            R.id.mult->{
                ans = multt(numb1, numb2)
                answer.setText(ans.toString())
            }
        }
    }
}



private fun Button?.setOnClickListener(onClickListener: View.OnClickListener?, function: () -> Unit) {

}
