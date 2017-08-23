package shop.fly.com.demo.scope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/6/12.
 */
@Module
public class UserModule {
    private User userA;
    private User userB;


    public UserModule(User userA, User userB) {
        this.userA = userA;
        this.userB = userB;
    }
    @UserName("a")
    @Provides
    @UserScope
    public User provideUserA(){
        return userA;
    }
    @UserName("b")
    @Provides
    @UserScope
    public User provideUserB(){
        return userB;
    }
}
