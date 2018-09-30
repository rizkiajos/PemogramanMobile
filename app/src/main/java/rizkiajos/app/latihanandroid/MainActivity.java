package rizkiajos.app.latihanandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    private EditText edtData;
    private Button btnSubmit;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtData = (EditText) findViewById(R.id.edit_data);
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        btnSubmitClicked();
    }
    private void btnSubmitClicked() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                String data = edtData.getText().toString();

                Intent detailIntent = new Intent(MainActivity.this, DetailActivty.class);
                detailIntent.putExtra("dataku",data);
                startActivity(detailIntent);
            }
        });
    }
}

