package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l2;
import androidx.compose.runtime.v5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class a0 extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36669d = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v5 f36670c;

    public a0(@NotNull v5 v5Var) {
        this.f36670c = v5Var;
    }

    @Override // androidx.compose.runtime.tooling.a
    public int d(@NotNull androidx.compose.runtime.g gVar) {
        v5 v5Var = this.f36670c;
        return v5Var.J(v5Var.E().k(gVar));
    }

    @Override // androidx.compose.runtime.tooling.a
    @Nullable
    public l2 g(@NotNull androidx.compose.runtime.g gVar) {
        return this.f36670c.E().t0(this.f36670c.E().k(gVar));
    }
}
