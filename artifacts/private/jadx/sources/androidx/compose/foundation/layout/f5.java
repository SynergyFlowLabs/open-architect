package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,477:1\n113#2:478\n113#2:479\n113#2:480\n113#2:481\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n*L\n391#1:478\n392#1:479\n393#1:480\n394#1:481\n*E\n"})
final class f5 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {
    private boolean X;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16015s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f16016t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f16017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f16018w;

    public /* synthetic */ f5(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B9(f5 f5Var, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        if (f5Var.X) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, aVar.g6(f5Var.f16015s), aVar.g6(f5Var.f16016t), 0.0f, 4, null);
        } else {
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var, aVar.g6(f5Var.f16015s), aVar.g6(f5Var.f16016t), 0.0f, 4, null);
        }
        return Unit.f312394a;
    }

    public final float A9() {
        return this.f16016t;
    }

    public final void C9(float f10) {
        this.f16018w = f10;
    }

    public final void D9(float f10) {
        this.f16017v = f10;
    }

    public final void E9(boolean z10) {
        this.X = z10;
    }

    public final void F9(float f10) {
        this.f16015s = f10;
    }

    public final void G9(float f10) {
        this.f16016t = f10;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        int iG6 = c1Var.g6(this.f16015s) + c1Var.g6(this.f16017v);
        int iG7 = c1Var.g6(this.f16016t) + c1Var.g6(this.f16018w);
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.q(j10, -iG6, -iG7));
        return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.c.i(j10, i2VarP0.h1() + iG6), androidx.compose.ui.unit.c.h(j10, i2VarP0.c1() + iG7), null, new Function1() { // from class: androidx.compose.foundation.layout.e5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f5.B9(this.f15986a, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    public final float w9() {
        return this.f16018w;
    }

    public final float x9() {
        return this.f16017v;
    }

    public final boolean y9() {
        return this.X;
    }

    public final float z9() {
        return this.f16015s;
    }

    private f5(float f10, float f11, float f12, float f13, boolean z10) {
        this.f16015s = f10;
        this.f16016t = f11;
        this.f16017v = f12;
        this.f16018w = f13;
        this.X = z10;
    }

    public /* synthetic */ f5(float f10, float f11, float f12, float f13, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.unit.h.r(0) : f10, (i10 & 2) != 0 ? androidx.compose.ui.unit.h.r(0) : f11, (i10 & 4) != 0 ? androidx.compose.ui.unit.h.r(0) : f12, (i10 & 8) != 0 ? androidx.compose.ui.unit.h.r(0) : f13, z10, null);
    }
}
