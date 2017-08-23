package shop.fly.com.demo;

import javax.inject.Singleton;

import dagger.Component;
import shop.fly.com.demo.scope.UserComponent;
import shop.fly.com.demo.scope.UserModule;

/**
 * Created by Administrator on 2017/6/12.
 */
@Singleton
@Component(modules = MyApplicationModule.class)
public interface MyApplicationComponent {
    UserComponent plus(UserModule userModule);
}
