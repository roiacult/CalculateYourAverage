package oxxy.kero.roiaculte.team7.CalculateYourAverage.base

import android.content.Context
import dagger.android.support.DaggerAppCompatActivity
import com.google.android.material.snackbar.Snackbar
import oxxy.kero.roiaculte.team7.CalculateYourAverage.R
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.annotation.StringRes
import oxxy.kero.roiaculte.team7.CalculateYourAverage.utils.extension.networkInfo


abstract class BaseActivity : DaggerAppCompatActivity() {

    fun showSnackBar(message: String) {
        val snackbar = Snackbar.make(
            findViewById(android.R.id.content),
            message, Snackbar.LENGTH_SHORT
        )
        snackbar.show()
    }

    fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun onError(message: String?) {
        if (message != null) {
            showSnackBar(message)
        } else {
            showSnackBar(getString(R.string.some_error))
        }
    }

    fun onError(@StringRes resId: Int) {
        onError(getString(resId))
    }

    fun showMessage(message: String?) {
        if (message != null) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, getString(R.string.some_error), Toast.LENGTH_SHORT).show()
        }
    }

    fun showMessage(@StringRes resId: Int) {
        showMessage(getString(resId))
    }

    fun isNetworkConnected(): Boolean {
        val activeNetwork = this.networkInfo
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting
    }
}

