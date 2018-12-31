package oxxy.kero.roiaculte.team7.starterproject.Ui.feature

import android.view.View
import dagger.Module
import dagger.android.ContributesAndroidInjector
import oxxy.kero.roiaculte.team7.starterproject.Ui.feature.fragment1.FragmentProvider
import oxxy.kero.roiaculte.team7.starterproject.di.viewmodel.ViewModelModule

/**
 * each activity will have a builder like this  it create a subcomponent with the help of the @ContributesAndroidInjector
 *  so the generated one is SubComponent_FeatureActivity
 * and dagger will also inject the activity  because we have inherite DaggerAppCompatActivivty
 *  the subComponent will have  the fragments dependencies module the viewmodel module and the activity module
 *
 */
@Module
abstract class FeatureBuilder {
    @ContributesAndroidInjector(modules = [ViewModelModule::class
        , FeatureModule::class
        , FragmentProvider::class])
    abstract fun provideActivity():FeatureActivity
}