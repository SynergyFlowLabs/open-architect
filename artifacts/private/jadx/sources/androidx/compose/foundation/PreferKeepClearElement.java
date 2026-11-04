package androidx.compose.foundation;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(33)
final class PreferKeepClearElement extends androidx.compose.ui.node.e1<i4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<androidx.compose.ui.layout.g0, n0.j> f13892c;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferKeepClearElement(@Nullable Function1<? super androidx.compose.ui.layout.g0, n0.j> function1) {
        this.f13892c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof i4) && this.f13892c == ((i4) obj).x9();
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        Function1<androidx.compose.ui.layout.g0, n0.j> function1 = this.f13892c;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("preferKeepClearBounds");
        if (this.f13892c != null) {
            t2Var.b().c("clearRect", this.f13892c);
        }
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public i4 a() {
        return new i4(this.f13892c);
    }

    @Nullable
    public final Function1<androidx.compose.ui.layout.g0, n0.j> m() {
        return this.f13892c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull i4 i4Var) {
        i4Var.A9(this.f13892c);
    }
}
