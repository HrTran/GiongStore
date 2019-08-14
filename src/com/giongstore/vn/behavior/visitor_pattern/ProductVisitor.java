package com.giongstore.vn.behavior.visitor_pattern;

import com.giongstore.vn.creation.Clothes;
import com.giongstore.vn.creation.Watches;

/**
 * Created by huytt99 on 14/08/19
 */
public interface ProductVisitor {
    void visitWatch(Watches watches);
    void visitClothes(Clothes clothes);
}
