package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class n5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36276c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private m5 f36277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private g f36278b;

    public n5(@NotNull m5 m5Var, @Nullable g gVar) {
        this.f36277a = m5Var;
        this.f36278b = gVar;
    }

    @Nullable
    public final g a() {
        return this.f36278b;
    }

    @NotNull
    public final m5 b() {
        return this.f36277a;
    }

    public final void c(@Nullable g gVar) {
        this.f36278b = gVar;
    }

    public final void d(@NotNull m5 m5Var) {
        this.f36277a = m5Var;
    }
}
