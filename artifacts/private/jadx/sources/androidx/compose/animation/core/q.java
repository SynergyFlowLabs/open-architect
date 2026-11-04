package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 4)
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,329:1\n85#2:330\n117#2,2:331\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n49#1:330\n49#1:331,2\n*E\n"})
public final class q<T, V extends w> implements n7<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f13228g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z3<T, V> f13229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private V f13231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f13232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f13233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13234f;

    public q(@NotNull z3<T, V> z3Var, T t10, @Nullable V v10, long j10, long j11, boolean z10) {
        V v11;
        this.f13229a = z3Var;
        this.f13230b = d7.g(t10, null, 2, null);
        this.f13231c = (v10 == null || (v11 = (V) x.e(v10)) == null) ? (V) r.i(z3Var, t10) : v11;
        this.f13232d = j10;
        this.f13233e = j11;
        this.f13234f = z10;
    }

    public final void A(boolean z10) {
        this.f13234f = z10;
    }

    public void E(T t10) {
        this.f13230b.setValue(t10);
    }

    public final void F(@NotNull V v10) {
        this.f13231c = v10;
    }

    public final long a() {
        return this.f13233e;
    }

    public final long b() {
        return this.f13232d;
    }

    @NotNull
    public final z3<T, V> d() {
        return this.f13229a;
    }

    public final T g() {
        return this.f13229a.b().invoke(this.f13231c);
    }

    @Override // androidx.compose.runtime.n7
    public T getValue() {
        return this.f13230b.getValue();
    }

    @NotNull
    public final V h() {
        return this.f13231c;
    }

    public final boolean p() {
        return this.f13234f;
    }

    public final void s(long j10) {
        this.f13233e = j10;
    }

    public final void t(long j10) {
        this.f13232d = j10;
    }

    @NotNull
    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + g() + ", isRunning=" + this.f13234f + ", lastFrameTimeNanos=" + this.f13232d + ", finishedTimeNanos=" + this.f13233e + ')';
    }

    public /* synthetic */ q(z3 z3Var, Object obj, w wVar, long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3Var, obj, (i10 & 4) != 0 ? null : wVar, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
