package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class t1 implements m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<v1, u1> f36641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private u1 f36642b;

    /* JADX WARN: Multi-variable type inference failed */
    public t1(@NotNull Function1<? super v1, ? extends u1> function1) {
        this.f36641a = function1;
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
        this.f36642b = this.f36641a.invoke(b2.f35307a);
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        u1 u1Var = this.f36642b;
        if (u1Var != null) {
            u1Var.dispose();
        }
        this.f36642b = null;
    }
}
