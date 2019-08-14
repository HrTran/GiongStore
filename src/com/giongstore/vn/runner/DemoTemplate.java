package com.giongstore.vn.runner;

import com.giongstore.vn.behavior.template_pattern.UploadFile;
import com.giongstore.vn.behavior.template_pattern.UploadImage;
import com.giongstore.vn.behavior.template_pattern.UploadVideo;

/**
 * Created by huytt99 on 14/08/19
 */
public class DemoTemplate {
    public static void main(String[] args) {
        UploadFile uploadStuff = new UploadImage();
        uploadStuff.process();

        System.out.println("\n==============================================\n");
        uploadStuff = new UploadVideo();
        uploadStuff.process();
    }
}
