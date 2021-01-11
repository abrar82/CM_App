package com.dwell.communitymanagement.Splash

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.codemybrainsout.onboarder.AhoyOnboarderActivity
import com.codemybrainsout.onboarder.AhoyOnboarderCard
import com.dwell.communitymanagement.Login.LoginActivity
import com.dwell.communitymanagement.R
import com.dwell.communitymanagement.Utils.globalDictionary


class OnboardingActivity : AhoyOnboarderActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_onboarding)
        setOnBoardingElements()
    }

    private fun setOnBoardingElements(){
        Log.d("onboard", "loaded")
        val ahoyOnboarderCard1 = AhoyOnboarderCard(
            globalDictionary["onBoardingPage1Header"],
            globalDictionary["onBoardingPage1Description"],
            R.drawable.logo
            )
//        ahoyOnboarderCard1.setBackgroundColor(R.color.indigo_blue)
        ahoyOnboarderCard1.setBackgroundColor(R.color.indigo_transparent);
        ahoyOnboarderCard1.setTitleColor(R.color.white)
        ahoyOnboarderCard1.setDescriptionColor(R.color.white)
//        ahoyOnboarderCard1.setImageResourceId(R.drawable.background)
        val ahoyOnboarderCard2 = AhoyOnboarderCard(
            globalDictionary["onBoardingPage2Header"],
            globalDictionary["onBoardingPage2Description"],
            R.drawable.logo
        )
//        ahoyOnboarderCard2.setBackgroundColor(R.color.indigo_blue)
        ahoyOnboarderCard2.setBackgroundColor(R.color.indigo_transparent);
        ahoyOnboarderCard2.setTitleColor(R.color.white)
        ahoyOnboarderCard2.setDescriptionColor(R.color.white)

        val pages: MutableList<AhoyOnboarderCard> = ArrayList()
        pages.add(ahoyOnboarderCard1)
        pages.add(ahoyOnboarderCard2)
        setOnboardPages(pages)
//        val colorList: MutableList<Int> = ArrayList()
//        colorList.add(R.drawable.main_background)
//        colorList.add(R.drawable.main_background)
//        colorList.add(R.color.solid_three)
//        setColorBackground(colorList)
        setGradientBackground()
        setImageBackground(R.drawable.onboard)
//        setGradientBackground(R.color.indigo_blue)
        setFinishButtonTitle(globalDictionary["continueButton"])
    }

    override fun onFinishButtonPressed() {
        sendToLogin()
    }
    private fun sendToLogin(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}