package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.collection.d1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final boolean f47692a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final boolean f47693b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g0 f47694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d1<String, Typeface> f47695d;

    @b1({b1.a.LIBRARY})
    public static class a extends androidx.core.provider.h.d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private androidx.core.content.res.i.f f47696j;

        public a(@p0 androidx.core.content.res.i.f fVar) {
            this.f47696j = fVar;
        }

        @Override // androidx.core.provider.h.d
        public void a(int i10) {
            androidx.core.content.res.i.f fVar = this.f47696j;
            if (fVar != null) {
                fVar.f(i10);
            }
        }

        @Override // androidx.core.provider.h.d
        public void b(@NonNull Typeface typeface) {
            androidx.core.content.res.i.f fVar = this.f47696j;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        androidx.tracing.b.c("TypefaceCompat static init");
        f47694c = new f0();
        f47695d = new d1<>(16);
        androidx.tracing.b.f();
    }

    private a0() {
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static void a() {
        f47695d.d();
    }

    @NonNull
    public static Typeface b(@NonNull Context context, @p0 Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @NonNull
    public static Typeface c(@NonNull Context context, @p0 Typeface typeface, @androidx.annotation.g0(from = 1, to = 1000) int i10, boolean z10) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        androidx.core.util.t.g(i10, 1, 1000, "weight");
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return f47694c.h(context, typeface, i10, z10);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public static Typeface d(@NonNull Context context, @p0 CancellationSignal cancellationSignal, @NonNull androidx.core.provider.h.c[] cVarArr, int i10) {
        androidx.tracing.b.c("TypefaceCompat.createFromFontInfo");
        try {
            Typeface typefaceD = f47694c.d(context, cancellationSignal, cVarArr, i10);
            androidx.tracing.b.f();
            return typefaceD;
        } catch (Throwable th2) {
            androidx.tracing.b.f();
            throw th2;
        }
    }

    @w0(29)
    @b1({b1.a.LIBRARY})
    @p0
    public static Typeface e(@NonNull Context context, @p0 CancellationSignal cancellationSignal, @NonNull List<androidx.core.provider.h.c[]> list, int i10) {
        androidx.tracing.b.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f47694c.e(context, cancellationSignal, list, i10);
        } finally {
            androidx.tracing.b.f();
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    @Deprecated
    public static Typeface f(@NonNull Context context, @NonNull androidx.core.content.res.f.b bVar, @NonNull Resources resources, int i10, int i11, @p0 androidx.core.content.res.i.f fVar, @p0 Handler handler, boolean z10) {
        return g(context, bVar, resources, i10, null, 0, i11, fVar, handler, z10);
    }

    @b1({b1.a.LIBRARY})
    @p0
    public static Typeface g(@NonNull Context context, @NonNull androidx.core.content.res.f.b bVar, @NonNull Resources resources, int i10, @p0 String str, int i11, int i12, @p0 androidx.core.content.res.i.f fVar, @p0 Handler handler, boolean z10) {
        Typeface typefaceB;
        if (bVar instanceof androidx.core.content.res.f.C0386f) {
            androidx.core.content.res.f.C0386f c0386f = (androidx.core.content.res.f.C0386f) bVar;
            Typeface typefaceN = n(c0386f.d());
            if (typefaceN != null) {
                if (fVar != null) {
                    fVar.d(typefaceN, handler);
                }
                return typefaceN;
            }
            typefaceB = androidx.core.provider.h.g(context, c0386f.a() != null ? z.a(new Object[]{c0386f.c(), c0386f.a()}) : z.a(new Object[]{c0386f.c()}), i12, !z10 ? fVar != null : c0386f.b() != 0, z10 ? c0386f.e() : -1, androidx.core.content.res.i.f.e(handler), new a(fVar));
        } else {
            typefaceB = f47694c.b(context, (androidx.core.content.res.f.d) bVar, resources, i12);
            if (fVar != null) {
                if (typefaceB != null) {
                    fVar.d(typefaceB, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f47695d.j(j(resources, i10, str, i11, i12), typefaceB);
        }
        return typefaceB;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    @Deprecated
    public static Typeface h(@NonNull Context context, @NonNull Resources resources, int i10, String str, int i11) {
        return i(context, resources, i10, str, 0, i11);
    }

    @b1({b1.a.LIBRARY})
    @p0
    public static Typeface i(@NonNull Context context, @NonNull Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceG = f47694c.g(context, resources, i10, str, i12);
        if (typefaceG != null) {
            f47695d.j(j(resources, i10, str, i11, i12), typefaceG);
        }
        return typefaceG;
    }

    private static String j(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + org.apache.commons.codec.language.l.f335457d + str + org.apache.commons.codec.language.l.f335457d + i11 + org.apache.commons.codec.language.l.f335457d + i10 + org.apache.commons.codec.language.l.f335457d + i12;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    @Deprecated
    public static Typeface k(@NonNull Resources resources, int i10, int i11) {
        return l(resources, i10, null, 0, i11);
    }

    @b1({b1.a.LIBRARY})
    @p0
    public static Typeface l(@NonNull Resources resources, int i10, @p0 String str, int i11, int i12) {
        return f47695d.f(j(resources, i10, str, i11, i12));
    }

    @p0
    private static Typeface m(Context context, Typeface typeface, int i10) {
        g0 g0Var = f47694c;
        androidx.core.content.res.f.d dVarN = g0Var.n(typeface);
        if (dVarN == null) {
            return null;
        }
        return g0Var.b(context, dVarN, context.getResources(), i10);
    }

    private static Typeface n(@p0 String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}
