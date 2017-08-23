package shop.fly.com.demo.scope.a;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2017/6/12.
 */
@Subcomponent(modules = AModule.class)
public interface AComponent {
    void inject(AActivity aActivity);
}
