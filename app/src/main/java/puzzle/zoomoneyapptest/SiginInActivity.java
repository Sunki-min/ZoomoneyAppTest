package puzzle.zoomoneyapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import puzzle.zoomoneyapptest.Data.Data;

public class SiginInActivity extends AppCompatActivity {

    private EditText et_id_sign_in;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_in);

        final EditText et_id_sign_in = (EditText) findViewById(R.id.et_id_sign_in);

        Button check_sign_in = (Button)findViewById(R.id.check_sign_in);
        check_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = et_id_sign_in.getText().toString();
                Data data_id = new Data(id);

                Intent go_to_account = new Intent(SiginInActivity.this, AccountActivity.class);
                getIntent().putExtra("id",data_id);
                startActivity(go_to_account);
            }
        });

        TextView tv_sign_up = (TextView)findViewById(R.id.tv_sign_up);
        tv_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_signUp = new Intent(SiginInActivity.this, SignUpActivity.class);
                startActivity(go_to_signUp);

            }
        });




    }
}
