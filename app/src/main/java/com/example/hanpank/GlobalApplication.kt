package com.example.hanpank

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this,"1e4895646c1688a3947c20c305c8f121")
    }
}