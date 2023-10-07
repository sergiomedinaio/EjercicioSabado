package ar.edu.davinci.ejerciciosbado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView paragraph = new TextView(this);
        paragraph.setText(R.string.mainText);
        paragraph.setBackgroundColor(+R.color.purple_500);
        LinearLayout appContent = findViewById(R.id.appContent);
        appContent.addView(paragraph);

    }
}