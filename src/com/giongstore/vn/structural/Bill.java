package com.giongstore.vn.structural;

import com.giongstore.vn.creation.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by huytt99 on 14/07/2019
 */
public class Bill {
    private List<Product> productList = new ArrayList<>();

    public Bill(List<Product> productList) {
        this.productList.addAll(productList);
    }

    public void getDetail() {
        for(Product item : this.productList) {
            System.out.println("|" + item.getName() + "\t\t\t|\t" + item.getPrice() + "\t|");
        }
    }

    public Double getTotal() {
        Double sum = 0.0;
        for(Product item : this.productList) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void printBill() {
        Double total = getTotal();
        System.out.println("=====================================");
        getDetail();
        System.out.println("=====================================");
        System.out.printf("| TOTAL\t\t\t\t\t|\t%.2f\t|\n", total);
        System.out.println("=====================================");
    }
}
