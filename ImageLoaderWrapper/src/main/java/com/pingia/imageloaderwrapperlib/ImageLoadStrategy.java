package com.pingia.imageloaderwrapperlib;

import android.widget.ImageView;

/**
 * author：admin on 2017/8/28.
 * mail:zengll@hztxt.com.cn
 * function:
 */
public interface ImageLoadStrategy {
     void loadImg(Object path, ImageView iv);
     void loadImg(Object path, ImageView iv, int placeHolderId);
}
