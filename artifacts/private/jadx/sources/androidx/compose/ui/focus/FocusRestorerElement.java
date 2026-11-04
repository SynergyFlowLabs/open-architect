package androidx.compose.ui.focus;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusRestorerElement extends e1<o0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g0 f37359c;

    public FocusRestorerElement(@NotNull g0 g0Var) {
        this.f37359c = g0Var;
    }

    public static /* synthetic */ FocusRestorerElement n(FocusRestorerElement focusRestorerElement, g0 g0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0Var = focusRestorerElement.f37359c;
        }
        return focusRestorerElement.m(g0Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRestorerElement) && Intrinsics.areEqual(this.f37359c, ((FocusRestorerElement) obj).f37359c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f37359c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("focusRestorer");
        t2Var.b().c("fallback", this.f37359c);
    }

    @NotNull
    public final g0 l() {
        return this.f37359c;
    }

    @NotNull
    public final FocusRestorerElement m(@NotNull g0 g0Var) {
        return new FocusRestorerElement(g0Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public o0 a() {
        return new o0(this.f37359c);
    }

    @NotNull
    public final g0 p() {
        return this.f37359c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull o0 o0Var) {
        o0Var.y9(this.f37359c);
    }

    @NotNull
    public String toString() {
        return "FocusRestorerElement(fallback=" + this.f37359c + ')';
    }
}
