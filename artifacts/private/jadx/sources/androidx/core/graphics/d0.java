package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@w0(26)
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class d0 extends b0 {
    private static final int A = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f47740t = "TypefaceCompatApi26Impl";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f47741u = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f47742v = "addFontFromAssetManager";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f47743w = "addFontFromBuffer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f47744x = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f47745y = "freeze";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f47746z = "abortCreation";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Class<?> f47747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Constructor<?> f47748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Method f47749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final Method f47750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final Method f47751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final Method f47752r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final Method f47753s;

    public d0() {
        Class<?> clsD;
        Constructor<?> constructorE;
        Method methodA;
        Method methodB;
        Method methodF;
        Method methodZ;
        Method methodC;
        try {
            clsD = D();
            constructorE = E(clsD);
            methodA = A(clsD);
            methodB = B(clsD);
            methodF = F(clsD);
            methodZ = z(clsD);
            methodC = C(clsD);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            clsD = null;
            constructorE = null;
            methodA = null;
            methodB = null;
            methodF = null;
            methodZ = null;
            methodC = null;
        }
        this.f47747m = clsD;
        this.f47748n = constructorE;
        this.f47749o = methodA;
        this.f47750p = methodB;
        this.f47751q = methodF;
        this.f47752r = methodZ;
        this.f47753s = methodC;
    }

    @p0
    private Object t() {
        try {
            return this.f47748n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void u(Object obj) {
        try {
            this.f47752r.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean v(Context context, Object obj, String str, int i10, int i11, int i12, @p0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f47749o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean w(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f47750p.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean x(Object obj) {
        try {
            return ((Boolean) this.f47751q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean y() {
        return this.f47749o != null;
    }

    protected Method A(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod(f47742v, AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    protected Method B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f47743w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method C(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(f47744x, cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> D() throws ClassNotFoundException {
        return Class.forName(f47741u);
    }

    protected Constructor<?> E(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    protected Method F(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f47745y, null);
    }

    @Override // androidx.core.graphics.b0, androidx.core.graphics.g0
    @p0
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) {
        if (!y()) {
            return super.b(context, dVar, resources, i10);
        }
        Object objT = t();
        if (objT == null) {
            return null;
        }
        androidx.core.content.res.f.e[] eVarArrA = dVar.a();
        int length = eVarArrA.length;
        int i11 = 0;
        while (i11 < length) {
            androidx.core.content.res.f.e eVar = eVarArrA[i11];
            String strA = eVar.a();
            int iC = eVar.c();
            int iE = eVar.e();
            boolean zF = eVar.f();
            FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(eVar.d());
            d0 d0Var = this;
            Context context2 = context;
            if (!d0Var.v(context2, objT, strA, iC, iE, zF ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                d0Var.u(objT);
                return null;
            }
            i11++;
            this = d0Var;
            context = context2;
        }
        d0 d0Var2 = this;
        if (d0Var2.x(objT)) {
            return d0Var2.q(objT);
        }
        return null;
    }

    @Override // androidx.core.graphics.b0, androidx.core.graphics.g0
    @p0
    public Typeface d(Context context, @p0 CancellationSignal cancellationSignal, @NonNull androidx.core.provider.h.c[] cVarArr, int i10) {
        Typeface typefaceQ;
        Object obj;
        d0 d0Var;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!y()) {
            androidx.core.provider.h.c cVarM = m(cVarArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cVarM.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(cVarM.e()).setItalic(cVarM.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapH = h0.h(context, cVarArr, cancellationSignal);
        Object objT = t();
        if (objT == null) {
            return null;
        }
        int length = cVarArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            androidx.core.provider.h.c cVar = cVarArr[i11];
            ByteBuffer byteBuffer = mapH.get(cVar.d());
            if (byteBuffer == null) {
                obj = objT;
                d0Var = this;
            } else {
                d0 d0Var2 = this;
                boolean zW = d0Var2.w(objT, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0);
                obj = objT;
                d0Var = d0Var2;
                if (!zW) {
                    d0Var.u(obj);
                    return null;
                }
                z10 = true;
            }
            i11++;
            this = d0Var;
            objT = obj;
            z10 = z10;
        }
        Object obj2 = objT;
        d0 d0Var3 = this;
        if (!z10) {
            d0Var3.u(obj2);
            return null;
        }
        if (d0Var3.x(obj2) && (typefaceQ = d0Var3.q(obj2)) != null) {
            return Typeface.create(typefaceQ, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.g0
    @w0(29)
    @p0
    public /* bridge */ /* synthetic */ Typeface e(@NonNull Context context, @p0 CancellationSignal cancellationSignal, @NonNull List list, int i10) {
        return super.e(context, cancellationSignal, list, i10);
    }

    @Override // androidx.core.graphics.g0
    @p0
    public Typeface g(Context context, Resources resources, int i10, String str, int i11) {
        if (!y()) {
            return super.g(context, resources, i10, str, i11);
        }
        Object objT = t();
        if (objT == null) {
            return null;
        }
        if (!v(context, objT, str, 0, -1, -1, null)) {
            u(objT);
            return null;
        }
        if (x(objT)) {
            return q(objT);
        }
        return null;
    }

    @Override // androidx.core.graphics.b0, androidx.core.graphics.g0
    @NonNull
    Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = k0.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.h(context, typeface, i10, z10) : typefaceB;
    }

    @p0
    protected Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f47747m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f47753s.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method z(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f47746z, null);
    }
}
