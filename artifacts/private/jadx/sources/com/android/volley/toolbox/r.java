package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.l1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class r extends com.android.volley.s<Bitmap> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f89620g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f89621h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f89622i = 2.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f89623j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f89624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    @p0
    private com.android.volley.v.b<Bitmap> f89625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f89626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f89627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f89628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView.ScaleType f89629f;

    public r(String str, com.android.volley.v.b<Bitmap> bVar, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, @p0 com.android.volley.v.a aVar) {
        super(0, str, aVar);
        this.f89624a = new Object();
        setRetryPolicy(new com.android.volley.i(1000, 2, 2.0f));
        this.f89625b = bVar;
        this.f89626c = config;
        this.f89627d = i10;
        this.f89628e = i11;
        this.f89629f = scaleType;
    }

    private com.android.volley.v<Bitmap> e(com.android.volley.o oVar) {
        Bitmap bitmapCreateScaledBitmap;
        byte[] bArr = oVar.f89471b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f89627d == 0 && this.f89628e == 0) {
            options.inPreferredConfig = this.f89626c;
            bitmapCreateScaledBitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iK = k(this.f89627d, this.f89628e, i10, i11, this.f89629f);
            int iK2 = k(this.f89628e, this.f89627d, i11, i10, this.f89629f);
            options.inJustDecodeBounds = false;
            options.inSampleSize = f(i10, i11, iK, iK2);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray == null || (bitmapDecodeByteArray.getWidth() <= iK && bitmapDecodeByteArray.getHeight() <= iK2)) {
                bitmapCreateScaledBitmap = bitmapDecodeByteArray;
            } else {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iK, iK2, true);
                bitmapDecodeByteArray.recycle();
            }
        }
        return bitmapCreateScaledBitmap == null ? com.android.volley.v.a(new com.android.volley.q(oVar)) : com.android.volley.v.c(bitmapCreateScaledBitmap, m.e(oVar));
    }

    @l1
    static int f(int i10, int i11, int i12, int i13) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int k(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 != 0 || i11 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i10 == 0) {
                    return (int) (((double) i12) * (((double) i11) / ((double) i13)));
                }
                if (i11 == 0) {
                    return i10;
                }
                double d10 = ((double) i13) / ((double) i12);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i11;
                    return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
                }
                double d12 = i11;
                return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
            }
            if (i10 != 0) {
                return i10;
            }
        }
        return i12;
    }

    @Override // com.android.volley.s
    public void cancel() {
        super.cancel();
        synchronized (this.f89624a) {
            try {
                this.f89625b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.s
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void deliverResponse(Bitmap bitmap) {
        com.android.volley.v.b<Bitmap> bVar;
        synchronized (this.f89624a) {
            bVar = this.f89625b;
        }
        if (bVar != null) {
            bVar.onResponse(bitmap);
        }
    }

    @Override // com.android.volley.s
    public com.android.volley.s.d getPriority() {
        return com.android.volley.s.d.LOW;
    }

    @Override // com.android.volley.s
    protected com.android.volley.v<Bitmap> parseNetworkResponse(com.android.volley.o oVar) {
        com.android.volley.v<Bitmap> vVarE;
        synchronized (f89623j) {
            try {
                try {
                    vVarE = e(oVar);
                } catch (OutOfMemoryError e10) {
                    com.android.volley.b0.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(oVar.f89471b.length), getUrl());
                    return com.android.volley.v.a(new com.android.volley.q(e10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVarE;
    }

    @Deprecated
    public r(String str, com.android.volley.v.b<Bitmap> bVar, int i10, int i11, Bitmap.Config config, com.android.volley.v.a aVar) {
        this(str, bVar, i10, i11, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }
}
