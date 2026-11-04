package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b2
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j0.a f71130a = new j0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private d3<?> f71131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f71132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Object f71133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f71134e;

    @NotNull
    public final j0 a() {
        return this.f71130a.a();
    }

    @Nullable
    public final Object b() {
        return this.f71133d;
    }

    public final boolean c() {
        return this.f71132c;
    }

    @NotNull
    public final d3<?> d() {
        d3<?> d3Var = this.f71131b;
        if (d3Var != null) {
            return d3Var;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final boolean e() {
        return this.f71134e;
    }

    public final void f(@Nullable Object obj) {
        this.f71133d = obj;
        this.f71130a.b(obj);
    }

    public final void g(boolean z10) {
        this.f71132c = z10;
        this.f71130a.c(z10);
    }

    public final void h(@NotNull d3<?> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f71131b = value;
        this.f71130a.d(value);
    }

    public final void i(boolean z10) {
        this.f71134e = z10;
        this.f71130a.e(z10);
    }
}
