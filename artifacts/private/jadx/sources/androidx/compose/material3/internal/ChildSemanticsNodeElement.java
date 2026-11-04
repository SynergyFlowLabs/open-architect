package androidx.compose.material3.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class ChildSemanticsNodeElement extends androidx.compose.ui.node.e1<t1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28624d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.semantics.e0, Unit> f28625c;

    /* JADX WARN: Multi-variable type inference failed */
    public ChildSemanticsNodeElement(@NotNull Function1<? super androidx.compose.ui.semantics.e0, Unit> function1) {
        this.f28625c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChildSemanticsNodeElement) && this.f28625c == ((ChildSemanticsNodeElement) obj).f28625c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f28625c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("childSemantics");
        t2Var.b().c("properties", this.f28625c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t1 a() {
        return new t1(this.f28625c);
    }

    @NotNull
    public final Function1<androidx.compose.ui.semantics.e0, Unit> m() {
        return this.f28625c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull t1 t1Var) {
        t1Var.A9(this.f28625c);
        androidx.compose.ui.node.j2.b(t1Var);
    }
}
