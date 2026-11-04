package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47799b = "TypefaceCompatBaseImpl";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f47800c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e.a({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, androidx.core.content.res.f.d> f47801a = new ConcurrentHashMap<>();

    class a implements d<androidx.core.provider.h.c> {
        a() {
        }

        @Override // androidx.core.graphics.g0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(androidx.core.provider.h.c cVar) {
            return cVar.e();
        }

        @Override // androidx.core.graphics.g0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(androidx.core.provider.h.c cVar) {
            return cVar.f();
        }
    }

    class b implements d<androidx.core.content.res.f.e> {
        b() {
        }

        @Override // androidx.core.graphics.g0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(androidx.core.content.res.f.e eVar) {
            return eVar.e();
        }

        @Override // androidx.core.graphics.g0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(androidx.core.content.res.f.e eVar) {
            return eVar.f();
        }
    }

    class c implements d<androidx.core.content.res.f.e> {
        c() {
        }

        @Override // androidx.core.graphics.g0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(androidx.core.content.res.f.e eVar) {
            return eVar.e();
        }

        @Override // androidx.core.graphics.g0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(androidx.core.content.res.f.e eVar) {
            return eVar.f();
        }
    }

    private interface d<T> {
        int a(T t10);

        boolean b(T t10);
    }

    g0() {
    }

    private void a(Typeface typeface, androidx.core.content.res.f.d dVar) {
        long jO = o(typeface);
        if (jO != 0) {
            this.f47801a.put(Long.valueOf(jO), dVar);
        }
    }

    private androidx.core.content.res.f.e i(androidx.core.content.res.f.d dVar, int i10) {
        return (androidx.core.content.res.f.e) k(dVar.a(), i10, new b());
    }

    private androidx.core.content.res.f.e j(androidx.core.content.res.f.d dVar, int i10, boolean z10) {
        return (androidx.core.content.res.f.e) l(dVar.a(), i10, z10, new c());
    }

    private static <T> T k(T[] tArr, int i10, d<T> dVar) {
        boolean z10;
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        if ((i10 & 2) != 0) {
            z10 = true;
            int i12 = 3 >> 1;
        } else {
            z10 = false;
        }
        return (T) l(tArr, i11, z10, dVar);
    }

    private static <T> T l(T[] tArr, int i10, boolean z10, d<T> dVar) {
        T t10 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int iAbs = (Math.abs(dVar.a(t11) - i10) * 2) + (dVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > iAbs) {
                t10 = t11;
                i11 = iAbs;
            }
        }
        return t10;
    }

    private static long o(@p0 Typeface typeface) {
        long jLongValue = 0;
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            jLongValue = ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        return jLongValue;
    }

    @p0
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) {
        androidx.core.content.res.f.e eVarI = i(dVar, i10);
        if (eVarI == null) {
            return null;
        }
        Typeface typefaceI = a0.i(context, resources, eVarI.b(), eVarI.a(), 0, i10);
        a(typefaceI, dVar);
        return typefaceI;
    }

    @p0
    Typeface c(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10, boolean z10) {
        androidx.core.content.res.f.e eVarJ = j(dVar, i10, z10);
        if (eVarJ == null) {
            return null;
        }
        Typeface typefaceI = a0.i(context, resources, eVarJ.b(), eVarJ.a(), 0, 0);
        a(typefaceI, dVar);
        return typefaceI;
    }

    @p0
    public Typeface d(Context context, @p0 CancellationSignal cancellationSignal, @NonNull androidx.core.provider.h.c[] cVarArr, int i10) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(m(cVarArr, i10).d());
            try {
                Typeface typefaceF = f(context, inputStreamOpenInputStream);
                h0.a(inputStreamOpenInputStream);
                return typefaceF;
            } catch (IOException unused) {
                h0.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                h0.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @w0(29)
    @p0
    public Typeface e(@NonNull Context context, @p0 CancellationSignal cancellationSignal, @NonNull List<androidx.core.provider.h.c[]> list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface f(Context context, InputStream inputStream) {
        File fileE = h0.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (h0.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    @p0
    public Typeface g(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = h0.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (!h0.c(fileE, resources, i10)) {
                fileE.delete();
                return null;
            }
            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileE.getPath());
            fileE.delete();
            return typefaceCreateFromFile;
        } catch (RuntimeException unused) {
            fileE.delete();
            return null;
        } catch (Throwable th2) {
            fileE.delete();
            throw th2;
        }
    }

    @NonNull
    Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceA;
        try {
            typefaceA = i0.a(this, context, typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? typeface : typefaceA;
    }

    protected androidx.core.provider.h.c m(androidx.core.provider.h.c[] cVarArr, int i10) {
        return (androidx.core.provider.h.c) k(cVarArr, i10, new a());
    }

    @p0
    androidx.core.content.res.f.d n(Typeface typeface) {
        long jO = o(typeface);
        if (jO == 0) {
            return null;
        }
        return this.f47801a.get(Long.valueOf(jO));
    }
}
