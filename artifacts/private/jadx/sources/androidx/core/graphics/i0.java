package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47817a = "WeightTypeface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47818b = "native_instance";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Field f47819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("sWeightCacheLock")
    private static final androidx.collection.b1<SparseArray<Typeface>> f47820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f47821e;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField(f47818b);
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            declaredField = null;
        }
        f47819c = declaredField;
        f47820d = new androidx.collection.b1<>(3);
        f47821e = new Object();
    }

    private i0() {
    }

    @p0
    static Typeface a(@NonNull g0 g0Var, @NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        if (!d()) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f47821e) {
            try {
                long jC = c(typeface);
                androidx.collection.b1<SparseArray<Typeface>> b1Var = f47820d;
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
                Typeface typefaceB = b(g0Var, context, typeface, i10, z10);
                if (typefaceB == null) {
                    typefaceB = e(typeface, i10, z10);
                }
                sparseArrayG.put(i11 == true ? 1 : 0, typefaceB);
                return typefaceB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @p0
    private static Typeface b(@NonNull g0 g0Var, @NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        androidx.core.content.res.f.d dVarN = g0Var.n(typeface);
        if (dVarN == null) {
            return null;
        }
        return g0Var.c(context, dVarN, context.getResources(), i10, z10);
    }

    private static long c(@NonNull Typeface typeface) {
        try {
            return ((Number) f47819c.get(typeface)).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static boolean d() {
        return f47819c != null;
    }

    private static Typeface e(Typeface typeface, int i10, boolean z10) {
        int i11 = 0;
        boolean z11 = i10 >= 600;
        if (z11 || z10) {
            if (z11) {
                i11 = !z10 ? 1 : 3;
            } else {
                i11 = 2;
            }
        }
        return Typeface.create(typeface, i11);
    }
}
