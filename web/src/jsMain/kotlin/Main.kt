import androidx.compose.ui.window.Window
import com.example.common.App
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window {
            App()
        }
    }
}

