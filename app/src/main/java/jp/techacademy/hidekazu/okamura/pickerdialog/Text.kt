package jp.techacademy.hidekazu.okamura.pickerdialog

import java.io.Serializable
import java.util.Date
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Text : RealmObject(), Serializable {
    var text: String = ""      // タイトル

    // idをプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
}