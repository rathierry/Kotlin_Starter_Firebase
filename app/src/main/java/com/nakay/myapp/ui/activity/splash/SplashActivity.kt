package com.nakay.myapp.ui.activity.splash

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.nakay.myapp.R

class SplashActivity : AppCompatActivity() {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods from SuperClass
    // ===========================================================

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /** hide title bar **/
        window.requestFeature(Window.FEATURE_NO_TITLE)

        /** set layout **/
        setContentView(R.layout.activity_splash)
    }

    // ===========================================================
    // Methods for Interfaces
    // ===========================================================

    // ===========================================================
    // Public Methods
    // ===========================================================

    // ===========================================================
    // Private Methods
    // ===========================================================

    // ===========================================================
    // Inner Classes/Interfaces
    // ===========================================================
}
