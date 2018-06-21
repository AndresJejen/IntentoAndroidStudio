package andresjejen.com.ingtento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    //Variables
    Button Boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Referencia a elementos
        Boton = (Button) findViewById(R.id.Btn2);

        //Listener
        Boton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(pantalla);
                finish();
            }
        });

    }
}
