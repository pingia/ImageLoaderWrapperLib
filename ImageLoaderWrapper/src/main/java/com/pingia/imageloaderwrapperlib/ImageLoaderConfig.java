package com.pingia.imageloaderwrapperlib;

/**
 * author：admin on 2017/8/28.
 * mail:zengll@hztxt.com.cn
 * function:
 */
public class ImageLoaderConfig {
     private ImageLoadStrategy mLoadStrategy;
    private ImageLoaderConfig(Builder builder) {
        this.mLoadStrategy = builder.mStrategy;
    }

    public ImageLoadStrategy getLoadStrategy(){
        return this.mLoadStrategy;
    }





    public static class Builder {
        private ImageLoadStrategy mStrategy;

        public Builder() {
        }

        public Builder setLoadStrategy(ImageLoadStrategy strategy) {
            this.mStrategy = strategy;
            return this;
        }

        public ImageLoaderConfig build() {
            return new ImageLoaderConfig(this);
        }
    }


}
