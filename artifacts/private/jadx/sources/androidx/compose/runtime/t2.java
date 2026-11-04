package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s4 f36643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Object f36645c;

    public t2(@NotNull s4 s4Var, int i10, @Nullable Object obj) {
        this.f36643a = s4Var;
        this.f36644b = i10;
        this.f36645c = obj;
    }

    @Nullable
    public final Object a() {
        return this.f36645c;
    }

    public final int b() {
        return this.f36644b;
    }

    @NotNull
    public final s4 c() {
        return this.f36643a;
    }

    public final boolean d() {
        return this.f36643a.z(this.f36645c);
    }

    public final void e(@Nullable Object obj) {
        this.f36645c = obj;
    }

    public final void f(int i10) {
        this.f36644b = i10;
    }
}
