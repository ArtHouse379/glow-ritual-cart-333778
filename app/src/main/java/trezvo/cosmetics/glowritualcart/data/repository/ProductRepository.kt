package trezvo.cosmetics.glowritualcart.data.repository

import trezvo.cosmetics.glowritualcart.data.model.Product
import trezvo.cosmetics.glowritualcart.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products = listOf<Product>(
        Product(
            id = 1,
            title = "Lipstick",
            description = "A creamy lipstick that adds smooth, even colour in one swipe. The comfortable finish works for everyday looks or a polished evening style. Its compact tube slips easily into a handbag for quick touch-ups.",
            category = ProductCategory.MAKEUP,
            price = 12.99,
            imageUrl = "https://images.pexels.com/photos/7667664/pexels-photo-7667664.jpeg",
        ),
        Product(
            id = 2,
            title = "Mascara",
            description = "This mascara defines lashes with rich colour and a flexible brush. The buildable formula lets you choose a natural coat or a fuller effect. It is an easy finishing step for day or evening makeup.",
            category = ProductCategory.MAKEUP,
            price = 14.50,
            imageUrl = "https://images.pexels.com/photos/3373734/pexels-photo-3373734.jpeg",
        ),
        Product(
            id = 3,
            title = "Facial Cleanser",
            description = "A gentle facial cleanser for washing away makeup, sunscreen, and daily impurities. The fresh gel texture rinses clean without leaving a heavy residue. Use it morning or evening as the first step in a simple skincare routine.",
            category = ProductCategory.SKIN_CARE,
            price = 16.00,
            imageUrl = "https://images.pexels.com/photos/6689393/pexels-photo-6689393.jpeg",
        ),
        Product(
            id = 4,
            title = "Face Moisturizer",
            description = "This face moisturizer gives skin a soft, comfortable layer of hydration. The cream spreads easily and sits well beneath makeup or sunscreen. Apply a small amount after cleansing whenever skin needs moisture.",
            category = ProductCategory.SKIN_CARE,
            price = 22.00,
            imageUrl = "https://images.pexels.com/photos/6690857/pexels-photo-6690857.jpeg",
        ),
        Product(
            id = 5,
            title = "Shampoo",
            description = "A daily shampoo that lifts away buildup while leaving hair feeling fresh. The easy-rinse lather suits a straightforward wash routine. Follow with conditioner through the lengths for a smoother finish.",
            category = ProductCategory.HAIR_CARE,
            price = 13.50,
            imageUrl = "https://images.pexels.com/photos/17576514/pexels-photo-17576514.jpeg",
        ),
        Product(
            id = 6,
            title = "Hair Conditioner",
            description = "This hair conditioner softens strands after shampooing and helps with everyday detangling. Its creamy texture coats the mid-lengths and ends without complicating your routine. Rinse after a short pause for hair that feels smooth and manageable.",
            category = ProductCategory.HAIR_CARE,
            price = 13.50,
            imageUrl = "https://images.pexels.com/photos/16253706/pexels-photo-16253706.jpeg",
        ),
        Product(
            id = 7,
            title = "Eau de Parfum",
            description = "A concentrated eau de parfum designed to add a lasting scent to your day. A light spray on pulse points creates a refined fragrance trail. The glass bottle makes an elegant addition to a dressing table.",
            category = ProductCategory.FRAGRANCE,
            price = 49.00,
            imageUrl = "https://images.pexels.com/photos/12538207/pexels-photo-12538207.jpeg",
        ),
        Product(
            id = 8,
            title = "Eau de Toilette",
            description = "This eau de toilette offers a lighter fragrance for everyday wear. Its airy concentration is easy to refresh during the day without feeling overpowering. Spray it onto pulse points or clothing from a short distance.",
            category = ProductCategory.FRAGRANCE,
            price = 34.00,
            imageUrl = "https://images.pexels.com/photos/9202849/pexels-photo-9202849.jpeg",
        ),
        Product(
            id = 9,
            title = "Body Lotion",
            description = "A smooth body lotion that helps keep skin feeling soft after bathing. The lightweight texture spreads quickly across arms and legs and absorbs with little effort. Use it daily on clean, dry skin for comfortable moisture.",
            category = ProductCategory.BATH_BODY,
            price = 12.00,
            imageUrl = "https://images.pexels.com/photos/10897817/pexels-photo-10897817.jpeg",
        ),
        Product(
            id = 10,
            title = "Shower Gel",
            description = "This shower gel creates a fresh lather for everyday cleansing. It rinses away easily and leaves skin ready for body lotion or fragrance. The pump bottle keeps the product convenient beside the bath or shower.",
            category = ProductCategory.BATH_BODY,
            price = 9.50,
            imageUrl = "https://images.pexels.com/photos/10928898/pexels-photo-10928898.jpeg",
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
