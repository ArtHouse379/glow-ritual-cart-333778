package trezvo.cosmetics.glowritualcart.data.model

import androidx.annotation.StringRes
import trezvo.cosmetics.glowritualcart.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    MAKEUP(R.string.product_category_makeup_title),
    SKIN_CARE(R.string.product_category_skin_care_title),
    HAIR_CARE(R.string.product_category_hair_care_title),
    FRAGRANCE(R.string.product_category_fragrance_title),
    BATH_BODY(R.string.product_category_bath_body_title),
}
