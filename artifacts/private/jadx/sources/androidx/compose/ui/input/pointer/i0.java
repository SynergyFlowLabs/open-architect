package androidx.compose.ui.input.pointer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39054c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g0 f39055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39056b;

    public boolean a() {
        return false;
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 b() {
        return this.f39055a;
    }

    public boolean c() {
        return false;
    }

    public final long d() {
        androidx.compose.ui.layout.g0 g0Var = this.f39055a;
        return g0Var != null ? g0Var.a() : androidx.compose.ui.unit.u.f42720b.a();
    }

    public final boolean e() {
        return this.f39056b;
    }

    public abstract void f();

    public abstract void g(@NotNull q qVar, @NotNull s sVar, long j10);

    public final void h(boolean z10) {
        this.f39056b = z10;
    }

    public final void i(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f39055a = g0Var;
    }
}
