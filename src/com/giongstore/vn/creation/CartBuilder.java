package com.giongstore.vn.creation;

public class CartBuilder {
    public Cart addList1(){
        Cart cart = new Cart();
        cart.addItem(new Watches("Omega", 200D));
        cart.addItem(new SaleClothes("Owen T-shirt", 20D));
        return cart;
    }
}
