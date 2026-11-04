package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
public class Colors {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f103858b;

        static {
            int[] iArr = new int[b.values().length];
            f103858b = iArr;
            try {
                iArr[b.ACCURATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103858b[b.FAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.values().length];
            f103857a = iArr2;
            try {
                iArr2[e.SRGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103857a[e.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f103857a[e.PREMULTIPLIED_SRGB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f103857a[e.PREMULTIPLIED_LINEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        ACCURATE,
        FAST
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public enum d {
        SRGB,
        LINEAR
    }

    public enum e {
        SRGB,
        LINEAR,
        PREMULTIPLIED_SRGB,
        PREMULTIPLIED_LINEAR
    }

    private Colors() {
    }

    @NonNull
    @d1(3)
    public static float[] a(float f10) {
        float[] fArr = new float[3];
        nCct(f10, fArr);
        return fArr;
    }

    @NonNull
    @d1(3)
    public static float[] b(float f10) {
        float[] fArr = new float[3];
        nIlluminantD(f10, fArr);
        return fArr;
    }

    @NonNull
    public static float[] c(@NonNull b bVar, @NonNull @d1(min = 3) float[] fArr) {
        int i10 = a.f103858b[bVar.ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            while (i11 < 3) {
                float f10 = fArr[i11];
                fArr[i11] = f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
                i11++;
            }
        } else if (i10 == 2) {
            while (i11 < 3) {
                fArr[i11] = (float) Math.sqrt(fArr[i11]);
                i11++;
            }
        }
        return fArr;
    }

    @NonNull
    @d1(3)
    public static float[] d(@NonNull d dVar, float f10, float f11, float f12) {
        return e(dVar, new float[]{f10, f11, f12});
    }

    @NonNull
    @d1(min = 3)
    public static float[] e(@NonNull d dVar, @NonNull @d1(min = 3) float[] fArr) {
        return dVar == d.LINEAR ? fArr : c(b.ACCURATE, fArr);
    }

    @NonNull
    @d1(4)
    public static float[] f(@NonNull e eVar, float f10, float f11, float f12, float f13) {
        int i10 = 0 << 2;
        return g(eVar, new float[]{f10, f11, f12, f13});
    }

    @NonNull
    @d1(min = 4)
    public static float[] g(@NonNull e eVar, @NonNull @d1(min = 4) float[] fArr) {
        int i10 = a.f103857a[eVar.ordinal()];
        if (i10 == 1) {
            c(b.ACCURATE, fArr);
        } else if (i10 != 2) {
            return i10 != 3 ? fArr : c(b.ACCURATE, fArr);
        }
        float f10 = fArr[3];
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        return fArr;
    }

    private static native void nCct(float f10, @NonNull @d1(3) float[] fArr);

    private static native void nIlluminantD(float f10, @NonNull @d1(3) float[] fArr);
}
