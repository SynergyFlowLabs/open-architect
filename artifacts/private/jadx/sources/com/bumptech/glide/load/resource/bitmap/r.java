package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.p0;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97075a = "DrawableToBitmap";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.bumptech.glide.load.engine.bitmap_recycle.e f97076b = new a();

    class a extends com.bumptech.glide.load.engine.bitmap_recycle.f {
        a() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.f, com.bumptech.glide.load.engine.bitmap_recycle.e
        public void e(Bitmap bitmap) {
        }
    }

    private r() {
    }

    @p0
    static com.bumptech.glide.load.engine.v<Bitmap> a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmapB;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapB = null;
        } else {
            bitmapB = b(eVar, current, i10, i11);
            z10 = true;
        }
        if (!z10) {
            eVar = f97076b;
        }
        return g.d(bitmapB, eVar);
    }

    @p0
    private static Bitmap b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(f97075a, 5)) {
                drawable.toString();
            }
            return null;
        }
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable(f97075a, 5)) {
                drawable.toString();
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        Lock lockI = g0.i();
        lockI.lock();
        Bitmap bitmapF = eVar.f(i10, i11, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapF);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapF;
        } finally {
            lockI.unlock();
        }
    }
}
