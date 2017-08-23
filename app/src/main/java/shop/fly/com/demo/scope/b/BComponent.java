package shop.fly.com.demo.scope.b;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2017/6/12.
 */
@Subcomponent(modules = BModule.class)
public interface BComponent {
    void inject(BActivity bActivity);
}
