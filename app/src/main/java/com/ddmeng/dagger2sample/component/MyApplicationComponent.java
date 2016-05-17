package com.ddmeng.dagger2sample.component;

import com.ddmeng.dagger2sample.MainActivity;
import com.ddmeng.dagger2sample.module.MyApplicationModule;

import dagger.Component;

@Component(modules = MyApplicationModule.class)
public interface MyApplicationComponent {
    // this should be an interface or abstract class

    // write like this, and Make Project, then a DaggerMyApplicationComponent class will be generated

    void inject(MainActivity activity);
}
