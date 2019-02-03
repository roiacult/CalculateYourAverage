package oxxy.kero.roiaculte.team7.CalculateYourAverage.ui.splash_screen

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import oxxy.kero.roiaculte.team7.CalculateYourAverage.R
import oxxy.kero.roiaculte.team7.CalculateYourAverage.base.BaseActivity
import oxxy.kero.roiaculte.team7.domain.use_cases.UserStateUseCase
import javax.inject.Inject
import oxxy.kero.roiaculte.team7.CalculateYourAverage.databinding.SplashScreenBinding

class SplashScreen : BaseActivity() {

    @Inject private lateinit var  userSatateUseCase : UserStateUseCase
    private lateinit var binding : SplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.splash_screen)


    }
}