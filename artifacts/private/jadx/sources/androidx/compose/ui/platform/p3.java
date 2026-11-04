package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.annotation.w0(29)
@SourceDebugExtension({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,318:1\n1#2:319\n41#3,5:320\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n247#1:320,5\n*E\n"})
public final class p3 implements v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f40705h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40706a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.e3 f40708c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.h2 f40710e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.r0 f40712g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final RenderNode f40707b = new RenderNode("Compose");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40709d = androidx.compose.ui.graphics.h1.f37790b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40711f = androidx.compose.ui.graphics.d0.f37693b.B();

    public p3(@NotNull AndroidComposeView androidComposeView) {
        this.f40706a = androidComposeView;
    }

    private final void e0(RenderNode renderNode, int i10) {
        androidx.compose.ui.graphics.h1.a aVar = androidx.compose.ui.graphics.h1.f37790b;
        if (androidx.compose.ui.graphics.h1.g(i10, aVar.c())) {
            androidx.compose.ui.graphics.h2 h2Var = this.f40710e;
            renderNode.setUseCompositingLayer(true, h2Var != null ? h2Var.D() : null);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.h1.g(i10, aVar.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final androidx.compose.ui.graphics.h2 i0() {
        androidx.compose.ui.graphics.h2 h2Var = this.f40710e;
        if (h2Var != null) {
            return h2Var;
        }
        androidx.compose.ui.graphics.h2 h2VarA = androidx.compose.ui.graphics.m.a();
        this.f40710e = h2VarA;
        return h2VarA;
    }

    private final boolean j0() {
        return androidx.compose.ui.graphics.h1.g(T(), androidx.compose.ui.graphics.h1.f37790b.c()) || k0();
    }

    private final boolean k0() {
        return (androidx.compose.ui.graphics.d0.G(t(), androidx.compose.ui.graphics.d0.f37693b.B()) && e() == null) ? false : true;
    }

    private final void l0() {
        if (j0()) {
            e0(this.f40707b, androidx.compose.ui.graphics.h1.f37790b.c());
        } else {
            e0(this.f40707b, this.f40709d);
        }
    }

    @Override // androidx.compose.ui.platform.v1
    public void A(@Nullable androidx.compose.ui.graphics.e3 e3Var) {
        this.f40708c = e3Var;
        if (Build.VERSION.SDK_INT >= 31) {
            q3.f40791a.a(this.f40707b, e3Var);
        }
    }

    @Override // androidx.compose.ui.platform.v1
    public float B() {
        return this.f40707b.getScaleX();
    }

    @Override // androidx.compose.ui.platform.v1
    public void C(float f10) {
        this.f40707b.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public float D() {
        return this.f40707b.getRotationX();
    }

    @Override // androidx.compose.ui.platform.v1
    public void E(float f10) {
        this.f40707b.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public float F() {
        return this.f40707b.getScaleY();
    }

    @Override // androidx.compose.ui.platform.v1
    public void G(boolean z10) {
        this.f40707b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void H(int i10) {
        this.f40709d = i10;
        l0();
    }

    @Override // androidx.compose.ui.platform.v1
    public void I(float f10) {
        this.f40707b.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void J(int i10) {
        this.f40707b.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.v1
    public float K() {
        return this.f40707b.getPivotX();
    }

    @Override // androidx.compose.ui.platform.v1
    public float L() {
        return this.f40707b.getPivotY();
    }

    @Override // androidx.compose.ui.platform.v1
    @NotNull
    public w1 M() {
        return new w1(this.f40707b.getUniqueId(), this.f40707b.getLeft(), this.f40707b.getTop(), this.f40707b.getRight(), this.f40707b.getBottom(), this.f40707b.getWidth(), this.f40707b.getHeight(), this.f40707b.getScaleX(), this.f40707b.getScaleY(), this.f40707b.getTranslationX(), this.f40707b.getTranslationY(), this.f40707b.getElevation(), this.f40707b.getAmbientShadowColor(), this.f40707b.getSpotShadowColor(), this.f40707b.getRotationZ(), this.f40707b.getRotationX(), this.f40707b.getRotationY(), this.f40707b.getCameraDistance(), this.f40707b.getPivotX(), this.f40707b.getPivotY(), this.f40707b.getClipToOutline(), this.f40707b.getClipToBounds(), this.f40707b.getAlpha(), this.f40708c, t(), e(), this.f40709d, null);
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean N() {
        return this.f40707b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean O(boolean z10) {
        return this.f40707b.setHasOverlappingRendering(z10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void P(@NotNull Matrix matrix) {
        this.f40707b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.v1
    public void Q(int i10) {
        this.f40707b.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void R(float f10) {
        this.f40707b.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void S(float f10) {
        this.f40707b.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public int T() {
        return this.f40709d;
    }

    @Override // androidx.compose.ui.platform.v1
    public void U(@Nullable Outline outline) {
        this.f40707b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.v1
    public void V(boolean z10) {
        this.f40707b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void W(@NotNull Matrix matrix) {
        this.f40707b.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean X(int i10, int i11, int i12, int i13) {
        return this.f40707b.setPosition(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.v1
    public int Y() {
        return this.f40707b.getAmbientShadowColor();
    }

    @Override // androidx.compose.ui.platform.v1
    public int Z() {
        return this.f40707b.getSpotShadowColor();
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean a() {
        return this.f40707b.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.v1
    public void a0(int i10) {
        this.f40707b.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.v1
    public int b() {
        return this.f40707b.getBottom();
    }

    @Override // androidx.compose.ui.platform.v1
    public void b0(@NotNull androidx.compose.ui.graphics.l0 l0Var, @Nullable androidx.compose.ui.graphics.k2 k2Var, @NotNull Function1<? super androidx.compose.ui.graphics.k0, Unit> function1) {
        RecordingCanvas recordingCanvasBeginRecording = this.f40707b.beginRecording();
        Canvas canvasS = l0Var.b().S();
        l0Var.b().U(recordingCanvasBeginRecording);
        androidx.compose.ui.graphics.b bVarB = l0Var.b();
        if (k2Var != null) {
            bVarB.save();
            boolean z10 = false;
            androidx.compose.ui.graphics.k0.C(bVarB, k2Var, 0, 2, null);
        }
        function1.invoke(bVarB);
        if (k2Var != null) {
            bVarB.B();
        }
        l0Var.b().U(canvasS);
        this.f40707b.endRecording();
    }

    @Override // androidx.compose.ui.platform.v1
    public void c() {
        this.f40707b.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.v1
    public void c0(int i10) {
        this.f40707b.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.v1
    public boolean d() {
        return this.f40707b.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.v1
    public float d0() {
        return this.f40707b.getElevation();
    }

    @Override // androidx.compose.ui.platform.v1
    @Nullable
    public androidx.compose.ui.graphics.r0 e() {
        return this.f40712g;
    }

    @Override // androidx.compose.ui.platform.v1
    public void f(@Nullable androidx.compose.ui.graphics.r0 r0Var) {
        this.f40712g = r0Var;
        i0().f(r0Var);
        l0();
    }

    @NotNull
    public final AndroidComposeView f0() {
        return this.f40706a;
    }

    @Override // androidx.compose.ui.platform.v1
    @Nullable
    public androidx.compose.ui.graphics.e3 g() {
        return this.f40708c;
    }

    public final boolean g0() {
        return this.f40707b.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.v1
    public int getHeight() {
        return this.f40707b.getHeight();
    }

    @Override // androidx.compose.ui.platform.v1
    public int getWidth() {
        return this.f40707b.getWidth();
    }

    @Override // androidx.compose.ui.platform.v1
    public void h(float f10) {
        this.f40707b.setTranslationY(f10);
    }

    public final boolean h0() {
        return this.f40707b.getUseCompositingLayer();
    }

    @Override // androidx.compose.ui.platform.v1
    public float i() {
        return this.f40707b.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.v1
    public void j(float f10) {
        this.f40707b.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void k(float f10) {
        this.f40707b.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void l(float f10) {
        this.f40707b.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public void m(float f10) {
        this.f40707b.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public int n() {
        return this.f40707b.getTop();
    }

    @Override // androidx.compose.ui.platform.v1
    public float o() {
        return this.f40707b.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.v1
    public float p() {
        return this.f40707b.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.v1
    public float q() {
        return this.f40707b.getRotationY();
    }

    @Override // androidx.compose.ui.platform.v1
    public float r() {
        return this.f40707b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.v1
    public void s(int i10) {
        this.f40711f = i10;
        i0().s(i10);
        l0();
    }

    @Override // androidx.compose.ui.platform.v1
    public void setAlpha(float f10) {
        this.f40707b.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.v1
    public int t() {
        return this.f40711f;
    }

    @Override // androidx.compose.ui.platform.v1
    public long u() {
        return this.f40707b.getUniqueId();
    }

    @Override // androidx.compose.ui.platform.v1
    public float v() {
        return this.f40707b.getRotationZ();
    }

    @Override // androidx.compose.ui.platform.v1
    public void w(@NotNull Canvas canvas) {
        canvas.drawRenderNode(this.f40707b);
    }

    @Override // androidx.compose.ui.platform.v1
    public int x() {
        return this.f40707b.getRight();
    }

    @Override // androidx.compose.ui.platform.v1
    public int y() {
        return this.f40707b.getLeft();
    }

    @Override // androidx.compose.ui.platform.v1
    public void z(float f10) {
        this.f40707b.setScaleX(f10);
    }
}
