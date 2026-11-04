package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.collection.h3;
import androidx.collection.j3;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public final class w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f11638h = "ResourceManagerInternal";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f11639i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f11641k = "appcompat_skip_skip";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f11642l = "android.graphics.drawable.VectorDrawable";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static w0 f11643m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, j3<ColorStateList>> f11645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h3<String, e> f11646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j3<String> f11647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.b1<WeakReference<Drawable.ConstantState>>> f11648d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f11649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f11651g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final PorterDuff.Mode f11640j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f11644n = new c(6);

    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme) {
            try {
                return androidx.appcompat.graphics.drawable.a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.e(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static class c extends androidx.collection.d1<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int s(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter t(int i10, PorterDuff.Mode mode) {
            return f(Integer.valueOf(s(i10, mode)));
        }

        PorterDuffColorFilter u(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return j(Integer.valueOf(s(i10, mode)), porterDuffColorFilter);
        }
    }

    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    k.a.C2242a.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    private interface e {
        Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public interface f {
        @androidx.annotation.p0
        Drawable a(@NonNull w0 w0Var, @NonNull Context context, @androidx.annotation.v int i10);

        @androidx.annotation.p0
        ColorStateList b(@NonNull Context context, @androidx.annotation.v int i10);

        @androidx.annotation.p0
        PorterDuff.Mode c(int i10);

        boolean d(@NonNull Context context, @androidx.annotation.v int i10, @NonNull Drawable drawable);

        boolean e(@NonNull Context context, @androidx.annotation.v int i10, @NonNull Drawable drawable);
    }

    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.e(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private void a(@NonNull String str, @NonNull e eVar) {
        if (this.f11646b == null) {
            this.f11646b = new h3<>();
        }
        this.f11646b.put(str, eVar);
    }

    private synchronized boolean b(@NonNull Context context, long j10, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            androidx.collection.b1<WeakReference<Drawable.ConstantState>> b1Var = this.f11648d.get(context);
            if (b1Var == null) {
                b1Var = new androidx.collection.b1<>();
                this.f11648d.put(context, b1Var);
            }
            b1Var.n(j10, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void c(@NonNull Context context, @androidx.annotation.v int i10, @NonNull ColorStateList colorStateList) {
        if (this.f11645a == null) {
            this.f11645a = new WeakHashMap<>();
        }
        j3<ColorStateList> j3Var = this.f11645a.get(context);
        if (j3Var == null) {
            j3Var = new j3<>();
            this.f11645a.put(context, j3Var);
        }
        j3Var.a(i10, colorStateList);
    }

    private void d(@NonNull Context context) {
        if (this.f11650f) {
            return;
        }
        this.f11650f = true;
        Drawable drawableJ = j(context, k.b.a.f307493a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f11650f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(@NonNull Context context, @androidx.annotation.v int i10) {
        if (this.f11649e == null) {
            this.f11649e = new TypedValue();
        }
        TypedValue typedValue = this.f11649e;
        context.getResources().getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        f fVar = this.f11651g;
        Drawable drawableA = fVar == null ? null : fVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return l(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    public static synchronized w0 h() {
        try {
            if (f11643m == null) {
                w0 w0Var = new w0();
                f11643m = w0Var;
                p(w0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11643m;
    }

    private synchronized Drawable i(@NonNull Context context, long j10) {
        try {
            androidx.collection.b1<WeakReference<Drawable.ConstantState>> b1Var = this.f11648d.get(context);
            if (b1Var == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> weakReferenceG = b1Var.g(j10);
            if (weakReferenceG != null) {
                Drawable.ConstantState constantState = weakReferenceG.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                b1Var.q(j10);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterT;
        try {
            c cVar = f11644n;
            porterDuffColorFilterT = cVar.t(i10, mode);
            if (porterDuffColorFilterT == null) {
                porterDuffColorFilterT = new PorterDuffColorFilter(i10, mode);
                cVar.u(i10, mode, porterDuffColorFilterT);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return porterDuffColorFilterT;
    }

    private ColorStateList n(@NonNull Context context, @androidx.annotation.v int i10) {
        j3<ColorStateList> j3Var;
        WeakHashMap<Context, j3<ColorStateList>> weakHashMap = this.f11645a;
        if (weakHashMap == null || (j3Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return j3Var.g(i10);
    }

    private static void p(@NonNull w0 w0Var) {
    }

    private static boolean q(@NonNull Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.i) || f11642l.equals(drawable.getClass().getName());
    }

    private Drawable r(@NonNull Context context, @androidx.annotation.v int i10) {
        int next;
        h3<String, e> h3Var = this.f11646b;
        if (h3Var == null || h3Var.isEmpty()) {
            return null;
        }
        j3<String> j3Var = this.f11647c;
        if (j3Var != null) {
            String strG = j3Var.g(i10);
            if (f11641k.equals(strG) || (strG != null && this.f11646b.get(strG) == null)) {
                return null;
            }
        } else {
            this.f11647c = new j3<>();
        }
        if (this.f11649e == null) {
            this.f11649e = new TypedValue();
        }
        TypedValue typedValue = this.f11649e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f11647c.a(i10, name);
                e eVar = this.f11646b.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableI == null) {
            this.f11647c.a(i10, f11641k);
        }
        return drawableI;
    }

    private Drawable v(@NonNull Context context, @androidx.annotation.v int i10, boolean z10, @NonNull Drawable drawable) {
        ColorStateList colorStateListM = m(context, i10);
        if (colorStateListM != null) {
            Drawable drawableR = androidx.core.graphics.drawable.c.r(drawable.mutate());
            androidx.core.graphics.drawable.c.o(drawableR, colorStateListM);
            PorterDuff.Mode modeO = o(i10);
            if (modeO != null) {
                androidx.core.graphics.drawable.c.p(drawableR, modeO);
            }
            return drawableR;
        }
        f fVar = this.f11651g;
        if ((fVar == null || !fVar.d(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, h1 h1Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = h1Var.f11335d;
            if (z10 || h1Var.f11334c) {
                drawable.setColorFilter(g(z10 ? h1Var.f11332a : null, h1Var.f11334c ? h1Var.f11333b : f11640j, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public synchronized Drawable j(@NonNull Context context, @androidx.annotation.v int i10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return k(context, i10, false);
    }

    synchronized Drawable k(@NonNull Context context, @androidx.annotation.v int i10, boolean z10) {
        Drawable drawableR;
        try {
            d(context);
            drawableR = r(context, i10);
            if (drawableR == null) {
                drawableR = f(context, i10);
            }
            if (drawableR == null) {
                drawableR = androidx.core.content.d.l(context, i10);
            }
            if (drawableR != null) {
                drawableR = v(context, i10, z10, drawableR);
            }
            if (drawableR != null) {
                m0.b(drawableR);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableR;
    }

    synchronized ColorStateList m(@NonNull Context context, @androidx.annotation.v int i10) {
        ColorStateList colorStateListN;
        try {
            colorStateListN = n(context, i10);
            if (colorStateListN == null) {
                f fVar = this.f11651g;
                colorStateListN = fVar == null ? null : fVar.b(context, i10);
                if (colorStateListN != null) {
                    c(context, i10, colorStateListN);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return colorStateListN;
    }

    PorterDuff.Mode o(int i10) {
        f fVar = this.f11651g;
        if (fVar == null) {
            return null;
        }
        return fVar.c(i10);
    }

    public synchronized void s(@NonNull Context context) {
        try {
            androidx.collection.b1<WeakReference<Drawable.ConstantState>> b1Var = this.f11648d.get(context);
            if (b1Var != null) {
                b1Var.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized Drawable t(@NonNull Context context, @NonNull u1 u1Var, @androidx.annotation.v int i10) {
        try {
            Drawable drawableR = r(context, i10);
            if (drawableR == null) {
                drawableR = u1Var.a(i10);
            }
            if (drawableR == null) {
                return null;
            }
            return v(context, i10, false, drawableR);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void u(f fVar) {
        this.f11651g = fVar;
    }

    boolean x(@NonNull Context context, @androidx.annotation.v int i10, @NonNull Drawable drawable) {
        f fVar = this.f11651g;
        return fVar != null && fVar.e(context, i10, drawable);
    }
}
