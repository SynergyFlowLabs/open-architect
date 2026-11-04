package com.airbnb.lottie.manager;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.p0;
import com.airbnb.lottie.d;
import com.airbnb.lottie.utils.j;
import com.airbnb.lottie.x0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f88337e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Context f88338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f88339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private d f88340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, x0> f88341d;

    public b(Drawable.Callback callback, String str, d dVar, Map<String, x0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f88339b = str;
        } else {
            this.f88339b = str + '/';
        }
        this.f88341d = map;
        e(dVar);
        if (callback instanceof View) {
            this.f88338a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f88338a = null;
        }
    }

    private Bitmap d(String str, @p0 Bitmap bitmap) {
        synchronized (f88337e) {
            this.f88341d.get(str).i(bitmap);
        }
        return bitmap;
    }

    @p0
    public Bitmap a(String str) {
        x0 x0Var = this.f88341d.get(str);
        if (x0Var == null) {
            return null;
        }
        Bitmap bitmapB = x0Var.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        d dVar = this.f88340c;
        if (dVar != null) {
            Bitmap bitmapA = dVar.a(x0Var);
            if (bitmapA != null) {
                d(str, bitmapA);
            }
            return bitmapA;
        }
        Context context = this.f88338a;
        if (context == null) {
            return null;
        }
        String strD = x0Var.d();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strD.startsWith("data:") && strD.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strD.substring(strD.indexOf(44) + 1), 0);
                return d(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e10) {
                com.airbnb.lottie.utils.d.f("data URL did not have correct base64 format.", e10);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f88339b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f88339b + strD), null, options);
                if (bitmapDecodeStream != null) {
                    return d(str, j.m(bitmapDecodeStream, x0Var.g(), x0Var.e()));
                }
                com.airbnb.lottie.utils.d.e("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e11) {
                com.airbnb.lottie.utils.d.f("Unable to decode image `" + str + "`.", e11);
                return null;
            }
        } catch (IOException e12) {
            com.airbnb.lottie.utils.d.f("Unable to open asset.", e12);
            return null;
        }
    }

    @p0
    public x0 b(String str) {
        return this.f88341d.get(str);
    }

    public boolean c(Context context) {
        if (this.f88338a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f88338a;
    }

    public void e(@p0 d dVar) {
        this.f88340c = dVar;
    }

    @p0
    public Bitmap f(String str, @p0 Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapB = this.f88341d.get(str).b();
            d(str, bitmap);
            return bitmapB;
        }
        x0 x0Var = this.f88341d.get(str);
        Bitmap bitmapB2 = x0Var.b();
        x0Var.i(null);
        return bitmapB2;
    }
}
