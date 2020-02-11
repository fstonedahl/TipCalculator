package edu.augustana.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTipText;
    private EditText totalBill;
    private Button btn15;
    private Button btn30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTipText = (TextView) findViewById(R.id.tipText);
        totalBill = (EditText) findViewById(R.id.totalBill);
        btn15 = (Button) findViewById(R.id.btn15);
        btn30 = (Button) findViewById(R.id.btn30);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tip15();
            }
        });
    }

    private void tip15() {
        String billText = totalBill.getText().toString();
        double billAmount = Double.valueOf(billText);
        double tipAmount = billAmount * 0.15;
        tvTipText.setText("Tip: $" + tipAmount);
    }

}
