package oxxy.kero.roiaculte.team7.CalculateYourAverage.Ui.feature.fragment1

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * here we will create a subComponent for the Fagment
 *   dagger will inject the fragment because we have inherited from daggerFragment
 *   we shall put the fragment dependencies here
 */
@Module
abstract class FragmentProvider {

    @ContributesAndroidInjector
     abstract fun provideFragment():Fragment1

}