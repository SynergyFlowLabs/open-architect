package androidx.compose.ui.graphics;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 {
    @k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super r1, Unit> function1) {
        return a0Var.B2(new BlockGraphicsLayerElement(function1));
    }

    @k7
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @kotlin.b1(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var) {
        return f(a0Var, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q3Var, z10, e3Var, s1.b(), s1.b(), h1.f37790b.a(), d0.f37693b.B(), null);
    }

    @k7
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replace with graphicsLayer that consumes a blend mode and a color filter", replaceWith = @kotlin.b1(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, renderEffect, ambientShadowColor, spotShadowColor, compositingStrategy, BlendMode.SrcOver, null)", imports = {"androidx.compose.ui.graphics"}))
    public static final /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var, long j11, long j12, int i10) {
        return f(a0Var, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q3Var, z10, e3Var, j11, j12, i10, d0.f37693b.B(), null);
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 f(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, @NotNull q3 q3Var, boolean z10, @Nullable e3 e3Var, long j11, long j12, int i10, int i11, @Nullable r0 r0Var) {
        return a0Var.B2(new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q3Var, z10, e3Var, j11, j12, i10, i11, r0Var, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 g(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var, long j11, long j12, int i10, int i11, r0 r0Var, int i12, Object obj) {
        return f(a0Var, (i12 & 1) != 0 ? 1.0f : f10, (i12 & 2) != 0 ? 1.0f : f11, (i12 & 4) == 0 ? f12 : 1.0f, (i12 & 8) != 0 ? 0.0f : f13, (i12 & 16) != 0 ? 0.0f : f14, (i12 & 32) != 0 ? 0.0f : f15, (i12 & 64) != 0 ? 0.0f : f16, (i12 & 128) != 0 ? 0.0f : f17, (i12 & 256) == 0 ? f18 : 0.0f, (i12 & 512) != 0 ? 8.0f : f19, (i12 & 1024) != 0 ? z3.f38723b.a() : j10, (i12 & 2048) != 0 ? d3.a() : q3Var, (i12 & 4096) != 0 ? false : z10, (i12 & 8192) != 0 ? null : e3Var, (i12 & 16384) != 0 ? s1.b() : j11, (32768 & i12) != 0 ? s1.b() : j12, (65536 & i12) != 0 ? h1.f37790b.a() : i10, (i12 & 131072) != 0 ? d0.f37693b.B() : i11, (i12 & 262144) != 0 ? null : r0Var);
    }

    @k7
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @kotlin.b1(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, renderEffect, ambientShadowColor, spotShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    public static final /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var, long j11, long j12) {
        return f(a0Var, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q3Var, z10, e3Var, j11, j12, h1.f37790b.a(), d0.f37693b.B(), null);
    }

    @k7
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @kotlin.b1(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final /* synthetic */ androidx.compose.ui.a0 j(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10) {
        return g(a0Var, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q3Var, z10, null, 0L, 0L, 0, d0.f37693b.B(), null, 114688, null);
    }

    public static /* synthetic */ androidx.compose.ui.a0 k(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return j(a0Var, f10, (i10 & 2) != 0 ? 1.0f : f11, (i10 & 4) == 0 ? f12 : 1.0f, (i10 & 8) != 0 ? 0.0f : f13, (i10 & 16) != 0 ? 0.0f : f14, (i10 & 32) != 0 ? 0.0f : f15, (i10 & 64) != 0 ? 0.0f : f16, (i10 & 128) != 0 ? 0.0f : f17, (i10 & 256) == 0 ? f18 : 0.0f, (i10 & 512) != 0 ? 8.0f : f19, (i10 & 1024) != 0 ? z3.f38723b.a() : j10, (i10 & 2048) != 0 ? d3.a() : q3Var, (i10 & 4096) != 0 ? false : z10);
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 l(@NotNull androidx.compose.ui.a0 a0Var) {
        return androidx.compose.ui.platform.r2.e() ? a0Var.B2(g(androidx.compose.ui.a0.E, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null)) : a0Var;
    }
}
