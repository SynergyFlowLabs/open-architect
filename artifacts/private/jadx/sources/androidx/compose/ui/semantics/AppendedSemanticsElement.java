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
public final class AppendedSemanticsElement extends e1<d> implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41053e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<e0, Unit> f41055d;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z10, @NotNull Function1<? super e0, Unit> function1) {
        this.f41054c = z10;
        this.f41055d = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f41054c == appendedSemanticsElement.f41054c && this.f41055d == appendedSemanticsElement.f41055d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (Boolean.hashCode(this.f41054c) * 31) + this.f41055d.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("semantics");
        t2Var.b().c("mergeDescendants", Boolean.valueOf(this.f41054c));
        t.b(t2Var, q0());
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(this.f41054c, false, this.f41055d);
    }

    public final boolean m() {
        return this.f41054c;
    }

    @NotNull
    public final Function1<e0, Unit> n() {
        return this.f41055d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull d dVar) {
        dVar.z9(this.f41054c);
        dVar.A9(this.f41055d);
    }

    @Override // androidx.compose.ui.semantics.s
    @NotNull
    public SemanticsConfiguration q0() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.B(this.f41054c);
        this.f41055d.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }
}
