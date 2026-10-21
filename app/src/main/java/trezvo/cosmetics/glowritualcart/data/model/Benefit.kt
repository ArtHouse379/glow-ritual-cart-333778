package trezvo.cosmetics.glowritualcart.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material.icons.filled.Verified
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val productBenefits = listOf<Benefit>(
    Benefit(
        icon = Icons.Filled.Verified,
        text = "Selected quality",
    ),
    Benefit(
        icon = Icons.Filled.Shield,
        text = "Product guarantee",
    ),
    Benefit(
        icon = Icons.Filled.Spa,
        text = "Everyday essentials",
    ),
)
