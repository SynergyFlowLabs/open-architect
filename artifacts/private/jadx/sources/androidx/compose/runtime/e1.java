package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.a1
public final class e1 implements m5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35594b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f35595a;

    public e1(@NotNull kotlinx.coroutines.s0 s0Var) {
        this.f35595a = s0Var;
    }

    @NotNull
    public final kotlinx.coroutines.s0 a() {
        return this.f35595a;
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        kotlinx.coroutines.s0 s0Var = this.f35595a;
        if (s0Var instanceof o5) {
            ((o5) s0Var).f();
        } else {
            kotlinx.coroutines.t0.d(s0Var, new a3());
        }
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        kotlinx.coroutines.s0 s0Var = this.f35595a;
        if (s0Var instanceof o5) {
            ((o5) s0Var).f();
        } else {
            kotlinx.coroutines.t0.d(s0Var, new a3());
        }
    }
}
