package com.giongstore.vn.runner;

import com.giongstore.vn.creation.Watches;
import com.giongstore.vn.structure.decorator_pattern.PayableProduct;
import com.giongstore.vn.structure.decorator_pattern.PayableWatches;

/**
 * Create by huytt99 on 02/07/2019
 */
public class DemoDecorator {
    public static void main(String[] args) {
        PayableProduct seikoWatch = new PayableWatches(new Watches("Seiko", 25.65), "cash");
        System.out.println(seikoWatch.info());
    }

}
