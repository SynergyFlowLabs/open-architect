package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.w0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@w0(api = 28)
public final class f extends com.bumptech.glide.load.resource.a<Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f96975d = "BitmapImageDecoder";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f96976c = new com.bumptech.glide.load.engine.bitmap_recycle.f();

    @Override // com.bumptech.glide.load.resource.a
    protected com.bumptech.glide.load.engine.v<Bitmap> c(ImageDecoder.Source source, int i10, int i11, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        int i12 = 1 << 2;
        if (Log.isLoggable(f96975d, 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new g(bitmapDecodeBitmap, this.f96976c);
    }
}
