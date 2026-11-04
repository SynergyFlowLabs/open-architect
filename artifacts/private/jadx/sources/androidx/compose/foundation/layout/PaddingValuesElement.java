package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends androidx.compose.ui.node.e1<l5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g5 f15814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15815d;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(@NotNull g5 g5Var, @NotNull Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15814c = g5Var;
        this.f15815d = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f15814c, paddingValuesElement.f15814c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f15814c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15815d.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public l5 a() {
        return new l5(this.f15814c);
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> m() {
        return this.f15815d;
    }

    @NotNull
    public final g5 n() {
        return this.f15814c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull l5 l5Var) {
        l5Var.y9(this.f15814c);
    }
}
