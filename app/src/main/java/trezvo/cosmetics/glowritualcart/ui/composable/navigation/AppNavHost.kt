package trezvo.cosmetics.glowritualcart.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import trezvo.cosmetics.glowritualcart.ui.composable.screen.cart.CJBEWCartScreen
import trezvo.cosmetics.glowritualcart.ui.composable.screen.checkout.CJBEWCheckoutScreen
import trezvo.cosmetics.glowritualcart.ui.composable.screen.home.CJBEWHomeScreen
import trezvo.cosmetics.glowritualcart.ui.composable.screen.onboarding.CJBEWOnboardingScreen
import trezvo.cosmetics.glowritualcart.ui.composable.screen.order.CJBEWOrdersScreen
import trezvo.cosmetics.glowritualcart.ui.composable.screen.productdetails.CJBEWProductDetailsScreen
import trezvo.cosmetics.glowritualcart.ui.composable.screen.settings.CJBEWSettingsScreen
import trezvo.cosmetics.glowritualcart.ui.composable.screen.splash.CJBEWSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            CJBEWSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            CJBEWOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            CJBEWHomeScreen(
                onNavigateToProductDetails = { id: Int ->
                    navController.navigate(
                        route = NavRoute.ProductDetails(id = id)
                    )
                }
            )
        }

        composable<NavRoute.ProductDetails> { backStackEntry ->
            val productDetails: NavRoute.ProductDetails = backStackEntry.toRoute()
            CJBEWProductDetailsScreen(
                productId = productDetails.id,
            )
        }

        composable<NavRoute.Cart> {
            CJBEWCartScreen(
                onNavigateToCheckoutScreen = {
                    navController.navigate(NavRoute.Checkout)
                }
            )
        }

        composable<NavRoute.Checkout> {
            CJBEWCheckoutScreen(
                onNavigateToOrdersScreen = {
                    navController.navigate(NavRoute.Orders) {
                        popUpTo(NavRoute.Home) { inclusive = false }
                    }
                }
            )
        }

        composable<NavRoute.Orders> {
            CJBEWOrdersScreen()
        }

        composable<NavRoute.Settings> {
            CJBEWSettingsScreen()
        }
    }
}