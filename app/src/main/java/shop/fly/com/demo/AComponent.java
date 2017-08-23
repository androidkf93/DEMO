package shop.fly.com.demo;

import dagger.Component;

/**
 * Created by Administrator on 2017/6/12.
 */

@Component(modules = {AModule.class, GsonMode.class})
public interface AComponent {
    void inject(MainActivity mainActivity);
}
