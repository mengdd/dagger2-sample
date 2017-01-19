package com.ddmeng.dagger2sample.components;

import com.ddmeng.dagger2sample.MainActivity;
import com.ddmeng.dagger2sample.modules.MyApplicationModule;
import com.ddmeng.dagger2sample.utils.GlobalTools;

import javax.inject.Singleton;

import dagger.Component;

// Components may have multiple scope annotations applied.
// This declares that they are all aliases to the same scope,
// and so that component may include scoped bindings with any of the scopes it declares.
@Singleton
@Component(modules = MyApplicationModule.class)
public interface MyApplicationComponent {
    // this should be an interface or abstract class

    // write like this, and Make Project, then a DaggerMyApplicationComponent class will be generated

    GlobalTools getGlobalTools();

    void inject(MainActivity activity);
}
