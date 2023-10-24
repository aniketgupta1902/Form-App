package in.arkapps.formapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email =findViewById(R.id.email);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mName = name.getText().toString();
                String mEmail = email.getText().toString();
                String pass = password.getText().toString();

                String title = "Login form";
                String msg = "Name : "+mName + "\n" + "Email : "+mEmail + "\n"+"Password : "+pass;

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(title)
                        .setMessage(msg)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.dismiss();

                            }
                        }).create().show();


            }
        });

    }
}
