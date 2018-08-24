package com.pedroabinajm.thebestburgers.di

import com.pedroabinajm.thebestburgers.hamburgers.HamburgersModule
import com.pedroabinajm.thebestburgers.hamburgers.view.HamburgersActivity
import com.pedroabinajm.thebestburgers.welcome.WelcomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [HamburgersModule::class])
    abstract fun bindHamburgersActivity(): HamburgersActivity

    @ContributesAndroidInjector
    abstract fun bindWelcomeActivity(): WelcomeActivity
}