package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class ClearAndSetSemanticsElement extends e1<d> implements s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41056d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<e0, Unit> f41057c;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(@NotNull Function1<? super e0, Unit> function1) {
        this.f41057c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && this.f41057c == ((ClearAndSetSemanticsElement) obj).f41057c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f41057c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("clearAndSetSemantics");
        t.b(t2Var, q0());
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(false, true, this.f41057c);
    }

    @NotNull
    public final Function1<e0, Unit> m() {
        return this.f41057c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull d dVar) {
        dVar.A9(this.f41057c);
    }

    @Override // androidx.compose.ui.semantics.s
    @NotNull
    public SemanticsConfiguration q0() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.B(false);
        semanticsConfiguration.A(true);
        this.f41057c.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }
}
