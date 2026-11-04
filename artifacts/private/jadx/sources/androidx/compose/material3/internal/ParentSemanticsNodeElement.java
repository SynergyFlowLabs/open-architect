package androidx.compose.material3.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class ParentSemanticsNodeElement extends androidx.compose.ui.node.e1<c3> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28634d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.semantics.e0, Unit> f28635c;

    /* JADX WARN: Multi-variable type inference failed */
    public ParentSemanticsNodeElement(@NotNull Function1<? super androidx.compose.ui.semantics.e0, Unit> function1) {
        this.f28635c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParentSemanticsNodeElement) && this.f28635c == ((ParentSemanticsNodeElement) obj).f28635c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f28635c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("parentSemantics");
        t2Var.b().c("properties", this.f28635c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c3 a() {
        return new c3(this.f28635c);
    }

    @NotNull
    public final Function1<androidx.compose.ui.semantics.e0, Unit> m() {
        return this.f28635c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull c3 c3Var) {
        c3Var.y9(this.f28635c);
        androidx.compose.ui.node.j2.b(c3Var);
    }
}
