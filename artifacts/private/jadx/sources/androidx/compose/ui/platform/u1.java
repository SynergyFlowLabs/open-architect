package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class u1 implements z3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40899b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.a1 f40900a;

    public u1(@NotNull androidx.compose.ui.text.input.a1 a1Var) {
        this.f40900a = a1Var;
    }

    @Override // androidx.compose.ui.platform.z3
    public void a() {
        this.f40900a.c();
    }

    @Override // androidx.compose.ui.platform.z3
    public void b() {
        this.f40900a.b();
    }

    @NotNull
    public final androidx.compose.ui.text.input.a1 c() {
        return this.f40900a;
    }
}
