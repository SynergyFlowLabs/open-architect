package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class g3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f48753b = "WindowInsetsCompat";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final g3 f48754c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f48755a;

    @e.a({"SoonBlockedPrivateApi"})
    @androidx.annotation.w0(21)
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f48756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Field f48757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f48758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f48759d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f48756a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f48757b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f48758c = declaredField3;
                declaredField3.setAccessible(true);
                f48759d = true;
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
        }

        private a() {
        }

        @androidx.annotation.p0
        public static g3 a(@NonNull View view) {
            if (f48759d && view.isAttachedToWindow()) {
                try {
                    Object obj = f48756a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f48757b.get(obj);
                        Rect rect2 = (Rect) f48758c.get(obj);
                        if (rect != null && rect2 != null) {
                            g3 g3VarA = new b().f(androidx.core.graphics.j.e(rect)).h(androidx.core.graphics.j.e(rect2)).a();
                            g3VarA.H(g3VarA);
                            g3VarA.d(view.getRootView());
                            return g3VarA;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    e10.getMessage();
                }
            }
            return null;
        }
    }

    @androidx.annotation.w0(30)
    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.g3.f
        void d(int i10, @NonNull androidx.core.graphics.j jVar) {
            this.f48767c.setInsets(n.a(i10), jVar.h());
        }

        @Override // androidx.core.view.g3.f
        void e(int i10, @NonNull androidx.core.graphics.j jVar) {
            this.f48767c.setInsetsIgnoringVisibility(n.a(i10), jVar.h());
        }

        @Override // androidx.core.view.g3.f
        void k(int i10, boolean z10) {
            this.f48767c.setVisible(n.a(i10), z10);
        }

        e(@NonNull g3 g3Var) {
            super(g3Var);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g3 f48768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.core.graphics.j[] f48769b;

        f() {
            this(new g3((g3) null));
        }

        protected final void a() {
            androidx.core.graphics.j[] jVarArr = this.f48769b;
            if (jVarArr != null) {
                androidx.core.graphics.j jVarF = jVarArr[m.e(1)];
                androidx.core.graphics.j jVarF2 = this.f48769b[m.e(2)];
                if (jVarF2 == null) {
                    jVarF2 = this.f48768a.f(2);
                }
                if (jVarF == null) {
                    jVarF = this.f48768a.f(1);
                }
                i(androidx.core.graphics.j.b(jVarF, jVarF2));
                androidx.core.graphics.j jVar = this.f48769b[m.e(16)];
                if (jVar != null) {
                    h(jVar);
                }
                androidx.core.graphics.j jVar2 = this.f48769b[m.e(32)];
                if (jVar2 != null) {
                    f(jVar2);
                }
                androidx.core.graphics.j jVar3 = this.f48769b[m.e(64)];
                if (jVar3 != null) {
                    j(jVar3);
                }
            }
        }

        @NonNull
        g3 b() {
            a();
            return this.f48768a;
        }

        void c(@androidx.annotation.p0 y yVar) {
        }

        void d(int i10, @NonNull androidx.core.graphics.j jVar) {
            if (this.f48769b == null) {
                this.f48769b = new androidx.core.graphics.j[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f48769b[m.e(i11)] = jVar;
                }
            }
        }

        void e(int i10, @NonNull androidx.core.graphics.j jVar) {
            if (i10 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void f(@NonNull androidx.core.graphics.j jVar) {
        }

        void g(@NonNull androidx.core.graphics.j jVar) {
        }

        void h(@NonNull androidx.core.graphics.j jVar) {
        }

        void i(@NonNull androidx.core.graphics.j jVar) {
        }

        void j(@NonNull androidx.core.graphics.j jVar) {
        }

        void k(int i10, boolean z10) {
        }

        f(@NonNull g3 g3Var) {
            this.f48768a = g3Var;
        }
    }

    @androidx.annotation.w0(28)
    private static class i extends h {
        i(@NonNull g3 g3Var, @NonNull WindowInsets windowInsets) {
            super(g3Var, windowInsets);
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        g3 a() {
            return g3.K(this.f48775c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.g3.g, androidx.core.view.g3.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f48775c, iVar.f48775c) && Objects.equals(this.f48779g, iVar.f48779g);
        }

        @Override // androidx.core.view.g3.l
        @androidx.annotation.p0
        y f() {
            return y.j(this.f48775c.getDisplayCutout());
        }

        @Override // androidx.core.view.g3.l
        public int hashCode() {
            return this.f48775c.hashCode();
        }

        i(@NonNull g3 g3Var, @NonNull i iVar) {
            super(g3Var, iVar);
        }
    }

    @androidx.annotation.w0(30)
    private static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        static final g3 f48784q = g3.K(WindowInsets.CONSUMED);

        k(@NonNull g3 g3Var, @NonNull WindowInsets windowInsets) {
            super(g3Var, windowInsets);
        }

        @Override // androidx.core.view.g3.g, androidx.core.view.g3.l
        final void d(@NonNull View view) {
        }

        @Override // androidx.core.view.g3.g, androidx.core.view.g3.l
        @NonNull
        public androidx.core.graphics.j g(int i10) {
            return androidx.core.graphics.j.g(this.f48775c.getInsets(n.a(i10)));
        }

        @Override // androidx.core.view.g3.g, androidx.core.view.g3.l
        @NonNull
        public androidx.core.graphics.j h(int i10) {
            return androidx.core.graphics.j.g(this.f48775c.getInsetsIgnoringVisibility(n.a(i10)));
        }

        @Override // androidx.core.view.g3.g, androidx.core.view.g3.l
        public boolean q(int i10) {
            return this.f48775c.isVisible(n.a(i10));
        }

        k(@NonNull g3 g3Var, @NonNull k kVar) {
            super(g3Var, kVar);
        }
    }

    private static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        static final g3 f48785b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g3 f48786a;

        l(@NonNull g3 g3Var) {
            this.f48786a = g3Var;
        }

        @NonNull
        g3 a() {
            return this.f48786a;
        }

        @NonNull
        g3 b() {
            return this.f48786a;
        }

        @NonNull
        g3 c() {
            return this.f48786a;
        }

        void d(@NonNull View view) {
        }

        void e(@NonNull g3 g3Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && androidx.core.util.o.a(l(), lVar.l()) && androidx.core.util.o.a(j(), lVar.j()) && androidx.core.util.o.a(f(), lVar.f());
        }

        @androidx.annotation.p0
        y f() {
            return null;
        }

        @NonNull
        androidx.core.graphics.j g(int i10) {
            return androidx.core.graphics.j.f47822e;
        }

        @NonNull
        androidx.core.graphics.j h(int i10) {
            if ((i10 & 8) == 0) {
                return androidx.core.graphics.j.f47822e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return androidx.core.util.o.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @NonNull
        androidx.core.graphics.j i() {
            return l();
        }

        @NonNull
        androidx.core.graphics.j j() {
            return androidx.core.graphics.j.f47822e;
        }

        @NonNull
        androidx.core.graphics.j k() {
            return l();
        }

        @NonNull
        androidx.core.graphics.j l() {
            return androidx.core.graphics.j.f47822e;
        }

        @NonNull
        androidx.core.graphics.j m() {
            return l();
        }

        @NonNull
        g3 n(int i10, int i11, int i12, int i13) {
            return f48785b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i10) {
            return true;
        }

        public void r(androidx.core.graphics.j[] jVarArr) {
        }

        void s(@NonNull androidx.core.graphics.j jVar) {
        }

        void t(@androidx.annotation.p0 g3 g3Var) {
        }

        public void u(androidx.core.graphics.j jVar) {
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f48787a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f48788b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f48789c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f48790d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f48791e = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f48792f = 16;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f48793g = 32;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f48794h = 64;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f48795i = 128;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f48796j = 256;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f48797k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f48798l = 256;

        @Retention(RetentionPolicy.SOURCE)
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public @interface a {
        }

        private m() {
        }

        @e.a({"WrongConstant"})
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        static int e(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    @androidx.annotation.w0(30)
    private static final class n {
        private n() {
        }

        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f48754c = k.f48784q;
        } else {
            f48754c = l.f48785b;
        }
    }

    @androidx.annotation.w0(20)
    private g3(@NonNull WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f48755a = new k(this, windowInsets);
        } else {
            this.f48755a = new j(this, windowInsets);
        }
    }

    @NonNull
    @androidx.annotation.w0(20)
    public static g3 K(@NonNull WindowInsets windowInsets) {
        return L(windowInsets, null);
    }

    @NonNull
    @androidx.annotation.w0(20)
    public static g3 L(@NonNull WindowInsets windowInsets, @androidx.annotation.p0 View view) {
        g3 g3Var = new g3((WindowInsets) androidx.core.util.t.l(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            g3Var.H(u1.r0(view));
            g3Var.d(view.getRootView());
        }
        return g3Var;
    }

    static androidx.core.graphics.j z(@NonNull androidx.core.graphics.j jVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, jVar.f47823a - i10);
        int iMax2 = Math.max(0, jVar.f47824b - i11);
        int iMax3 = Math.max(0, jVar.f47825c - i12);
        int iMax4 = Math.max(0, jVar.f47826d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? jVar : androidx.core.graphics.j.d(iMax, iMax2, iMax3, iMax4);
    }

    public boolean A() {
        return this.f48755a.o();
    }

    public boolean B() {
        return this.f48755a.p();
    }

    public boolean C(int i10) {
        return this.f48755a.q(i10);
    }

    @NonNull
    @Deprecated
    public g3 D(int i10, int i11, int i12, int i13) {
        return new b(this).h(androidx.core.graphics.j.d(i10, i11, i12, i13)).a();
    }

    @NonNull
    @Deprecated
    public g3 E(@NonNull Rect rect) {
        return new b(this).h(androidx.core.graphics.j.e(rect)).a();
    }

    void F(androidx.core.graphics.j[] jVarArr) {
        this.f48755a.r(jVarArr);
    }

    void G(@NonNull androidx.core.graphics.j jVar) {
        this.f48755a.s(jVar);
    }

    void H(@androidx.annotation.p0 g3 g3Var) {
        this.f48755a.t(g3Var);
    }

    void I(@androidx.annotation.p0 androidx.core.graphics.j jVar) {
        this.f48755a.u(jVar);
    }

    @androidx.annotation.w0(20)
    @androidx.annotation.p0
    public WindowInsets J() {
        l lVar = this.f48755a;
        if (lVar instanceof g) {
            return ((g) lVar).f48775c;
        }
        return null;
    }

    @NonNull
    @Deprecated
    public g3 a() {
        return this.f48755a.a();
    }

    @NonNull
    @Deprecated
    public g3 b() {
        return this.f48755a.b();
    }

    @NonNull
    @Deprecated
    public g3 c() {
        return this.f48755a.c();
    }

    void d(@NonNull View view) {
        this.f48755a.d(view);
    }

    @androidx.annotation.p0
    public y e() {
        return this.f48755a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g3) {
            return androidx.core.util.o.a(this.f48755a, ((g3) obj).f48755a);
        }
        return false;
    }

    @NonNull
    public androidx.core.graphics.j f(int i10) {
        return this.f48755a.g(i10);
    }

    @NonNull
    public androidx.core.graphics.j g(int i10) {
        return this.f48755a.h(i10);
    }

    @NonNull
    @Deprecated
    public androidx.core.graphics.j h() {
        return this.f48755a.i();
    }

    public int hashCode() {
        l lVar = this.f48755a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f48755a.j().f47826d;
    }

    @Deprecated
    public int j() {
        return this.f48755a.j().f47823a;
    }

    @Deprecated
    public int k() {
        return this.f48755a.j().f47825c;
    }

    @Deprecated
    public int l() {
        return this.f48755a.j().f47824b;
    }

    @NonNull
    @Deprecated
    public androidx.core.graphics.j m() {
        return this.f48755a.j();
    }

    @NonNull
    @Deprecated
    public androidx.core.graphics.j n() {
        return this.f48755a.k();
    }

    @Deprecated
    public int o() {
        return this.f48755a.l().f47826d;
    }

    @Deprecated
    public int p() {
        return this.f48755a.l().f47823a;
    }

    @Deprecated
    public int q() {
        return this.f48755a.l().f47825c;
    }

    @Deprecated
    public int r() {
        return this.f48755a.l().f47824b;
    }

    @NonNull
    @Deprecated
    public androidx.core.graphics.j s() {
        return this.f48755a.l();
    }

    @NonNull
    @Deprecated
    public androidx.core.graphics.j t() {
        return this.f48755a.m();
    }

    public boolean u() {
        androidx.core.graphics.j jVarF = f(m.a());
        androidx.core.graphics.j jVar = androidx.core.graphics.j.f47822e;
        return (jVarF.equals(jVar) && g(m.a() ^ m.d()).equals(jVar) && e() == null) ? false : true;
    }

    @Deprecated
    public boolean v() {
        return !this.f48755a.j().equals(androidx.core.graphics.j.f47822e);
    }

    @Deprecated
    public boolean w() {
        return !this.f48755a.l().equals(androidx.core.graphics.j.f47822e);
    }

    @NonNull
    public g3 x(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11, @androidx.annotation.g0(from = 0) int i12, @androidx.annotation.g0(from = 0) int i13) {
        return this.f48755a.n(i10, i11, i12, i13);
    }

    @NonNull
    public g3 y(@NonNull androidx.core.graphics.j jVar) {
        return x(jVar.f47823a, jVar.f47824b, jVar.f47825c, jVar.f47826d);
    }

    @androidx.annotation.w0(api = 20)
    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f48761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f48762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f48763g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f48764h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f48765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.j f48766d;

        c() {
            this.f48765c = l();
        }

        @androidx.annotation.p0
        private static WindowInsets l() {
            if (!f48762f) {
                try {
                    f48761e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f48762f = true;
            }
            Field field = f48761e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f48764h) {
                try {
                    f48763g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f48764h = true;
            }
            Constructor<WindowInsets> constructor = f48763g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.g3.f
        @NonNull
        g3 b() {
            a();
            g3 g3VarK = g3.K(this.f48765c);
            g3VarK.F(this.f48769b);
            g3VarK.I(this.f48766d);
            return g3VarK;
        }

        @Override // androidx.core.view.g3.f
        void g(@androidx.annotation.p0 androidx.core.graphics.j jVar) {
            this.f48766d = jVar;
        }

        @Override // androidx.core.view.g3.f
        void i(@NonNull androidx.core.graphics.j jVar) {
            WindowInsets windowInsets = this.f48765c;
            if (windowInsets != null) {
                this.f48765c = windowInsets.replaceSystemWindowInsets(jVar.f47823a, jVar.f47824b, jVar.f47825c, jVar.f47826d);
            }
        }

        c(@NonNull g3 g3Var) {
            super(g3Var);
            this.f48765c = g3Var.J();
        }
    }

    @androidx.annotation.w0(api = 29)
    private static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f48767c;

        d() {
            this.f48767c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.g3.f
        @NonNull
        g3 b() {
            a();
            g3 g3VarK = g3.K(this.f48767c.build());
            g3VarK.F(this.f48769b);
            return g3VarK;
        }

        @Override // androidx.core.view.g3.f
        void c(@androidx.annotation.p0 y yVar) {
            this.f48767c.setDisplayCutout(yVar != null ? yVar.i() : null);
        }

        @Override // androidx.core.view.g3.f
        void f(@NonNull androidx.core.graphics.j jVar) {
            this.f48767c.setMandatorySystemGestureInsets(jVar.h());
        }

        @Override // androidx.core.view.g3.f
        void g(@NonNull androidx.core.graphics.j jVar) {
            this.f48767c.setStableInsets(jVar.h());
        }

        @Override // androidx.core.view.g3.f
        void h(@NonNull androidx.core.graphics.j jVar) {
            this.f48767c.setSystemGestureInsets(jVar.h());
        }

        @Override // androidx.core.view.g3.f
        void i(@NonNull androidx.core.graphics.j jVar) {
            this.f48767c.setSystemWindowInsets(jVar.h());
        }

        @Override // androidx.core.view.g3.f
        void j(@NonNull androidx.core.graphics.j jVar) {
            this.f48767c.setTappableElementInsets(jVar.h());
        }

        d(@NonNull g3 g3Var) {
            super(g3Var);
            WindowInsets windowInsetsJ = g3Var.J();
            this.f48767c = windowInsetsJ != null ? new WindowInsets.Builder(windowInsetsJ) : new WindowInsets.Builder();
        }
    }

    @androidx.annotation.w0(21)
    private static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.j f48780m;

        h(@NonNull g3 g3Var, @NonNull WindowInsets windowInsets) {
            super(g3Var, windowInsets);
            this.f48780m = null;
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        g3 b() {
            return g3.K(this.f48775c.consumeStableInsets());
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        g3 c() {
            return g3.K(this.f48775c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        final androidx.core.graphics.j j() {
            if (this.f48780m == null) {
                this.f48780m = androidx.core.graphics.j.d(this.f48775c.getStableInsetLeft(), this.f48775c.getStableInsetTop(), this.f48775c.getStableInsetRight(), this.f48775c.getStableInsetBottom());
            }
            return this.f48780m;
        }

        @Override // androidx.core.view.g3.l
        boolean o() {
            return this.f48775c.isConsumed();
        }

        @Override // androidx.core.view.g3.l
        public void u(@androidx.annotation.p0 androidx.core.graphics.j jVar) {
            this.f48780m = jVar;
        }

        h(@NonNull g3 g3Var, @NonNull h hVar) {
            super(g3Var, hVar);
            this.f48780m = null;
            this.f48780m = hVar.f48780m;
        }
    }

    @androidx.annotation.w0(20)
    private static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f48770h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static Method f48771i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Class<?> f48772j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Field f48773k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f48774l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        final WindowInsets f48775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.j[] f48776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.j f48777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g3 f48778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.graphics.j f48779g;

        g(@NonNull g3 g3Var, @NonNull WindowInsets windowInsets) {
            super(g3Var);
            this.f48777e = null;
            this.f48775c = windowInsets;
        }

        @e.a({"PrivateApi"})
        private static void A() {
            try {
                f48771i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f48772j = cls;
                f48773k = cls.getDeclaredField("mVisibleInsets");
                f48774l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f48773k.setAccessible(true);
                f48774l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
            f48770h = true;
        }

        @NonNull
        @e.a({"WrongConstant"})
        private androidx.core.graphics.j v(int i10, boolean z10) {
            androidx.core.graphics.j jVarB = androidx.core.graphics.j.f47822e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    jVarB = androidx.core.graphics.j.b(jVarB, w(i11, z10));
                }
            }
            return jVarB;
        }

        private androidx.core.graphics.j x() {
            g3 g3Var = this.f48778f;
            return g3Var != null ? g3Var.m() : androidx.core.graphics.j.f47822e;
        }

        @androidx.annotation.p0
        private androidx.core.graphics.j y(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f48770h) {
                A();
            }
            Method method = f48771i;
            if (method != null && f48772j != null && f48773k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f48773k.get(f48774l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.j.e(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    e10.getMessage();
                }
            }
            return null;
        }

        @Override // androidx.core.view.g3.l
        void d(@NonNull View view) {
            androidx.core.graphics.j jVarY = y(view);
            if (jVarY == null) {
                jVarY = androidx.core.graphics.j.f47822e;
            }
            s(jVarY);
        }

        @Override // androidx.core.view.g3.l
        void e(@NonNull g3 g3Var) {
            g3Var.H(this.f48778f);
            g3Var.G(this.f48779g);
        }

        @Override // androidx.core.view.g3.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f48779g, ((g) obj).f48779g);
            }
            return false;
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        public androidx.core.graphics.j g(int i10) {
            return v(i10, false);
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        public androidx.core.graphics.j h(int i10) {
            return v(i10, true);
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        final androidx.core.graphics.j l() {
            if (this.f48777e == null) {
                this.f48777e = androidx.core.graphics.j.d(this.f48775c.getSystemWindowInsetLeft(), this.f48775c.getSystemWindowInsetTop(), this.f48775c.getSystemWindowInsetRight(), this.f48775c.getSystemWindowInsetBottom());
            }
            return this.f48777e;
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        g3 n(int i10, int i11, int i12, int i13) {
            b bVar = new b(g3.K(this.f48775c));
            bVar.h(g3.z(l(), i10, i11, i12, i13));
            bVar.f(g3.z(j(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.g3.l
        boolean p() {
            return this.f48775c.isRound();
        }

        @Override // androidx.core.view.g3.l
        @e.a({"WrongConstant"})
        boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.g3.l
        public void r(androidx.core.graphics.j[] jVarArr) {
            this.f48776d = jVarArr;
        }

        @Override // androidx.core.view.g3.l
        void s(@NonNull androidx.core.graphics.j jVar) {
            this.f48779g = jVar;
        }

        @Override // androidx.core.view.g3.l
        void t(@androidx.annotation.p0 g3 g3Var) {
            this.f48778f = g3Var;
        }

        @NonNull
        protected androidx.core.graphics.j w(int i10, boolean z10) {
            androidx.core.graphics.j jVarM;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.j.d(0, Math.max(x().f47824b, l().f47824b), 0, 0) : androidx.core.graphics.j.d(0, l().f47824b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.j jVarX = x();
                    androidx.core.graphics.j jVarJ = j();
                    return androidx.core.graphics.j.d(Math.max(jVarX.f47823a, jVarJ.f47823a), 0, Math.max(jVarX.f47825c, jVarJ.f47825c), Math.max(jVarX.f47826d, jVarJ.f47826d));
                }
                androidx.core.graphics.j jVarL = l();
                g3 g3Var = this.f48778f;
                jVarM = g3Var != null ? g3Var.m() : null;
                int iMin = jVarL.f47826d;
                if (jVarM != null) {
                    iMin = Math.min(iMin, jVarM.f47826d);
                }
                return androidx.core.graphics.j.d(jVarL.f47823a, 0, jVarL.f47825c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return androidx.core.graphics.j.f47822e;
                }
                g3 g3Var2 = this.f48778f;
                y yVarE = g3Var2 != null ? g3Var2.e() : f();
                return yVarE != null ? androidx.core.graphics.j.d(yVarE.e(), yVarE.g(), yVarE.f(), yVarE.d()) : androidx.core.graphics.j.f47822e;
            }
            androidx.core.graphics.j[] jVarArr = this.f48776d;
            jVarM = jVarArr != null ? jVarArr[m.e(8)] : null;
            if (jVarM != null) {
                return jVarM;
            }
            androidx.core.graphics.j jVarL2 = l();
            androidx.core.graphics.j jVarX2 = x();
            int i12 = jVarL2.f47826d;
            if (i12 > jVarX2.f47826d) {
                return androidx.core.graphics.j.d(0, 0, 0, i12);
            }
            androidx.core.graphics.j jVar = this.f48779g;
            return (jVar == null || jVar.equals(androidx.core.graphics.j.f47822e) || (i11 = this.f48779g.f47826d) <= jVarX2.f47826d) ? androidx.core.graphics.j.f47822e : androidx.core.graphics.j.d(0, 0, 0, i11);
        }

        protected boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(androidx.core.graphics.j.f47822e);
        }

        g(@NonNull g3 g3Var, @NonNull g gVar) {
            this(g3Var, new WindowInsets(gVar.f48775c));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f48760a;

        public b() {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f48760a = new e();
            } else {
                this.f48760a = new d();
            }
        }

        @NonNull
        public g3 a() {
            return this.f48760a.b();
        }

        @NonNull
        public b b(@androidx.annotation.p0 y yVar) {
            this.f48760a.c(yVar);
            return this;
        }

        @NonNull
        public b c(int i10, @NonNull androidx.core.graphics.j jVar) {
            this.f48760a.d(i10, jVar);
            return this;
        }

        @NonNull
        public b d(int i10, @NonNull androidx.core.graphics.j jVar) {
            this.f48760a.e(i10, jVar);
            return this;
        }

        @NonNull
        @Deprecated
        public b e(@NonNull androidx.core.graphics.j jVar) {
            this.f48760a.f(jVar);
            return this;
        }

        @NonNull
        @Deprecated
        public b f(@NonNull androidx.core.graphics.j jVar) {
            this.f48760a.g(jVar);
            return this;
        }

        @NonNull
        @Deprecated
        public b g(@NonNull androidx.core.graphics.j jVar) {
            this.f48760a.h(jVar);
            return this;
        }

        @NonNull
        @Deprecated
        public b h(@NonNull androidx.core.graphics.j jVar) {
            this.f48760a.i(jVar);
            return this;
        }

        @NonNull
        @Deprecated
        public b i(@NonNull androidx.core.graphics.j jVar) {
            this.f48760a.j(jVar);
            return this;
        }

        @NonNull
        public b j(int i10, boolean z10) {
            this.f48760a.k(i10, z10);
            return this;
        }

        public b(@NonNull g3 g3Var) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f48760a = new e(g3Var);
            } else {
                this.f48760a = new d(g3Var);
            }
        }
    }

    @androidx.annotation.w0(29)
    private static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.j f48781n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.j f48782o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.j f48783p;

        j(@NonNull g3 g3Var, @NonNull WindowInsets windowInsets) {
            super(g3Var, windowInsets);
            this.f48781n = null;
            this.f48782o = null;
            this.f48783p = null;
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        androidx.core.graphics.j i() {
            if (this.f48782o == null) {
                this.f48782o = androidx.core.graphics.j.g(this.f48775c.getMandatorySystemGestureInsets());
            }
            return this.f48782o;
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        androidx.core.graphics.j k() {
            if (this.f48781n == null) {
                this.f48781n = androidx.core.graphics.j.g(this.f48775c.getSystemGestureInsets());
            }
            return this.f48781n;
        }

        @Override // androidx.core.view.g3.l
        @NonNull
        androidx.core.graphics.j m() {
            if (this.f48783p == null) {
                this.f48783p = androidx.core.graphics.j.g(this.f48775c.getTappableElementInsets());
            }
            return this.f48783p;
        }

        @Override // androidx.core.view.g3.g, androidx.core.view.g3.l
        @NonNull
        g3 n(int i10, int i11, int i12, int i13) {
            return g3.K(this.f48775c.inset(i10, i11, i12, i13));
        }

        @Override // androidx.core.view.g3.h, androidx.core.view.g3.l
        public void u(@androidx.annotation.p0 androidx.core.graphics.j jVar) {
        }

        j(@NonNull g3 g3Var, @NonNull j jVar) {
            super(g3Var, jVar);
            this.f48781n = null;
            this.f48782o = null;
            this.f48783p = null;
        }
    }

    public g3(@androidx.annotation.p0 g3 g3Var) {
        if (g3Var == null) {
            this.f48755a = new l(this);
            return;
        }
        l lVar = g3Var.f48755a;
        if (Build.VERSION.SDK_INT >= 30 && (lVar instanceof k)) {
            this.f48755a = new k(this, (k) lVar);
        } else if (lVar instanceof j) {
            this.f48755a = new j(this, (j) lVar);
        } else if (lVar instanceof i) {
            this.f48755a = new i(this, (i) lVar);
        } else if (lVar instanceof h) {
            this.f48755a = new h(this, (h) lVar);
        } else if (lVar instanceof g) {
            this.f48755a = new g(this, (g) lVar);
        } else {
            this.f48755a = new l(this);
        }
        lVar.e(this);
    }
}
