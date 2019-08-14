package com.giongstore.vn.behavior.template_pattern;

/**
 * Created by huytt99 on 14/08/19
 */
public class UploadImage extends UploadFile {

    @Override
    void browseFile() {
        System.out.println("Choosing file(s) which default extension is jpeg, png or jpg");
    }

    @Override
    void verify() {
        System.out.println("If image is not exceed 2Mb and not contain sensitive image, image is acceptable");
    }

    @Override
    void pushToQueue() {
        System.out.println("Parse JSON, Push to Kafka, topic: img-product-452");
    }

    @Override
    void saveToDB() {
        System.out.println("Save image with id corresponding to product_id");
    }
}
