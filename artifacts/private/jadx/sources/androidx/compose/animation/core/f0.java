package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 3)
public final class f0<T, V extends w> implements g<T, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12938j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w4<V> f12939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final z3<T, V> f12940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f12941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final V f12942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final V f12943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final V f12944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final T f12945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f12946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f12947i;

    public f0(@NotNull w4<V> w4Var, @NotNull z3<T, V> z3Var, T t10, @NotNull V v10) {
        this.f12939a = w4Var;
        this.f12940b = z3Var;
        this.f12941c = t10;
        V vInvoke = f().a().invoke(t10);
        this.f12942d = vInvoke;
        this.f12943e = (V) x.e(v10);
        this.f12945g = (T) f().b().invoke(w4Var.d(vInvoke, v10));
        this.f12946h = w4Var.c(vInvoke, v10);
        V v11 = (V) x.e(w4Var.b(e(), vInvoke, v10));
        this.f12944f = v11;
        int iB = v11.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v12 = this.f12944f;
            v12.e(i10, kotlin.ranges.r.H(v12.a(i10), -this.f12939a.a(), this.f12939a.a()));
        }
    }

    public final T a() {
        return this.f12941c;
    }

    @Override // androidx.compose.animation.core.g
    public boolean b() {
        return this.f12947i;
    }

    @Override // androidx.compose.animation.core.g
    public T c() {
        return this.f12945g;
    }

    @Override // androidx.compose.animation.core.g
    public long e() {
        return this.f12946h;
    }

    @Override // androidx.compose.animation.core.g
    @NotNull
    public z3<T, V> f() {
        return this.f12940b;
    }

    @Override // androidx.compose.animation.core.g
    public T g(long j10) {
        return !d(j10) ? (T) f().b().invoke(this.f12939a.e(j10, this.f12942d, this.f12943e)) : c();
    }

    @Override // androidx.compose.animation.core.g
    @NotNull
    public V i(long j10) {
        return !d(j10) ? (V) this.f12939a.b(j10, this.f12942d, this.f12943e) : this.f12944f;
    }

    @NotNull
    public final V j() {
        return this.f12943e;
    }

    public f0(@NotNull g0<T> g0Var, @NotNull z3<T, V> z3Var, T t10, @NotNull V v10) {
        this(g0Var.a(z3Var), z3Var, t10, v10);
    }

    public f0(@NotNull g0<T> g0Var, @NotNull z3<T, V> z3Var, T t10, T t11) {
        this(g0Var.a(z3Var), z3Var, t10, z3Var.a().invoke(t11));
    }
}
