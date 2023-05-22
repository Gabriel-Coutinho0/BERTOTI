public class main {
        public static void main(String[] args) {
            ShoppingCart shoppingCart = new ShoppingCart();
            DesktopView shoppingCartView = new DesktopView();
            MobileView shoppingCartView2 = new MobileView();
            shoppingCart.attach(shoppingCartView);
            shoppingCart.attach(shoppingCartView2);
    
            Item item1 = new Item("Item 1", 10.5);
            Item item2 = new Item("Item 2", 20.0);
    
            shoppingCart.addItem(item1);
            shoppingCart.addItem(item2);
    
            shoppingCart.removeItem(item1);
        }
    }
