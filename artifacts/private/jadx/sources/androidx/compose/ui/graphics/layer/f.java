package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.e3;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.s0;
import com.rabbitmq.client.k0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(23)
@SourceDebugExtension({"SMAP\nGraphicsLayerV23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,426:1\n1#2:427\n278#3:428\n54#4:429\n59#4:431\n54#4:439\n59#4:441\n54#4:443\n59#4:445\n54#4:447\n59#4:449\n85#5:430\n90#5:432\n60#5:434\n70#5:437\n85#5:440\n90#5:442\n85#5:444\n90#5:446\n85#5:448\n90#5:450\n65#6:433\n69#6:436\n22#7:435\n22#7:438\n41#8,3:451\n44#8,2:480\n305#9,26:454\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n*L\n181#1:428\n183#1:429\n184#1:431\n295#1:439\n295#1:441\n298#1:443\n299#1:445\n325#1:447\n326#1:449\n183#1:430\n184#1:432\n187#1:434\n188#1:437\n295#1:440\n295#1:442\n298#1:444\n299#1:446\n325#1:448\n326#1:450\n187#1:433\n188#1:436\n187#1:435\n188#1:438\n329#1:451,3\n329#1:480,2\n330#1:454,26\n*E\n"})
public final class f implements d {
    private static boolean I;
    private float A;
    private boolean B;
    private boolean C;
    private boolean D;

    @Nullable
    private e3 E;
    private boolean F;
    private final long G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l0 f37917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.drawscope.a f37918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final RenderNode f37919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f37920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Paint f37921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Matrix f37922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f37924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private r0 f37927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f37928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f37930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f37931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f37932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f37933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f37934t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f37935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f37936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f37937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f37938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f37939y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f37940z;

    @NotNull
    public static final a H = new a(null);

    @NotNull
    private static final AtomicBoolean J = new AtomicBoolean(true);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return f.I;
        }

        public final void b(boolean z10) {
            f.I = z10;
        }

        private a() {
        }
    }

    public f(@NotNull View view, long j10, @NotNull l0 l0Var, @NotNull androidx.compose.ui.graphics.drawscope.a aVar) {
        this.f37916b = j10;
        this.f37917c = l0Var;
        this.f37918d = aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.f37919e = renderNodeCreate;
        androidx.compose.ui.unit.u.a aVar2 = androidx.compose.ui.unit.u.f42720b;
        this.f37920f = aVar2.a();
        this.f37924j = aVar2.a();
        if (J.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            Y(renderNodeCreate);
            U();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (I) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        b.a aVar3 = b.f37875b;
        T(aVar3.a());
        this.f37925k = aVar3.a();
        this.f37926l = d0.f37693b.B();
        this.f37928n = 1.0f;
        this.f37930p = n0.g.f332700b.c();
        this.f37931q = 1.0f;
        this.f37932r = 1.0f;
        q0.a aVar4 = q0.f38131b;
        this.f37936v = aVar4.a();
        this.f37937w = aVar4.a();
        this.A = 8.0f;
        this.F = true;
    }

    private final void S() {
        boolean z10 = false;
        boolean z11 = b() && !this.f37923i;
        if (b() && this.f37923i) {
            z10 = true;
        }
        if (z11 != this.C) {
            this.C = z11;
            this.f37919e.setClipToBounds(z11);
        }
        if (z10 != this.D) {
            this.D = z10;
            this.f37919e.setClipToOutline(z10);
        }
    }

    private final void T(int i10) {
        RenderNode renderNode = this.f37919e;
        b.a aVar = b.f37875b;
        if (b.g(i10, aVar.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f37921g);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.g(i10, aVar.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f37921g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f37921g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint V() {
        Paint paint = this.f37921g;
        if (paint == null) {
            paint = new Paint();
            this.f37921g = paint;
        }
        return paint;
    }

    private final boolean W() {
        return (!b.g(G(), b.f37875b.c()) && d0.G(t(), d0.f37693b.B()) && e() == null) ? false : true;
    }

    private final void X() {
        if (W()) {
            T(b.f37875b.c());
        } else {
            T(G());
        }
    }

    private final void Y(RenderNode renderNode) {
        t tVar = t.f38010a;
        tVar.c(renderNode, tVar.a(renderNode));
        tVar.d(renderNode, tVar.b(renderNode));
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void A(@Nullable e3 e3Var) {
        this.E = e3Var;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float B() {
        return this.f37931q;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void C(float f10) {
        this.f37932r = f10;
        this.f37919e.setScaleY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float D() {
        return this.f37938x;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void E(float f10) {
        this.f37933s = f10;
        this.f37919e.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float F() {
        return this.f37932r;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public int G() {
        return this.f37925k;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void H(int i10, int i11, long j10) {
        int i12 = (int) (j10 >> 32);
        int i13 = (int) (k0.f265952a & j10);
        this.f37919e.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (androidx.compose.ui.unit.u.h(this.f37920f, j10)) {
            return;
        }
        if (this.f37929o) {
            this.f37919e.setPivotX(i12 / 2.0f);
            this.f37919e.setPivotY(i13 / 2.0f);
        }
        this.f37920f = j10;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long I() {
        return this.f37930p;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void J(boolean z10) {
        this.F = z10;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long K() {
        return this.f37916b;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long L() {
        return this.f37937w;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void M(long j10) {
        this.f37930p = j10;
        if ((9223372034707292159L & j10) == n0.d.f332689d) {
            this.f37929o = true;
            this.f37919e.setPivotX(((int) (this.f37920f >> 32)) / 2.0f);
            this.f37919e.setPivotY(((int) (k0.f265952a & this.f37920f)) / 2.0f);
        } else {
            this.f37929o = false;
            this.f37919e.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f37919e.setPivotY(Float.intBitsToFloat((int) (j10 & k0.f265952a)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void N(int i10) {
        this.f37925k = i10;
        X();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void O(boolean z10) {
        this.B = z10;
        S();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void Q(float f10) {
        this.f37935u = f10;
        this.f37919e.setElevation(f10);
    }

    public final void U() {
        s.f38009a.a(this.f37919e);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public boolean a() {
        return this.f37919e.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float a0() {
        return this.f37935u;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public boolean b() {
        return this.B;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void c() {
        U();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public boolean d() {
        return this.F;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    @Nullable
    public r0 e() {
        return this.f37927m;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void f(@Nullable r0 r0Var) {
        this.f37927m = r0Var;
        if (r0Var == null) {
            X();
            return;
        }
        T(b.f37875b.c());
        RenderNode renderNode = this.f37919e;
        Paint paintV = V();
        paintV.setColorFilter(androidx.compose.ui.graphics.d.e(r0Var));
        renderNode.setLayerPaint(paintV);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long f0() {
        return this.f37936v;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    @Nullable
    public e3 g() {
        return this.E;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long getLayerId() {
        return this.G;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void h(float f10) {
        this.f37934t = f10;
        this.f37919e.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void h0(long j10) {
        this.f37936v = j10;
        t.f38010a.c(this.f37919e, s0.t(j10));
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float i() {
        return this.A;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void j(float f10) {
        this.A = f10;
        this.f37919e.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void j0(long j10) {
        this.f37937w = j10;
        t.f38010a.d(this.f37919e, s0.t(j10));
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void k(float f10) {
        this.f37938x = f10;
        this.f37919e.setRotationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void l(float f10) {
        this.f37939y = f10;
        this.f37919e.setRotationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void m(float f10) {
        this.f37940z = f10;
        this.f37919e.setRotation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    @NotNull
    public Matrix n() {
        Matrix matrix = this.f37922h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f37922h = matrix;
        }
        this.f37919e.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float o() {
        return this.f37934t;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float p() {
        return this.f37933s;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float q() {
        return this.f37939y;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float r() {
        return this.f37928n;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void s(int i10) {
        if (!d0.G(this.f37926l, i10)) {
            this.f37926l = i10;
            V().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.d(i10)));
            X();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void setAlpha(float f10) {
        this.f37928n = f10;
        this.f37919e.setAlpha(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public int t() {
        return this.f37926l;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float v() {
        return this.f37940z;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void w(@Nullable Outline outline, long j10) {
        this.f37924j = j10;
        this.f37919e.setOutline(outline);
        this.f37923i = outline != null;
        S();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void x(@NotNull androidx.compose.ui.graphics.k0 k0Var) {
        DisplayListCanvas displayListCanvasD = androidx.compose.ui.graphics.c.d(k0Var);
        Intrinsics.checkNotNull(displayListCanvasD, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasD.drawRenderNode(this.f37919e);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void y(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull c cVar, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        Canvas canvasStart = this.f37919e.start(Math.max((int) (this.f37920f >> 32), (int) (this.f37924j >> 32)), Math.max((int) (this.f37920f & k0.f265952a), (int) (this.f37924j & k0.f265952a)));
        try {
            l0 l0Var = this.f37917c;
            Canvas canvasS = l0Var.b().S();
            l0Var.b().U(canvasStart);
            androidx.compose.ui.graphics.b bVarB = l0Var.b();
            androidx.compose.ui.graphics.drawscope.a aVar = this.f37918d;
            long jH = androidx.compose.ui.unit.v.h(this.f37920f);
            androidx.compose.ui.unit.d density = aVar.Z3().getDensity();
            androidx.compose.ui.unit.w layoutDirection = aVar.Z3().getLayoutDirection();
            androidx.compose.ui.graphics.k0 k0VarF = aVar.Z3().f();
            long jD = aVar.Z3().d();
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
                l0Var.b().U(canvasS);
                this.f37919e.end(canvasStart);
                J(false);
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
            this.f37919e.end(canvasStart);
            throw th3;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void z(float f10) {
        this.f37931q = f10;
        this.f37919e.setScaleX(f10);
    }

    public /* synthetic */ f(View view, long j10, l0 l0Var, androidx.compose.ui.graphics.drawscope.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j10, (i10 & 4) != 0 ? new l0() : l0Var, (i10 & 8) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }
}
