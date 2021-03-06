package com.devjcastro.unittestexample.domain.di.login;

import com.devjcastro.unittestexample.ui.activities.login.LoginActivity;

import dagger.Component;

/**
 * Created by devmaster on 26/03/18.
 */
@Component(modules = LoginDomainModule.class)
public interface LoginDomainComponent {
    void inject(LoginActivity activity);
}
