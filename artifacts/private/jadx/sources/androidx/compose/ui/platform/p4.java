package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@e.a({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,531:1\n1#2:532\n65#3:533\n69#3:536\n60#4:534\n70#4:537\n85#4:540\n90#4:542\n22#5:535\n22#5:538\n54#6:539\n59#6:541\n41#7,5:543\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n273#1:533\n274#1:536\n273#1:534\n274#1:537\n310#1:540\n311#1:542\n273#1:535\n274#1:538\n310#1:539\n311#1:541\n348#1:543,5\n*E\n"})
public final class p4 extends View implements androidx.compose.ui.node.w1, androidx.compose.ui.layout.r {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private static Field f40713g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static boolean f40714h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static boolean f40715i3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private static Method f40718p2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a2 f40721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> f40722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f40723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final g3 f40724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Rect f40726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.h2 f40728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.l0 f40730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final x2<View> f40731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f40732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f40734o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f40735s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f40736t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f40737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final c f40719w = new c(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f40716p0 = 8;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final Function2<View, Matrix, Unit> f40717p1 = b.f40738a;

    @NotNull
    private static final ViewOutlineProvider H1 = new a();

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineB = ((p4) view).f40724e.b();
            Intrinsics.checkNotNull(outlineB);
            outline.set(outlineB);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function2<View, Matrix, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40738a = new b();

        b() {
            super(2);
        }

        public final void c(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Matrix matrix) {
            c(view, matrix);
            return Unit.f312394a;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return p4.f40714h3;
        }

        @NotNull
        public final ViewOutlineProvider b() {
            return p4.H1;
        }

        public final boolean c() {
            return p4.f40715i3;
        }

        public final void d(boolean z10) {
            p4.f40715i3 = z10;
        }

        @e.a({"BanUncheckedReflection"})
        public final void e(@NotNull View view) {
            try {
                if (!a()) {
                    p4.f40714h3 = true;
                    p4.f40718p2 = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    p4.f40713g3 = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    Method method = p4.f40718p2;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = p4.f40713g3;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = p4.f40713g3;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = p4.f40718p2;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                d(true);
            }
        }

        private c() {
        }
    }

    @androidx.annotation.w0(29)
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f40739a = new d();

        private d() {
        }

        @oj.n
        public static final long a(@NotNull View view) {
            return view.getUniqueDrawingId();
        }
    }

    public p4(@NotNull AndroidComposeView androidComposeView, @NotNull a2 a2Var, @NotNull Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2, @NotNull Function0<Unit> function0) {
        super(androidComposeView.getContext());
        this.f40720a = androidComposeView;
        this.f40721b = a2Var;
        this.f40722c = function2;
        this.f40723d = function0;
        this.f40724e = new g3();
        this.f40730k = new androidx.compose.ui.graphics.l0();
        this.f40731l = new x2<>(f40717p1);
        this.f40734o = androidx.compose.ui.graphics.z3.f38723b.a();
        this.f40735s = true;
        setWillNotDraw(false);
        a2Var.addView(this);
        this.f40736t = View.generateViewId();
    }

    private final void A() {
        setOutlineProvider(this.f40724e.b() != null ? H1 : null);
    }

    private final androidx.compose.ui.graphics.k2 getManualClipPath() {
        if (getClipToOutline() && !this.f40724e.e()) {
            return this.f40724e.d();
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f40727h) {
            this.f40727h = z10;
            this.f40720a.Z0(this, z10);
        }
    }

    private final androidx.compose.ui.graphics.h2 y() {
        androidx.compose.ui.graphics.h2 h2Var = this.f40728i;
        if (h2Var != null) {
            return h2Var;
        }
        androidx.compose.ui.graphics.h2 h2VarA = androidx.compose.ui.graphics.m.a();
        this.f40728i = h2VarA;
        return h2VarA;
    }

    private final void z() {
        Rect rect;
        if (this.f40725f) {
            Rect rect2 = this.f40726g;
            if (rect2 == null) {
                this.f40726g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f40726g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // androidx.compose.ui.node.w1
    public void a(@NotNull float[] fArr) {
        androidx.compose.ui.graphics.c2.w(fArr, this.f40731l.b(this));
    }

    @Override // androidx.compose.ui.node.w1
    public void b(@NotNull Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2, @NotNull Function0<Unit> function0) {
        this.f40721b.addView(this);
        this.f40731l.h();
        this.f40725f = false;
        this.f40729j = false;
        this.f40734o = androidx.compose.ui.graphics.z3.f38723b.a();
        this.f40722c = function2;
        this.f40723d = function0;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.w1
    public void c(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        boolean z10 = getElevation() > 0.0f;
        this.f40729j = z10;
        if (z10) {
            k0Var.D();
        }
        this.f40721b.a(k0Var, this, getDrawingTime());
        if (this.f40729j) {
            k0Var.q();
        }
    }

    @Override // androidx.compose.ui.node.w1
    public void d(@NotNull n0.e eVar, boolean z10) {
        if (z10) {
            this.f40731l.f(this, eVar);
        } else {
            this.f40731l.d(this, eVar);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public void destroy() {
        setInvalidated(false);
        this.f40720a.g1();
        this.f40722c = null;
        this.f40723d = null;
        this.f40720a.e1(this);
        this.f40721b.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        boolean z10;
        androidx.compose.ui.graphics.l0 l0Var = this.f40730k;
        Canvas canvasS = l0Var.b().S();
        l0Var.b().U(canvas);
        androidx.compose.ui.graphics.b bVarB = l0Var.b();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            bVarB.save();
            this.f40724e.a(bVarB);
            z10 = true;
        }
        Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2 = this.f40722c;
        if (function2 != null) {
            function2.invoke(bVarB, null);
        }
        if (z10) {
            bVarB.B();
        }
        l0Var.b().U(canvasS);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.w1
    public long f(long j10, boolean z10) {
        return z10 ? this.f40731l.g(this, j10) : this.f40731l.e(this, j10);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // androidx.compose.ui.node.w1
    public void g(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.z3.k(this.f40734o) * i10);
        setPivotY(androidx.compose.ui.graphics.z3.l(this.f40734o) * i11);
        A();
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        z();
        this.f40731l.c();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final a2 getContainer() {
        return this.f40721b;
    }

    @Override // androidx.compose.ui.node.w1
    public float getFrameRate() {
        return this.f40732m;
    }

    @Override // androidx.compose.ui.layout.r
    public long getLayerId() {
        return this.f40736t;
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.f40720a;
    }

    @Override // androidx.compose.ui.layout.r
    public long getOwnerViewId() {
        return d.a(this.f40720a);
    }

    @Override // androidx.compose.ui.node.w1
    @NotNull
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo3getUnderlyingMatrixsQKQjiQ() {
        return this.f40731l.b(this);
    }

    @Override // androidx.compose.ui.node.w1
    public boolean h(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10));
        if (this.f40725f) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f40724e.f(j10);
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f40735s;
    }

    @Override // androidx.compose.ui.node.w1
    public void i(@NotNull androidx.compose.ui.graphics.l3 l3Var) {
        Function0<Unit> function0;
        int iX = l3Var.x() | this.f40737v;
        if ((iX & 4096) != 0) {
            long jC6 = l3Var.c6();
            this.f40734o = jC6;
            setPivotX(androidx.compose.ui.graphics.z3.k(jC6) * getWidth());
            setPivotY(androidx.compose.ui.graphics.z3.l(this.f40734o) * getHeight());
        }
        if ((iX & 1) != 0) {
            setScaleX(l3Var.B());
        }
        if ((iX & 2) != 0) {
            setScaleY(l3Var.F());
        }
        if ((iX & 4) != 0) {
            setAlpha(l3Var.r());
        }
        if ((iX & 8) != 0) {
            setTranslationX(l3Var.p());
        }
        if ((iX & 16) != 0) {
            setTranslationY(l3Var.o());
        }
        if ((iX & 32) != 0) {
            setElevation(l3Var.a0());
        }
        if ((iX & 1024) != 0) {
            setRotation(l3Var.v());
        }
        if ((iX & 256) != 0) {
            setRotationX(l3Var.D());
        }
        if ((iX & 512) != 0) {
            setRotationY(l3Var.q());
        }
        if ((iX & 2048) != 0) {
            setCameraDistancePx(l3Var.i());
        }
        boolean z10 = false;
        boolean z11 = getManualClipPath() != null;
        boolean z12 = l3Var.b() && l3Var.t3() != androidx.compose.ui.graphics.d3.a();
        if ((iX & 24576) != 0) {
            this.f40725f = l3Var.b() && l3Var.t3() == androidx.compose.ui.graphics.d3.a();
            z();
            setClipToOutline(z12);
        }
        boolean zH = this.f40724e.h(l3Var.I(), l3Var.r(), z12, l3Var.a0(), l3Var.d());
        if (this.f40724e.c()) {
            A();
        }
        boolean z13 = getManualClipPath() != null;
        if (z11 != z13 || (z13 && zH)) {
            invalidate();
        }
        if (!this.f40729j) {
            boolean z14 = true;
            if (getElevation() > 0.0f && (function0 = this.f40723d) != null) {
                function0.invoke();
            }
        }
        if ((iX & androidx.compose.ui.graphics.k1.f37825u) != 0) {
            this.f40731l.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if ((iX & 64) != 0) {
            r4.f40819a.a(this, androidx.compose.ui.graphics.s0.t(l3Var.f0()));
        }
        if ((iX & 128) != 0) {
            r4.f40819a.b(this, androidx.compose.ui.graphics.s0.t(l3Var.L()));
        }
        if (i10 >= 31 && (131072 & iX) != 0) {
            s4.f40883a.a(this, l3Var.g());
        }
        boolean z15 = ((262144 & iX) == 0 && (524288 & iX) == 0) ? false : true;
        if ((iX & 32768) != 0 || z15) {
            int iC = z15 ? androidx.compose.ui.graphics.h1.f37790b.c() : l3Var.T();
            androidx.compose.ui.graphics.h1.a aVar = androidx.compose.ui.graphics.h1.f37790b;
            Paint paintD = null;
            if (androidx.compose.ui.graphics.h1.g(iC, aVar.c())) {
                if (z15) {
                    androidx.compose.ui.graphics.h2 h2VarY = y();
                    h2VarY.f(l3Var.e());
                    h2VarY.s(l3Var.t());
                    paintD = h2VarY.D();
                }
                setLayerType(2, paintD);
            } else {
                if (androidx.compose.ui.graphics.h1.g(iC, aVar.b())) {
                    setLayerType(0, null);
                } else {
                    setLayerType(0, null);
                }
                this.f40735s = z10;
            }
            z10 = true;
            this.f40735s = z10;
        }
        this.f40737v = l3Var.x();
    }

    @Override // android.view.View, androidx.compose.ui.node.w1
    public void invalidate() {
        if (this.f40727h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f40720a.invalidate();
    }

    @Override // androidx.compose.ui.node.w1
    public void j(@NotNull float[] fArr) {
        float[] fArrA = this.f40731l.a(this);
        if (fArrA != null) {
            androidx.compose.ui.graphics.c2.w(fArr, fArrA);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public void k(long j10) {
        int iN = androidx.compose.ui.unit.q.n(j10);
        if (iN != getLeft()) {
            offsetLeftAndRight(iN - getLeft());
            this.f40731l.c();
        }
        int iP = androidx.compose.ui.unit.q.p(j10);
        if (iP != getTop()) {
            offsetTopAndBottom(iP - getTop());
            this.f40731l.c();
        }
    }

    @Override // androidx.compose.ui.node.w1
    public void l() {
        if (this.f40727h && !f40715i3) {
            f40719w.e(this);
            setInvalidated(false);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public boolean m() {
        return this.f40733n;
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.w1
    public void setFrameRate(float f10) {
        this.f40732m = f10;
    }

    @Override // androidx.compose.ui.node.w1
    public void setFrameRateFromParent(boolean z10) {
        this.f40733n = z10;
    }

    public final boolean x() {
        return this.f40727h;
    }
}
