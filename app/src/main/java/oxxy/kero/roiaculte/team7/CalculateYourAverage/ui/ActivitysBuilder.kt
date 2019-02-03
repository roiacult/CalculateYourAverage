package oxxy.kero.roiaculte.team7.CalculateYourAverage.ui

import dagger.Module
import dagger.android.ContributesAndroidInjector
import oxxy.kero.roiaculte.team7.CalculateYourAverage.ui.feature.FeatureActivity
import oxxy.kero.roiaculte.team7.CalculateYourAverage.ui.feature.FeatureModule
import oxxy.kero.roiaculte.team7.CalculateYourAverage.ui.feature.fragment1.FragmentProvider

/**
 * all Activitys will be injeted here by  @ContributesAndroidInjector with here modules
 */
@Module
abstract class ActivitysBuilder {
    @ContributesAndroidInjector(modules = [FeatureModule::class
        , FragmentProvider::class])
    abstract fun provideActivity(): FeatureActivity
}