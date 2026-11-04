package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.e3;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.s0;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,583:1\n1#2:584\n278#3:585\n54#4:586\n59#4:588\n54#4:596\n59#4:598\n54#4:600\n59#4:602\n54#4:604\n59#4:606\n85#5:587\n90#5:589\n60#5:591\n70#5:594\n85#5:597\n90#5:599\n85#5:601\n90#5:603\n85#5:605\n90#5:607\n65#6:590\n69#6:593\n22#7:592\n22#7:595\n41#8,3:608\n44#8,2:637\n41#8,5:639\n305#9,26:611\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n*L\n266#1:585\n271#1:586\n272#1:588\n377#1:596\n377#1:598\n380#1:600\n381#1:602\n437#1:604\n437#1:606\n271#1:587\n272#1:589\n276#1:591\n277#1:594\n377#1:597\n377#1:599\n380#1:601\n381#1:603\n437#1:605\n437#1:607\n276#1:590\n277#1:593\n276#1:592\n277#1:595\n439#1:608,3\n439#1:637,2\n460#1:639,5\n440#1:611,26\n*E\n"})
public final class h implements d {

    @NotNull
    public static final b L = new b(null);
    private static final boolean M = !v.f38012a.a();

    @NotNull
    private static final Canvas N = new a();
    private float A;
    private float B;
    private float C;
    private float D;
    private long E;
    private long F;
    private float G;
    private float H;
    private float I;

    @Nullable
    private e3 J;
    private final boolean K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.layer.view.a f37966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f37967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final l0 f37968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final x f37969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Resources f37970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Rect f37971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Paint f37972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final Picture f37973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.drawscope.a f37974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final l0 f37975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f37978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f37980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f37981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f37982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f37983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private r0 f37985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f37986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f37987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f37988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f37989y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f37990z;

    public static final class a extends Canvas {
        a() {
        }

        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return h.M;
        }

        @NotNull
        public final Canvas b() {
            return h.N;
        }

        private b() {
        }
    }

    public h(@NotNull androidx.compose.ui.graphics.layer.view.a aVar, long j10, @NotNull l0 l0Var, @NotNull androidx.compose.ui.graphics.drawscope.a aVar2) {
        this.f37966b = aVar;
        this.f37967c = j10;
        this.f37968d = l0Var;
        x xVar = new x(aVar, l0Var, aVar2);
        this.f37969e = xVar;
        this.f37970f = aVar.getResources();
        this.f37971g = new Rect();
        boolean z10 = M;
        this.f37973i = z10 ? new Picture() : null;
        this.f37974j = z10 ? new androidx.compose.ui.graphics.drawscope.a() : null;
        this.f37975k = z10 ? new l0() : null;
        aVar.addView(xVar);
        xVar.setClipBounds(null);
        this.f37978n = androidx.compose.ui.unit.u.f42720b.a();
        this.f37980p = true;
        this.f37983s = View.generateViewId();
        this.f37984t = d0.f37693b.B();
        this.f37986v = androidx.compose.ui.graphics.layer.b.f37875b.a();
        this.f37987w = 1.0f;
        this.f37989y = n0.g.f332700b.e();
        this.f37990z = 1.0f;
        this.A = 1.0f;
        q0.a aVar3 = q0.f38131b;
        this.E = aVar3.a();
        this.F = aVar3.a();
        this.K = z10;
    }

    private final void S(int i10) {
        x xVar = this.f37969e;
        androidx.compose.ui.graphics.layer.b.a aVar = androidx.compose.ui.graphics.layer.b.f37875b;
        boolean z10 = true;
        if (androidx.compose.ui.graphics.layer.b.g(i10, aVar.c())) {
            this.f37969e.setLayerType(2, this.f37972h);
        } else if (androidx.compose.ui.graphics.layer.b.g(i10, aVar.b())) {
            this.f37969e.setLayerType(0, this.f37972h);
            z10 = false;
        } else {
            this.f37969e.setLayerType(0, this.f37972h);
        }
        xVar.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    private final Paint U() {
        Paint paint = this.f37972h;
        if (paint == null) {
            paint = new Paint();
            this.f37972h = paint;
        }
        return paint;
    }

    private final void V() {
        try {
            l0 l0Var = this.f37968d;
            Canvas canvas = N;
            Canvas canvasS = l0Var.b().S();
            l0Var.b().U(canvas);
            androidx.compose.ui.graphics.b bVarB = l0Var.b();
            androidx.compose.ui.graphics.layer.view.a aVar = this.f37966b;
            x xVar = this.f37969e;
            aVar.a(bVarB, xVar, xVar.getDrawingTime());
            l0Var.b().U(canvasS);
        } catch (ClassCastException unused) {
        }
    }

    private final boolean W() {
        return androidx.compose.ui.graphics.layer.b.g(G(), androidx.compose.ui.graphics.layer.b.f37875b.c()) || X();
    }

    private final boolean X() {
        return (d0.G(t(), d0.f37693b.B()) && e() == null) ? false : true;
    }

    private final void Y() {
        Rect rect;
        if (this.f37979o) {
            x xVar = this.f37969e;
            if (!b() || this.f37981q) {
                rect = null;
            } else {
                rect = this.f37971g;
                int i10 = 0 >> 0;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.f37969e.getWidth();
                rect.bottom = this.f37969e.getHeight();
            }
            xVar.setClipBounds(rect);
        }
    }

    private final void Z() {
        if (W()) {
            S(androidx.compose.ui.graphics.layer.b.f37875b.c());
        } else {
            S(G());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void A(@Nullable e3 e3Var) {
        this.J = e3Var;
        if (Build.VERSION.SDK_INT >= 31) {
            a0.f37874a.a(this.f37969e, e3Var);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float B() {
        return this.f37990z;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void C(float f10) {
        this.A = f10;
        this.f37969e.setScaleY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float D() {
        return this.G;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void E(float f10) {
        this.B = f10;
        this.f37969e.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float F() {
        return this.A;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public int G() {
        return this.f37986v;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void H(int i10, int i11, long j10) {
        if (androidx.compose.ui.unit.u.h(this.f37978n, j10)) {
            int i12 = this.f37976l;
            if (i12 != i10) {
                this.f37969e.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f37977m;
            if (i13 != i11) {
                this.f37969e.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (b()) {
                this.f37979o = true;
            }
            int i14 = (int) (j10 >> 32);
            int i15 = (int) (k0.f265952a & j10);
            this.f37969e.layout(i10, i11, i10 + i14, i11 + i15);
            this.f37978n = j10;
            if (this.f37988x) {
                this.f37969e.setPivotX(i14 / 2.0f);
                this.f37969e.setPivotY(i15 / 2.0f);
            }
        }
        this.f37976l = i10;
        this.f37977m = i11;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long I() {
        return this.f37989y;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void J(boolean z10) {
        this.f37980p = z10;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long K() {
        return this.f37967c;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long L() {
        return this.F;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void M(long j10) {
        this.f37989y = j10;
        if ((9223372034707292159L & j10) == n0.d.f332689d) {
            y.f38029a.a(this.f37969e);
            return;
        }
        this.f37988x = false;
        this.f37969e.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
        this.f37969e.setPivotY(Float.intBitsToFloat((int) (j10 & k0.f265952a)));
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void N(int i10) {
        this.f37986v = i10;
        Z();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void O(boolean z10) {
        boolean z11 = false;
        this.f37982r = z10 && !this.f37981q;
        this.f37979o = true;
        x xVar = this.f37969e;
        if (z10 && this.f37981q) {
            z11 = true;
        }
        xVar.setClipToOutline(z11);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void Q(float f10) {
        this.D = f10;
        this.f37969e.setElevation(f10);
    }

    @NotNull
    public final l0 T() {
        return this.f37968d;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float a0() {
        return this.D;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public boolean b() {
        return this.f37982r || this.f37969e.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void c() {
        this.f37966b.removeViewInLayout(this.f37969e);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public boolean d() {
        return this.f37980p;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    @Nullable
    public r0 e() {
        return this.f37985u;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void f(@Nullable r0 r0Var) {
        this.f37985u = r0Var;
        U().setColorFilter(r0Var != null ? androidx.compose.ui.graphics.d.e(r0Var) : null);
        Z();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long f0() {
        return this.E;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    @Nullable
    public e3 g() {
        return this.J;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long getLayerId() {
        return this.f37983s;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void h(float f10) {
        this.C = f10;
        this.f37969e.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void h0(long j10) {
        this.E = j10;
        y.f38029a.b(this.f37969e, s0.t(j10));
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float i() {
        return this.f37969e.getCameraDistance() / this.f37970f.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void j(float f10) {
        this.f37969e.setCameraDistance(f10 * this.f37970f.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void j0(long j10) {
        this.F = j10;
        y.f38029a.c(this.f37969e, s0.t(j10));
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void k(float f10) {
        this.G = f10;
        this.f37969e.setRotationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void l(float f10) {
        this.H = f10;
        this.f37969e.setRotationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void m(float f10) {
        this.I = f10;
        this.f37969e.setRotation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    @NotNull
    public Matrix n() {
        return this.f37969e.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float o() {
        return this.C;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float p() {
        return this.B;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float q() {
        return this.H;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float r() {
        return this.f37987w;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void s(int i10) {
        this.f37984t = i10;
        U().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.d(i10)));
        Z();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void setAlpha(float f10) {
        this.f37987w = f10;
        this.f37969e.setAlpha(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public int t() {
        return this.f37984t;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public boolean u() {
        return this.K;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float v() {
        return this.I;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void w(@Nullable Outline outline, long j10) {
        boolean zE = this.f37969e.e(outline);
        if (b() && outline != null) {
            this.f37969e.setClipToOutline(true);
            if (this.f37982r) {
                this.f37982r = false;
                this.f37979o = true;
            }
        }
        this.f37981q = outline != null;
        if (zE) {
            return;
        }
        this.f37969e.invalidate();
        V();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void x(@NotNull androidx.compose.ui.graphics.k0 k0Var) {
        Y();
        Canvas canvasD = androidx.compose.ui.graphics.c.d(k0Var);
        if (canvasD.isHardwareAccelerated()) {
            androidx.compose.ui.graphics.layer.view.a aVar = this.f37966b;
            x xVar = this.f37969e;
            aVar.a(k0Var, xVar, xVar.getDrawingTime());
        } else {
            Picture picture = this.f37973i;
            if (picture != null) {
                canvasD.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void y(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull c cVar, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) throws Throwable {
        Picture picture;
        if (this.f37969e.getParent() == null) {
            this.f37966b.addView(this.f37969e);
        }
        this.f37969e.d(dVar, wVar, cVar, function1);
        if (!this.f37969e.isAttachedToWindow()) {
            return;
        }
        this.f37969e.setVisibility(4);
        this.f37969e.setVisibility(0);
        V();
        Picture picture2 = this.f37973i;
        if (picture2 == null) {
            return;
        }
        long j10 = this.f37978n;
        Canvas canvasBeginRecording = picture2.beginRecording((int) (j10 >> 32), (int) (j10 & k0.f265952a));
        try {
            l0 l0Var = this.f37975k;
            if (l0Var != null) {
                Canvas canvasS = l0Var.b().S();
                l0Var.b().U(canvasBeginRecording);
                androidx.compose.ui.graphics.b bVarB = l0Var.b();
                androidx.compose.ui.graphics.drawscope.a aVar = this.f37974j;
                if (aVar != null) {
                    long jH = androidx.compose.ui.unit.v.h(this.f37978n);
                    androidx.compose.ui.unit.d density = aVar.Z3().getDensity();
                    androidx.compose.ui.unit.w layoutDirection = aVar.Z3().getLayoutDirection();
                    androidx.compose.ui.graphics.k0 k0VarF = aVar.Z3().f();
                    long jD = aVar.Z3().d();
                    picture = picture2;
                    try {
                        c cVarH = aVar.Z3().h();
                        androidx.compose.ui.graphics.drawscope.d dVarZ3 = aVar.Z3();
                        dVarZ3.e(dVar);
                        dVarZ3.b(wVar);
                        dVarZ3.k(bVarB);
                        dVarZ3.g(jH);
                        dVarZ3.j(cVar);
                        bVarB.save();
                        try {
                            function1.invoke(aVar);
                            bVarB.B();
                            androidx.compose.ui.graphics.drawscope.d dVarZ4 = aVar.Z3();
                            dVarZ4.e(density);
                            dVarZ4.b(layoutDirection);
                            dVarZ4.k(k0VarF);
                            dVarZ4.g(jD);
                            dVarZ4.j(cVarH);
                        } catch (Throwable th2) {
                            bVarB.B();
                            androidx.compose.ui.graphics.drawscope.d dVarZ5 = aVar.Z3();
                            dVarZ5.e(density);
                            dVarZ5.b(layoutDirection);
                            dVarZ5.k(k0VarF);
                            dVarZ5.g(jD);
                            dVarZ5.j(cVarH);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        picture.endRecording();
                        throw th;
                    }
                } else {
                    picture = picture2;
                }
                l0Var.b().U(canvasS);
                Unit unit = Unit.f312394a;
            } else {
                picture = picture2;
            }
            picture.endRecording();
        } catch (Throwable th4) {
            th = th4;
            picture = picture2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void z(float f10) {
        this.f37990z = f10;
        this.f37969e.setScaleX(f10);
    }

    public /* synthetic */ h(androidx.compose.ui.graphics.layer.view.a aVar, long j10, l0 l0Var, androidx.compose.ui.graphics.drawscope.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j10, (i10 & 4) != 0 ? new l0() : l0Var, (i10 & 8) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar2);
    }
}
