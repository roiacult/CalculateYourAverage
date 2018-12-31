package oxxy.kero.roiaculte.team7.starterproject.base

import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity() {

    abstract fun fragment(): BaseFragment
}