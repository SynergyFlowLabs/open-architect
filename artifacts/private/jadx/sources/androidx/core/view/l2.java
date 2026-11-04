package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f48848b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f48849c = "WindowInsetsAnimCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f48850a;

    public static abstract class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f48853c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f48854d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WindowInsets f48855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48856b;

        @Retention(RetentionPolicy.SOURCE)
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public @interface a {
        }

        public b(int i10) {
            this.f48856b = i10;
        }

        public final int a() {
            return this.f48856b;
        }

        public void c(@NonNull l2 l2Var) {
        }

        public void d(@NonNull l2 l2Var) {
        }

        @NonNull
        public abstract g3 e(@NonNull g3 g3Var, @NonNull List<l2> list);

        @NonNull
        public a f(@NonNull l2 l2Var, @NonNull a aVar) {
            return aVar;
        }
    }

    @androidx.annotation.w0(21)
    private static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Interpolator f48857f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Interpolator f48858g = new androidx.interpolator.view.animation.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Interpolator f48859h = new DecelerateInterpolator();

        @androidx.annotation.w0(21)
        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final int f48860c = 160;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f48861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private g3 f48862b;

            /* JADX INFO: renamed from: androidx.core.view.l2$c$a$a, reason: collision with other inner class name */
            class C0417a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l2 f48863a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g3 f48864b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ g3 f48865c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f48866d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f48867e;

                C0417a(l2 l2Var, g3 g3Var, g3 g3Var2, int i10, View view) {
                    this.f48863a = l2Var;
                    this.f48864b = g3Var;
                    this.f48865c = g3Var2;
                    this.f48866d = i10;
                    this.f48867e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f48863a.i(valueAnimator.getAnimatedFraction());
                    c.o(this.f48867e, c.s(this.f48864b, this.f48865c, this.f48863a.d(), this.f48866d), Collections.singletonList(this.f48863a));
                }
            }

            class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l2 f48869a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f48870b;

                b(l2 l2Var, View view) {
                    this.f48869a = l2Var;
                    this.f48870b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f48869a.i(1.0f);
                    c.m(this.f48870b, this.f48869a);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.l2$c$a$c, reason: collision with other inner class name */
            class RunnableC0418c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f48872a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ l2 f48873b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f48874c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f48875d;

                RunnableC0418c(View view, l2 l2Var, a aVar, ValueAnimator valueAnimator) {
                    this.f48872a = view;
                    this.f48873b = l2Var;
                    this.f48874c = aVar;
                    this.f48875d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.p(this.f48872a, this.f48873b, this.f48874c);
                    this.f48875d.start();
                }
            }

            a(@NonNull View view, @NonNull b bVar) {
                this.f48861a = bVar;
                g3 g3VarR0 = u1.r0(view);
                this.f48862b = g3VarR0 != null ? new g3.b(g3VarR0).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int i10;
                if (!view.isLaidOut()) {
                    this.f48862b = g3.L(windowInsets, view);
                    return c.q(view, windowInsets);
                }
                g3 g3VarL = g3.L(windowInsets, view);
                if (this.f48862b == null) {
                    this.f48862b = u1.r0(view);
                }
                if (this.f48862b == null) {
                    this.f48862b = g3VarL;
                    return c.q(view, windowInsets);
                }
                b bVarR = c.r(view);
                if ((bVarR == null || !Objects.equals(bVarR.f48855a, windowInsets)) && (i10 = c.i(g3VarL, this.f48862b)) != 0) {
                    g3 g3Var = this.f48862b;
                    l2 l2Var = new l2(i10, c.k(i10, g3VarL, g3Var), 160L);
                    l2Var.i(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(l2Var.b());
                    a aVarJ = c.j(g3VarL, g3Var, i10);
                    c.n(view, l2Var, windowInsets, false);
                    duration.addUpdateListener(new C0417a(l2Var, g3VarL, g3Var, i10, view));
                    duration.addListener(new b(l2Var, view));
                    e1.a(view, new RunnableC0418c(view, l2Var, aVarJ, duration));
                    this.f48862b = g3VarL;
                    return c.q(view, windowInsets);
                }
                return c.q(view, windowInsets);
            }
        }

        c(int i10, @androidx.annotation.p0 Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        @e.a({"WrongConstant"})
        static int i(@NonNull g3 g3Var, @NonNull g3 g3Var2) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!g3Var.f(i11).equals(g3Var2.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        @NonNull
        static a j(@NonNull g3 g3Var, @NonNull g3 g3Var2, int i10) {
            androidx.core.graphics.j jVarF = g3Var.f(i10);
            androidx.core.graphics.j jVarF2 = g3Var2.f(i10);
            return new a(androidx.core.graphics.j.d(Math.min(jVarF.f47823a, jVarF2.f47823a), Math.min(jVarF.f47824b, jVarF2.f47824b), Math.min(jVarF.f47825c, jVarF2.f47825c), Math.min(jVarF.f47826d, jVarF2.f47826d)), androidx.core.graphics.j.d(Math.max(jVarF.f47823a, jVarF2.f47823a), Math.max(jVarF.f47824b, jVarF2.f47824b), Math.max(jVarF.f47825c, jVarF2.f47825c), Math.max(jVarF.f47826d, jVarF2.f47826d)));
        }

        static Interpolator k(int i10, g3 g3Var, g3 g3Var2) {
            if ((i10 & 8) != 0) {
                return g3Var.f(g3.m.d()).f47826d > g3Var2.f(g3.m.d()).f47826d ? f48857f : f48858g;
            }
            return f48859h;
        }

        @NonNull
        private static View.OnApplyWindowInsetsListener l(@NonNull View view, @NonNull b bVar) {
            return new a(view, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0021 A[LOOP:0: B:10:0x001a->B:12:0x0021, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012  */
        /* JADX WARN: Code duplicated, block: B:9:0x0017  */
        static void m(@NonNull View view, @NonNull l2 l2Var) {
            ViewGroup viewGroup;
            int i10;
            b bVarR = r(view);
            if (bVarR != null) {
                bVarR.c(l2Var);
                if (bVarR.a() != 0) {
                    if (view instanceof ViewGroup) {
                        viewGroup = (ViewGroup) view;
                        for (i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                            m(viewGroup.getChildAt(i10), l2Var);
                        }
                    }
                }
            } else if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
                while (i10 < viewGroup.getChildCount()) {
                    m(viewGroup.getChildAt(i10), l2Var);
                }
            }
        }

        static void n(View view, l2 l2Var, WindowInsets windowInsets, boolean z10) {
            b bVarR = r(view);
            if (bVarR != null) {
                bVarR.f48855a = windowInsets;
                if (!z10) {
                    bVarR.d(l2Var);
                    if (bVarR.a() == 0) {
                        z10 = true;
                        int i10 = 5 << 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    n(viewGroup.getChildAt(i11), l2Var, windowInsets, z10);
                }
            }
        }

        static void o(@NonNull View view, @NonNull g3 g3Var, @NonNull List<l2> list) {
            b bVarR = r(view);
            if (bVarR != null) {
                g3Var = bVarR.e(g3Var, list);
                if (bVarR.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    o(viewGroup.getChildAt(i10), g3Var, list);
                }
            }
        }

        static void p(View view, l2 l2Var, a aVar) {
            b bVarR = r(view);
            if (bVarR != null) {
                bVarR.f(l2Var, aVar);
                if (bVarR.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i10 = 7 >> 0;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    p(viewGroup.getChildAt(i11), l2Var, aVar);
                }
            }
        }

        @NonNull
        static WindowInsets q(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(i1.a.e.f286788j0) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @androidx.annotation.p0
        static b r(View view) {
            Object tag = view.getTag(i1.a.e.f286804r0);
            if (tag instanceof a) {
                return ((a) tag).f48861a;
            }
            return null;
        }

        @e.a({"WrongConstant"})
        static g3 s(g3 g3Var, g3 g3Var2, float f10, int i10) {
            g3.b bVar = new g3.b(g3Var);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    bVar.c(i11, g3Var.f(i11));
                } else {
                    androidx.core.graphics.j jVarF = g3Var.f(i11);
                    androidx.core.graphics.j jVarF2 = g3Var2.f(i11);
                    float f11 = 1.0f - f10;
                    bVar.c(i11, g3.z(jVarF, (int) (((double) ((jVarF.f47823a - jVarF2.f47823a) * f11)) + 0.5d), (int) (((double) ((jVarF.f47824b - jVarF2.f47824b) * f11)) + 0.5d), (int) (((double) ((jVarF.f47825c - jVarF2.f47825c) * f11)) + 0.5d), (int) (((double) ((jVarF.f47826d - jVarF2.f47826d) * f11)) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void t(@NonNull View view, @androidx.annotation.p0 b bVar) {
            Object tag = view.getTag(i1.a.e.f286788j0);
            if (bVar == null) {
                view.setTag(i1.a.e.f286804r0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerL = l(view, bVar);
            view.setTag(i1.a.e.f286804r0, onApplyWindowInsetsListenerL);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerL);
            }
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f48883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private final Interpolator f48884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f48885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f48886e;

        e(int i10, @androidx.annotation.p0 Interpolator interpolator, long j10) {
            this.f48882a = i10;
            this.f48884c = interpolator;
            this.f48885d = j10;
        }

        public float a() {
            return this.f48886e;
        }

        public long b() {
            return this.f48885d;
        }

        public float c() {
            return this.f48883b;
        }

        public float d() {
            Interpolator interpolator = this.f48884c;
            return interpolator != null ? interpolator.getInterpolation(this.f48883b) : this.f48883b;
        }

        @androidx.annotation.p0
        public Interpolator e() {
            return this.f48884c;
        }

        public int f() {
            return this.f48882a;
        }

        public void g(float f10) {
            this.f48886e = f10;
        }

        public void h(float f10) {
            this.f48883b = f10;
        }
    }

    public l2(int i10, @androidx.annotation.p0 Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f48850a = new d(i10, interpolator, j10);
        } else {
            this.f48850a = new c(i10, interpolator, j10);
        }
    }

    static void h(@NonNull View view, @androidx.annotation.p0 b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.l(view, bVar);
        } else {
            c.t(view, bVar);
        }
    }

    @androidx.annotation.w0(30)
    static l2 j(WindowInsetsAnimation windowInsetsAnimation) {
        return new l2(windowInsetsAnimation);
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public float a() {
        return this.f48850a.a();
    }

    public long b() {
        return this.f48850a.b();
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f48850a.c();
    }

    public float d() {
        return this.f48850a.d();
    }

    @androidx.annotation.p0
    public Interpolator e() {
        return this.f48850a.e();
    }

    public int f() {
        return this.f48850a.f();
    }

    public void g(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        this.f48850a.g(f10);
    }

    public void i(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        this.f48850a.h(f10);
    }

    @androidx.annotation.w0(30)
    private static class d extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        private final WindowInsetsAnimation f48877f;

        @androidx.annotation.w0(30)
        private static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f48878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List<l2> f48879b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ArrayList<l2> f48880c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, l2> f48881d;

            a(@NonNull b bVar) {
                super(bVar.a());
                this.f48881d = new HashMap<>();
                this.f48878a = bVar;
            }

            @NonNull
            private l2 a(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                l2 l2Var = this.f48881d.get(windowInsetsAnimation);
                if (l2Var != null) {
                    return l2Var;
                }
                l2 l2VarJ = l2.j(windowInsetsAnimation);
                this.f48881d.put(windowInsetsAnimation, l2VarJ);
                return l2VarJ;
            }

            public void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f48878a.c(a(windowInsetsAnimation));
                this.f48881d.remove(windowInsetsAnimation);
            }

            public void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f48878a.d(a(windowInsetsAnimation));
            }

            @NonNull
            public WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                ArrayList<l2> arrayList = this.f48880c;
                if (arrayList == null) {
                    ArrayList<l2> arrayList2 = new ArrayList<>(list.size());
                    this.f48880c = arrayList2;
                    this.f48879b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = y2.a(list.get(size));
                    l2 l2VarA = a(windowInsetsAnimationA);
                    l2VarA.i(windowInsetsAnimationA.getFraction());
                    this.f48880c.add(l2VarA);
                }
                return this.f48878a.e(g3.K(windowInsets), this.f48879b).J();
            }

            @NonNull
            public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                return this.f48878a.f(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        d(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f48877f = windowInsetsAnimation;
        }

        @NonNull
        public static WindowInsetsAnimation.Bounds i(@NonNull a aVar) {
            o2.a();
            return n2.a(aVar.a().h(), aVar.b().h());
        }

        @NonNull
        public static androidx.core.graphics.j j(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.j.g(bounds.getUpperBound());
        }

        @NonNull
        public static androidx.core.graphics.j k(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.j.g(bounds.getLowerBound());
        }

        public static void l(@NonNull View view, @androidx.annotation.p0 b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.l2.e
        public long b() {
            return this.f48877f.getDurationMillis();
        }

        @Override // androidx.core.view.l2.e
        public float c() {
            return this.f48877f.getFraction();
        }

        @Override // androidx.core.view.l2.e
        public float d() {
            return this.f48877f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.l2.e
        @androidx.annotation.p0
        public Interpolator e() {
            return this.f48877f.getInterpolator();
        }

        @Override // androidx.core.view.l2.e
        public int f() {
            return this.f48877f.getTypeMask();
        }

        @Override // androidx.core.view.l2.e
        public void h(float f10) {
            this.f48877f.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(x2.a(i10, interpolator, j10));
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.j f48851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.j f48852b;

        public a(@NonNull androidx.core.graphics.j jVar, @NonNull androidx.core.graphics.j jVar2) {
            this.f48851a = jVar;
            this.f48852b = jVar2;
        }

        @NonNull
        @androidx.annotation.w0(30)
        public static a e(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        @NonNull
        public androidx.core.graphics.j a() {
            return this.f48851a;
        }

        @NonNull
        public androidx.core.graphics.j b() {
            return this.f48852b;
        }

        @NonNull
        public a c(@NonNull androidx.core.graphics.j jVar) {
            return new a(g3.z(this.f48851a, jVar.f47823a, jVar.f47824b, jVar.f47825c, jVar.f47826d), g3.z(this.f48852b, jVar.f47823a, jVar.f47824b, jVar.f47825c, jVar.f47826d));
        }

        @NonNull
        @androidx.annotation.w0(30)
        public WindowInsetsAnimation.Bounds d() {
            return d.i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f48851a + " upper=" + this.f48852b + "}";
        }

        @androidx.annotation.w0(30)
        private a(@NonNull WindowInsetsAnimation.Bounds bounds) {
            this.f48851a = d.k(bounds);
            this.f48852b = d.j(bounds);
        }
    }

    @androidx.annotation.w0(30)
    private l2(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f48850a = new d(windowInsetsAnimation);
        }
    }
}
