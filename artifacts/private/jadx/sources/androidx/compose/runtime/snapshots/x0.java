package androidx.compose.runtime.snapshots;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,511:1\n33#2:512\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListStateRecord\n*L\n244#1:512\n*E\n"})
public final class x0<T> extends e1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f36621g = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> f36622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36624f;

    public x0(long j10, @NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar) {
        super(j10);
        this.f36622d = gVar;
    }

    @Override // androidx.compose.runtime.snapshots.e1
    public void b(@NotNull e1 e1Var) {
        synchronized (k0.f36525a) {
            try {
                Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
                this.f36622d = ((x0) e1Var).f36622d;
                this.f36623e = ((x0) e1Var).f36623e;
                this.f36624f = ((x0) e1Var).f36624f;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.e1
    @NotNull
    public e1 c() {
        return f(b0.N().p());
    }

    @Override // androidx.compose.runtime.snapshots.e1
    @NotNull
    public e1 f(long j10) {
        return new x0(j10, this.f36622d);
    }

    @NotNull
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> k() {
        return this.f36622d;
    }

    public final int l() {
        return this.f36623e;
    }

    public final int m() {
        return this.f36624f;
    }

    public final void n(@NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar) {
        this.f36622d = gVar;
    }

    public final void o(int i10) {
        this.f36623e = i10;
    }

    public final void p(int i10) {
        this.f36624f = i10;
    }
}
