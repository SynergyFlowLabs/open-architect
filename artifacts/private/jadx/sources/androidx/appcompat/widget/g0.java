package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class g0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f11290n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f11291o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f11292p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f11293q = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextView f11294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h1 f11295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h1 f11296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h1 f11297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h1 f11298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h1 f11299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h1 f11300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h1 f11301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final i0 f11302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11303j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11304k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f11305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11306m;

    class a extends androidx.core.content.res.i.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f11309c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f11307a = i10;
            this.f11308b = i11;
            this.f11309c = weakReference;
        }

        @Override // androidx.core.content.res.i.f
        public void f(int i10) {
        }

        @Override // androidx.core.content.res.i.f
        public void g(@NonNull Typeface typeface) {
            int i10 = this.f11307a;
            if (i10 != -1) {
                typeface = f.a(typeface, i10, (this.f11308b & 2) != 0);
            }
            g0.this.n(this.f11309c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f11311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f11312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11313c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f11311a = textView;
            this.f11312b = typeface;
            this.f11313c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11311a.setTypeface(this.f11312b, this.f11313c);
        }
    }

    @androidx.annotation.w0(21)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @androidx.annotation.w0(24)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @androidx.annotation.u
        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @androidx.annotation.w0(26)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @androidx.annotation.u
        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @androidx.annotation.u
        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @androidx.annotation.u
        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @androidx.annotation.w0(28)
    static class f {
        private f() {
        }

        @androidx.annotation.u
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    g0(@NonNull TextView textView) {
        this.f11294a = textView;
        this.f11302i = new i0(textView);
    }

    private void B(int i10, float f10) {
        this.f11302i.t(i10, f10);
    }

    private void C(Context context, j1 j1Var) {
        String strW;
        this.f11303j = j1Var.o(i.a.m.f286511d6, this.f11303j);
        int iO = j1Var.o(i.a.m.f286592m6, -1);
        this.f11304k = iO;
        if (iO != -1) {
            this.f11303j &= 2;
        }
        if (j1Var.C(i.a.m.f286583l6) || j1Var.C(i.a.m.f286600n6)) {
            this.f11305l = null;
            int i10 = j1Var.C(i.a.m.f286600n6) ? i.a.m.f286600n6 : i.a.m.f286583l6;
            int i11 = this.f11304k;
            int i12 = this.f11303j;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceK = j1Var.k(i10, this.f11303j, new a(i11, i12, new WeakReference(this.f11294a)));
                    if (typefaceK != null) {
                        if (this.f11304k != -1) {
                            this.f11305l = f.a(Typeface.create(typefaceK, 0), this.f11304k, (this.f11303j & 2) != 0);
                        } else {
                            this.f11305l = typefaceK;
                        }
                    }
                    this.f11306m = this.f11305l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f11305l == null && (strW = j1Var.w(i10)) != null) {
                if (this.f11304k != -1) {
                    this.f11305l = f.a(Typeface.create(strW, 0), this.f11304k, (this.f11303j & 2) != 0);
                } else {
                    this.f11305l = Typeface.create(strW, this.f11303j);
                }
            }
        } else if (j1Var.C(i.a.m.f286502c6)) {
            this.f11306m = false;
            int iO2 = j1Var.o(i.a.m.f286502c6, 1);
            if (iO2 == 1) {
                this.f11305l = Typeface.SANS_SERIF;
            } else if (iO2 == 2) {
                this.f11305l = Typeface.SERIF;
            } else if (iO2 == 3) {
                this.f11305l = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, h1 h1Var) {
        if (drawable != null && h1Var != null) {
            n.j(drawable, h1Var, this.f11294a.getDrawableState());
        }
    }

    private static h1 d(Context context, n nVar, int i10) {
        ColorStateList colorStateListF = nVar.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        h1 h1Var = new h1();
        h1Var.f11335d = true;
        h1Var.f11332a = colorStateListF;
        return h1Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f11294a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f11294a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f11294a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f11294a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f11294a.getCompoundDrawables();
        TextView textView2 = this.f11294a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        h1 h1Var = this.f11301h;
        this.f11295b = h1Var;
        this.f11296c = h1Var;
        this.f11297d = h1Var;
        this.f11298e = h1Var;
        this.f11299f = h1Var;
        this.f11300g = h1Var;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void A(int i10, float f10) {
        if (!v1.f11632d && !l()) {
            B(i10, f10);
        }
    }

    void b() {
        if (this.f11295b != null || this.f11296c != null || this.f11297d != null || this.f11298e != null) {
            Drawable[] compoundDrawables = this.f11294a.getCompoundDrawables();
            a(compoundDrawables[0], this.f11295b);
            a(compoundDrawables[1], this.f11296c);
            a(compoundDrawables[2], this.f11297d);
            a(compoundDrawables[3], this.f11298e);
        }
        if (this.f11299f == null && this.f11300g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f11294a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f11299f);
        a(compoundDrawablesRelative[2], this.f11300g);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void c() {
        this.f11302i.a();
    }

    int e() {
        return this.f11302i.f();
    }

    int f() {
        return this.f11302i.g();
    }

    int g() {
        return this.f11302i.h();
    }

    int[] h() {
        return this.f11302i.i();
    }

    int i() {
        return this.f11302i.j();
    }

    @androidx.annotation.p0
    ColorStateList j() {
        h1 h1Var = this.f11301h;
        if (h1Var != null) {
            return h1Var.f11332a;
        }
        return null;
    }

    @androidx.annotation.p0
    PorterDuff.Mode k() {
        h1 h1Var = this.f11301h;
        if (h1Var != null) {
            return h1Var.f11333b;
        }
        return null;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    boolean l() {
        return this.f11302i.n();
    }

    @e.a({"NewApi"})
    void m(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strW;
        String strW2;
        int iC;
        float fG;
        Context context = this.f11294a.getContext();
        n nVarB = n.b();
        j1 j1VarG = j1.G(context, attributeSet, i.a.m.f286594n0, i10, 0);
        TextView textView = this.f11294a;
        androidx.core.view.u1.E1(textView, textView.getContext(), i.a.m.f286594n0, attributeSet, j1VarG.B(), i10, 0);
        int iU = j1VarG.u(i.a.m.f286602o0, -1);
        if (j1VarG.C(i.a.m.f286626r0)) {
            this.f11295b = d(context, nVarB, j1VarG.u(i.a.m.f286626r0, 0));
        }
        if (j1VarG.C(i.a.m.f286610p0)) {
            this.f11296c = d(context, nVarB, j1VarG.u(i.a.m.f286610p0, 0));
        }
        if (j1VarG.C(i.a.m.f286634s0)) {
            this.f11297d = d(context, nVarB, j1VarG.u(i.a.m.f286634s0, 0));
        }
        if (j1VarG.C(i.a.m.f286618q0)) {
            this.f11298e = d(context, nVarB, j1VarG.u(i.a.m.f286618q0, 0));
        }
        if (j1VarG.C(i.a.m.f286642t0)) {
            this.f11299f = d(context, nVarB, j1VarG.u(i.a.m.f286642t0, 0));
        }
        if (j1VarG.C(i.a.m.f286650u0)) {
            this.f11300g = d(context, nVarB, j1VarG.u(i.a.m.f286650u0, 0));
        }
        j1VarG.I();
        boolean z11 = this.f11294a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z12 = true;
        if (iU != -1) {
            j1 j1VarE = j1.E(context, iU, i.a.m.f286484a6);
            if (z11 || !j1VarE.C(i.a.m.f286616p6)) {
                zA = false;
                z10 = false;
            } else {
                zA = j1VarE.a(i.a.m.f286616p6, false);
                z10 = true;
            }
            C(context, j1VarE);
            strW = j1VarE.C(i.a.m.f286624q6) ? j1VarE.w(i.a.m.f286624q6) : null;
            strW2 = j1VarE.C(i.a.m.f286608o6) ? j1VarE.w(i.a.m.f286608o6) : null;
            j1VarE.I();
        } else {
            zA = false;
            z10 = false;
            strW = null;
            strW2 = null;
        }
        j1 j1VarG2 = j1.G(context, attributeSet, i.a.m.f286484a6, i10, 0);
        if (z11 || !j1VarG2.C(i.a.m.f286616p6)) {
            z12 = z10;
        } else {
            zA = j1VarG2.a(i.a.m.f286616p6, false);
        }
        if (j1VarG2.C(i.a.m.f286624q6)) {
            strW = j1VarG2.w(i.a.m.f286624q6);
        }
        if (j1VarG2.C(i.a.m.f286608o6)) {
            strW2 = j1VarG2.w(i.a.m.f286608o6);
        }
        if (j1VarG2.C(i.a.m.f286493b6) && j1VarG2.g(i.a.m.f286493b6, -1) == 0) {
            this.f11294a.setTextSize(0, 0.0f);
        }
        C(context, j1VarG2);
        j1VarG2.I();
        if (!z11 && z12) {
            s(zA);
        }
        Typeface typeface = this.f11305l;
        if (typeface != null) {
            if (this.f11304k == -1) {
                this.f11294a.setTypeface(typeface, this.f11303j);
            } else {
                this.f11294a.setTypeface(typeface);
            }
        }
        if (strW2 != null) {
            e.d(this.f11294a, strW2);
        }
        if (strW != null) {
            d.b(this.f11294a, d.a(strW));
        }
        this.f11302i.o(attributeSet, i10);
        if (v1.f11632d && this.f11302i.j() != 0) {
            int[] iArrI = this.f11302i.i();
            if (iArrI.length > 0) {
                if (e.a(this.f11294a) != -1.0f) {
                    e.b(this.f11294a, this.f11302i.g(), this.f11302i.f(), this.f11302i.h(), 0);
                } else {
                    e.c(this.f11294a, iArrI, 0);
                }
            }
        }
        j1 j1VarF = j1.F(context, attributeSet, i.a.m.f286658v0);
        int iU2 = j1VarF.u(i.a.m.E0, -1);
        Drawable drawableC = iU2 != -1 ? nVarB.c(context, iU2) : null;
        int iU3 = j1VarF.u(i.a.m.J0, -1);
        Drawable drawableC2 = iU3 != -1 ? nVarB.c(context, iU3) : null;
        int iU4 = j1VarF.u(i.a.m.F0, -1);
        Drawable drawableC3 = iU4 != -1 ? nVarB.c(context, iU4) : null;
        int iU5 = j1VarF.u(i.a.m.C0, -1);
        Drawable drawableC4 = iU5 != -1 ? nVarB.c(context, iU5) : null;
        int iU6 = j1VarF.u(i.a.m.G0, -1);
        Drawable drawableC5 = iU6 != -1 ? nVarB.c(context, iU6) : null;
        int iU7 = j1VarF.u(i.a.m.D0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iU7 != -1 ? nVarB.c(context, iU7) : null);
        if (j1VarF.C(i.a.m.H0)) {
            androidx.core.widget.r.s(this.f11294a, j1VarF.d(i.a.m.H0));
        }
        if (j1VarF.C(i.a.m.I0)) {
            androidx.core.widget.r.t(this.f11294a, m0.e(j1VarF.o(i.a.m.I0, -1), null));
        }
        int iG = j1VarF.g(i.a.m.L0, -1);
        int iG2 = j1VarF.g(i.a.m.O0, -1);
        if (j1VarF.C(i.a.m.P0)) {
            TypedValue typedValueH = j1VarF.H(i.a.m.P0);
            if (typedValueH == null || typedValueH.type != 5) {
                fG = j1VarF.g(i.a.m.P0, -1);
                iC = -1;
            } else {
                iC = androidx.core.util.k0.c(typedValueH.data);
                fG = TypedValue.complexToFloat(typedValueH.data);
            }
        } else {
            iC = -1;
            fG = -1.0f;
        }
        j1VarF.I();
        if (iG != -1) {
            androidx.core.widget.r.y(this.f11294a, iG);
        }
        if (iG2 != -1) {
            androidx.core.widget.r.z(this.f11294a, iG2);
        }
        if (fG != -1.0f) {
            if (iC == -1) {
                androidx.core.widget.r.A(this.f11294a, (int) fG);
            } else {
                androidx.core.widget.r.B(this.f11294a, iC, fG);
            }
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f11306m) {
            this.f11305l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f11303j));
                    return;
                }
                textView.setTypeface(typeface, this.f11303j);
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (v1.f11632d) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strW;
        j1 j1VarE = j1.E(context, i10, i.a.m.f286484a6);
        if (j1VarE.C(i.a.m.f286616p6)) {
            s(j1VarE.a(i.a.m.f286616p6, false));
        }
        if (j1VarE.C(i.a.m.f286493b6) && j1VarE.g(i.a.m.f286493b6, -1) == 0) {
            int i11 = 3 | 0;
            this.f11294a.setTextSize(0, 0.0f);
        }
        C(context, j1VarE);
        if (j1VarE.C(i.a.m.f286608o6) && (strW = j1VarE.w(i.a.m.f286608o6)) != null) {
            e.d(this.f11294a, strW);
        }
        j1VarE.I();
        Typeface typeface = this.f11305l;
        if (typeface != null) {
            this.f11294a.setTypeface(typeface, this.f11303j);
        }
    }

    void r(@NonNull TextView textView, @androidx.annotation.p0 InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        androidx.core.view.inputmethod.a.k(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f11294a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f11302i.p(i10, i11, i12, i13);
    }

    void u(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        this.f11302i.q(iArr, i10);
    }

    void v(int i10) {
        this.f11302i.r(i10);
    }

    void w(@androidx.annotation.p0 ColorStateList colorStateList) {
        if (this.f11301h == null) {
            this.f11301h = new h1();
        }
        h1 h1Var = this.f11301h;
        h1Var.f11332a = colorStateList;
        h1Var.f11335d = colorStateList != null;
        z();
    }

    void x(@androidx.annotation.p0 PorterDuff.Mode mode) {
        if (this.f11301h == null) {
            this.f11301h = new h1();
        }
        h1 h1Var = this.f11301h;
        h1Var.f11333b = mode;
        h1Var.f11334c = mode != null;
        z();
    }
}
