package androidx.compose.runtime.snapshots;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,253:1\n33#2:254\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetStateRecord\n*L\n88#1:254\n*E\n"})
public final class g1<T> extends e1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36489f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> f36490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36491e;

    public g1(long j10, @NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar) {
        super(j10);
        this.f36490d = iVar;
    }

    @Override // androidx.compose.runtime.snapshots.e1
    public void b(@NotNull e1 e1Var) {
        synchronized (s0.f36588a) {
            Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.f36490d = ((g1) e1Var).f36490d;
            this.f36491e = ((g1) e1Var).f36491e;
            Unit unit = Unit.f312394a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.e1
    @NotNull
    public e1 c() {
        return new g1(b0.N().p(), this.f36490d);
    }

    @Override // androidx.compose.runtime.snapshots.e1
    @NotNull
    public e1 f(long j10) {
        return new g1(j10, this.f36490d);
    }

    public final int k() {
        return this.f36491e;
    }

    @NotNull
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> l() {
        return this.f36490d;
    }

    public final void m(int i10) {
        this.f36491e = i10;
    }

    public final void n(@NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar) {
        this.f36490d = iVar;
    }
}
