package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"SoonBlockedPrivateApi"})
@w0(26)
@b1({b1.a.LIBRARY})
final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47837a = "WeightTypeface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47838b = "native_instance";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f47839c = "nativeCreateFromTypefaceWithExactStyle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Field f47840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f47841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Constructor<Typeface> f47842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("sWeightCacheLock")
    private static final androidx.collection.b1<SparseArray<Typeface>> f47843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f47844h;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField(f47838b);
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod(f47839c, cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f47840d = declaredField;
        f47841e = declaredMethod;
        f47842f = declaredConstructor;
        f47843g = new androidx.collection.b1<>(3);
        f47844h = new Object();
    }

    private k0() {
    }

    @p0
    private static Typeface a(long j10) {
        try {
            return f47842f.newInstance(Long.valueOf(j10));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @p0
    static Typeface b(@NonNull Typeface typeface, int i10, boolean z10) {
        if (!d()) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f47844h) {
            try {
                long jC = c(typeface);
                androidx.collection.b1<SparseArray<Typeface>> b1Var = f47843g;
                SparseArray<Typeface> sparseArrayG = b1Var.g(jC);
                if (sparseArrayG == null) {
                    sparseArrayG = new SparseArray<>(4);
                    b1Var.n(jC, sparseArrayG);
                } else {
                    Typeface typeface2 = sparseArrayG.get(i11 == true ? 1 : 0);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface typefaceA = a(e(jC, i10, z10));
                sparseArrayG.put(i11 == true ? 1 : 0, typefaceA);
                return typefaceA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static long c(@NonNull Typeface typeface) {
        try {
            return f47840d.getLong(typeface);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static boolean d() {
        return f47840d != null;
    }

    @e.a({"BanUncheckedReflection"})
    private static long e(long j10, int i10, boolean z10) {
        try {
            return ((Long) f47841e.invoke(null, Long.valueOf(j10), Integer.valueOf(i10), Boolean.valueOf(z10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
