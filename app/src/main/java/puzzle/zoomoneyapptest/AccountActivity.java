package puzzle.zoomoneyapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import puzzle.zoomoneyapptest.Data.Data;

public class AccountActivity extends AppCompatActivity {

    private TextView tv_account;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        TextView tv_account = (TextView)findViewById(R.id.tv_account);

        Intent intent = getIntent();
        Data data_id = (Data) intent.getSerializableExtra("ID");

        tv_account.setText(""+ data_id.input_first);

        Button btn_check_account = (Button)findViewById(R.id.btn_check_account);
        btn_check_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_signIn = new Intent(AccountActivity.this, SignInActivity.class);
                startActivity(go_to_signIn);
            }
        });



    }
}
