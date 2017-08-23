package shop.fly.com.demo.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.security.RunAs;
import javax.inject.Qualifier;

/**
 * Created by Administrator on 2017/6/13.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface UserName {

    String value() default "";
}
