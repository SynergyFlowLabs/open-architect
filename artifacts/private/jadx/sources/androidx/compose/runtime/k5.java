package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class k5 extends h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h7 f36185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36186b;

    public k5(@NotNull h7 h7Var, int i10) {
        super(null);
        this.f36185a = h7Var;
        this.f36186b = i10;
    }

    @Override // androidx.compose.runtime.h7
    @NotNull
    public Object a(@NotNull w5 w5Var) {
        return new j7(this.f36185a.a(w5Var), this.f36186b);
    }

    public final int b() {
        return this.f36186b;
    }

    @NotNull
    public final h7 c() {
        return this.f36185a;
    }
}
