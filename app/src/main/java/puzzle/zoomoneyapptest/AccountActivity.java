package puzzle.zoomoneyapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {

    private TextView tv_account;
    private SwipeRefreshLayout mSwipeRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mSwipeRefresh = (SwipeRefreshLayout)findViewById(R.id.swipeRefreshLayout);

        mSwipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mSwipeRefresh.setRefreshing(false);
            }
        });

//        TextView userID = (TextView)findViewById(R.id.userID);
//
//        Intent intent = getIntent();
//        Data data_id = (Data) intent.getSerializableExtra("ID");
//
//        userID.setText(""+ data_id.input_first);

        ImageButton btn_check_account = (ImageButton)findViewById(R.id.btn_check_account);
        btn_check_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_signIn = new Intent(AccountActivity.this, SignInActivity.class);
                startActivity(go_to_signIn);
            }
        });

    }


}
