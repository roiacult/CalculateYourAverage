package oxxy.kero.roiaculte.team7.starterproject

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import oxxy.kero.roiaculte.team7.starterproject.di.Component.DaggerAppComponent

class AndroidApplication :DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return  DaggerAppComponent.builder().create(this)
    }
}