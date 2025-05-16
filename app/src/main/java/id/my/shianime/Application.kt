package id.my.shianime

import com.acutecoder.crashhandler.CrashHandlerApplication
import com.acutecoder.crashhandler.callback.RestartAppCallback
import com.acutecoder.crashhandler.util.installCrashHandler

class Application : CrashHandlerApplication() {
    init {
        installCrashHandler(callback = RestartAppCallback(this))
    }
}