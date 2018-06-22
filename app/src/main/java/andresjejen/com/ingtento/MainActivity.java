package andresjejen.com.ingtento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Variables
    Button Boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Referencia a elementos
        Boton = (Button) findViewById(R.id.Btn1);

        //Listener
        Boton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(pantalla);
                finish();
            }
        });
    }
}


