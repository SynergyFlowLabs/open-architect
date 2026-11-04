package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends androidx.compose.ui.node.e1<x> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f13840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.i0 f13841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f13842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f13843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f13844g;

    public /* synthetic */ BackgroundElement(long j10, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.q3 q3Var, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i0Var, f10, q3Var, function1);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && androidx.compose.ui.graphics.q0.y(this.f13840c, backgroundElement.f13840c) && Intrinsics.areEqual(this.f13841d, backgroundElement.f13841d) && this.f13842e == backgroundElement.f13842e && Intrinsics.areEqual(this.f13843f, backgroundElement.f13843f);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iK = androidx.compose.ui.graphics.q0.K(this.f13840c) * 31;
        androidx.compose.ui.graphics.i0 i0Var = this.f13841d;
        return ((((iK + (i0Var != null ? i0Var.hashCode() : 0)) * 31) + Float.hashCode(this.f13842e)) * 31) + this.f13843f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f13844g.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public x a() {
        return new x(this.f13840c, this.f13841d, this.f13842e, this.f13843f, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull x xVar) {
        xVar.S(this.f13840c);
        xVar.P6(this.f13841d);
        xVar.setAlpha(this.f13842e);
        xVar.Q3(this.f13843f);
        androidx.compose.ui.node.u.a(xVar);
    }

    public /* synthetic */ BackgroundElement(long j10, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.q3 q3Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10, (i10 & 2) != 0 ? null : i0Var, f10, q3Var, function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j10, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.q3 q3Var, Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f13840c = j10;
        this.f13841d = i0Var;
        this.f13842e = f10;
        this.f13843f = q3Var;
        this.f13844g = function1;
    }
}
