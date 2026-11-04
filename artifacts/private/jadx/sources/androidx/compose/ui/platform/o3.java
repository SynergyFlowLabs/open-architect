package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.annotation.w0(23)
@SourceDebugExtension({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,453:1\n1#2:454\n41#3,5:455\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n315#1:455,5\n*E\n"})
public final class o3 implements v1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f40682o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final RenderNode f40685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.h2 f40687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.e3 f40692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.r0 f40695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f40680m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f40681n = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f40683p = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return o3.f40682o;
        }

        public final void b(boolean z10) {
            o3.f40682o = z10;
        }

        private a() {
        }
    }

    public o3(@NotNull AndroidComposeView androidComposeView) {
        this.f40684a = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f40685b = renderNodeCreate;
        this.f40686c = androidx.compose.ui.graphics.h1.f37790b.a();
        if (f40683p) {
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
            t0(renderNodeCreate);
            h0();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f40683p = false;
        }
        if (f40682o) {
            throw new NoClassDefFoundError();
        }
        this.f40694k = androidx.compose.ui.graphics.d0.f37693b.B();
    }

    private final void g0(RenderNode renderNode, int i10) {
        androidx.compose.ui.graphics.h1.a aVar = androidx.compose.ui.graphics.h1.f37790b;
        if (androidx.compose.ui.graphics.h1.g(i10, aVar.c())) {
            renderNode.setLayerType(2);
            androidx.compose.ui.graphics.h2 h2Var = this.f40687d;
            renderNode.setLayerPaint(h2Var != null ? h2Var.D() : null);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        if (androidx.compose.ui.graphics.h1.g(i10, aVar.b())) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void h0() {
        t3.f40897a.a(this.f40685b);
    }

    private final androidx.compose.ui.graphics.h2 l0() {
        androidx.compose.ui.graphics.h2 h2Var = this.f40687d;
        if (h2Var != null) {
            return h2Var;
        }
        androidx.compose.ui.graphics.h2 h2VarA = androidx.compose.ui.graphics.m.a();
        this.f40687d = h2VarA;
        return h2VarA;
    }

    private final boolean m0() {
        return androidx.compose.ui.graphics.h1.g(T(), androidx.compose.ui.graphics.h1.f37790b.c()) || n0();
    }

    private final boolean n0() {
        return (androidx.compose.ui.graphics.d0.G(t(), androidx.compose.ui.graphics.d0.f37693b.B()) && e() == null) ? false : true;
    }

    private final void s0() {
        if (m0()) {
            g0(this.f40685b, androidx.compose.ui.graphics.h1.f37790b.c());
        } else {
            g0(this.f40685b, this.f40686c);
        }
    }

    private final void t0(RenderNode renderNode) {
        u3 u3Var = u3.f40904a;
        u3Var.c(renderNode, u3Var.a(renderNode));
        u3Var.d(renderNode, u3Var.b(renderNode));
    }

    @Override // androidx.compose.ui.platform.v1
    public void A(@Nullable androidx.compose.ui.graphics.e3 e3Var) {
        this.f40692i = e3Var;
    }

    @Override // androidx.compose.ui.platform.v1
    public float B() {
        return this.f40685b.getScaleX();
    }

    @Override // androidx.compose.ui.platform.v1
    public void C(float f10) {
        this.f40685b.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public float D() {
        return this.f40685b.getRotationX();
    }

    @Override // androidx.compose.ui.platform.v1
    public void E(float f10) {
        this.f40685b.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public float F() {
        return this.f40685b.getScaleY();
    }

    @Override // androidx.compose.ui.platform.v1
    public void G(boolean z10) {
        this.f40693j = z10;
        this.f40685b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void H(int i10) {
        this.f40686c = i10;
        s0();
    }

    @Override // androidx.compose.ui.platform.v1
    public void I(float f10) {
        this.f40685b.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void J(int i10) {
        r0(n() + i10);
        o0(b() + i10);
        this.f40685b.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.v1
    public float K() {
        return this.f40685b.getPivotX();
    }

    @Override // androidx.compose.ui.platform.v1
    public float L() {
        return this.f40685b.getPivotY();
    }

    @Override // androidx.compose.ui.platform.v1
    @NotNull
    public w1 M() {
        return new w1(0L, 0, 0, 0, 0, 0, 0, this.f40685b.getScaleX(), this.f40685b.getScaleY(), this.f40685b.getTranslationX(), this.f40685b.getTranslationY(), this.f40685b.getElevation(), Y(), Z(), this.f40685b.getRotation(), this.f40685b.getRotationX(), this.f40685b.getRotationY(), this.f40685b.getCameraDistance(), this.f40685b.getPivotX(), this.f40685b.getPivotY(), this.f40685b.getClipToOutline(), d(), this.f40685b.getAlpha(), g(), t(), e(), this.f40686c, null);
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean N() {
        return this.f40685b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean O(boolean z10) {
        return this.f40685b.setHasOverlappingRendering(z10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void P(@NotNull Matrix matrix) {
        this.f40685b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.v1
    public void Q(int i10) {
        p0(y() + i10);
        q0(x() + i10);
        this.f40685b.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void R(float f10) {
        this.f40685b.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void S(float f10) {
        this.f40685b.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public int T() {
        return this.f40686c;
    }

    @Override // androidx.compose.ui.platform.v1
    public void U(@Nullable Outline outline) {
        this.f40685b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.v1
    public void V(boolean z10) {
        this.f40685b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void W(@NotNull Matrix matrix) {
        this.f40685b.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean X(int i10, int i11, int i12, int i13) {
        p0(i10);
        r0(i11);
        q0(i12);
        o0(i13);
        return this.f40685b.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.v1
    public int Y() {
        return u3.f40904a.a(this.f40685b);
    }

    @Override // androidx.compose.ui.platform.v1
    public int Z() {
        return u3.f40904a.b(this.f40685b);
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean a() {
        return this.f40685b.isValid();
    }

    @Override // androidx.compose.ui.platform.v1
    public void a0(int i10) {
        u3.f40904a.c(this.f40685b, i10);
    }

    @Override // androidx.compose.ui.platform.v1
    public int b() {
        return this.f40691h;
    }

    @Override // androidx.compose.ui.platform.v1
    public void b0(@NotNull androidx.compose.ui.graphics.l0 l0Var, @Nullable androidx.compose.ui.graphics.k2 k2Var, @NotNull Function1<? super androidx.compose.ui.graphics.k0, Unit> function1) {
        DisplayListCanvas displayListCanvasStart = this.f40685b.start(getWidth(), getHeight());
        Canvas canvasS = l0Var.b().S();
        l0Var.b().U((Canvas) displayListCanvasStart);
        androidx.compose.ui.graphics.b bVarB = l0Var.b();
        if (k2Var != null) {
            bVarB.save();
            androidx.compose.ui.graphics.k0.C(bVarB, k2Var, 0, 2, null);
        }
        function1.invoke(bVarB);
        if (k2Var != null) {
            bVarB.B();
        }
        l0Var.b().U(canvasS);
        this.f40685b.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.v1
    public void c() {
        h0();
    }

    @Override // androidx.compose.ui.platform.v1
    public void c0(int i10) {
        u3.f40904a.d(this.f40685b, i10);
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean d() {
        return this.f40693j;
    }

    @Override // androidx.compose.ui.platform.v1
    public float d0() {
        return this.f40685b.getElevation();
    }

    @Override // androidx.compose.ui.platform.v1
    @Nullable
    public androidx.compose.ui.graphics.r0 e() {
        return this.f40695l;
    }

    @Override // androidx.compose.ui.platform.v1
    public void f(@Nullable androidx.compose.ui.graphics.r0 r0Var) {
        this.f40695l = r0Var;
        l0().f(r0Var);
        s0();
    }

    @Override // androidx.compose.ui.platform.v1
    @Nullable
    public androidx.compose.ui.graphics.e3 g() {
        return this.f40692i;
    }

    @Override // androidx.compose.ui.platform.v1
    public int getHeight() {
        return b() - n();
    }

    @Override // androidx.compose.ui.platform.v1
    public int getWidth() {
        return x() - y();
    }

    @Override // androidx.compose.ui.platform.v1
    public void h(float f10) {
        this.f40685b.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public float i() {
        return -this.f40685b.getCameraDistance();
    }

    public final int i0() {
        return androidx.compose.ui.graphics.h1.g(this.f40686c, androidx.compose.ui.graphics.h1.f37790b.c()) ? 2 : 0;
    }

    @Override // androidx.compose.ui.platform.v1
    public void j(float f10) {
        this.f40685b.setCameraDistance(-f10);
    }

    @NotNull
    public final AndroidComposeView j0() {
        return this.f40684a;
    }

    @Override // androidx.compose.ui.platform.v1
    public void k(float f10) {
        this.f40685b.setRotationX(f10);
    }

    public final boolean k0() {
        return this.f40685b.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.v1
    public void l(float f10) {
        this.f40685b.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void m(float f10) {
        this.f40685b.setRotation(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public int n() {
        return this.f40689f;
    }

    @Override // androidx.compose.ui.platform.v1
    public float o() {
        return this.f40685b.getTranslationY();
    }

    public void o0(int i10) {
        this.f40691h = i10;
    }

    @Override // androidx.compose.ui.platform.v1
    public float p() {
        return this.f40685b.getTranslationX();
    }

    public void p0(int i10) {
        this.f40688e = i10;
    }

    @Override // androidx.compose.ui.platform.v1
    public float q() {
        return this.f40685b.getRotationY();
    }

    public void q0(int i10) {
        this.f40690g = i10;
    }

    @Override // androidx.compose.ui.platform.v1
    public float r() {
        return this.f40685b.getAlpha();
    }

    public void r0(int i10) {
        this.f40689f = i10;
    }

    @Override // androidx.compose.ui.platform.v1
    public void s(int i10) {
        this.f40694k = i10;
        l0().s(i10);
        s0();
    }

    @Override // androidx.compose.ui.platform.v1
    public void setAlpha(float f10) {
        this.f40685b.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public int t() {
        return this.f40694k;
    }

    @Override // androidx.compose.ui.platform.v1
    public long u() {
        return 0L;
    }

    @Override // androidx.compose.ui.platform.v1
    public float v() {
        return this.f40685b.getRotation();
    }

    @Override // androidx.compose.ui.platform.v1
    public void w(@NotNull Canvas canvas) {
        Intrinsics.checkNotNull(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f40685b);
    }

    @Override // androidx.compose.ui.platform.v1
    public int x() {
        return this.f40690g;
    }

    @Override // androidx.compose.ui.platform.v1
    public int y() {
        return this.f40688e;
    }

    @Override // androidx.compose.ui.platform.v1
    public void z(float f10) {
        this.f40685b.setScaleX(f10);
    }
}
