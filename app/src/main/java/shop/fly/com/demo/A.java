package shop.fly.com.demo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/6/12.
 */

public class A {
    String field;
    @Inject
    public A(){

    }
    public void doSomeThing(){
        Log.e("A", "doSomeThing()");
    }
}
