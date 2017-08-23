package shop.fly.com.demo.scope.c;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2017/6/12.
 */
@Subcomponent(modules = CModule.class)
public interface CComponent {
    void inject(CActivity cActivity);
}
