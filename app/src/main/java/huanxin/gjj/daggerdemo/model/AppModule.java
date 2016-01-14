package huanxin.gjj.daggerdemo.model;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import huanxin.gjj.daggerdemo.MyApplication;

/**
 * 作者：gjj on 2016/1/13 15:30
 * 邮箱：Gujj512@163.com
 */
@Module(//@Module：把这个类标识为Dagger module
        injects = {// injects：标识module将要注入这个类的任何依赖
                MyApplication.class
        },
        includes = {//指定AppModule会包含DomainModule
                DomainModule.class
    }
)
public class AppModule {

    private MyApplication app;

    public AppModule(MyApplication app) {
        this.app = app;
    }

    @Provides//@Providers：标识函数作为注入提供者，函数名并不重要，它只依赖于所提供的类类型。
    @Singleton//如果标识为Singleton，那这个函数会一直返回相同的对象实例，这比常规的单例好很多
    public Context provideApplicationContext() {
        return app;
    }
}
