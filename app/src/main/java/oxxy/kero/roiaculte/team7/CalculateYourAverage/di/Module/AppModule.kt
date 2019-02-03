package oxxy.kero.roiaculte.team7.CalculateYourAverage.di.Module

import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import oxxy.kero.roiaculte.team7.domain.functional.AppRxSchedulers
import oxxy.kero.roiaculte.team7.domain.functional.CouroutineDispatchers
import oxxy.kero.roiaculte.team7.CalculateYourAverage.utils.Schedulers.AppCoroutineDispatchers
import oxxy.kero.roiaculte.team7.CalculateYourAverage.utils.Schedulers.AppRxSchedulersImpl

@Module
class AppModule {

    @Provides
    fun provideSchedulers(): AppRxSchedulers {
        return AppRxSchedulersImpl(
            Schedulers.io()
            , AndroidSchedulers.mainThread(), Schedulers.computation())
    }
    @Provides
    fun provideDispatchers(): CouroutineDispatchers {
        return AppCoroutineDispatchers(Dispatchers.IO, Dispatchers.Unconfined, Dispatchers.Main)
    }


}