package oxxy.kero.roiaculte.team7.CalculateYourAverage.Firebase

import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides

@Module
abstract class FirebaseModule {

    @Provides
    fun provideFirebaseAuth():FirebaseAuth{
        return FirebaseAuth.getInstance()
    }

}