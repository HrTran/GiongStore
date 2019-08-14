package com.giongstore.vn.behavior.template_pattern;

/**
 * Created by huytt99 on 14/08/19
 */
public abstract class UploadFile {
    abstract void browseFile();
    abstract void verify();
    abstract void pushToQueue();
    abstract void saveToDB();

    public final void process() {
        browseFile();
        verify();
        pushToQueue();
        saveToDB();
    }
}
