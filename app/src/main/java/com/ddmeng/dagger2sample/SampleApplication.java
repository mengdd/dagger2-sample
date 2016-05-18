package com.ddmeng.dagger2sample;

import android.app.Application;

import com.ddmeng.dagger2sample.component.DaggerMyApplicationComponent;
import com.ddmeng.dagger2sample.component.MyApplicationComponent;
import com.ddmeng.dagger2sample.module.MyApplicationModule;

/**
 * Some of the comments are from http://google.github.io/dagger/users-guide.html
 */
public class SampleApplication extends Application {

    private MyApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        // The implementation has the same name as the interface prefixed with Dagger.
        // Obtain an instance by invoking the builder() method on that implementation
        // and use the returned builder to set dependencies and build() a new instance.

        component = DaggerMyApplicationComponent
                .builder()
                .myApplicationModule(new MyApplicationModule(this))//when module has constructor parameter, it has to be set here
                // When module has no constructor parameter, Dagger will use the default one, so it's ok not to set it
                .build();

        // If all dependencies can be constructed without the user creating a dependency instance,
        // then the generated implementation will also have a create() method
        // that can be used to get a new instance without having to deal with the builder.
        // DaggerMyApplicationComponent.create();
        // 没有参数的情况下, 这个和直接build()效果一样.


        // Note: If your @Component is not a top-level type,
        // the generated component’s name will be include its enclosing types’ names, joined with an underscore.

    }

    public MyApplicationComponent getComponent() {
        return component;
    }
}
