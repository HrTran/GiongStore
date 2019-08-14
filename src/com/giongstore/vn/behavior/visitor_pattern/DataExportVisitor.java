package com.giongstore.vn.behavior.visitor_pattern;

import com.giongstore.vn.creation.Clothes;
import com.giongstore.vn.creation.Watches;

/**
 * Created by huytt99 on 14/08/19
 */
public class DataExportVisitor implements ProductVisitor {
    @Override
    public void visitClothes(Clothes clothes) {
        System.out.println("<name>" + clothes.getName() + "</name>\n" +
                           "<price>" + clothes.getPrice() + "</price>\n");
    }

    @Override
    public void visitWatch(Watches watches) {
        System.out.println("data: {\n" +
                           "    name: \"" + watches.getName() + "\"\n" +
                           "    price: \"" + watches.getPrice() + "\"\n" +
                            "}");
    }
}
