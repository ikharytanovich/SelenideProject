package pages;

import pages.mystore.*;

public interface PageFactory {
    LogInPage logInPage = new LogInPage();
    MenuBar menuBar = new MenuBar();
    CatalogPage catalogPage = new CatalogPage();
    PaymentPage paymentPage = new PaymentPage();
    UserPage userPage = new UserPage();
    WishlistPage wishlistPage = new WishlistPage();
    ItemDetailPage itemDetailPage = new ItemDetailPage();
}
