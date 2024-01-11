package net.oliversne.volumecalculator;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VolumeShapes extends AppCompatActivity {

    Button resultBtn;
    TextView resultDisplay, volumeTitle;
    EditText inputText1, inputText2, inputText3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

        resultBtn = findViewById(R.id.calculate_button);
        resultDisplay = findViewById(R.id.result_text);
        volumeTitle = findViewById(R.id.title_calculator);
        inputText1 = findViewById(R.id.height_text);
        inputText2 = findViewById(R.id.width_text);
        inputText3 = findViewById(R.id.length_text);

        Bundle bundle = getIntent().getExtras();
        String shapeName = bundle.getString("shapeName");

        switch(shapeName){
            case "Sphere":
                inputText1.setVisibility(View.INVISIBLE);
                inputText3.setVisibility(View.INVISIBLE);
                resultBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String radius = inputText2.getText().toString();
                        int r = Integer.parseInt(radius);
                        double volume = (4/3) * 3.1416 * r * r * r;
                        resultDisplay.setText("Sphere´s Volume: " + volume);
                    }
                });
                break;
            case "Prism":
                resultBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String height = inputText1.getText().toString();
                        String width = inputText2.getText().toString();
                        String length = inputText3.getText().toString();
                        int h = Integer.parseInt(height);
                        int l = Integer.parseInt(length);
                        int w = Integer.parseInt(width);
                        double volume = h * l * w;
                        resultDisplay.setText("Prism´s Volume: " + volume);
                    }
                });
                break;
            case "Cube":
                inputText1.setVisibility(View.INVISIBLE);
                inputText3.setVisibility(View.INVISIBLE);
                resultBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String length = inputText2.getText().toString();
                        int l = Integer.parseInt(length);
                        double volume = l * l * l;
                        resultDisplay.setText("Cube´s Volume: " + volume);
                    }
                });
                break;
            case "Cylinder":
                inputText3.setVisibility(View.INVISIBLE);
                resultBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String radius = inputText1.getText().toString();
                        int r = Integer.parseInt(radius);
                        String height = inputText2.getText().toString();
                        int h = Integer.parseInt(height);
                        double volume = 3.1416 * (r * r) * h;
                        resultDisplay.setText("Cylinder´s Volume: " + volume);
                    }
                });
                break;
            }

        }
}
