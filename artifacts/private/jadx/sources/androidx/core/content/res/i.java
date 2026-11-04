package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.annotation.y;
import androidx.core.graphics.a0;
import androidx.core.util.t;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47661a = "ResourcesCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f47662b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("sColorStateCacheLock")
    private static final WeakHashMap<e, SparseArray<d>> f47663c = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f47664d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.c
    public static final int f47665e = 0;

    @w0(21)
    static class a {
        private a() {
        }

        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    @w0(23)
    static class b {
        private b() {
        }

        static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        @NonNull
        static ColorStateList b(@NonNull Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    @w0(29)
    static class c {
        private c() {
        }

        static float a(@NonNull Resources resources, @q int i10) {
            return resources.getFloat(i10);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f47666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f47667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f47668c;

        d(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @p0 Resources.Theme theme) {
            this.f47666a = colorStateList;
            this.f47667b = configuration;
            this.f47668c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Resources f47669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Resources.Theme f47670b;

        e(@NonNull Resources resources, @p0 Resources.Theme theme) {
            this.f47669a = resources;
            this.f47670b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f47669a.equals(eVar.f47669a) && androidx.core.util.o.a(this.f47670b, eVar.f47670b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return androidx.core.util.o.b(this.f47669a, this.f47670b);
        }
    }

    public static abstract class f {
        @NonNull
        @b1({b1.a.LIBRARY})
        public static Handler e(@p0 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public final void c(final int i10, @p0 Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47676a.f(i10);
                }
            });
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public final void d(@NonNull final Typeface typeface, @p0 Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47674a.g(typeface);
                }
            });
        }

        public abstract void f(int i10);

        public abstract void g(@NonNull Typeface typeface);
    }

    public static final class g {

        @w0(23)
        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Object f47671a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f47672b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f47673c;

            private a() {
            }

            @e.a({"BanUncheckedReflection"})
            static void a(@NonNull Resources.Theme theme) {
                synchronized (f47671a) {
                    try {
                        if (!f47673c) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                f47672b = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException unused) {
                            }
                            f47673c = true;
                        }
                        Method method = f47672b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                                f47672b = null;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @w0(29)
        static class b {
            private b() {
            }

            static void a(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        private g() {
        }

        public static void a(@NonNull Resources.Theme theme) {
            b.a(theme);
        }
    }

    private i() {
    }

    private static void a(@NonNull e eVar, @androidx.annotation.n int i10, @NonNull ColorStateList colorStateList, @p0 Resources.Theme theme) {
        synchronized (f47664d) {
            try {
                WeakHashMap<e, SparseArray<d>> weakHashMap = f47663c;
                SparseArray<d> sparseArray = weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i10, new d(colorStateList, eVar.f47669a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(@NonNull Resources.Theme theme) {
        synchronized (f47664d) {
            try {
                Iterator<e> it = f47663c.keySet().iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next != null && theme.equals(next.f47670b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r2.f47668c == r6.hashCode()) goto L23;
     */
    @androidx.annotation.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList c(@androidx.annotation.NonNull androidx.core.content.res.i.e r6, @androidx.annotation.n int r7) {
        /*
            java.lang.Object r0 = androidx.core.content.res.i.f47664d
            monitor-enter(r0)
            r5 = 5
            java.util.WeakHashMap<androidx.core.content.res.i$e, android.util.SparseArray<androidx.core.content.res.i$d>> r1 = androidx.core.content.res.i.f47663c     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L3b
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L3b
            r5 = 4
            if (r1 == 0) goto L52
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L3b
            if (r2 <= 0) goto L52
            java.lang.Object r2 = r1.get(r7)     // Catch: java.lang.Throwable -> L3b
            r5 = 0
            androidx.core.content.res.i$d r2 = (androidx.core.content.res.i.d) r2     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L52
            r5 = 1
            android.content.res.Configuration r3 = r2.f47667b     // Catch: java.lang.Throwable -> L3b
            r5 = 2
            android.content.res.Resources r4 = r6.f47669a     // Catch: java.lang.Throwable -> L3b
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L3b
            r5 = 6
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L3b
            r5 = 1
            if (r3 == 0) goto L4e
            r5 = 6
            android.content.res.Resources$Theme r6 = r6.f47670b     // Catch: java.lang.Throwable -> L3b
            if (r6 != 0) goto L3e
            int r3 = r2.f47668c     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L4a
            r5 = 5
            goto L3e
        L3b:
            r6 = move-exception
            r5 = 0
            goto L55
        L3e:
            r5 = 1
            if (r6 == 0) goto L4e
            int r3 = r2.f47668c     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.hashCode()     // Catch: java.lang.Throwable -> L3b
            r5 = 5
            if (r3 != r6) goto L4e
        L4a:
            android.content.res.ColorStateList r6 = r2.f47666a     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return r6
        L4e:
            r5 = 5
            r1.remove(r7)     // Catch: java.lang.Throwable -> L3b
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            r6 = 0
            return r6
        L55:
            r5 = 7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.i.c(androidx.core.content.res.i$e, int):android.content.res.ColorStateList");
    }

    @p0
    public static Typeface d(@NonNull Context context, @y int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    @androidx.annotation.l
    public static int e(@NonNull Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i10, theme);
    }

    @p0
    public static ColorStateList f(@NonNull Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) throws Resources.NotFoundException {
        e eVar = new e(resources, theme);
        ColorStateList colorStateListC = c(eVar, i10);
        if (colorStateListC != null) {
            return colorStateListC;
        }
        ColorStateList colorStateListN = n(resources, i10, theme);
        if (colorStateListN == null) {
            return b.b(resources, i10, theme);
        }
        a(eVar, i10, colorStateListN, theme);
        return colorStateListN;
    }

    @p0
    public static Drawable g(@NonNull Resources resources, @v int i10, @p0 Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i10, theme);
    }

    @p0
    public static Drawable h(@NonNull Resources resources, @v int i10, int i11, @p0 Resources.Theme theme) throws Resources.NotFoundException {
        return a.b(resources, i10, i11, theme);
    }

    public static float i(@NonNull Resources resources, @q int i10) {
        return c.a(resources, i10);
    }

    @p0
    public static Typeface j(@NonNull Context context, @y int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public static Typeface k(@NonNull Context context, @y int i10, @NonNull TypedValue typedValue, int i11, @p0 f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, typedValue, i11, fVar, null, true, false);
    }

    public static void l(@NonNull Context context, @y int i10, @NonNull f fVar, @p0 Handler handler) throws Resources.NotFoundException {
        t.l(fVar);
        if (context.isRestricted()) {
            fVar.c(-4, handler);
        } else {
            p(context, i10, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    @NonNull
    private static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = f47662b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @p0
    private static ColorStateList n(Resources resources, int i10, @p0 Resources.Theme theme) {
        if (o(resources, i10)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean o(@NonNull Resources resources, @androidx.annotation.n int i10) {
        TypedValue typedValueM = m();
        resources.getValue(i10, typedValueM, true);
        int i11 = typedValueM.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static Typeface p(@NonNull Context context, int i10, @NonNull TypedValue typedValue, int i11, @p0 f fVar, @p0 Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceQ = q(context, resources, typedValue, i10, i11, fVar, handler, z10, z11);
        if (typefaceQ != null || fVar != null || z11) {
            return typefaceQ;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    private static Typeface q(@NonNull Context context, Resources resources, @NonNull TypedValue typedValue, int i10, int i11, @p0 f fVar, @p0 Handler handler, boolean z10, boolean z11) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (fVar != null) {
                fVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceL = a0.l(resources, i10, string, typedValue.assetCookie, i11);
        if (typefaceL != null) {
            if (fVar != null) {
                fVar.d(typefaceL, handler);
            }
            return typefaceL;
        }
        if (z11) {
            return null;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                androidx.core.content.res.f.b bVarB = androidx.core.content.res.f.b(resources.getXml(i10), resources);
                if (bVarB != null) {
                    return a0.g(context, bVarB, resources, i10, string, typedValue.assetCookie, i11, fVar, handler, z10);
                }
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            }
            Typeface typefaceI = a0.i(context, resources, i10, string, typedValue.assetCookie, i11);
            if (fVar != null) {
                if (typefaceI != null) {
                    fVar.d(typefaceI, handler);
                    return typefaceI;
                }
                fVar.c(-3, handler);
            }
            return typefaceI;
        } catch (IOException | XmlPullParserException unused) {
            if (fVar != null) {
                fVar.c(-3, handler);
            }
            return null;
        }
    }
}
