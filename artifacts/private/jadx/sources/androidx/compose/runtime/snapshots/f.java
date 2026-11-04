package androidx.compose.runtime.snapshots;

import androidx.collection.l2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,2486:1\n1893#2:2487\n33#3:2488\n1#4:2489\n31#5:2490\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1589#1:2487\n1589#1:2488\n1607#1:2490\n*E\n"})
public final class f extends e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f36477v = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final e f36478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f36479u;

    public f(long j10, @NotNull v vVar, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2, @NotNull e eVar) {
        super(j10, vVar, function1, function2);
        this.f36478t = eVar;
        eVar.v(this);
    }

    private final void k0() {
        if (!this.f36479u) {
            this.f36479u = true;
            this.f36478t.w(this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.e
    @NotNull
    public o P() {
        f fVar;
        if (this.f36478t.Q() || this.f36478t.f()) {
            return new o.a(this);
        }
        l2<c1> l2VarJ = j();
        long jP = p();
        int i10 = 7 << 0;
        Map<e1, ? extends e1> mapD0 = l2VarJ != null ? b0.d0(this.f36478t.p(), this, this.f36478t.i()) : null;
        synchronized (b0.Q()) {
            try {
                b0.w0(this);
                if (l2VarJ == null || l2VarJ.q() == 0) {
                    fVar = this;
                    fVar.b();
                    Unit unit = Unit.f312394a;
                } else {
                    fVar = this;
                    o oVarV = fVar.V(this.f36478t.p(), l2VarJ, mapD0, this.f36478t.i());
                    if (!Intrinsics.areEqual(oVarV, o.b.f36549b)) {
                        return oVarV;
                    }
                    l2<c1> l2VarJ2 = fVar.f36478t.j();
                    if (l2VarJ2 != null) {
                        l2VarJ2.F(l2VarJ);
                    } else {
                        fVar.f36478t.d0(l2VarJ);
                        fVar.d0(null);
                    }
                }
                if (Intrinsics.compare(fVar.f36478t.p(), jP) < 0) {
                    fVar.f36478t.O();
                }
                e eVar = fVar.f36478t;
                eVar.D(eVar.i().s(jP).p(fVar.S()));
                fVar.f36478t.W(jP);
                fVar.f36478t.Y(fVar.I());
                fVar.f36478t.X(fVar.S());
                fVar.f36478t.Z(fVar.T());
                Unit unit2 = Unit.f312394a;
                fVar.b0(true);
                fVar.k0();
                m0.e.f(fVar, l2VarJ);
                return o.b.f36549b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void d() {
        if (f()) {
            return;
        }
        super.d();
        k0();
    }

    @NotNull
    public final e l0() {
        return this.f36478t;
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @NotNull
    public m o() {
        return this.f36478t.o();
    }
}
