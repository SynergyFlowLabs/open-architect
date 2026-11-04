package com.google.android.filament.android;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;

/* JADX INFO: loaded from: classes4.dex */
public final class TextureHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f104684a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f104685b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f104686c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f104687d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f104688e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f104689f = 5;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104690a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f104690a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104690a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104690a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f104690a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f104690a[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f104690a[Bitmap.Config.HARDWARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private TextureHelper() {
    }

    public static void a(@NonNull Engine engine, @NonNull Texture texture, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13, @g0(from = 0) int i14, @NonNull Bitmap bitmap) {
        int iE = e(bitmap.getConfig());
        if (iE == 2 || iE == 5) {
            throw new IllegalArgumentException("Unsupported config: ARGB_4444 or HARDWARE");
        }
        nSetBitmap(texture.getNativeObject(), engine.getNativeObject(), i10, i11, i12, i13, i14, bitmap, iE);
    }

    public static void b(@NonNull Engine engine, @NonNull Texture texture, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13, @g0(from = 0) int i14, @NonNull Bitmap bitmap, Object obj, Runnable runnable) {
        int iE = e(bitmap.getConfig());
        if (iE == 2 || iE == 5) {
            throw new IllegalArgumentException("Unsupported config: ARGB_4444 or HARDWARE");
        }
        nSetBitmapWithCallback(texture.getNativeObject(), engine.getNativeObject(), i10, i11, i12, i13, i14, bitmap, iE, obj, runnable);
    }

    public static void c(@NonNull Engine engine, @NonNull Texture texture, @g0(from = 0) int i10, @NonNull Bitmap bitmap) {
        a(engine, texture, i10, 0, 0, texture.v(i10), texture.s(i10), bitmap);
    }

    public static void d(@NonNull Engine engine, @NonNull Texture texture, @g0(from = 0) int i10, @NonNull Bitmap bitmap, Object obj, Runnable runnable) {
        b(engine, texture, i10, 0, 0, texture.v(i10), texture.s(i10), bitmap, obj, runnable);
    }

    private static int e(Bitmap.Config config) {
        int i10 = a.f104690a[config.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 5) {
            return i10 != 6 ? 3 : 5;
        }
        return 4;
    }

    private static native void nSetBitmap(long j10, long j11, int i10, int i11, int i12, int i13, int i14, Bitmap bitmap, int i15);

    private static native void nSetBitmapWithCallback(long j10, long j11, int i10, int i11, int i12, int i13, int i14, Bitmap bitmap, int i15, Object obj, Runnable runnable);
}
