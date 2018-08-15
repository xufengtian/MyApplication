package com.example.mrxu.myapplication.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.mrxu.myapplication.BaseApplication;
import com.example.mrxu.myapplication.Constant;
import com.example.mrxu.myapplication.R;
import com.example.mrxu.myapplication.utils.glider.GlideCircleTransform;
import com.example.mrxu.myapplication.utils.glider.GlideRoundTransform;

import java.io.File;

/**
 * Description : 图片加载工具类 使用glide框架封装
 */
public class ImageLoaderUtils {

    public static void display(Context context, ImageView imageView, String url, int placeholder, int error) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        if (!TextUtils.isEmpty(url)) {
            if (url.replace(Constant.BASE_IMG_URL, "").equals("null")) {
                url = null;
            }
        }
        Glide.with(BaseApplication.getContext()).load(url).placeholder(placeholder)
                .error(error).crossFade().into(imageView);
    }

    public static void display(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        if (!TextUtils.isEmpty(url)) {
            if (url.replace(Constant.BASE_IMG_URL, "").equals("null")) {
                url = null;
            }
        }
        Glide.with(BaseApplication.getContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.drawable.default_photo)
                .error(R.drawable.default_photo)
                .crossFade().into(imageView);
    }

    public static void displayNODefaultPic(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        if (!TextUtils.isEmpty(url)) {
            if (url.replace(Constant.BASE_IMG_URL, "").equals("null")) {
                url = null;
            }
        }
        Glide.with(BaseApplication.getContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .crossFade().into(imageView);
    }

    public static void display(Context context, ImageView imageView, File url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        Glide.with(BaseApplication.getContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.drawable.default_photo)
                .error(R.drawable.default_photo)
                .crossFade().into(imageView);
    }


    public static void displaySmallPhoto(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        if (!TextUtils.isEmpty(url)) {
            if (url.replace(Constant.BASE_IMG_URL, "").equals("null")) {
                url = null;
            }
        }
        Glide.with(BaseApplication.getContext()).load(url).asBitmap()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.default_photo)
                .error(R.drawable.default_photo)
                .thumbnail(0.5f)
                .into(imageView);
    }

    public static void displayBigPhoto(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        if (!TextUtils.isEmpty(url)) {
            if (url.replace(Constant.BASE_IMG_URL, "").equals("null")) {
                url = null;
            }
        }
        Glide.with(BaseApplication.getContext()).load(url).asBitmap()
                .format(DecodeFormat.PREFER_ARGB_8888)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.default_photo)
                .error(R.drawable.default_photo)
                .into(imageView);
    }

    public static void display(Context context, ImageView imageView, int url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        Glide.with(BaseApplication.getContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.drawable.default_photo)
                .error(R.drawable.default_photo)
                .crossFade().into(imageView);
    }


    /**
     * 圆形头像
     */
    public static void displayRoundHead(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        if (!TextUtils.isEmpty(url)) {
            if (url.replace(Constant.BASE_IMG_URL, "").equals("null")) {
                url = null;
            }
        }
        Glide.with(BaseApplication.getContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.default_photo)
                .placeholder(R.drawable.default_photo)
                .centerCrop().transform(new GlideCircleTransform(context)).into(imageView);
    }

    public static void displayRound(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        if (!TextUtils.isEmpty(url)) {
            if (url.replace(Constant.BASE_IMG_URL, "").equals("null")) {
                url = null;
            }
        }
        Glide.with(BaseApplication.getContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.default_photo)
                .placeholder(R.drawable.default_photo)
                .centerCrop().transform(new GlideCircleTransform(context)).into(imageView);
    }

    public static void displayRound(Context context, ImageView imageView, int resId) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        Glide.with(BaseApplication.getContext()).load(resId)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.default_photo)
                .centerCrop().transform(new GlideCircleTransform(context)).into(imageView);
    }

    /**
     * 圆角
     */
    public static void displayCircularBead(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        if (!TextUtils.isEmpty(url)) {
            if (url.replace(Constant.BASE_IMG_URL, "").equals("null")) {
                url = null;
            }
        }
        Glide.with(BaseApplication.getContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.default_photo)
                .error(R.drawable.default_photo)
                .centerCrop().transform(new CenterCrop(context), new GlideRoundTransform(context)).into(imageView);
    }

    /**
     * 圆角  不带默认图
     */
    public static void displayCircularBeadNobg(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        if (!TextUtils.isEmpty(url)) {
            if (url.replace(Constant.BASE_IMG_URL, "").equals("null")) {
                url = null;
            }
        }
        Glide.with(BaseApplication.getContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop().transform(new CenterCrop(context), new GlideRoundTransform(context)).into(imageView);
    }


    /**
     * 自适应宽度加载图片。保持图片的长宽比例不变，通过修改imageView的高度来完全显示图片。
     */
    public static void loadIntoUseFitWidth(Context context, final String imageUrl, final ImageView imageView, final int vw) {
        Glide.with(BaseApplication.getContext())
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        if (imageView == null) {
                            return false;
                        }
                        if (imageView.getScaleType() != ImageView.ScaleType.FIT_XY) {
                            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        }
                        ViewGroup.LayoutParams params = imageView.getLayoutParams();
//                        int vw = imageView.getWidth() - imageView.getPaddingLeft() - imageView.getPaddingRight();
//                        int vw =DisplayUtil.dip2px(150);
                        params.width = vw;
                        float scale = (float) vw / (float) resource.getIntrinsicWidth();
                        int vh = Math.round(resource.getIntrinsicHeight() * scale);
                        params.height = vh + imageView.getPaddingTop() + imageView.getPaddingBottom();
                        if (vh > vw * 3) {
                            params.height = vw * 2;
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        }
                        imageView.setLayoutParams(params);

                        Log.d("jia", vw + "onResourceReady: " + vh);
                        return false;
                    }
                })
                .placeholder(R.drawable.default_photo)
                .error(R.drawable.default_photo)
                .into(imageView);
    }


}
