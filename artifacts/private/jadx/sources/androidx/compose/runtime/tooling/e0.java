package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l2;
import androidx.compose.runtime.z5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class e0 extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36687d = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final z5 f36688c;

    public e0(@NotNull z5 z5Var) {
        this.f36688c = z5Var;
    }

    @Override // androidx.compose.runtime.tooling.a
    public int d(@NotNull androidx.compose.runtime.g gVar) {
        z5 z5Var = this.f36688c;
        return z5Var.r0(z5Var.E(gVar));
    }

    @Override // androidx.compose.runtime.tooling.a
    @Nullable
    public l2 g(@NotNull androidx.compose.runtime.g gVar) {
        z5 z5Var = this.f36688c;
        return z5Var.A1(z5Var.E(gVar));
    }
}
