package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.collection.h3;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@w0(24)
@b1({b1.a.LIBRARY_GROUP_PREFIX})
class c0 extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f47706d = "TypefaceCompatApi24Impl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f47707e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f47708f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f47709g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Class<?> f47710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Constructor<?> f47711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Method f47712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Method f47713k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(f47707e);
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod(f47708f, ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod(f47709g, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f47711i = constructor;
        f47710h = cls;
        f47712j = method2;
        f47713k = method;
    }

    c0() {
    }

    private static boolean p(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f47712j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f47710h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f47713k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean r() {
        return f47712j != null;
    }

    private static Object s() {
        try {
            return f47711i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.g0
    @p0
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) {
        int i11;
        Object objS = s();
        if (objS == null) {
            return null;
        }
        androidx.core.content.res.f.e[] eVarArrA = dVar.a();
        int length = eVarArrA.length;
        while (i11 < length) {
            androidx.core.content.res.f.e eVar = eVarArrA[i11];
            ByteBuffer byteBufferB = h0.b(context, resources, eVar.b());
            i11 = (byteBufferB != null && p(objS, byteBufferB, eVar.c(), eVar.e(), eVar.f())) ? i11 + 1 : 0;
            return null;
        }
        return q(objS);
    }

    @Override // androidx.core.graphics.g0
    @p0
    public Typeface d(Context context, @p0 CancellationSignal cancellationSignal, @NonNull androidx.core.provider.h.c[] cVarArr, int i10) {
        Object objS = s();
        if (objS == null) {
            return null;
        }
        h3 h3Var = new h3();
        for (androidx.core.provider.h.c cVar : cVarArr) {
            Uri uriD = cVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) h3Var.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = h0.f(context, cancellationSignal, uriD);
                h3Var.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !p(objS, byteBufferF, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface typefaceQ = q(objS);
        if (typefaceQ == null) {
            return null;
        }
        return Typeface.create(typefaceQ, i10);
    }

    @Override // androidx.core.graphics.g0
    @NonNull
    Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = j0.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.h(context, typeface, i10, z10) : typefaceB;
    }
}
