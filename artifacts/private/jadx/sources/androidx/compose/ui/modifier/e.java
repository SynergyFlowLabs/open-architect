package androidx.compose.ui.modifier;

import androidx.compose.runtime.k7;
import androidx.compose.ui.platform.t2;
import androidx.compose.ui.platform.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@k7
final class e extends u2 implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<n, Unit> f39620d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull Function1<? super n, Unit> function1, @NotNull Function1<? super t2, Unit> function2) {
        super(function2);
        this.f39620d = function1;
    }

    @Override // androidx.compose.ui.modifier.d
    public void c7(@NotNull n nVar) {
        this.f39620d.invoke(nVar);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof e) && ((e) obj).f39620d == this.f39620d;
    }

    public int hashCode() {
        return this.f39620d.hashCode();
    }

    @NotNull
    public final Function1<n, Unit> i() {
        return this.f39620d;
    }
}
