package androidx.compose.foundation.layout;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class a7 {
    private static boolean A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final a f15880x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f15881y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final WeakHashMap<View, a7> f15882z = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f15883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f15884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h f15885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f15886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final h f15887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final h f15888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final h f15889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final h f15890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final h f15891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final t6 f15892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final v6 f15893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final v6 f15894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final v6 f15895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final t6 f15896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final t6 f15897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final t6 f15898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final t6 f15899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final t6 f15900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final t6 f15901s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final t6 f15902t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f15903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f15904v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final w3 f15905w;

    @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,698:1\n75#2:699\n1282#3,6:700\n381#4,7:706\n1#5:713\n66#6,5:714\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n551#1:699\n554#1:700,6\n566#1:706,7\n556#1:714,5\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.a7$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n1#1,69:1\n556#2:70\n*E\n"})
        public static final class C0097a implements androidx.compose.runtime.u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a7 f15906a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f15907b;

            public C0097a(a7 a7Var, View view) {
                this.f15906a = a7Var;
                this.f15907b = view;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f15906a.c(this.f15907b);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.u1 e(a7 a7Var, View view, androidx.compose.runtime.v1 v1Var) {
            a7Var.z(view);
            return new C0097a(a7Var, view);
        }

        private final a7 f(View view) {
            a7 a7Var;
            synchronized (a7.f15882z) {
                try {
                    WeakHashMap weakHashMap = a7.f15882z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        a7 a7Var2 = new a7(null, view, false ? 1 : 0);
                        weakHashMap.put(view, a7Var2);
                        obj2 = a7Var2;
                    }
                    a7Var = (a7) obj2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return a7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h h(androidx.core.view.g3 g3Var, int i10, String str) {
            h hVar = new h(i10, str);
            if (g3Var != null) {
                hVar.j(g3Var, i10);
            }
            return hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final t6 i(androidx.core.view.g3 g3Var, int i10, String str) {
            androidx.core.graphics.j jVarG;
            if (g3Var == null || (jVarG = g3Var.g(i10)) == null) {
                jVarG = androidx.core.graphics.j.f47822e;
            }
            return b8.a(jVarG, str);
        }

        @androidx.compose.runtime.o
        @NotNull
        public final a7 d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:549)");
            }
            final View view = (View) c0Var.W(AndroidCompositionLocals_androidKt.m());
            final a7 a7VarF = f(view);
            boolean zK0 = c0Var.k0(a7VarF) | c0Var.k0(view);
            Object objI0 = c0Var.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.layout.z6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return a7.a.e(a7VarF, view, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.runtime.b2.d(a7VarF, (Function1) objI0, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return a7VarF;
        }

        @lm.n
        public final void g(boolean z10) {
            a7.A = z10;
        }

        private a() {
        }
    }

    public /* synthetic */ a7(androidx.core.view.g3 g3Var, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(g3Var, view);
    }

    public static /* synthetic */ void B(a7 a7Var, androidx.core.view.g3 g3Var, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        a7Var.A(g3Var, i10);
    }

    public static /* synthetic */ void g() {
    }

    public final void A(@NotNull androidx.core.view.g3 g3Var, int i10) {
        if (A) {
            WindowInsets windowInsetsJ = g3Var.J();
            Intrinsics.checkNotNull(windowInsetsJ);
            g3Var = androidx.core.view.g3.K(windowInsetsJ);
        }
        this.f15883a.j(g3Var, i10);
        this.f15885c.j(g3Var, i10);
        this.f15884b.j(g3Var, i10);
        this.f15887e.j(g3Var, i10);
        this.f15888f.j(g3Var, i10);
        this.f15889g.j(g3Var, i10);
        this.f15890h.j(g3Var, i10);
        this.f15891i.j(g3Var, i10);
        this.f15886d.j(g3Var, i10);
        if (i10 == 0) {
            this.f15896n.g(b8.U(g3Var.g(androidx.core.view.g3.m.b())));
            this.f15897o.g(b8.U(g3Var.g(androidx.core.view.g3.m.g())));
            this.f15898p.g(b8.U(g3Var.g(androidx.core.view.g3.m.h())));
            this.f15899q.g(b8.U(g3Var.g(androidx.core.view.g3.m.i())));
            this.f15900r.g(b8.U(g3Var.g(androidx.core.view.g3.m.k())));
            androidx.core.view.y yVarE = g3Var.e();
            if (yVarE != null) {
                this.f15892j.g(b8.U(yVarE.h()));
            }
        }
        androidx.compose.runtime.snapshots.m.f36535e.y();
    }

    public final void C(@NotNull androidx.core.view.g3 g3Var) {
        this.f15902t.g(b8.U(g3Var.f(androidx.core.view.g3.m.d())));
    }

    public final void D(@NotNull androidx.core.view.g3 g3Var) {
        this.f15901s.g(b8.U(g3Var.f(androidx.core.view.g3.m.d())));
    }

    public final void c(@NotNull View view) {
        int i10 = this.f15904v - 1;
        this.f15904v = i10;
        if (i10 == 0) {
            androidx.core.view.u1.j2(view, null);
            androidx.core.view.u1.G2(view, null);
            view.removeOnAttachStateChangeListener(this.f15905w);
        }
    }

    @NotNull
    public final h d() {
        return this.f15883a;
    }

    @NotNull
    public final t6 e() {
        return this.f15896n;
    }

    public final boolean f() {
        return this.f15903u;
    }

    @NotNull
    public final h h() {
        return this.f15884b;
    }

    @NotNull
    public final h i() {
        return this.f15885c;
    }

    @NotNull
    public final t6 j() {
        return this.f15902t;
    }

    @NotNull
    public final t6 k() {
        return this.f15901s;
    }

    @NotNull
    public final h l() {
        return this.f15886d;
    }

    @NotNull
    public final h m() {
        return this.f15887e;
    }

    @NotNull
    public final t6 n() {
        return this.f15897o;
    }

    @NotNull
    public final v6 o() {
        return this.f15895m;
    }

    @NotNull
    public final v6 p() {
        return this.f15893k;
    }

    @NotNull
    public final v6 q() {
        return this.f15894l;
    }

    @NotNull
    public final h r() {
        return this.f15888f;
    }

    @NotNull
    public final t6 s() {
        return this.f15898p;
    }

    @NotNull
    public final h t() {
        return this.f15889g;
    }

    @NotNull
    public final t6 u() {
        return this.f15899q;
    }

    @NotNull
    public final h v() {
        return this.f15890h;
    }

    @NotNull
    public final h w() {
        return this.f15891i;
    }

    @NotNull
    public final t6 x() {
        return this.f15900r;
    }

    @NotNull
    public final t6 y() {
        return this.f15892j;
    }

    public final void z(@NotNull View view) {
        if (this.f15904v == 0) {
            androidx.core.view.u1.j2(view, this.f15905w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f15905w);
            androidx.core.view.u1.G2(view, this.f15905w);
        }
        this.f15904v++;
    }

    private a7(androidx.core.view.g3 g3Var, View view) {
        androidx.core.view.y yVarE;
        androidx.core.graphics.j jVarH;
        a aVar = f15880x;
        this.f15883a = aVar.h(g3Var, androidx.core.view.g3.m.b(), "captionBar");
        h hVarH = aVar.h(g3Var, androidx.core.view.g3.m.c(), "displayCutout");
        this.f15884b = hVarH;
        h hVarH2 = aVar.h(g3Var, androidx.core.view.g3.m.d(), "ime");
        this.f15885c = hVarH2;
        h hVarH3 = aVar.h(g3Var, androidx.core.view.g3.m.f(), "mandatorySystemGestures");
        this.f15886d = hVarH3;
        this.f15887e = aVar.h(g3Var, androidx.core.view.g3.m.g(), "navigationBars");
        this.f15888f = aVar.h(g3Var, androidx.core.view.g3.m.h(), "statusBars");
        h hVarH4 = aVar.h(g3Var, androidx.core.view.g3.m.i(), "systemBars");
        this.f15889g = hVarH4;
        h hVarH5 = aVar.h(g3Var, androidx.core.view.g3.m.j(), "systemGestures");
        this.f15890h = hVarH5;
        h hVarH6 = aVar.h(g3Var, androidx.core.view.g3.m.k(), "tappableElement");
        this.f15891i = hVarH6;
        t6 t6VarA = b8.a((g3Var == null || (yVarE = g3Var.e()) == null || (jVarH = yVarE.h()) == null) ? androidx.core.graphics.j.f47822e : jVarH, "waterfall");
        this.f15892j = t6VarA;
        v6 v6VarL = b7.l(b7.l(hVarH4, hVarH2), hVarH);
        this.f15893k = v6VarL;
        v6 v6VarL2 = b7.l(b7.l(b7.l(hVarH6, hVarH3), hVarH5), t6VarA);
        this.f15894l = v6VarL2;
        this.f15895m = b7.l(v6VarL, v6VarL2);
        this.f15896n = aVar.i(g3Var, androidx.core.view.g3.m.b(), "captionBarIgnoringVisibility");
        this.f15897o = aVar.i(g3Var, androidx.core.view.g3.m.g(), "navigationBarsIgnoringVisibility");
        this.f15898p = aVar.i(g3Var, androidx.core.view.g3.m.h(), "statusBarsIgnoringVisibility");
        this.f15899q = aVar.i(g3Var, androidx.core.view.g3.m.i(), "systemBarsIgnoringVisibility");
        this.f15900r = aVar.i(g3Var, androidx.core.view.g3.m.k(), "tappableElementIgnoringVisibility");
        this.f15901s = aVar.i(g3Var, androidx.core.view.g3.m.d(), "imeAnimationTarget");
        this.f15902t = aVar.i(g3Var, androidx.core.view.g3.m.d(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(androidx.compose.ui.d0.b.I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f15903u = bool != null ? bool.booleanValue() : !o0.f16257b;
        this.f15905w = new w3(this);
    }
}
