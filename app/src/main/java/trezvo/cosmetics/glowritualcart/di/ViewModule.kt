package trezvo.cosmetics.glowritualcart.di

import trezvo.cosmetics.glowritualcart.ui.viewmodel.AppViewModel
import trezvo.cosmetics.glowritualcart.ui.viewmodel.CartViewModel
import trezvo.cosmetics.glowritualcart.ui.viewmodel.CheckoutViewModel
import trezvo.cosmetics.glowritualcart.ui.viewmodel.OnboardingViewModel
import trezvo.cosmetics.glowritualcart.ui.viewmodel.OrderViewModel
import trezvo.cosmetics.glowritualcart.ui.viewmodel.ProductDetailsViewModel
import trezvo.cosmetics.glowritualcart.ui.viewmodel.ProductViewModel
import trezvo.cosmetics.glowritualcart.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}