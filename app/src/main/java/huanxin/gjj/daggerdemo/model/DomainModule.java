package huanxin.gjj.daggerdemo.model;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：gjj on 2016/1/13 16:14
 * 邮箱：Gujj512@163.com
 */
@Module(
        complete = false,
        library = true//module指明为library
)
public class DomainModule {

    @Provides
    @Singleton
    public TestModel1 provideAnalyticsManager(TestModel1 app){
        return new TestModel1();
    }

}
