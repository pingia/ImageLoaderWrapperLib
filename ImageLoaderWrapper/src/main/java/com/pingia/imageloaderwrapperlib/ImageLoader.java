package com.pingia.imageloaderwrapperlib;

import android.widget.ImageView;

/**
 * author：admin on 2017/8/28.
 * mail:zengll@hztxt.com.cn
 * function:
 */
public class ImageLoader {
    private volatile static ImageLoader instance = null;
    private ImageLoaderConfig mLoadConfig;
    private ImageLoadStrategy mImageLoadStrategy;

    public static ImageLoader getInstance(){
        if(null == instance){
            synchronized (ImageLoader.class) {
                if(null == instance) {
                    instance = new ImageLoader();
                }
            }
        }

        return  instance;
    }

    public void init(ImageLoaderConfig config){
        this.mLoadConfig = config;
        this.mImageLoadStrategy = config.getLoadStrategy();
    }


    public void loadImg(Object path, ImageView iv){
        this.mImageLoadStrategy.loadImg(path,iv);
    }
    public void loadImg(Object path, ImageView iv, int placeHolderId){
        this.mImageLoadStrategy.loadImg(path,iv,placeHolderId);
    }

}
