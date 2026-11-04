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
@w0(21)
@b1({b1.a.LIBRARY})
final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47827a = "WeightTypeface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47828b = "native_instance";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f47829c = "nativeCreateFromTypeface";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f47830d = "nativeCreateWeightAlias";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Field f47831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f47832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Method f47833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Constructor<Typeface> f47834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("sWeightCacheLock")
    private static final androidx.collection.b1<SparseArray<Typeface>> f47835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f47836j;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField(f47828b);
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod(f47829c, cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod(f47830d, cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        f47831e = declaredField;
        f47832f = declaredMethod;
        f47833g = declaredMethod2;
        f47834h = declaredConstructor;
        f47835i = new androidx.collection.b1<>(3);
        f47836j = new Object();
    }

    private j0() {
    }

    @p0
    private static Typeface a(long j10) {
        try {
            return f47834h.newInstance(Long.valueOf(j10));
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
        synchronized (f47836j) {
            try {
                long jC = c(typeface);
                androidx.collection.b1<SparseArray<Typeface>> b1Var = f47835i;
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
                Typeface typefaceA = z10 == typeface.isItalic() ? a(f(jC, i10)) : a(e(jC, i10, z10));
                sparseArrayG.put(i11 == true ? 1 : 0, typefaceA);
                return typefaceA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static long c(@NonNull Typeface typeface) {
        try {
            return f47831e.getLong(typeface);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static boolean d() {
        return f47831e != null;
    }

    @e.a({"BanUncheckedReflection"})
    private static long e(long j10, int i10, boolean z10) {
        try {
            Long l10 = (Long) f47832f.invoke(null, Long.valueOf(j10), Integer.valueOf(z10 ? 2 : 0));
            l10.longValue();
            return ((Long) f47833g.invoke(null, l10, Integer.valueOf(i10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @e.a({"BanUncheckedReflection"})
    private static long f(long j10, int i10) {
        try {
            return ((Long) f47833g.invoke(null, Long.valueOf(j10), Integer.valueOf(i10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
