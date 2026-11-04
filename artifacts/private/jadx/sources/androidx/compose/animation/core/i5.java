package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class i5<V extends w> implements x4<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13032e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l0 f13035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final z4<V> f13036d;

    public i5() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.animation.core.x4
    public int a() {
        return this.f13033a;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f13036d.g(j10, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f13036d.i(j10, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.x4
    public int k() {
        return this.f13034b;
    }

    @NotNull
    public final l0 n() {
        return this.f13035c;
    }

    public i5(int i10, int i11, @NotNull l0 l0Var) {
        this.f13033a = i10;
        this.f13034b = i11;
        this.f13035c = l0Var;
        this.f13036d = new z4<>(new e1(a(), k(), l0Var));
    }

    public /* synthetic */ i5(int i10, int i11, l0 l0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? u0.d() : l0Var);
    }
}
