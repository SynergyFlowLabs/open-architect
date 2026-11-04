package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class n4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f19714c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y6 f19715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y6 f19716b;

    public n4(@NotNull y6 y6Var, @NotNull y6 y6Var2) {
        this.f19715a = y6Var;
        this.f19716b = y6Var2;
    }

    public static /* synthetic */ n4 d(n4 n4Var, y6 y6Var, y6 y6Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y6Var = n4Var.f19715a;
        }
        if ((i10 & 2) != 0) {
            y6Var2 = n4Var.f19716b;
        }
        return n4Var.c(y6Var, y6Var2);
    }

    @NotNull
    public final y6 a() {
        return this.f19715a;
    }

    @NotNull
    public final y6 b() {
        return this.f19716b;
    }

    @NotNull
    public final n4 c(@NotNull y6 y6Var, @NotNull y6 y6Var2) {
        return new n4(y6Var, y6Var2);
    }

    @NotNull
    public final y6 e() {
        return this.f19716b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return this.f19715a == n4Var.f19715a && this.f19716b == n4Var.f19716b;
    }

    @NotNull
    public final y6 f() {
        return this.f19715a;
    }

    public int hashCode() {
        return (this.f19715a.hashCode() * 31) + this.f19716b.hashCode();
    }

    @NotNull
    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f19715a + ", endAffinity=" + this.f19716b + ')';
    }

    public n4(@NotNull y6 y6Var) {
        this(y6Var, y6Var);
    }
}
