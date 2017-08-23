package shop.fly.com.demo.scope.c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import shop.fly.com.demo.MainActivity;
import shop.fly.com.demo.MyApplication;
import shop.fly.com.demo.R;
import shop.fly.com.demo.scope.User;
import shop.fly.com.demo.scope.UserName;

public class CActivity extends AppCompatActivity {

    @UserName("a")
    @Inject
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        MyApplication.get(this).getUserComponent().plus(new CModule()).inject(this);
        findViewById(R.id.button).setOnClickListener(view -> {
            MyApplication.get(CActivity.this).releaseUserComponent();
            startActivity(new Intent(CActivity.this, MainActivity.class));
        });

        ((TextView)findViewById(R.id.text)).setText("name: " + user.getName() + "\n pwd: " + user.getPassword() +
                "\nuser.toString(): " + user.toString());
    }
}
