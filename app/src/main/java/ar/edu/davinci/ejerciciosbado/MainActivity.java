package ar.edu.davinci.ejerciciosbado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button actionButton = new Button(this);
        actionButton.setText(R.string.actionButtonText);
        actionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                TextView paragraph = new TextView(button.getContext());
                paragraph.setText(R.string.mainText);
                paragraph.setBackgroundColor(+R.color.purple_500);

                LinearLayout contentList = findViewById(R.id.contentList);
                contentList.addView(paragraph);
            }
        });

        LinearLayout appContent = findViewById(R.id.appContent);
        appContent.addView(actionButton);

    }
}