package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import androidx.compose.runtime.d7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,329:1\n85#2:330\n117#2,2:331\n85#2:333\n117#2,2:334\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n129#1:330\n129#1:331,2\n161#1:333\n161#1:334,2\n*E\n"})
public final class n<T, V extends w> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13203j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z3<T, V> f13204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f13205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f13206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f13207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private V f13209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f13210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f13211h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13212i;

    public n(T t10, @NotNull z3<T, V> z3Var, @NotNull V v10, long j10, T t11, long j11, boolean z10, @NotNull Function0<Unit> function0) {
        this.f13204a = z3Var;
        this.f13205b = t11;
        this.f13206c = j11;
        this.f13207d = function0;
        this.f13208e = d7.g(t10, null, 2, null);
        this.f13209f = (V) x.e(v10);
        this.f13210g = j10;
        this.f13212i = d7.g(Boolean.valueOf(z10), null, 2, null);
    }

    public final void a() {
        m(false);
        this.f13207d.invoke();
    }

    public final long b() {
        return this.f13211h;
    }

    public final long c() {
        return this.f13210g;
    }

    public final long d() {
        return this.f13206c;
    }

    public final T e() {
        return this.f13205b;
    }

    @NotNull
    public final z3<T, V> f() {
        return this.f13204a;
    }

    public final T g() {
        return this.f13208e.getValue();
    }

    public final T h() {
        return this.f13204a.b().invoke(this.f13209f);
    }

    @NotNull
    public final V i() {
        return this.f13209f;
    }

    public final boolean j() {
        return ((Boolean) this.f13212i.getValue()).booleanValue();
    }

    public final void k(long j10) {
        this.f13211h = j10;
    }

    public final void l(long j10) {
        this.f13210g = j10;
    }

    public final void m(boolean z10) {
        this.f13212i.setValue(Boolean.valueOf(z10));
    }

    public final void n(T t10) {
        this.f13208e.setValue(t10);
    }

    public final void o(@NotNull V v10) {
        this.f13209f = v10;
    }

    @NotNull
    public final q<T, V> p() {
        return new q<>(this.f13204a, g(), this.f13209f, this.f13210g, this.f13211h, j());
    }
}
