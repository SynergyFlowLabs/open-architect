package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class p0 implements androidx.compose.ui.modifier.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<v6, Unit> f16267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private v6 f16268b;

    /* JADX WARN: Multi-variable type inference failed */
    public p0(@NotNull Function1<? super v6, Unit> function1) {
        this.f16267a = function1;
    }

    @Override // androidx.compose.ui.modifier.d
    public void c7(@NotNull androidx.compose.ui.modifier.n nVar) {
        v6 v6Var = (v6) nVar.I(t7.e());
        if (!Intrinsics.areEqual(v6Var, this.f16268b)) {
            this.f16268b = v6Var;
            this.f16267a.invoke(v6Var);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && ((p0) obj).f16267a == this.f16267a;
    }

    public int hashCode() {
        return this.f16267a.hashCode();
    }
}
