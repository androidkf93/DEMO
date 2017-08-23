package shop.fly.com.demo.scope;

import dagger.Component;
import dagger.Subcomponent;
import shop.fly.com.demo.scope.a.AComponent;
import shop.fly.com.demo.scope.a.AModule;
import shop.fly.com.demo.scope.b.BComponent;
import shop.fly.com.demo.scope.b.BModule;
import shop.fly.com.demo.scope.c.CComponent;
import shop.fly.com.demo.scope.c.CModule;

/**
 * Created by Administrator on 2017/6/12.
 */
@UserScope
@Subcomponent(modules = UserModule.class)
public interface UserComponent {
    AComponent plus(AModule aModule);
    BComponent plus(BModule bModule);
    CComponent plus(CModule cModule);
}
