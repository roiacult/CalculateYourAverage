package oxxy.kero.roiaculte.team7.CalculateYourAverage.Ui

import dagger.Module
import dagger.android.ContributesAndroidInjector
import oxxy.kero.roiaculte.team7.CalculateYourAverage.Ui.feature.FeatureActivity
import oxxy.kero.roiaculte.team7.CalculateYourAverage.Ui.feature.FeatureModule
import oxxy.kero.roiaculte.team7.CalculateYourAverage.Ui.feature.fragment1.FragmentProvider

/**
 * all Activitys will be injeted here by  @ContributesAndroidInjector with here modules
 */
@Module
abstract class ActivitysBuilder {
    @ContributesAndroidInjector(modules = [FeatureModule::class
        , FragmentProvider::class])
    abstract fun provideActivity(): FeatureActivity
}