package shop.fly.com.demo;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/6/12.
 */
@Module
public class AModule {

    @Provides
    public A provideA(){
        return new A();
    }

}
