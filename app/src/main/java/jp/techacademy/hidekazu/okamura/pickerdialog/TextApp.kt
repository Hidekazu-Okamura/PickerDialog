package jp.techacademy.hidekazu.okamura.pickerdialog

import android.app.Application
import io.realm.Realm

class TextApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}