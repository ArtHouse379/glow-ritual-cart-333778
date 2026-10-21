package trezvo.cosmetics.glowritualcart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import trezvo.cosmetics.glowritualcart.ui.composable.approot.AppRoot
import trezvo.cosmetics.glowritualcart.ui.theme.CJBEWAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CJBEWAppTheme {
                AppRoot()
            }
        }
    }
}
