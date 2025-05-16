package id.my.shianime.core

import java.net.URL

class Shianime {
    val title = Shianime::class.java.name
    val url =
        URL(URL("https://raw.githubusercontent.com/BanDroid/shianime-apk/refs/heads/main/domain.txt").readText())
}