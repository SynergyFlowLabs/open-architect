package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35798b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35799a;

    public g(int i10) {
        this.f35799a = i10;
    }

    public final int a() {
        return this.f35799a;
    }

    public final boolean b() {
        return this.f35799a != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.f35799a = i10;
    }

    public final int d(@NotNull w5 w5Var) {
        return w5Var.k(this);
    }

    public final int e(@NotNull z5 z5Var) {
        return z5Var.E(this);
    }

    @NotNull
    public String toString() {
        return super.toString() + "{ location = " + this.f35799a + " }";
    }
}
