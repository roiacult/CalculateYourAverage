package oxxy.kero.roiaculte.team7.CalculateYourAverage

import dagger.Module
import oxxy.kero.roiaculte.team7.CalculateYourAverage.Firebase.FirebaseModule

@Module(includes= [FirebaseModule::class])
abstract class DataModule {
}