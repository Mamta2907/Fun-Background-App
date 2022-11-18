package chaudhari.mamta.funbackground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   ConstraintLayout layout;
   Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.rootLayout);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                //int color = Color.argb(255, random.nextInt(256),random.nextInt(256),random.nextInt(256) );
                int color = Color.rgb(random.nextInt(256),random.nextInt(250),random.nextInt(256));
                layout.setBackgroundColor(color);
            }
        });
    }

}