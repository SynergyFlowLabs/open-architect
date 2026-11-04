package com.bumptech.glide.util;

import android.graphics.Bitmap;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f97487a = 31;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f97488b = 17;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f97489c = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f97490d = new char[64];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f97491a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f97491a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97491a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97491a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97491a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f97491a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private m() {
    }

    public static void a() {
        if (!s()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!t()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(@p0 Object obj, @p0 Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof com.bumptech.glide.load.model.l ? ((com.bumptech.glide.load.model.l) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean d(@p0 Object obj, @p0 Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @NonNull
    private static String e(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f97489c;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & com.google.common.base.c.f116464q];
        }
        return new String(cArr);
    }

    @NonNull
    public static <T> Queue<T> f(int i10) {
        return new ArrayDeque(i10);
    }

    public static int g(int i10, int i11, @p0 Bitmap.Config config) {
        return i10 * i11 * i(config);
    }

    @e.b(19)
    public static int h(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    private static int i(@p0 Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f97491a[config.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                return i10 != 4 ? 4 : 8;
            }
        }
        return i11;
    }

    @Deprecated
    public static int j(@NonNull Bitmap bitmap) {
        return h(bitmap);
    }

    @NonNull
    public static <T> List<T> k(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static int l(float f10) {
        return m(f10, 17);
    }

    public static int m(float f10, int i10) {
        return o(Float.floatToIntBits(f10), i10);
    }

    public static int n(int i10) {
        return o(i10, 17);
    }

    public static int o(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int p(@p0 Object obj, int i10) {
        return o(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int q(boolean z10) {
        return r(z10, 17);
    }

    public static int r(boolean z10, int i10) {
        return o(z10 ? 1 : 0, i10);
    }

    public static boolean s() {
        return !t();
    }

    public static boolean t() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean u(int i10) {
        if (i10 <= 0 && i10 != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public static boolean v(int i10, int i11) {
        return u(i10) && u(i11);
    }

    @NonNull
    public static String w(@NonNull byte[] bArr) {
        String strE;
        char[] cArr = f97490d;
        synchronized (cArr) {
            try {
                strE = e(bArr, cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strE;
    }
}
