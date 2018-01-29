package puzzle.zoomoneyapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import puzzle.zoomoneyapptest.Data.Data;

public class SignInActivity extends AppCompatActivity {

    private EditText et_id_sign_in;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_in);

        final EditText et_id_sign_in = (EditText) findViewById(R.id.et_id_sign_in);

        InputFilter[] inputFilters = new InputFilter[]{
                new InputFilter.LengthFilter(11)
        };

        ImageButton check_sign_in = (ImageButton)findViewById(R.id.check_sign_in);
        check_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input_first = et_id_sign_in.getText().toString();
                Data data_id = new Data(input_first);

                Intent go_to_account = new Intent(SignInActivity.this, AccountActivity.class);
                go_to_account.putExtra("ID",data_id);
                startActivity(go_to_account);
            }
        });

        TextView tv_sign_up = (TextView)findViewById(R.id.tv_sign_up);
        tv_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_signUp = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(go_to_signUp);

            }
        });




    }
}
