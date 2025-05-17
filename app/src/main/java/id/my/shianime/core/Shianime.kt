package id.my.shianime.core

import android.util.Log
import com.acutecoder.cotask.CoTask
import java.net.URL

class Shianime {
    val title = Shianime::class.java.name
    fun getCurrentURL(callback: (URL) -> Unit) {
        CoTask {
            URL("https://shiadrive.my.id/domain.txt").readText()
        }.onResult { url ->
            callback(URL(url))
        }.catch { e ->
            Log.d("NETWORK_DOMAIN_FETCH", e.message.toString())
        }
    }
}