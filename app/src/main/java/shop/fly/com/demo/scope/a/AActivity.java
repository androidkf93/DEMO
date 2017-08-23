package shop.fly.com.demo.scope.a;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import shop.fly.com.demo.MyApplication;
import shop.fly.com.demo.R;
import shop.fly.com.demo.scope.User;
import shop.fly.com.demo.scope.UserName;
import shop.fly.com.demo.scope.b.BActivity;

public class AActivity extends AppCompatActivity {

    @UserName("a")
    @Inject
    User userA;

    @UserName("b")
    @Inject
    User userB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        MyApplication.get(this).getUserComponent().plus(new AModule()).inject(this);
        findViewById(R.id.button).setOnClickListener(view -> {
            startActivity(new Intent(AActivity.this, BActivity.class));
        });
        ((TextView)findViewById(R.id.text)).setText("A: " + userA.getName() + "\nB: " + userB.getName() +
        "\nuserA.toString(): " + userA.toString() + "\nuserB.toString(): " + userB.toString());
    }
}
