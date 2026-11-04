package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class TabIndicatorModifier extends androidx.compose.ui.node.e1<w20> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f25915g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7<List<f30>> f25916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> f25919f;

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(@NotNull androidx.compose.runtime.n7<? extends List<f30>> n7Var, int i10, boolean z10, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> y0Var) {
        this.f25916c = n7Var;
        this.f25917d = i10;
        this.f25918e = z10;
        this.f25919f = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabIndicatorModifier q(TabIndicatorModifier tabIndicatorModifier, androidx.compose.runtime.n7 n7Var, int i10, boolean z10, androidx.compose.animation.core.y0 y0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            n7Var = tabIndicatorModifier.f25916c;
        }
        if ((i11 & 2) != 0) {
            i10 = tabIndicatorModifier.f25917d;
        }
        if ((i11 & 4) != 0) {
            z10 = tabIndicatorModifier.f25918e;
        }
        if ((i11 & 8) != 0) {
            y0Var = tabIndicatorModifier.f25919f;
        }
        return tabIndicatorModifier.p(n7Var, i10, z10, y0Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return Intrinsics.areEqual(this.f25916c, tabIndicatorModifier.f25916c) && this.f25917d == tabIndicatorModifier.f25917d && this.f25918e == tabIndicatorModifier.f25918e && Intrinsics.areEqual(this.f25919f, tabIndicatorModifier.f25919f);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((this.f25916c.hashCode() * 31) + Integer.hashCode(this.f25917d)) * 31) + Boolean.hashCode(this.f25918e)) * 31) + this.f25919f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
    }

    @NotNull
    public final androidx.compose.runtime.n7<List<f30>> l() {
        return this.f25916c;
    }

    public final int m() {
        return this.f25917d;
    }

    public final boolean n() {
        return this.f25918e;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> o() {
        return this.f25919f;
    }

    @NotNull
    public final TabIndicatorModifier p(@NotNull androidx.compose.runtime.n7<? extends List<f30>> n7Var, int i10, boolean z10, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> y0Var) {
        return new TabIndicatorModifier(n7Var, i10, z10, y0Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public w20 a() {
        return new w20(this.f25916c, this.f25917d, this.f25918e, this.f25919f);
    }

    @NotNull
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> s() {
        return this.f25919f;
    }

    public final boolean t() {
        return this.f25918e;
    }

    @NotNull
    public String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.f25916c + ", selectedTabIndex=" + this.f25917d + ", followContentSize=" + this.f25918e + ", animationSpec=" + this.f25919f + ')';
    }

    public final int u() {
        return this.f25917d;
    }

    @NotNull
    public final androidx.compose.runtime.n7<List<f30>> v() {
        return this.f25916c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull w20 w20Var) {
        w20Var.G9(this.f25916c);
        w20Var.F9(this.f25917d);
        w20Var.E9(this.f25918e);
        w20Var.D9(this.f25919f);
    }
}
