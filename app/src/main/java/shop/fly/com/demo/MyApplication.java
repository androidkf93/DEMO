package shop.fly.com.demo;

import android.app.Application;
import android.content.Context;

import shop.fly.com.demo.scope.User;
import shop.fly.com.demo.scope.UserComponent;
import shop.fly.com.demo.scope.UserModule;

/**
 * Created by Administrator on 2017/6/12.
 */

public class MyApplication extends Application {

    private MyApplicationComponent appComponent;
    private UserComponent userComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerMyApplicationComponent.builder().myApplicationModule(new MyApplicationModule(this)).build();
    }

    public static MyApplication get(Context context){
        return (MyApplication) context.getApplicationContext();
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }

    public UserComponent createUserComponent(User userA, User userB){
        userComponent = appComponent.plus(new UserModule(userA, userB));
        return userComponent;
    }

    public void releaseUserComponent(){
        userComponent = null;
    }
}
