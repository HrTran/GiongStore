package com.giongstore.vn.behavior.template_pattern;

/**
 * Created by huytt99 on 14/08/19
 */
public class UploadVideo extends UploadFile {
    @Override
    void browseFile() {
        System.out.println("Choosing file(s) which default extension is mp4, avi or ogg");
    }

    @Override
    void verify() {
        System.out.println("If video is not exceed 25Mb and not contain sensitive or forbidden content, video is acceptable");
    }

    @Override
    void pushToQueue() {
        // Do not push to queue
    }

    @Override
    void saveToDB() {
        System.out.println("Save video with id corresponding to product_id");
    }
}
