package vn.com.viettel.vds.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import vn.com.viettel.vds.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText phoneNumber = findViewById(R.id.txtPhoneNumber);
        phoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),phoneNumber.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        setContentView(R.layout.activity_main);
    }
}